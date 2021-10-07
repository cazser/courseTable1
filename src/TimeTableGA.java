import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
/**
 * Don't be daunted by the number of classes in this chapter -- most of them are
 * just simple containers for information, and only have a handful of properties
 * with setters and getters.
 *
 * The real stuff happens in the GeneticAlgorithm class and the Timetable class.
 *
 * The Timetable class is what the genetic algorithm is expected to create a
 * valid version of -- meaning, after all is said and done, a chromosome is read
 * into a Timetable class, and the Timetable class creates a nicer, neater
 * representation of the chromosome by turning it into a proper list of Classes
 * with rooms and professors and whatnot.
 *
 * The Timetable class also understands the problem's Hard Constraints (ie, a
 * professor can't be in two places simultaneously, or a room can't be used by
 * two classes simultaneously), and so is used by the GeneticAlgorithm's
 * calcFitness class as well.
 *
 * Finally, we overload the Timetable class by entrusting it with the "database
 * information" generated here in initializeTimetable. Normally, that
 * information about what professors are employed and which classrooms the
 * university has would come from a database, but this isn't a book about
 * databases so we hardcode it.
 *
 * @author bkanber
 *
 */

public class TimeTableGA {
    private static Population Deserialize() throws Exception, IOException {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    new File("Pop.txt")));
            Population population = (Population) ois.readObject();

            return population;

    }
    public static void main(String[] args) throws Exception {
        // Get a Timetable object with all the available information.
        Problem problem = new Problem();
        Timetable timetable = problem.initializeTimetable();

        // Initialize GA
        GeneticAlgorithm ga = new GeneticAlgorithm(120, 0.0001, 0.5, 2, 2);

        // Initialize population
        Population population=null;
        try {
            System.out.println("反序列化成功");
            population = Deserialize();
        }catch (Exception e) {
                population = ga.initPopulation(timetable);
            }


        // Evaluate population
        ga.evalPopulation(population, timetable);

        // Keep track of current generation
        int generation = 1;

        // Start evolution loop
        while (ga.isTerminationConditionMet(population) == false) {
            // Print fitness
            // System.out.println("G" + generation + " Best fitness: " +
            // population.getFittest(0).getFitness());

            // Apply crossover
            population = ga.crossoverPopulation(population);

            // Apply mutation
            population = ga.mutatePopulation(population, timetable);

            // Evaluate population
            ga.evalPopulation(population, timetable);

                try {
                    ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                            new File("Pop.txt")));
                    oo.writeObject(population);
                } catch (Exception e) {
                    System.out.println("没成功");
                }

            // Increment the current generation
            generation++;
            System.out.println(generation);
        }

        // Print fitness
        int clashes = 1;
        int i=0;
        while(clashes!=0) {
            timetable.createClasses(population.getFittest(i));
            clashes = timetable.calcClashes();
            System.out.println(clashes);
            i++;
        }
        // Print classes
        System.out.println();
        Class classes[] = timetable.getClasses();
        int classIndex = 1;
        File f=new File("output.csv");
        File f1 = new File("output.html");
        FileWriter fw=null;
        FileWriter fw1 = null;
        BufferedWriter bw=null;
        BufferedWriter bw1 = null;
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            if(!f1.exists()){
                f1.createNewFile();
            }
            fw=new FileWriter(f.getAbsoluteFile());  //true表示可以追加新内容
            //fw=new FileWriter(f.getAbsoluteFile()); //表示不追加
            bw=new BufferedWriter(fw);
            bw.write("课程号");
            bw.write(",课程");
            bw.write(",班级");
            bw.write(",教室");
            bw.write(",教师");
            bw.write(",时间");
            bw.write("\n");
            fw1 = new FileWriter(f1.getAbsoluteFile());
            bw1 = new BufferedWriter(fw1);
            bw1.write("<style>th,td{border:1px solid black;}table{border-collapse: collapse;}</style>");
            bw1.write("<table>");
            bw1.write("<thead>");
            bw1.write("<tr>");
            bw1.write("<th>课程号</th>");
            bw1.write("<th>课程</th>");
            bw1.write("<th>班级</th>");
            bw1.write("<th>教室</th>");
            bw1.write("<th>教师</th>");
            bw1.write("<th>时间</th>");
            bw1.write("</tr>");
            bw1.write("<tbody>");
            for (Class bestClass : classes) {
                /*
                System.out.println("Class " + classIndex + ":");
                System.out.println("Module: " + timetable.getModule(bestClass.getModuleId()).getModuleName());
                System.out.println("Group: " + problem.getReferGroup(timetable.getGroup(bestClass.getGroupId()).getGroupId())));
                System.out.println("Room: " + timetable.getRoom(bestClass.getRoomId()).getRoomNumber());
                System.out.println("Professor: " + timetable.getProfessor(bestClass.getProfessorId()).getProfessorName());
                System.out.println("Time: " + timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot());
                System.out.println("-----");
                */
                 bw.write(Integer.toString(classIndex));
                 bw.write(",");
                 bw.write(timetable.getModule(bestClass.getModuleId()).getModuleName());
                 bw.write(",");
                 bw.write(problem.getReferGroup(timetable.getGroup(bestClass.getGroupId()).getGroupId()));
                 bw.write(",");
                 bw.write(timetable.getRoom(bestClass.getRoomId()).getRoomNumber());
                bw.write(",");
                bw.write(timetable.getProfessor(bestClass.getProfessorId()).getProfessorName());
                bw.write(",");
                bw.write(timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot());
                bw.write("\n");

                bw1.write("<tr>");
                bw1.write("<td>"+Integer.toString(classIndex)+"</td>");
                bw1.write("<td>"+timetable.getModule(bestClass.getModuleId()).getModuleName()+"</td>");
                bw1.write("<td>"+problem.getReferGroup(timetable.getGroup(bestClass.getGroupId()).getGroupId()
                )+"</td>");
                bw1.write("<td>"+ timetable.getRoom(bestClass.getRoomId()).getRoomNumber()+"</td>");
                bw1.write("<td>"+timetable.getProfessor(bestClass.getProfessorId()).getProfessorName()+"</td>");
                bw1.write("<td>"+timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot()+"</td>");
                bw1.write("\n");
                bw1.write("</tr>");
                classIndex++;
            }
            bw1.write("</tbody>");
            bw1.write("</table>");
            bw.close();
            bw1.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        File f2=new File("data.js");
        FileWriter fw2=null;
        BufferedWriter bw2 = null;
        try {
            if (!f2.exists()) {
                f2.createNewFile();
            }
            fw2=new FileWriter(f2.getAbsoluteFile());
            bw2=new BufferedWriter(fw2);
            bw2.write("const data=[");


            for (Class bestClass : classes) {
                String module =timetable.getModule(bestClass.getModuleId()).getModuleName();
                int groupId = timetable.getGroup(bestClass.getGroupId()).getGroupId();
                String group = problem.getReferGroup(timetable.getGroup(bestClass.getGroupId()).getGroupId());
                String room = timetable.getRoom(bestClass.getRoomId()).getRoomNumber();
                String professor = timetable.getProfessor(bestClass.getProfessorId()).getProfessorName();
                int timeslot =timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslotId();
                    bw2.write("{");
                    bw2.write("groupId: "+ ((Integer)groupId).toString());
                    bw2.write(",");
                    bw2.write("groupName:" + "'" + group + "'");
                    bw2.write(",");
                    bw2.write("module:"+ "'" + module + "'");
                    bw2.write(",");
                    bw2.write("room:" +"'" +room +"'");
                    bw2.write(",");
                    bw2.write("professor:" +"'" + professor+ "'");
                    bw2.write(",");
                    bw2.write("timeslotId:"+((Integer) timeslot).toString());
                    bw2.write("}");
                    bw2.write(",");
            }

            bw2.write("]");
            bw2.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Creates a Timetable with all the necessary course information.
     *
     * Normally you'd get this info from a database.
     *
     * @return
     */

}