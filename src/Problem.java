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
        timetable.addRoom(14, "体育楼307", 100);
        timetable.addRoom(15, "体育楼309", 100);
        timetable.addRoom(16, "理工一519", 100);
        timetable.addRoom(17, "体育楼209", 100);
        timetable.addRoom(18, "理工一523", 100);
        timetable.addRoom(19, "崇师B415", 100);
        timetable.addRoom(20, "崇师B616", 100);
        timetable.addRoom(21, "崇师C101", 100);
        timetable.addRoom(22, "崇师C102", 100);
        timetable.addRoom(23, "崇师C103", 100);
        timetable.addRoom(24, "崇师C104", 100);
        timetable.addRoom(25, "崇师C306", 100);
        timetable.addRoom(26, "崇师C502", 100);
        timetable.addRoom(27, "崇师C105", 100);


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
        timetable.addProfessor(1, "李红宇", new int[]{0,
                                                                            1,1,0,0,
                                                                            1,1,0,0,
                                                                            1,1,
                                                                            1,1,0,0,
                                                                            1,1,0,0,
                                                                            });
        timetable.addProfessor(2, "外聘", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(3, "外聘", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(4, "张广玲", new int[]{0,
                -1,0,0,0,
                -1,0,0,0,
                -1,0,
                -1,0,0,0,
                -1,0,0,0,
        });
        timetable.addProfessor(5, "赵松", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(6, "李玉霞", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(7, "范雪琴", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(8, "常晓娟", new int[]{0,
                1,1,1,1,
                1,1,1,1,
                0,0,
                0,0,0,0,
                1,1,1,1,
        });
        timetable.addProfessor(9, "穆全起", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(10, "王洪侠", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(11, "魏洪伟", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(12, "朱晓", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(13, "刘月兰", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(14, "林琳", new int[]{0,
                1,1,0,0,
                1,1,1,1,
                1,1,
                1,1,1,1,
                1,1,0,0,
        });
        timetable.addProfessor(15, "刘玉喜", new int[]{0,
                -1,0,0,0,
                -1,0,0,0,
                -1,0,
                -1,0,0,0,
                -1,0,0,0,
        });
        timetable.addProfessor(16, "王秀珍", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(17, "于丹", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(18, "于延", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(19, "孙鹏飞", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(20, "朱海龙", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(21, "贺维", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(22, "邵晶波", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(23, "马宁", new int[]{0,
                0,0,0,0,
                1,1,1,1,
                1,1,
                0,0,0,0,
                1,1,1,1,
        });
        timetable.addProfessor(24, "杨建柏", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(25, "王金江", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(26, "黄玉妍", new int[]{0,
                -1,-1,-1,-1,
                0,0,0,0,
                0,0,
                -1,-1,-1,-1,
                0,0,0,0,
        });
        timetable.addProfessor(27, "贺裕", new int[]{0,
                0,1,0,0,
                0,1,0,0,
                0,1,
                0,1,0,0,
                0,1,0,0,
        });
        timetable.addProfessor(28, "季伟东", new int[]{0,
                0,0,0,0,
                0,0,1,1,
                0,0,
                0,0,0,0,
                1,1,1,1,
        });
        timetable.addProfessor(29, "赵丽", new int[]{0,
                1,1,0,0,
                1,1,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(30, "李英梅", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(31, "李世明", new int[]{0,
                0,0,0,0,
                1,1,1,1,
                1,1,
                1,1,1,1,
                0,0,0,0,
        });
        timetable.addProfessor(32, "姚艳雪", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(33, "周英", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(34, "郑岩", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(35, "倪蕴涛", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(36, "付宝君", new int[]{0,
                -1,0,0,0,
                -1,0,0,0,
                -1,0,
                -1,0,0,0,
                -1,0,0,0,
        });
        timetable.addProfessor(37, "赵国生", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(38, "姜春茂", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(39, "杜军", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(40, "段喜梅", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(41, "韩贤东", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(42, "崔艳玲", new int[]{0,
                1,1,0,0,
                0,0,0,0,
                0,0,
                1,1,1,1,
                1,1,1,1,
        });
        timetable.addProfessor(43, "邸佳奇", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(44, "张明宇", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(45, "李持磊", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(46, "周国辉", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(47, "赵微", new int[]{0,
                0,0,0,0,
                1,1,0,0,
                0,0,
                0,0,0,0,
                1,1,0,0,
        });
        timetable.addProfessor(48, "王禹贺", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });
        timetable.addProfessor(49, "丁金凤", new int[]{0,
                0,0,0,0,
                0,0,0,0,
                0,0,
                0,0,0,0,
                0,0,0,0,
        });


        // Set up modules and define the professors that teach them
        timetable.addModule(1, "高级语言程序设计", "高级语言程序设计", new int[] { 1 });
        timetable.addModule(2, "高数1", "高等数学1", new int[] { 2 });
        timetable.addModule(3, "线代","线性代数", new int[] { 3 });
        timetable.addModule(4, "导论", "计算机导论", new int[] {  4 });
        timetable.addModule(5, "数据结构课程设计", "数据结构课程设计", new int[] { 5 });
        timetable.addModule(6, "工程项目综合实践1","工程项目综合实践1" , new int[] { 5 });
        timetable.addModule(7, "设计模式","设计模式" , new int[] { 6 });
        timetable.addModule(8, "web程序设计","web程序设计" , new int[] { 7,8 });
        timetable.addModule(9, "单片机原理与应用","单片机原理与应用" , new int[] { 9 });
        timetable.addModule(10, "数字逻辑","数字逻辑" , new int[] { 10 });
        timetable.addModule(11,"概率论", "概率论与数理统计", new int[]{2});
        timetable.addModule(12,"数据结构", "数据结构", new int[]{11});
        timetable.addModule(13,"人工智能导论", "人工智能导论", new int[]{12});
        timetable.addModule(14,"SSH框架开发技术", "SSH框架开发技术", new int[]{1});
        timetable.addModule(15,"UML统一建模", "UML建模", new int[]{13});
        timetable.addModule(16,"ARM体系结构", "ARM体系结构", new int[]{4});
        timetable.addModule(17,"数据库设计与应用", "数据库设计与应用", new int[]{4,14});
        timetable.addModule(18,"C++程序设计", "C++程序设计", new int[]{15});
        timetable.addModule(19,"计算机网络", "计算机网络", new int[]{16});
        timetable.addModule(20,"操作系统", "操作系统", new int[]{17});
        timetable.addModule(21,"编译原理课程设计", "编译原理课程设计", new int[]{5, 6, 12});
        timetable.addModule(22,"单片机原理与应用", "单片机原理与应用", new int[]{9});
        timetable.addModule(23,"编译原理", "编译原理", new int[]{12});
        timetable.addModule(24,"高级语言程序设计", "高级语言程序设计", new int[]{7, 18});
        timetable.addModule(25,"高数1", "高等数学1", new int[]{2});
        timetable.addModule(26,"线性代数", "线性代数", new int[]{2});
        timetable.addModule(27,"计算机导论", "计算机导论", new int[]{19});
        timetable.addModule(28,"数据结构", "数据结构", new int[]{8});
        timetable.addModule(29,"概率论与数理统计", "概率论与数理统计", new int[]{2});
        timetable.addModule(30,"教育学原理", "教育学原理", new int[]{2});
        timetable.addModule(31,"人工智能导论", "人工智能导论", new int[]{20});
        timetable.addModule(32,"数据结构课程设计", "数据结构课程设计", new int[]{5});
        timetable.addModule(33,"Python程序设计", "Python程序设计", new int[]{21});
        timetable.addModule(34,"web程序设计与框架应用", "web程序设计与框架应用", new int[]{2});
        timetable.addModule(35,"计算机辅助教学", "计算机辅助教学", new int[]{15});
        timetable.addModule(36,"软件工程", "软件工程", new int[]{22});
        timetable.addModule(37,"计算机网络", "计算机网络", new int[]{23});
        timetable.addModule(38,"Spark大数据快速运算", "Spark快速运算", new int[]{2});
        timetable.addModule(39,"数据清洗", "数据清洗", new int[]{24});
        timetable.addModule(40,"综合课程设计(spark)", "综合课程设计(spark)", new int[]{2});
        timetable.addModule(41,"数据采集", "数据采集", new int[]{24});
        timetable.addModule(42,"数据挖掘", "数据挖掘", new int[]{22});
        timetable.addModule(43,"线性代数", "线性代数", new int[]{25});
        timetable.addModule(44,"高级语言程序设计", "高级语言程序设计", new int[]{26});
        timetable.addModule(45,"高等数学1", "高等数学1", new int[]{27});
        timetable.addModule(46,"大数据技术原理与应用", "大数据技术原理与应用", new int[]{28});
        timetable.addModule(47,"Web程序设计", "Web程序设计", new int[]{29});
        timetable.addModule(48,"Python程序设计", "Python程序设计", new int[]{29});
        timetable.addModule(49,"数字逻辑", "数字逻辑", new int[]{28});
        timetable.addModule(50,"数据结构", "数据结构", new int[]{26});
        timetable.addModule(51,"数据库系统原理", "数据库系统原理", new int[]{30});
        timetable.addModule(52,"物联网工程导论", "物联网工程导论", new int[]{31});
        timetable.addModule(53,"高级语言程序设计", "高级语言程序设计", new int[]{32});
        timetable.addModule(54,"高级语言程序设计训练", "高级语言程序设计训练", new int[]{32});
        timetable.addModule(55,"数据结构", "数据结构", new int[]{33});
        timetable.addModule(56,"概率论与数理统计", "概率论与数理统计", new int[]{34});
        timetable.addModule(57,"数字电子技术", "数字电子技术", new int[]{35});
        timetable.addModule(58,"数据库系统原理", "数据库系统原理", new int[]{36});
        timetable.addModule(59,"物联网专业英语(英语)", "物联网专业英语(英语)", new int[]{37});
        timetable.addModule(60,"Python语言", "Python语言", new int[]{38});
        timetable.addModule(61,"数字电子技术应用实践", "数字电子技术应用实践", new int[]{35});
        timetable.addModule(62,"数据库应用与开发", "数据库应用与开发", new int[]{36});
        timetable.addModule(63,"计算机网络", "计算机网络", new int[]{31});
        timetable.addModule(64,"物联网通信技术", "物联网通信技术", new int[]{39});
        timetable.addModule(65,"数据处理与智能决策", "数据处理与智能决策", new int[]{34});
        timetable.addModule(66,"云计算技术", "云计算技术", new int[]{38});
        timetable.addModule(67,"Linux高级服务应用", "Linux高级服务应用", new int[]{37});
        timetable.addModule(68,"物联网通信课程设计", "物联网通信课程设计", new int[]{39});
        timetable.addModule(69,"Linux程序设计", "Linux程序设计", new int[]{38});
        timetable.addModule(70,"密码学基础", "密码学基础", new int[]{37});
        timetable.addModule(71,"游戏英语", "游戏英语", new int[]{40});
        timetable.addModule(72,"Unity3D", "Unity3D", new int[]{41});
        timetable.addModule(73,"游戏职业与素质拓展", "游戏职业与素质拓展", new int[]{42});
        timetable.addModule(74,"游戏场景设计", "游戏场景设计", new int[]{43});
        timetable.addModule(75,"ANDROID平台程序设计", "ANDROID平台程序设计", new int[]{29});
        timetable.addModule(76,"计算机网络", "计算机网络", new int[]{41});
        timetable.addModule(77,"计算机图形学", "计算机图形学", new int[]{42});
        timetable.addModule(78,"游戏引擎原理及实现", "游戏引擎原理及实现", new int[]{44});
        timetable.addModule(79,"高等数学1", "高等数学1", new int[]{45});
        timetable.addModule(80,"线性代数", "线性代数", new int[]{25});
        timetable.addModule(81,"游戏文化与鉴赏", "游戏文化与鉴赏", new int[]{29});
        timetable.addModule(82,"游戏概论", "游戏概论", new int[]{46});
        timetable.addModule(83,"高级语言程序设计", "高级语言程序设计", new int[]{47});
        timetable.addModule(84,"三维动画制作技术", "三维动画制作技术", new int[]{43});
        timetable.addModule(85,"操作系统API实践", "操作系统API实践", new int[]{41});
        timetable.addModule(86,"概率论与数理统计", "概率论与数理统计", new int[]{48});
        timetable.addModule(87,"影视特效制作", "影视特效制作", new int[]{2});
        timetable.addModule(88,"游戏原画设计", "游戏原画设计", new int[]{2});
        timetable.addModule(89,"二维动画制作", "二维动画制作", new int[]{49});
        timetable.addModule(90,"数据结构", "数据结构", new int[]{40});
        timetable.addModule(91,"计算机图形学", "计算机图形学", new int[]{42});










        // Set up student groups and the modules they take.
        timetable.addGroup(1, 100, new int[] { 1,2, 3, 4 });//计科非师2021
        this.Grouprefer.put(1, "计科非师2021");
        timetable.addGroup(2, 100, new int[] { 5, 6, 7, 8, 9, 10, 11, 12, 13 });//计科非师2020
        this.Grouprefer.put(2, "计科非师2020");
        timetable.addGroup(3, 100, new int[] { 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 });//计科非师2019
        this.Grouprefer.put(3, "计科非师2019" );
        timetable.addGroup(4, 100, new int[] { 24, 25, 26, 27 });//计科师范2021
        this.Grouprefer.put(4, "计科师范2021");
        timetable.addGroup(5, 100, new int[] { 28, 29, 30, 31, 32, 33, 34, 35 });//计科师范2020
        this.Grouprefer.put(5, "计科师范2020");
        timetable.addGroup(6, 100, new int[] { 36, 37, 38, 39, 40, 41, 42 });//大数据2019
        this.Grouprefer.put(6, "大数据2019");
        timetable.addGroup(7, 100, new int[] { 43, 44, 45 });//大数据2021
        this.Grouprefer.put(7, "大数据2021");
        timetable.addGroup(8, 100, new int[] { 46, 47, 48, 49, 50, 51 });//大数据2020
        this.Grouprefer.put(8, "大数据2020");
        timetable.addGroup(9, 100, new int[] { 52, 53, 54 });//物联网2021
        this.Grouprefer.put(9, "物联网2021");
        timetable.addGroup(10, 100, new int[] { 55, 56, 57, 58, 59, 60, 61, 62 });//物联网2020
        this.Grouprefer.put(10, "物联网2020");
        timetable.addGroup(11, 100,new int[]{63, 64, 65, 66, 67, 68, 69, 70});//物联网2019
        this.Grouprefer.put(11, "物联网2019");
        timetable.addGroup(12, 100, new int[]{71, 72, 73, 74, 75, 76, 77, 78});//数媒2019
        this.Grouprefer.put(12, "数媒2019");
        timetable.addGroup(13, 100, new int[]{79, 80, 81, 82, 83});//数媒2021
        this.Grouprefer.put(13, "数媒2021");
        timetable.addGroup(14, 100, new int[]{84, 85, 86, 87, 88, 89, 90, 91});//数媒2020
        this.Grouprefer.put(14, "数媒2020");
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


        fitness=   1/(double)(clashes+1);
        individual.setFitness(fitness);

        return fitness;
    }
}
