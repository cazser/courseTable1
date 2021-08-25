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
    private static Problem problem;
    public static void main(String[] args) {
        // Get a Timetable object with all the available information.
        problem = new Problem();
        Timetable timetable = problem.initializeTimetable();

        // Initialize GA
        GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.01, 0.9, 2, 5);

        // Initialize population
        Population population = ga.initPopulation(timetable);

        // Evaluate population
        ga.evalPopulation(population, timetable);

        // Keep track of current generation
        int generation = 1;

        // Start evolution loop
        while (ga.isTerminationConditionMet(generation, 1000) == false
                && ga.isTerminationConditionMet(population) == false) {
            // Print fitness
            // System.out.println("G" + generation + " Best fitness: " +
            // population.getFittest(0).getFitness());

            // Apply crossover
            population = ga.crossoverPopulation(population);

            // Apply mutation
            population = ga.mutatePopulation(population, timetable);

            // Evaluate population
            ga.evalPopulation(population, timetable);

            // Increment the current generation
            generation++;
        }

        // Print fitness
        timetable.createClasses(population.getFittest(0));

        // Print classes
        System.out.println();
        Class classes[] = timetable.getClasses();
        int classIndex = 1;
        for (Class bestClass : classes) {
            System.out.println("Class " + classIndex + ":");
            System.out.println("Module: " + timetable.getModule(bestClass.getModuleId()).getModuleName());
            System.out.println("Group: " + timetable.getGroup(bestClass.getGroupId()).getGroupId());
            System.out.println("Room: " + timetable.getRoom(bestClass.getRoomId()).getRoomNumber());
            System.out.println("Professor: " + timetable.getProfessor(bestClass.getProfessorId()).getProfessorName());
            System.out.println("Time: " + timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot());
            System.out.println("-----");
            classIndex++;
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