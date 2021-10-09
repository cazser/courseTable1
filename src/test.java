public class test {

    public static void main(String[] args) throws Exception {

        class cc extends CalculatFitness{
            public double calcFitness(Individual individual, Timetable timetable){
                return -1;
            }
        }

        System.out.println(new cc()==null);
    }
}
