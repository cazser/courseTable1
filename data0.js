const data=[{groupId: 1,groupName:'计科非师2021',module:'高级语言程序设计',room:'理工一521',professor:'李红宇',timeslotId:10},{groupId: 1,groupName:'计科非师2021',module:'高等数学1',room:'理工一519',professor:'外聘',timeslotId:11},{groupId: 1,groupName:'计科非师2021',module:'线性代数',room:'体育楼305',professor:'外聘',timeslotId:6},{groupId: 1,groupName:'计科非师2021',module:'计算机导论',room:'理工一519',professor:'张广玲',timeslotId:8},{groupId: 2,groupName:'计科非师2020',module:'数据结构课程设计',room:'理工一521',professor:'赵松',timeslotId:13},{groupId: 2,groupName:'计科非师2020',module:'工程项目综合实践1',room:'崇师C105',professor:'赵松',timeslotId:18},{groupId: 2,groupName:'计科非师2020',module:'设计模式',room:'体育楼305',professor:'李玉霞',timeslotId:4},{groupId: 2,groupName:'计科非师2020',module:'web程序设计',room:'理工一117',professor:'常晓娟',timeslotId:6},{groupId: 2,groupName:'计科非师2020',module:'单片机原理与应用',room:'崇师C104',professor:'穆全起',timeslotId:11},{groupId: 2,groupName:'计科非师2020',module:'数字逻辑',room:'崇师C105',professor:'王洪侠',timeslotId:8},{groupId: 2,groupName:'计科非师2020',module:'概率论与数理统计',room:'理工一429',professor:'外聘',timeslotId:1},{groupId: 2,groupName:'计科非师2020',module:'数据结构',room:'体育楼209',professor:'魏洪伟',timeslotId:7},{groupId: 2,groupName:'计科非师2020',module:'人工智能导论',room:'崇师C103',professor:'朱晓',timeslotId:10},{groupId: 3,groupName:'计科非师2019',module:'SSH框架开发技术',room:'崇师C306',professor:'李红宇',timeslotId:16},{groupId: 3,groupName:'计科非师2019',module:'UML建模',room:'体育楼309',professor:'刘月兰',timeslotId:1},{groupId: 3,groupName:'计科非师2019',module:'ARM体系结构',room:'体育楼209',professor:'张广玲',timeslotId:9},{groupId: 3,groupName:'计科非师2019',module:'数据库设计与应用',room:'理工一523',professor:'林琳',timeslotId:7},{groupId: 3,groupName:'计科非师2019',module:'C++程序设计',room:'体育楼209',professor:'刘玉喜',timeslotId:11},{groupId: 3,groupName:'计科非师2019',module:'计算机网络',room:'理工一411',professor:'王秀珍',timeslotId:2},{groupId: 3,groupName:'计科非师2019',module:'操作系统',room:'崇师C102',professor:'于丹',timeslotId:5},{groupId: 3,groupName:'计科非师2019',module:'编译原理课程设计',room:'理工一121',professor:'朱晓',timeslotId:15},{groupId: 3,groupName:'计科非师2019',module:'单片机原理与应用',room:'崇师B415',professor:'穆全起',timeslotId:4},{groupId: 3,groupName:'计科非师2019',module:'编译原理',room:'体育楼307',professor:'朱晓',timeslotId:12},{groupId: 4,groupName:'计科师范2021',module:'高级语言程序设计',room:'理工一429',professor:'范雪琴',timeslotId:7},{groupId: 4,groupName:'计科师范2021',module:'高等数学1',room:'崇师C105',professor:'外聘',timeslotId:13},{groupId: 4,groupName:'计科师范2021',module:'线性代数',room:'体育楼305',professor:'外聘',timeslotId:12},{groupId: 4,groupName:'计科师范2021',module:'计算机导论',room:'崇师C104',professor:'孙鹏飞',timeslotId:15},{groupId: 5,groupName:'计科师范2020',module:'数据结构',room:'理工一123',professor:'常晓娟',timeslotId:1},{groupId: 5,groupName:'计科师范2020',module:'概率论与数理统计',room:'体育楼309',professor:'外聘',timeslotId:9},{groupId: 5,groupName:'计科师范2020',module:'教育学原理',room:'崇师C502',professor:'外聘',timeslotId:16},{groupId: 5,groupName:'计科师范2020',module:'人工智能导论',room:'理工一117',professor:'朱海龙',timeslotId:11},{groupId: 5,groupName:'计科师范2020',module:'数据结构课程设计',room:'理工一126',professor:'赵松',timeslotId:6},{groupId: 5,groupName:'计科师范2020',module:'Python程序设计',room:'体育楼211',professor:'贺维',timeslotId:15},{groupId: 5,groupName:'计科师范2020',module:'web程序设计与框架应用',room:'崇师C306',professor:'外聘',timeslotId:3},{groupId: 5,groupName:'计科师范2020',module:'计算机辅助教学',room:'理工一429',professor:'刘玉喜',timeslotId:13},{groupId: 6,groupName:'大数据2019',module:'软件工程',room:'体育楼309',professor:'邵晶波',timeslotId:4},{groupId: 6,groupName:'大数据2019',module:'计算机网络',room:'崇师B415',professor:'马宁',timeslotId:8},{groupId: 6,groupName:'大数据2019',module:'Spark快速运算',room:'理工一429',professor:'外聘',timeslotId:18},{groupId: 6,groupName:'大数据2019',module:'数据清洗',room:'崇师C101',professor:'杨建柏',timeslotId:16},{groupId: 6,groupName:'大数据2019',module:'综合课程设计(spark)',room:'理工一519',professor:'外聘',timeslotId:6},{groupId: 6,groupName:'大数据2019',module:'数据采集',room:'崇师C103',professor:'杨建柏',timeslotId:12},{groupId: 6,groupName:'大数据2019',module:'数据挖掘',room:'理工一519',professor:'邵晶波',timeslotId:7},{groupId: 7,groupName:'大数据2021',module:'线性代数',room:'体育楼305',professor:'王金江',timeslotId:16},{groupId: 7,groupName:'大数据2021',module:'高级语言程序设计',room:'理工一117',professor:'黄玉妍',timeslotId:10},{groupId: 7,groupName:'大数据2021',module:'高等数学1',room:'理工一126',professor:'贺裕',timeslotId:2},{groupId: 8,groupName:'大数据2020',module:'大数据技术原理与应用',room:'崇师B616',professor:'季伟东',timeslotId:17},{groupId: 8,groupName:'大数据2020',module:'Web程序设计',room:'理工一123',professor:'赵丽',timeslotId:15},{groupId: 8,groupName:'大数据2020',module:'Python程序设计',room:'理工一523',professor:'赵丽',timeslotId:11},{groupId: 8,groupName:'大数据2020',module:'数字逻辑',room:'崇师B415',professor:'季伟东',timeslotId:6},{groupId: 8,groupName:'大数据2020',module:'数据结构',room:'理工一126',professor:'黄玉妍',timeslotId:13},{groupId: 8,groupName:'大数据2020',module:'数据库系统原理',room:'理工一431',professor:'李英梅',timeslotId:10},{groupId: 9,groupName:'物联网2021',module:'物联网工程导论',room:'崇师C105',professor:'李世明',timeslotId:10},{groupId: 9,groupName:'物联网2021',module:'高级语言程序设计',room:'理工一411',professor:'姚艳雪',timeslotId:6},{groupId: 9,groupName:'物联网2021',module:'高级语言程序设计训练',room:'体育楼211',professor:'姚艳雪',timeslotId:12},{groupId: 10,groupName:'物联网2020',module:'数据结构',room:'理工一121',professor:'周英',timeslotId:8},{groupId: 10,groupName:'物联网2020',module:'概率论与数理统计',room:'体育楼211',professor:'郑岩',timeslotId:7},{groupId: 10,groupName:'物联网2020',module:'数字电子技术',room:'理工一429',professor:'倪蕴涛',timeslotId:17},{groupId: 10,groupName:'物联网2020',module:'数据库系统原理',room:'理工一431',professor:'付宝君',timeslotId:3},{groupId: 10,groupName:'物联网2020',module:'物联网专业英语(英语)',room:'崇师C105',professor:'赵国生',timeslotId:1},{groupId: 10,groupName:'物联网2020',module:'Python语言',room:'体育楼209',professor:'姜春茂',timeslotId:18},{groupId: 10,groupName:'物联网2020',module:'数字电子技术应用实践',room:'崇师C104',professor:'倪蕴涛',timeslotId:9},{groupId: 10,groupName:'物联网2020',module:'数据库应用与开发',room:'理工一121',professor:'付宝君',timeslotId:14},{groupId: 11,groupName:'物联网2019',module:'计算机网络',room:'崇师C103',professor:'李世明',timeslotId:1},{groupId: 11,groupName:'物联网2019',module:'物联网通信技术',room:'理工一521',professor:'杜军',timeslotId:18},{groupId: 11,groupName:'物联网2019',module:'数据处理与智能决策',room:'体育楼211',professor:'郑岩',timeslotId:5},{groupId: 11,groupName:'物联网2019',module:'云计算技术',room:'理工一521',professor:'姜春茂',timeslotId:4},{groupId: 11,groupName:'物联网2019',module:'Linux高级服务应用',room:'体育楼305',professor:'赵国生',timeslotId:9},{groupId: 11,groupName:'物联网2019',module:'物联网通信课程设计',room:'体育楼307',professor:'杜军',timeslotId:8},{groupId: 11,groupName:'物联网2019',module:'Linux程序设计',room:'崇师C104',professor:'姜春茂',timeslotId:16},{groupId: 11,groupName:'物联网2019',module:'密码学基础',room:'理工一431',professor:'赵国生',timeslotId:7},{groupId: 12,groupName:'数媒2019',module:'游戏英语',room:'体育楼307',professor:'段喜梅',timeslotId:14},{groupId: 12,groupName:'数媒2019',module:'Unity3D',room:'体育楼305',professor:'韩贤东',timeslotId:1},{groupId: 12,groupName:'数媒2019',module:'游戏职业与素质拓展',room:'理工一123',professor:'崔艳玲',timeslotId:17},{groupId: 12,groupName:'数媒2019',module:'游戏场景设计',room:'理工一411',professor:'邸佳奇',timeslotId:16},{groupId: 12,groupName:'数媒2019',module:'ANDROID平台程序设计',room:'体育楼209',professor:'赵丽',timeslotId:13},{groupId: 12,groupName:'数媒2019',module:'计算机网络',room:'体育楼209',professor:'韩贤东',timeslotId:15},{groupId: 12,groupName:'数媒2019',module:'计算机图形学',room:'理工一521',professor:'崔艳玲',timeslotId:5},{groupId: 12,groupName:'数媒2019',module:'游戏引擎原理及实现',room:'理工一121',professor:'张明宇',timeslotId:3},{groupId: 13,groupName:'数媒2021',module:'高等数学1',room:'崇师C102',professor:'李持磊',timeslotId:18},{groupId: 13,groupName:'数媒2021',module:'线性代数',room:'理工一521',professor:'王金江',timeslotId:3},{groupId: 13,groupName:'数媒2021',module:'游戏文化与鉴赏',room:'理工一133',professor:'赵丽',timeslotId:9},{groupId: 13,groupName:'数媒2021',module:'游戏概论',room:'理工一121',professor:'周国辉',timeslotId:4},{groupId: 13,groupName:'数媒2021',module:'高级语言程序设计',room:'理工一119',professor:'赵微',timeslotId:12},{groupId: 14,groupName:'数媒2020',module:'三维动画制作技术',room:'理工一429',professor:'邸佳奇',timeslotId:8},{groupId: 14,groupName:'数媒2020',module:'操作系统API实践',room:'理工一121',professor:'韩贤东',timeslotId:9},{groupId: 14,groupName:'数媒2020',module:'概率论与数理统计',room:'崇师C306',professor:'王禹贺',timeslotId:7},{groupId: 14,groupName:'数媒2020',module:'影视特效制作',room:'理工一121',professor:'外聘',timeslotId:17},{groupId: 14,groupName:'数媒2020',module:'游戏原画设计',room:'体育楼307',professor:'外聘',timeslotId:4},{groupId: 14,groupName:'数媒2020',module:'二维动画制作',room:'体育楼309',professor:'丁金凤',timeslotId:15},{groupId: 14,groupName:'数媒2020',module:'数据结构',room:'崇师C101',professor:'段喜梅',timeslotId:1},{groupId: 14,groupName:'数媒2020',module:'计算机图形学',room:'理工一117',professor:'崔艳玲',timeslotId:16},]