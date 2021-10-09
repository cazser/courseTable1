import java.util.HashMap;

public class Problem {

    protected HashMap<Integer, String> Grouprefer;
    private Timetable timetable;
    public CalculatFitness calc;
    public Problem(){
        this.Grouprefer = new HashMap<>();
        this.calc=null;
        this.timetable = null;
    }
    public Problem(Timetable timetable, CalculatFitness calculatFitness){
        this.Grouprefer = new HashMap<>();
        this.timetable = new Timetable(timetable);
        this.calc= calculatFitness;
    }

    public void InitTimeTable(Timetable timetable){
        this.timetable = timetable;
    }

    public void InitCalcFitness(CalculatFitness calc){
        this.calc = calc;
    }

    public String getReferGroup(int groupId){
        return this.Grouprefer.get(groupId);
    }

    public  double calcFitness( Individual individual, Timetable timetable) {
        // Create new timetable object to use -- cloned from an existing timetable
        return this.calc.calcFitness(individual, timetable);
    }
/*
    public  double calcFitness( Individual individual, Timetable timetable) {
        Timetable threadTimetable = new Timetable(timetable);
        threadTimetable.createClasses(individual);

        // Calculate fitness
        int clashes = threadTimetable.calcClashes();
        double satisfy = 0;
        Class[] classes = timetable.getClasses();
        if (classes != null) {
            for (Class class1 : classes) {
                int timeslotid = class1.getTimeslotId();
                int professorid = class1.getProfessorId();
                satisfy += timetable.getProfessors().get(professorid).getTimePreference()[timeslotid];
            }
        }
        double fitness = 0;


        fitness = 1 / (double) (clashes + 1) + satisfy;
        individual.setFitness(fitness);

        return fitness;
    }

  */
}
