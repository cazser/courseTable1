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

        timetable.addModule(45, "数据结构", "数据结构", new int[]{16});
        timetable.addModule(46,"人工智能导论", "人工智能导论", new int[]{17});
        timetable.addModule(47, "计算机辅助教学", "计算机辅助教学", new int[]{18});
        timetable.addModule(48, "数据结构", "数据结构", new int[]{16});
        timetable.addModule(49, "Python程序设计", "Python程序设计", new int[]{19});
        timetable.addModule(50, "web程序设计与框架应用(单)Python程序设计(双)",  
                                "web程序设计与框架应用(单)Python程序设计(双)", new int[]{19, 20});
        timetable.addModule(51, "人工智能导论1-8web程序设计与框架应用9-16", 
                                "人工智能导论1-8web程序设计与框架应用9-16",  new int[]{20, 17});

        timetable.addModule(52, "数据结构", "数据结构", new int[]{16});
        timetable.addModule(53,"人工智能导论", "人工智能导论", new int[]{17});
        timetable.addModule(54,"人工智能导论(实）", "人工智能导论（实）", new int[]{17});
        timetable.addModule(55, "计算机辅助教学", "计算机辅助教学", new int[]{18});
        timetable.addModule(56, "数据结构", "数据结构", new int[]{16});
        timetable.addModule(57, "Python程序设计1", "Python程序设计1", new int[]{19});
        timetable.addModule(58, "Python程序设计2", "Python程序设计2", new int[]{19});
        timetable.addModule(59, "web程序设计与框架应用", 
                                "web程序设计与框架应用",  new int[]{20});
        timetable.addModule(60, "web程序设计与框架应用(实)", 
                                "web程序设计与框架应用(实)",  new int[]{20});

        timetable.addModule(61, "web程序设计", "web程序设计", new int[]{1});
        timetable.addModule(62, "数据结构", "数据结构", new int[]{21});
        timetable.addModule(63,"人工智能导论", "人工智能导论", new int[]{22});
        timetable.addModule(64, "单片机原理与应用", "单片机原理与应用", new int[]{23});
        timetable.addModule(65, "设计模式", "设计模式", new int[]{24});
        timetable.addModule(66, "数字逻辑", "数字逻辑", new int[]{25});
        timetable.addModule(67,"人工智能导论(实)", "人工智能导论(实)", new int[]{22});
        
        timetable.addModule(68, "web程序设计", "web程序设计", new int[]{16});
        timetable.addModule(69, "数据结构", "数据结构", new int[]{21});
        timetable.addModule(70,"人工智能导论", "人工智能导论", new int[]{22});
        timetable.addModule(71, "单片机原理与应用", "单片机原理与应用", new int[]{23});
        timetable.addModule(72, "设计模式", "设计模式", new int[]{24});
        timetable.addModule(73, "数字逻辑", "数字逻辑", new int[]{25});
        timetable.addModule(74,"人工智能导论(实)", "人工智能导论(实)", new int[]{22});

        timetable.addModule(75, "Python程序设计", "Python程序设计", new int[]{19});
        timetable.addModule(76, "软件需求分析", "软件需求分析", new int[]{26});
        timetable.addModule(77, "web程序设计", "web程序设计", new int[]{27});
        timetable.addModule(78, "数据结构", "数据结构", new int[]{28});
        timetable.addModule(79, "web前端开发技术", "web前端开发技术", new int[]{29});
        timetable.addModule(80, "web程序设计(实)", "web程序设计(实)", new int[]{27});
        timetable.addModule(81, "计算机系统基础", "计算机系统基础", new int[]{30});
        timetable.addModule(82, "数据结构2", "数据结构2", new int[]{28});
        timetable.addModule(83, "计算机系统基础2", "计算机系统基础2", new int[]{30});

        timetable.addModule(84, "Python程序设计", "Python程序设计", new int[]{19});
        timetable.addModule(85, "软件需求分析", "软件需求分析", new int[]{26});
        timetable.addModule(86, "web程序设计", "web程序设计", new int[]{27});
        timetable.addModule(87, "数据结构", "数据结构", new int[]{28});
        timetable.addModule(88, "web前端开发技术", "web前端开发技术", new int[]{29});
        timetable.addModule(89, "计算机系统基础", "计算机系统基础", new int[]{30});
        timetable.addModule(90, "数据结构2", "数据结构2", new int[]{28});
        timetable.addModule(91, "计算机系统基础2", "计算机系统基础2", new int[]{30});

        timetable.addModule(92, "计算机图形学", "计算机图形学", new int[]{31});
        timetable.addModule(93, "影视特效制作|c方向5-7,游戏原画设计|c方向1",  
                                "影视特效制作|c方向5-7,游戏原画设计|c方向1",  new int[]{32, 33});
        timetable.addModule(94, "影视特效制作|c方向5-7,游戏原画设计|c方向2",  
                                "影视特效制作|c方向5-7,游戏原画设计|c方向2",  new int[]{32, 33});
        timetable.addModule(95, "影视特效制作|c方向5-7,游戏原画设计|c方向3",  
                                "影视特效制作|c方向5-7,游戏原画设计|c方向3",  new int[]{32, 33});
        timetable.addModule(96, "影视特效制作|c方向5-7,游戏原画设计|c方向4",  
                                "影视特效制作|c方向5-7,游戏原画设计|c方向4",  new int[]{32, 33});
        timetable.addModule(97, "操作系统API事件",  "操作系统API事件", new int[]{34});
        timetable.addModule(98, "数据结构", "数据结构", new int[]{35});
        timetable.addModule(99, "数据结构(实)", "数据结构(实)", new int[]{35});
        timetable.addModule(100, "影视特效制作|c方向5-7,三维动画制作技术|c方向1",  
                                "影视特效制作|c方向5-7,三维动画制作技术|c方向1",  new int[]{32, 33});
        timetable.addModule(101, "影视特效制作|c方向5-7,三维动画制作技术|c方向2",
                                "影视特效制作|c方向5-7,三维动画制作技术|c方向2" ,  new int[]{32, 33});
        timetable.addModule(102, "三维动画制作技术", "三维动画制作技术", new int[]{36});
        
        timetable.addModule(103, "数据库系统原理", "数据库系统原理", new int[]{37});
        timetable.addModule(104, "数据结构", "数据结构", new int[]{38});
        timetable.addModule(105, "数字电子技术", "数字电子技术", new int[]{39});
        timetable.addModule(106, "物联网专业英语", "物联网专业英语", new int[]{40});
        timetable.addModule(107, "Python语言", "Python语言", new int[]{41});
        timetable.addModule(108, "Python语言(实)", "Python语言(实)", new int[]{41});
        timetable.addModule(109, "数据库应用与开发1班", "数据库应用与开发1班", new int[]{37});
        timetable.addModule(110, "数据库应用与开发2班", "数据库应用与开发2班", new int[]{37});

        timetable.addModule(111, "Python程序设计", "Python程序设计", new int[]{12});
        timetable.addModule(112, "数据结构", "数据结构", new int[]{15});
        timetable.addModule(113, "数字逻辑", "数字逻辑", new int[]{42});
        timetable.addModule(114, "大数据原理与应用",  "大数据原理与应用", new int[]{42});
        timetable.addModule(115, "数据库系统原理1-8&&web程序设计9-16",  "数据库系统原理1-8&&web程序设计9-16",new int[]{12,43});
        timetable.addModule(116, "数据库系统原理",  "数据库系统原理",new int[]{43});
        timetable.addModule(117, "数据结构2", "数据结构2", new int[]{15});
        timetable.addModule(118, "数字逻辑1-8web程序设计9-16",   "数字逻辑1-8web程序设计9-16",new int[]{12, 42});
        timetable.addModule(119, "大数据原理与应用(实)",  "大数据原理与应用(实)", new int[]{42});
        
        timetable.addModule(120, "计算机网络",  "计算机网络", new int[]{44});
        timetable.addModule(121, "编译原理",  "编译原理", new int[]{24});
        timetable.addModule(122, "操作系统",  "操作系统", new int[]{45});
        timetable.addModule(123, "数据库设计与应用",  "数据库设计与应用", new int[]{46});
        timetable.addModule(124, "信息技术课程标准与教材研究",   "信息技术课程标准与教材研究", new int[]{47});
        timetable.addModule(125, "智能教育工程项目设计1-8机器人教育9-16",   
                                 "智能教育工程项目设计1-8机器人教育9-16", new int[]{17, 5});
        timetable.addModule(126, "信息技术课程标准与教材研究1-8&&计算机网络",   
                                 "信息技术课程标准与教材研究1-8&&计算机网络",  new int[]{47, 44});
        timetable.addModule(127, "智能教育工程项目设计1-8编译原理9-16",   
                                 "智能教育工程项目设计1-8编译原理9-16", new int[]{17, 24});
        timetable.addModule(128, "操作系统",  "操作系统", new int[]{45});
        timetable.addModule(129, "数据库设计与应用",  "数据库设计与应用", new int[]{46});
        timetable.addModule(130, "机器人教育", "机器人教育", new int[]{5});

        timetable.addModule(131, "计算机网络",  "计算机网络", new int[]{44});
        timetable.addModule(132, "编译原理",  "编译原理", new int[]{24});
        timetable.addModule(133, "信息技术课程标准与教材研究",   "信息技术课程标准与教材研究", new int[]{47});
        timetable.addModule(134, "操作系统",  "操作系统", new int[]{48});
        timetable.addModule(135, "智能教育工程项目设计",   "智能教育工程项目设计", new int[]{17});
        timetable.addModule(136, "数据库设计与应用",  "数据库设计与应用", new int[]{46});
        timetable.addModule(137, "智能教育工程项目设计1-8编译原理9-16",   
                                 "智能教育工程项目设计1-8编译原理9-16", new int[]{17, 24});
        timetable.addModule(138, "信息技术课程标准与教材研究1-8&&计算机网络",   
                                 "信息技术课程标准与教材研究1-8&&计算机网络",  new int[]{47, 44});
        timetable.addModule(139, "数据库设计与应用",  "数据库设计与应用", new int[]{46});
        timetable.addModule(140, "机器人教育", "机器人教育", new int[]{5});

        timetable.addModule(141, "编译原理",  "编译原理", new int[]{22});
        timetable.addModule(142, "操作系统",  "操作系统", new int[]{45});
        timetable.addModule(143, "C++程序设计",  "C++程序设计", new int[]{18});
        timetable.addModule(144, "ARM体系结构",  "ARM体系结构", new int[]{ 7});
        timetable.addModule(145, "数据库设计与应用",  "数据库设计与应用", new int[]{29});
        timetable.addModule(146, "操作系统",  "操作系统", new int[]{45});
        timetable.addModule(147, "计算机网络1-8编译原理9-16",   "计算机网络1-8编译原理9-16",  new int[]{44, 22});
        timetable.addModule(148, "C++程序设计",  "C++程序设计", new int[]{18});
        timetable.addModule(149, "数据库设计与应用",  "数据库设计与应用", new int[]{29});
        timetable.addModule(150, "计算机网络",  "计算机网络", new int[]{42});
        timetable.addModule(151, "单片机原理与应用",  "单片机原理与应用", new int[]{23});
        
        timetable.addModule(152, "SSH开发技术",   "SSH开发技术", new int[]{ 6});
        timetable.addModule(153, "编译原理",  "编译原理", new int[]{22});
        timetable.addModule(154, "数据库设计与应用",  "数据库设计与应用", new int[]{7});
        timetable.addModule(155, "UML统一建模",  "UML统一建模", new int[]{ 46 });
        timetable.addModule(156, "操作系统",  "操作系统", new int[]{45});
        timetable.addModule(157, "SSH开发技术",   "SSH开发技术", new int[]{ 6});
        timetable.addModule(158, "计算机网络1-8编译原理9-16",   "计算机网络1-8编译原理9-16",  new int[]{44, 22});
        timetable.addModule(159, "UML统一建模",  "UML统一建模", new int[]{ 46 });
        timetable.addModule(160, "操作系统1-8&&数据库设计与应用",   "操作系统1-8&&数据库设计与应用", new int[]{45, 7});
        timetable.addModule(161, "单片机原理与应用",  "单片机原理与应用", new int[]{23});
        timetable.addModule(162, "计算机网络",   "计算机网络",  new int[]{44 });
        
        timetable.addModule(163, "操作系统",  "操作系统", new int[]{49});
        timetable.addModule(164, "UML统一建模",  "UML统一建模", new int[]{ 50 });
        timetable.addModule(165, "软件测试与质量保证",   "软件测试与质量保证", new int[]{ 51 });
        timetable.addModule(166, "移动终端应用开发基础",   "移动终端应用开发基础",  new int[]{ 9  });
        timetable.addModule(167, "软件需求分析",  "软件需求分析", new int[]{ 26 });
        timetable.addModule(168, "软件测试与质量保证",   "软件测试与质量保证", new int[]{ 51 });
        timetable.addModule(169, "操作系统",  "操作系统", new int[]{49});
        timetable.addModule(170, "个人级软件开发",  "个人级软件开发", new int[]{ 8});
        timetable.addModule(171, "计算机组成原理1-8个人级软件开发9-16",   "计算机组成原理1-8个人级软件开发9-16",  new int[]{30, 8});
        timetable.addModule(172, "软件框架开发技术1-8个人级软件开发9-16",  "个人级软件开发", new int[]{20, 52});
        timetable.addModule(173, "软件框架开发技术1-8个人级软件开发9-16",  "个人级软件开发", new int[]{20, 52});
       
        timetable.addModule(174, "UML统一建模",  "UML统一建模", new int[]{ 50 });
        timetable.addModule(175, "操作系统",  "操作系统", new int[]{49});
        timetable.addModule(176, "计算机组成原理",   "计算机组成原理",  new int[]{ 30 });
        timetable.addModule(177, "移动终端应用开发基础",   "移动终端应用开发基础",  new int[]{ 9  });
        timetable.addModule(178, "软件测试与质量保证",   "软件测试与质量保证", new int[]{ 51 });
        timetable.addModule(179, "软件测试与质量保证",   "软件测试与质量保证", new int[]{ 51 });
        timetable.addModule(180, "软件需求分析",  "软件需求分析", new int[]{ 26 });
        timetable.addModule(181, "软件框架开发技术1-8个人级软件开发9-16",  "个人级软件开发", new int[]{20, 29});
        timetable.addModule(182, "软件框架开发技术1-8个人级软件开发9-16",  "个人级软件开发", new int[]{20, 29});
        timetable.addModule(183, "个人级软件开发",  "个人级软件开发", new int[]{ 27 });
        timetable.addModule(184, "计算机组成原理1-8个人级软件开发9-16",    "计算机组成原理1-8个人级软件开发9-16",  new int[]{ 30, 27 });
         
        timetable.addModule(185, "计算机图形学",  "计算机图形学", new int[]{ 31 });
        timetable.addModule(186, "Unity3D",  "Unity3D", new int[]{ 34 });
        timetable.addModule(187, "游戏引擎原理与实现",  "游戏引擎原理与实现", new int[]{ 28 });
        timetable.addModule(188, "ANDROID平台程序设计",  "ANDROID平台程序设计", new int[]{ 12 });
        timetable.addModule(189, "游戏引擎原理与实现",  "游戏引擎原理与实现", new int[]{ 28 });
        timetable.addModule(190, "ANDROID平台程序设计1-8游戏职业与素质拓展9-16",   
                                 "ANDROID平台程序设计1-8游戏职业与素质拓展9-16", new int[]{ 12 , 31});
        timetable.addModule(191, "计算机网络",  "计算机网络", new int[]{ 34 });
        timetable.addModule(192, "计算机网络(单)计算机图形学(双)",   "计算机网络(单)计算机图形学(双)", new int[]{ 34 , 31});
        timetable.addModule(193, "游戏引擎原理与实现",  "游戏引擎原理与实现", new int[]{ 28 });
        timetable.addModule(194, "游戏场景设计", "游戏场景设计", new int[]{35});
        timetable.addModule(195, "游戏英语", "游戏英语", new int[]{ 53 });

        timetable.addModule(196, "数据处理与智能决策", "数据处理与智能决策", new int[]{ 54 });
        timetable.addModule(197, "物联网通信技术", "物联网通信技术", new int[]{ 55 });
        timetable.addModule(198, "物联网通信课程设计", "物联网通信课程设计", new int[]{ 55 });
        timetable.addModule(199, "物联网通信课程设计", "物联网通信课程设计", new int[]{ 55 });
        timetable.addModule(200, "数据处理与智能决策", "数据处理与智能决策", new int[]{ 54 });
        timetable.addModule(201, "物联网通信技术", "物联网通信技术", new int[]{ 55 });
        timetable.addModule(202, "物联网通信课程设计", "物联网通信课程设计", new int[]{ 55 });
        timetable.addModule(203, "物联网通信课程设计", "物联网通信课程设计", new int[]{ 55 });
        timetable.addModule(204, "计算机网络",  "计算机网络", new int[]{ 14 });
        timetable.addModule(205, "Linux高级服务应用",  "Linux高级服务应用", new int[]{  40});
        timetable.addModule(206, "计算机网络",  "计算机网络", new int[]{ 14 });
        timetable.addModule(207, "云计算技术1-8Linux程序设计9-16",   
                                 "云计算技术1-8Linux程序设计9-16",  new int[]{ 41 });
        timetable.addModule(208, "云计算技术1-8Linux程序设计9-16",   
                                 "云计算技术1-8Linux程序设计9-16",  new int[]{ 41 });
        timetable.addModule(209, "密码学基础",  "密码学基础", new int[]{  40});
        
        timetable.addModule(210, "数据挖掘",  "数据挖掘", new int[]{  56});
        timetable.addModule(211, "软件工程",  "软件工程", new int[]{  56});
        timetable.addModule(212, "数据采集",  "数据采集", new int[]{  57});
        timetable.addModule(213, "数据采集(实)",  "数据采集(实)", new int[]{  57});
        timetable.addModule(214, "数据挖掘",  "数据挖掘", new int[]{  56});
        timetable.addModule(215, "软件工程",  "软件工程", new int[]{  56});
        timetable.addModule(216, "计算机网络",  "计算机网络", new int[]{ 50 });
        timetable.addModule(217, "Spark大数据快速运算",  "Spark大数据快速运算", new int[]{ 58 });
        timetable.addModule(218, "Spark大数据快速运算",  "Spark大数据快速运算", new int[]{ 58 });
        timetable.addModule(219, "计算机网络",  "计算机网络", new int[]{ 50 });
        timetable.addModule(220, "数据清洗",  "数据清洗", new int[]{  57});
        timetable.addModule(221, "数据清洗(实)",  "数据清洗(实)", new int[]{  57});
        


      
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
        timetable.addGroup(9, 100, new int[] { 45, 46, 47, 48, 49, 50, 51},
                new int[]{1, 2, 4,  5,  10, 12, 13, 16, 17});
        this.Grouprefer.put(9, "2020计科1班公费");
        timetable.addGroup(10, 100, new int[] {  52, 53, 54, 55, 56, 57, 58, 59, 60},
                new int[]{1, 2, 4,  6,  10, 12, 14,  17});
        this.Grouprefer.put(10, "2020计科2班");
        timetable.addGroup(11, 100, new int[] { 61, 62, 63, 64, 65, 66, 67},
                new int[]{1, 4,  6,  10, 12, 14});
        this.Grouprefer.put(11, "2020计科34班");
        timetable.addGroup(12, 100, new int[] { 68, 69, 70, 71, 72, 73, 74},
                new int[]{1, 2, 4,  7,  10, 12, 13, 14});
        this.Grouprefer.put(12, "2020计科56班");
        timetable.addGroup(13, 100, new int[] {  75, 76, 77, 78, 79, 80, 81, 82, 83},
                new int[]{1, 5,  7,  10, 12, 15});
        this.Grouprefer.put(13, "2020软件工程12班");
        timetable.addGroup(14, 100, new int[] { 84, 85, 86, 87, 88, 89, 90, 91},
                new int[]{1, 5,  6,  10, 12, 15});
        this.Grouprefer.put(14, "2020软件工程34班");
        timetable.addGroup(15, 100, new int[] {92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102},
                new int[]{1, 5,  6,  10, 11,12, 13});
        this.Grouprefer.put(15, "2020数媒");
        timetable.addGroup(16, 100, new int[]  {103, 104, 105, 106, 107, 108, 109, 110},
                new int[]{1, 3, 4,  7,  10, 12, 16});
        this.Grouprefer.put(16, "2020物联网工程");
        timetable.addGroup(17, 100, new int[]  {111, 112, 113, 114, 115, 116, 117, 118, 119},
                new int[]{1, 3, 5,  10,11,  12, 16});
        this.Grouprefer.put(17, "2020大数据1班");
        timetable.addGroup(18, 100, new int[]  {120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130},
                new int[]{5, 6, 10, 11,  15, 16, 17});
        this.Grouprefer.put(18, "2019计科1班");
        timetable.addGroup(19, 100, new int[]  { 131, 132, 133, 134, 135, 136, 137, 138, 139, 140},
                new int[]{5, 6, 11,  15, 16, 17});
        this.Grouprefer.put(19, "2019计科2班");
        timetable.addGroup(20, 100, new int[]  { 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151},
                new int[]{ 6, 7, 11,  12,  16, 17});
        this.Grouprefer.put(20, "2019计科嵌入式");
        timetable.addGroup(21, 100, new int[]  {  152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162},
                new int[]{ 6, 11, 17});
        this.Grouprefer.put(21, "2019计科软件方向");
        timetable.addGroup(22, 100, new int[]  {   163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173},
                new int[]{ 7, 12, 16});
        this.Grouprefer.put(22, "2019软件工程架构方向");
        timetable.addGroup(23, 100, new int[]  {    174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184},
                new int[]{ 7, 12, 16});
        this.Grouprefer.put(23, "2019软件工程互联方向");
        timetable.addGroup(24, 100, new int[]  {     185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195},
                new int[]{  13, 15, 18});
        this.Grouprefer.put(24, "2019数媒");
        timetable.addGroup(25, 100, new int[]  {     196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209},
                new int[]{  13, 15, 18});
        this.Grouprefer.put(25, "2019物联网工程");
        timetable.addGroup(26, 100, new int[]  {      210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221},
                new int[]{7,  12, 16});
        this.Grouprefer.put(26, "2019大数据1班");




















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
