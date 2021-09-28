const data=[{groupId: 16,groupName:'2020物联网工程',module:'数据库系统原理',room:'理工一523',professor:'付宝君',timeslotId:13},{groupId: 16,groupName:'2020物联网工程',module:'数据结构',room:'崇师C104',professor:'周英',timeslotId:17},{groupId: 16,groupName:'2020物联网工程',module:'数字电子技术',room:'理工一126',professor:'倪蕴涛',timeslotId:6},{groupId: 16,groupName:'2020物联网工程',module:'物联网专业英语',room:'理工一119',professor:'赵国生',timeslotId:18},{groupId: 16,groupName:'2020物联网工程',module:'Python语言',room:'崇师C306',professor:'姜春茂',timeslotId:8},{groupId: 16,groupName:'2020物联网工程',module:'Python语言(实)',room:'理工一123',professor:'姜春茂',timeslotId:5},{groupId: 16,groupName:'2020物联网工程',module:'数据库应用与开发1班',room:'体育楼211',professor:'付宝君',timeslotId:15},{groupId: 16,groupName:'2020物联网工程',module:'数据库应用与开发2班',room:'体育楼209',professor:'付宝君',timeslotId:14},{groupId: 17,groupName:'2020大数据1班',module:'Python程序设计',room:'体育楼305',professor:'赵丽',timeslotId:7},{groupId: 17,groupName:'2020大数据1班',module:'数据结构',room:'理工一119',professor:'黄玉妍',timeslotId:2},{groupId: 17,groupName:'2020大数据1班',module:'数字逻辑',room:'理工一121',professor:'季伟东',timeslotId:17},{groupId: 17,groupName:'2020大数据1班',module:'大数据原理与应用',room:'理工一519',professor:'季伟东',timeslotId:14},{groupId: 17,groupName:'2020大数据1班',module:'数据库系统原理1-8&&web程序设计9-16',room:'理工一133',professor:'李英梅',timeslotId:15},{groupId: 17,groupName:'2020大数据1班',module:'数据库系统原理',room:'理工一431',professor:'李英梅',timeslotId:13},{groupId: 17,groupName:'2020大数据1班',module:'数据结构2',room:'体育楼209',professor:'黄玉妍',timeslotId:6},{groupId: 17,groupName:'2020大数据1班',module:'数字逻辑1-8web程序设计9-16',room:'理工一521',professor:'季伟东',timeslotId:4},{groupId: 17,groupName:'2020大数据1班',module:'大数据原理与应用(实)',room:'崇师B415',professor:'季伟东',timeslotId:8},{groupId: 18,groupName:'2019计科1班',module:'计算机网络',room:'崇师C101',professor:'王秀珍',timeslotId:2},{groupId: 18,groupName:'2019计科1班',module:'编译原理',room:'理工一519',professor:'李玉霞',timeslotId:18},{groupId: 18,groupName:'2019计科1班',module:'操作系统',room:'理工一126',professor:'于丹',timeslotId:12},{groupId: 18,groupName:'2019计科1班',module:'数据库设计与应用',room:'理工一133',professor:'刘月兰',timeslotId:8},{groupId: 18,groupName:'2019计科1班',module:'信息技术课程标准与教材研究',room:'体育楼309',professor:'宋耀文',timeslotId:9},{groupId: 18,groupName:'2019计科1班',module:'智能教育工程项目设计1-8机器人教育9-16',room:'崇师B616',professor:'于延',timeslotId:4},{groupId: 18,groupName:'2019计科1班',module:'信息技术课程标准与教材研究1-8&&计算机网络',room:'崇师C102',professor:'王秀珍',timeslotId:1},{groupId: 18,groupName:'2019计科1班',module:'智能教育工程项目设计1-8编译原理9-16',room:'理工一521',professor:'李玉霞',timeslotId:14},{groupId: 18,groupName:'2019计科1班',module:'操作系统',room:'崇师C102',professor:'于丹',timeslotId:13},{groupId: 18,groupName:'2019计科1班',module:'数据库设计与应用',room:'崇师C101',professor:'刘月兰',timeslotId:7},{groupId: 18,groupName:'2019计科1班',module:'机器人教育',room:'崇师C306',professor:'于延',timeslotId:3},{groupId: 9,groupName:'2020计科1班公费',module:'数据结构',room:'理工一117',professor:'常晓娟',timeslotId:6},{groupId: 9,groupName:'2020计科1班公费',module:'人工智能导论',room:'理工一123',professor:'朱海龙',timeslotId:7},{groupId: 9,groupName:'2020计科1班公费',module:'计算机辅助教学',room:'理工一123',professor:'刘玉喜',timeslotId:3},{groupId: 9,groupName:'2020计科1班公费',module:'数据结构',room:'崇师B415',professor:'常晓娟',timeslotId:14},{groupId: 9,groupName:'2020计科1班公费',module:'Python程序设计',room:'崇师C103',professor:'贺维',timeslotId:18},{groupId: 9,groupName:'2020计科1班公费',module:'web程序设计与框架应用(单)Python程序设计(双)',room:'理工一126',professor:'贺维',timeslotId:9},{groupId: 9,groupName:'2020计科1班公费',module:'人工智能导论1-8web程序设计与框架应用9-16',room:'理工一123',professor:'房益龙',timeslotId:11},{groupId: 10,groupName:'2020计科2班',module:'数据结构',room:'理工一431',professor:'常晓娟',timeslotId:11},{groupId: 10,groupName:'2020计科2班',module:'人工智能导论',room:'理工一121',professor:'朱海龙',timeslotId:8},{groupId: 10,groupName:'2020计科2班',module:'人工智能导论（实）',room:'理工一519',professor:'朱海龙',timeslotId:3},{groupId: 10,groupName:'2020计科2班',module:'计算机辅助教学',room:'理工一123',professor:'刘玉喜',timeslotId:13},{groupId: 10,groupName:'2020计科2班',module:'数据结构',room:'崇师C102',professor:'常晓娟',timeslotId:9},{groupId: 10,groupName:'2020计科2班',module:'Python程序设计1',room:'理工一126',professor:'贺维',timeslotId:15},{groupId: 10,groupName:'2020计科2班',module:'Python程序设计2',room:'体育楼309',professor:'贺维',timeslotId:7},{groupId: 10,groupName:'2020计科2班',module:'web程序设计与框架应用',room:'理工一121',professor:'房益龙',timeslotId:16},{groupId: 10,groupName:'2020计科2班',module:'web程序设计与框架应用(实)',room:'理工一133',professor:'房益龙',timeslotId:18},{groupId: 11,groupName:'2020计科34班',module:'web程序设计',room:'体育楼309',professor:'范雪琴',timeslotId:18},{groupId: 11,groupName:'2020计科34班',module:'数据结构',room:'理工一117',professor:'魏洪伟',timeslotId:7},{groupId: 11,groupName:'2020计科34班',module:'人工智能导论',room:'崇师C306',professor:'朱晓',timeslotId:9},{groupId: 11,groupName:'2020计科34班',module:'单片机原理与应用',room:'理工一429',professor:'穆全起',timeslotId:5},{groupId: 11,groupName:'2020计科34班',module:'设计模式',room:'理工一126',professor:'李玉霞',timeslotId:16},{groupId: 11,groupName:'2020计科34班',module:'数字逻辑',room:'崇师C102',professor:'王洪侠',timeslotId:2},{groupId: 11,groupName:'2020计科34班',module:'人工智能导论(实)',room:'崇师B415',professor:'朱晓',timeslotId:15},{groupId: 12,groupName:'2020计科56班',module:'web程序设计',room:'崇师C101',professor:'常晓娟',timeslotId:5},{groupId: 12,groupName:'2020计科56班',module:'数据结构',room:'理工一431',professor:'魏洪伟',timeslotId:15},{groupId: 12,groupName:'2020计科56班',module:'人工智能导论',room:'崇师C104',professor:'朱晓',timeslotId:11},{groupId: 12,groupName:'2020计科56班',module:'单片机原理与应用',room:'理工一123',professor:'穆全起',timeslotId:9},{groupId: 12,groupName:'2020计科56班',module:'设计模式',room:'理工一431',professor:'李玉霞',timeslotId:6},{groupId: 12,groupName:'2020计科56班',module:'数字逻辑',room:'体育楼209',professor:'王洪侠',timeslotId:3},{groupId: 12,groupName:'2020计科56班',module:'人工智能导论(实)',room:'体育楼211',professor:'朱晓',timeslotId:18},{groupId: 13,groupName:'2020软件工程12班',module:'Python程序设计',room:'理工一521',professor:'贺维',timeslotId:2},{groupId: 13,groupName:'2020软件工程12班',module:'软件需求分析',room:'体育楼211',professor:'丁云鸿',timeslotId:9},{groupId: 13,groupName:'2020软件工程12班',module:'web程序设计',room:'体育楼211',professor:'石哗琼',timeslotId:6},{groupId: 13,groupName:'2020软件工程12班',module:'数据结构',room:'理工一431',professor:'张明宇',timeslotId:17},{groupId: 13,groupName:'2020软件工程12班',module:'web前端开发技术',room:'理工一429',professor:'林琳',timeslotId:14},{groupId: 13,groupName:'2020软件工程12班',module:'web程序设计(实)',room:'崇师C103',professor:'石哗琼',timeslotId:8},{groupId: 13,groupName:'2020软件工程12班',module:'计算机系统基础',room:'理工一117',professor:'李晶',timeslotId:3},{groupId: 13,groupName:'2020软件工程12班',module:'数据结构2',room:'理工一411',professor:'张明宇',timeslotId:16},{groupId: 13,groupName:'2020软件工程12班',module:'计算机系统基础2',room:'理工一429',professor:'李晶',timeslotId:13},{groupId: 14,groupName:'2020软件工程34班',module:'Python程序设计',room:'理工一119',professor:'贺维',timeslotId:4},{groupId: 14,groupName:'2020软件工程34班',module:'软件需求分析',room:'理工一523',professor:'丁云鸿',timeslotId:3},{groupId: 14,groupName:'2020软件工程34班',module:'web程序设计',room:'体育楼307',professor:'石哗琼',timeslotId:14},{groupId: 14,groupName:'2020软件工程34班',module:'数据结构',room:'崇师C103',professor:'张明宇',timeslotId:11},{groupId: 14,groupName:'2020软件工程34班',module:'web前端开发技术',room:'崇师C104',professor:'林琳',timeslotId:9},{groupId: 14,groupName:'2020软件工程34班',module:'计算机系统基础',room:'理工一429',professor:'李晶',timeslotId:8},{groupId: 14,groupName:'2020软件工程34班',module:'数据结构2',room:'崇师C102',professor:'张明宇',timeslotId:7},{groupId: 14,groupName:'2020软件工程34班',module:'计算机系统基础2',room:'体育楼209',professor:'李晶',timeslotId:2},{groupId: 15,groupName:'2020数媒',module:'计算机图形学',room:'体育楼209',professor:'崔艳玲',timeslotId:8},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,游戏原画设计|c方向1',room:'崇师B616',professor:'贾轶男',timeslotId:14},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,游戏原画设计|c方向2',room:'理工一519',professor:'贾轶男',timeslotId:9},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,游戏原画设计|c方向3',room:'崇师C105',professor:'宋岩风',timeslotId:18},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,游戏原画设计|c方向4',room:'崇师C103',professor:'贾轶男',timeslotId:3},{groupId: 15,groupName:'2020数媒',module:'操作系统API事件',room:'理工一431',professor:'韩贤东',timeslotId:7},{groupId: 15,groupName:'2020数媒',module:'数据结构',room:'崇师B616',professor:'邸佳奇',timeslotId:2},{groupId: 15,groupName:'2020数媒',module:'数据结构(实)',room:'理工一119',professor:'邸佳奇',timeslotId:17},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,三维动画制作技术|c方向1',room:'理工一117',professor:'宋岩风',timeslotId:16},{groupId: 15,groupName:'2020数媒',module:'影视特效制作|c方向5-7,三维动画制作技术|c方向2',room:'崇师C105',professor:'贾轶男',timeslotId:4},{groupId: 15,groupName:'2020数媒',module:'三维动画制作技术',room:'崇师C105',professor:'丁金凤',timeslotId:15},]