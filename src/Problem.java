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
        timetable.addProfessor(10,"赵微",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(11,"周国辉",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(12,"赵丽",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(13,"姚艳雪",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(14,"李世明",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(15,"黄玉妍",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(16,"常晓娟",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(17,"朱海龙",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(18,"刘玉喜",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(19,"贺维",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(20,"房益龙",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(21,"魏洪伟",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(22,"朱晓",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(23,"穆全起",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(24,"李玉霞",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(25,"王洪侠",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(26,"丁云鸿",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(27,"石哗琼",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(28,"张明宇",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(29,"林琳",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(30,"李晶",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(31,"崔艳玲",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(32,"贾轶男",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(33,"宋岩风",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(34,"韩贤东",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(35,"邸佳奇",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(36,"丁金凤",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(37,"付宝君",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(38,"周英",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(39,"倪蕴涛",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(40,"赵国生",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(41,"姜春茂",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(42,"季伟东",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(43,"李英梅",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(44,"王秀珍",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(45,"于丹",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(46,"刘月兰",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(47,"宋耀文",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(48,"张军",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(49,"伦立军",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(50,"马宁",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(51,"边奕心",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(52,"于晓东",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(53,"段喜梅",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(54,"郑岩",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(55,"杜军",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(56,"邵晶波",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(57,"杨建柏",new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0});
        timetable.addProfessor(58,"张修茂",new int[]{0,
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

        timetable.addModule(31,"高级语言程序设计1", "高级语言程序设计1", new int[]{10});
        timetable.addModule(32," 高级语言程序设计(实)" ,"高级语言程序设计(实)", new int[]{10});
        timetable.addModule(33,"高级语言程序设计2", "高级语言程序设计2", new int[]{10});
        timetable.addModule(34,"游戏概论", "游戏概论", new int[]{11});
        timetable.addModule(35,"游戏文化与鉴赏", "游戏文化与鉴赏", new int[]{12});
        timetable.addModule(36,"游戏文化与鉴赏(实)" ,"游戏文化与鉴赏(实)", new int[]{12});

        timetable.addModule(37,"高级语言程序设计1", "高级语言程序设计1", new int[]{13});
        timetable.addModule(38," 高级语言程序设计(实)" ,"高级语言程序设计(实)", new int[]{13});
        timetable.addModule(39,"高级语言程序设计2", "高级语言程序设计2", new int[]{13});
        timetable.addModule(40,"物联网工程导论", "物联网工程导论", new int[]{14});
        timetable.addModule(41,"物联网工程导论(实)", "物联网工程导论(实)", new int[]{14});
        
        timetable.addModule(42,"高级语言程序设计1", "高级语言程序设计1", new int[]{15});
        timetable.addModule(43,"高级语言程序设计(实)", "高级语言程序设计(实)", new int[]{15});
        timetable.addModule(44,"高级语言程序设计2", "高级语言程序设计2", new int[]{15});
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
        timetable.addGroup(6, 100, new int[] { 31, 32, 33, 34, 35, 36},
                new int[]{1, 2, 3, 6, 9, 11, 14, 15, 17});
        this.Grouprefer.put(6, "2021数媒专业");
        timetable.addGroup(7, 100, new int[] { 37, 38, 39, 40, 41},
                new int[]{1, 3, 4, 6, 8, 9,  15, 16});
        this.Grouprefer.put(7, "2021物联网工程");
        timetable.addGroup(8, 100, new int[] { 42, 43, 44},
                new int[]{1, 2, 3,  6, 7, 10, 12, 15, 16});
        this.Grouprefer.put(8, "2021大数据1班");


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
