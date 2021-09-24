import java.util.HashMap;

public class Problem {
    private HashMap<Integer, String> Grouprefer;
    public Problem(){
        this.Grouprefer = new HashMap<>();

    }

    public String getReferGroup(int groupId){
        return this.Grouprefer.get(groupId);
    }
    public Timetable initializeTimetable() {
        // Create timetable
        Timetable timetable = new Timetable();

        // Set up rooms
        timetable.addRoom(1, "理工一133", 100);
        timetable.addRoom(2, "理工一121", 100);
        timetable.addRoom(3, "理工一521", 100);
        timetable.addRoom(4, "理工一429", 100);
        timetable.addRoom(5, "理工一431", 100);
        timetable.addRoom(6, "理工一411", 100);
        timetable.addRoom(7, "理工一117", 100);
        timetable.addRoom(8,"理工一119", 100);
        timetable.addRoom(9,"理工一123", 100);
        timetable.addRoom(10, "理工一126", 100);
        timetable.addRoom(11, "体育楼211", 100);
        timetable.addRoom(12, "体育楼305", 100);
        timetable.addRoom(13, "体育楼307", 100);
        timetable.addRoom(14, "体育楼309", 100);
        timetable.addRoom(15, "理工一519", 100);
        timetable.addRoom(16, "体育楼209", 100);
        timetable.addRoom(17, "理工一523", 100);
        timetable.addRoom(18, "崇师B415", 100);
        timetable.addRoom(19, "崇师B616", 100);
        timetable.addRoom(20, "崇师C101", 100);
        timetable.addRoom(21, "崇师C102", 100);
        timetable.addRoom(22, "崇师C103", 100);
        timetable.addRoom(23, "崇师C104", 100);
        timetable.addRoom(24, "崇师C306", 100);
        timetable.addRoom(25, "崇师D502", 100);
        timetable.addRoom(26, "崇师C105", 100);


        // Set up timeslots
        timetable.addTimeslot(1, "Mon 9:00 - 11:00");
        timetable.addTimeslot(2, "Mon 11:00 - 13:00");
        timetable.addTimeslot(3, "Mon 13:00 - 15:00");
        timetable.addTimeslot(4, "Mon 15:00 - 17:00");
        timetable.addTimeslot(5, "Thu 9:00 - 11:00");
        timetable.addTimeslot(6, "Thu 11:00 - 13:00");
        timetable.addTimeslot(7, "Thu 13:00 - 15:00");
        timetable.addTimeslot(8, "Thu 15:00 - 17:00");
        timetable.addTimeslot(9, "Wed 9:00 - 11:00");
        timetable.addTimeslot(10, "Wed 11:00 - 13:00");
        timetable.addTimeslot(11, "Tes 9:00 - 11:00");
        timetable.addTimeslot(12, "Tes 11:00 - 13:00");
        timetable.addTimeslot(13, "Tes 13:00 - 15:00");
        timetable.addTimeslot(14, "Tes 15:00 - 17:00");
        timetable.addTimeslot(15, "Fri 9:00 - 11:00");
        timetable.addTimeslot(16, "Fri 11:00 - 13:00");
        timetable.addTimeslot(17, "Fri 13:00 - 15:00");
        timetable.addTimeslot(18, "Fri 15:00 - 17:00");
        // Set up professors
        timetable.addProfessor(1,"范雪琴",new int[]{0,
                                                                0,0,0,0,
                                                                0,0,0,0,
                                                                0,0,
                                                                0,0,0,0,
                                                                0,0,0,0});
        timetable.addProfessor(2,"王金江",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(3,"大学英语1",new int[]{0,
                -1000, -1000, -1000, -1000,
                -1000,10000000,-1000, -1000,
                -1000,-1000,
                -1000,-1000,-1000,-1000,
                10000000,-1000,-1000,-1000});
        timetable.addProfessor(4,"李持磊",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(5,"体育1",new int[]{0,
                -1000,-1000,1000000,-1000,
                -1000,-1000,-1000,-1000,
                -1000,-1000,
                -1000,-1000,-1000,-1000,
                -1000,-1000,-1000,-1000});
        timetable.addProfessor(6,"孙鹏飞",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(7,"张洪岩",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});

        timetable.addModule(1,"高级语言程序设计1", "高级语言程序设计1", new int[]{1});
        timetable.addModule(2,"高级语言程序设计(实)", "高级语言程序设计(实)", new int[]{1});
        timetable.addModule(3,"高级语言程序设计2", "高级语言程序设计2", new int[]{1});
        timetable.addModule(4,"线性代数", "线性代数", new int[]{2});
        timetable.addModule(5,"线性代数2", "线性代数2", new int[]{2});
        timetable.addModule(6,"大学英语1", "大学英语1", new int[]{3});
        timetable.addModule(7,"高等数学1", "高等数学1", new int[]{4});
        timetable.addModule(8,"大学英语1.1", "大学英语1.1", new int[]{3});
        timetable.addModule(9,"高等数学1.2", "高等数学1.2", new int[]{4});
        timetable.addModule(10,"高等数学1.3", "高等数学1.3", new int[]{4});
        timetable.addModule(11,"体育1", "体育1", new int[]{5});
        timetable.addModule(12,"计算机导论", "计算机导论", new int[]{6});
        timetable.addModule(13,"计算机导论(实)", "计算机导论(实)", new int[]{6});
        timetable.addModule(14,"大学生心理健康教育", "大学生心理健康教育", new int[]{7});
        // Set up student groups and the modules they take.
        timetable.addGroup(1, 100, new int[] { 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 });
        this.Grouprefer.put(1, "计科1班公费2021");

        return timetable;
    }
    public  double calcFitness( Individual individual, Timetable timetable){
        // Create new timetable object to use -- cloned from an existing timetable
        Timetable threadTimetable = new Timetable(timetable);
        threadTimetable.createClasses(individual);

        // Calculate fitness
        int clashes = threadTimetable.calcClashes();
        double satisfy = 0;
        Class[] classes = timetable.getClasses();
        if(classes!=null) {
            for (Class class1 : classes) {
                int timeslotid = class1.getTimeslotId();
                int professorid = class1.getProfessorId();
                satisfy += timetable.getProfessors().get(professorid).getTimePreference()[timeslotid];
            }
        }
        double fitness = 0;


        fitness=   1/(double)(clashes+1) + satisfy;
        individual.setFitness(fitness);

        return fitness;
    }
}
