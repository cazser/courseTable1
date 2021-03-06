public class GeneticAlgorithm {

    private int populationSize;
    private double mutationRate;
    private double crossoverRate;
    private int elitismCount;
    protected int tournamentSize;
    private  Problem problem;
    public GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount,
                            int tournamentSize) {

        this.populationSize = populationSize;
        this.mutationRate = mutationRate;
        this.crossoverRate = crossoverRate;
        this.elitismCount = elitismCount;
        this.tournamentSize = tournamentSize;
    }
public  void InitProblem(Problem problem){
        this.problem = problem;
}

    private void setMutationRate(double rate){
        this.mutationRate = rate;
    }
    /**
     * Initialize population
     *
     * @param  of the individuals chromosome
     * @return population The initial population generated
     */
    public Population initPopulation(Timetable timetable) {
        // Initialize population
        Population population = new Population(this.populationSize, timetable);
        return population;
    }

    /**
     * Check if population has met termination condition
     *
     * @param generationsCount Number of generations passed
     * @param maxGenerations   Number of generations to terminate after
     * @return boolean True if termination condition met, otherwise, false
     */
    public boolean isTerminationConditionMet(double generationsCount, double maxGenerations) {
        return ((double)generationsCount > maxGenerations);
    }

    /**
     * Check if population has met termination condition
     *
     * @param population
     * @return boolean True if termination condition met, otherwise, false
     */
    public boolean isTerminationConditionMet(Population population) {
        double temp =population.getFittest(0).getFitness();
        System.out.println(temp);
        if(temp<0.1){
            this.setMutationRate(temp/100);
        }else if(temp<0.3){
            this.setMutationRate(temp/200);
        }else {
            this.setMutationRate(temp /500);
        }
    return temp== 1.0;


    }

    /**
     * Calculate individual's fitness value
     *
     * @param individual
     * @param timetable
     * @return fitness
     */
    public double calcFitness(Individual individual, Timetable timetable) {

        return this.problem.calcFitness(individual, timetable);
    }

    /**
     * Evaluate population
     *
     * @param population
     * @param timetable
     */
    public void evalPopulation(Population population, Timetable timetable) {
        double populationFitness = 0;

        // Loop over population evaluating individuals and summing population
        // fitness
        for (Individual individual : population.getIndividuals()) {
            populationFitness += this.calcFitness(individual, timetable);
        }

        population.setPopulationFitness(populationFitness);
    }

    /**
     * Selects parent for crossover using tournament selection
     *
     * Tournament selection works by choosing N random individuals, and then
     * choosing the best of those.
     *
     * @param population
     * @return The individual selected as a parent
     */
    public Individual selectParent(Population population) {
        // Create tournament
        Population tournament = new Population(this.tournamentSize);

        // Add random individuals to the tournament
        population.shuffle();
        for (int i = 0; i < this.tournamentSize; i++) {
            Individual tournamentIndividual = population.getIndividual(i);
            tournament.setIndividual(i, tournamentIndividual);
        }
        //System.out.print("??????\n");
        // Return the best
        return tournament.getFittest(0);
    }

    /**
     * Apply mutation to population
     *
     * @param population
     * @param timetable
     * @return The mutated population
     */
    public Population mutatePopulation(Population population, Timetable timetable) {
        // Initialize new population
        Population newPopulation = new Population(this.populationSize);
        double bestFitness = population.getFittest(0).getFitness();

        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            Individual individual = population.getFittest(populationIndex);

            // Create random individual to swap genes with
            Individual randomIndividual = new Individual(timetable);
            //Calculate adaptive mutation rate

            // Loop over individual's genes
            for (int geneIndex = 0; geneIndex < individual.getChromosomeLength(); geneIndex++) {
                // Skip mutation if this is an elite individual
                if (populationIndex > this.elitismCount) {
                    // Does this gene need mutation?
                    if (this.mutationRate > Math.random()) {
                        // Swap for new gene
                        individual.setGene(geneIndex, randomIndividual.getGene(geneIndex));
                    }
                }
            }

            // Add individual to population
            newPopulation.setIndividual(populationIndex, individual);
        }
        //System.out.println("??????\n");
        // Return mutated population
        return newPopulation;
    }

    /**
     * Apply crossover to population
     *
     * @param population The population to apply crossover to
     * @return The new population
     */
    public Population crossoverPopulation(Population population) {
        // Create new population
        Population newPopulation = new Population(population.size());

        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            Individual parent1 = population.getFittest(populationIndex);

            // Apply crossover to this individual?
            if (this.crossoverRate > Math.random() && populationIndex >= this.elitismCount) {
                // Initialize offspring
                Individual offspring = new Individual(parent1.getChromosomeLength());

                // Find second parent
                Individual parent2 = selectParent(population);

                // Loop over genome
                for (int geneIndex = 0; geneIndex < parent1.getChromosomeLength(); geneIndex++) {
                    // Use half of parent1's genes and half of parent2's genes
                    if (0.5 > Math.random()) {
                        offspring.setGene(geneIndex, parent1.getGene(geneIndex));
                    } else {
                        offspring.setGene(geneIndex, parent2.getGene(geneIndex));
                    }
                }

                // Add offspring to new population
                newPopulation.setIndividual(populationIndex, offspring);
            } else {
                // Add individual to new population without applying crossover
                newPopulation.setIndividual(populationIndex, parent1);
            }
        }
       // System.out.println("??????\n");
        return newPopulation;
    }
    public int getPopulationSize(){
        return this.populationSize;
    }
}
