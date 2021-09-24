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

        timetable.addProfessor(3,"李持磊",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(4,"孙鹏飞",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(5,"于延",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(6,"李红宇",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(7,"张广玲",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(8,"付伟",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(9,"李志聪",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});


        timetable.addModule(1,"高级语言程序设计1", "高级语言程序设计1", new int[]{1});
        timetable.addModule(2,"高级语言程序设计(实)", "高级语言程序设计(实)", new int[]{1});
        timetable.addModule(3,"高级语言程序设计2", "高级语言程序设计2", new int[]{1});
        timetable.addModule(9,"计算机导论", "计算机导论", new int[]{4});
        timetable.addModule(10,"计算机导论(实)", "计算机导论(实)", new int[]{4});

        timetable.addModule(11,"高级语言程序设计1", "高级语言程序设计1", new int[]{5});
        timetable.addModule(12,"高级语言程序设计(实)", "高级语言程序设计(实)", new int[]{5});
        timetable.addModule(13,"高级语言程序设计2", "高级语言程序设计2", new int[]{5});
        timetable.addModule(14,"计算机导论", "计算机导论", new int[]{4});
        timetable.addModule(15,"计算机导论(实)", "计算机导论(实)", new int[]{4});

        timetable.addModule(16,"高级语言程序设计1", "高级语言程序设计1", new int[]{6});
        timetable.addModule(17,"高级语言程序设计(实)", "高级语言程序设计(实)", new int[]{6});
        timetable.addModule(18,"高级语言程序设计2", "高级语言程序设计2", new int[]{6});
        timetable.addModule(19,"计算机导论", "计算机导论", new int[]{7});
        timetable.addModule(20,"计算机导论(实)", "计算机导论(实)", new int[]{7});


        timetable.addModule(21,"软件工程专业导论", "软件工程专业导论", new int[]{8});
        timetable.addModule(22,"软件工程专业导论(实)", "软件工程专业导论(实)", new int[]{8});
        timetable.addModule(23,"高级语言程序设计1", "高级语言程序设计1", new int[]{9});
        timetable.addModule(24," 高级语言程序设计(实)" ,"高级语言程序设计(实)", new int[]{9});
        timetable.addModule(25,"高级语言程序设计2", "高级语言程序设计2", new int[]{9});

        timetable.addModule(26,"软件工程专业导论", "软件工程专业导论", new int[]{8});
        timetable.addModule(27,"软件工程专业导论(实)", "软件工程专业导论(实)", new int[]{8});
        timetable.addModule(28,"高级语言程序设计1", "高级语言程序设计1", new int[]{9});
        timetable.addModule(29," 高级语言程序设计(实)" ,"高级语言程序设计(实)", new int[]{9});
        timetable.addModule(30,"高级语言程序设计2", "高级语言程序设计2", new int[]{9});

        // Set up student groups and the modules they take.
        timetable.addGroup(1, 100, new int[] { 1,2, 3,  9, 10},
                                                    new int[]{2,3,6, 10,11,12,15, 16,18});
        this.Grouprefer.put(1, "2021计科1班公费");
        timetable.addGroup(2, 100, new int[] { 11, 12, 13, 14, 15},
                new int[]{1, 3,6,10,11,12,14, 15});
        this.Grouprefer.put(2, "2021计科2班行知班");
        timetable.addGroup(3, 100, new int[] { 16, 17, 18, 19, 20},
                new int[]{1, 2, 3,6,7, 9, 12,14, 15, 16, 18});
        this.Grouprefer.put(3, "2021计科34班");
        timetable.addGroup(4, 100, new int[] { 21, 22, 23, 24, 25},
                new int[]{ 3,5, 6,7, 12,13,15,16});
        this.Grouprefer.put(4, "2021软件工程12班");
        timetable.addGroup(5, 100, new int[] { 26, 27, 28, 29, 30},
                new int[]{ 2, 3, 6, 7, 8, 14, 15, 16});
        this.Grouprefer.put(5, "2021软件工程34班");

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
