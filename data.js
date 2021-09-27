const data=[{groupId: 1,groupName:'2021计科1班公费',module:'高级语言程序设计1',room:'体育楼211',professor:'范雪琴',timeslotId:17},{groupId: 1,groupName:'2021计科1班公费',module:'高级语言程序设计(实)',room:'崇师C104',professor:'范雪琴',timeslotId:7},{groupId: 1,groupName:'2021计科1班公费',module:'高级语言程序设计2',room:'理工一121',professor:'范雪琴',timeslotId:1},{groupId: 1,groupName:'2021计科1班公费',module:'计算机导论',room:'崇师C102',professor:'孙鹏飞',timeslotId:8},{groupId: 1,groupName:'2021计科1班公费',module:'计算机导论(实)',room:'体育楼209',professor:'孙鹏飞',timeslotId:4},{groupId: 2,groupName:'2021计科2班行知班',module:'高级语言程序设计1',room:'理工一519',professor:'于延',timeslotId:2},{groupId: 2,groupName:'2021计科2班行知班',module:'高级语言程序设计(实)',room:'理工一123',professor:'于延',timeslotId:7},{groupId: 2,groupName:'2021计科2班行知班',module:'高级语言程序设计2',room:'理工一133',professor:'于延',timeslotId:16},{groupId: 2,groupName:'2021计科2班行知班',module:'计算机导论',room:'崇师C306',professor:'孙鹏飞',timeslotId:5},{groupId: 2,groupName:'2021计科2班行知班',module:'计算机导论(实)',room:'理工一523',professor:'孙鹏飞',timeslotId:17},{groupId: 3,groupName:'2021计科34班',module:'高级语言程序设计1',room:'崇师C103',professor:'李红宇',timeslotId:4},{groupId: 3,groupName:'2021计科34班',module:'高级语言程序设计(实)',room:'崇师C306',professor:'李红宇',timeslotId:8},{groupId: 3,groupName:'2021计科34班',module:'高级语言程序设计2',room:'崇师C102',professor:'李红宇',timeslotId:17},{groupId: 3,groupName:'2021计科34班',module:'计算机导论',room:'体育楼309',professor:'张广玲',timeslotId:11},{groupId: 3,groupName:'2021计科34班',module:'计算机导论(实)',room:'崇师B616',professor:'张广玲',timeslotId:5},{groupId: 4,groupName:'2021软件工程12班',module:'软件工程专业导论',room:'崇师B415',professor:'付伟',timeslotId:4},{groupId: 4,groupName:'2021软件工程12班',module:'软件工程专业导论(实)',room:'理工一431',professor:'付伟',timeslotId:2},{groupId: 4,groupName:'2021软件工程12班',module:'高级语言程序设计1',room:'崇师C105',professor:'李志聪',timeslotId:17},{groupId: 4,groupName:'2021软件工程12班',module:'高级语言程序设计(实)',room:'理工一411',professor:'李志聪',timeslotId:1},{groupId: 4,groupName:'2021软件工程12班',module:'高级语言程序设计2',room:'体育楼209',professor:'李志聪',timeslotId:9},{groupId: 5,groupName:'2021软件工程34班',module:'软件工程专业导论',room:'理工一119',professor:'付伟',timeslotId:12},{groupId: 5,groupName:'2021软件工程34班',module:'软件工程专业导论(实)',room:'理工一126',professor:'付伟',timeslotId:11},{groupId: 5,groupName:'2021软件工程34班',module:'高级语言程序设计1',room:'理工一123',professor:'李志聪',timeslotId:10},{groupId: 5,groupName:'2021软件工程34班',module:'高级语言程序设计(实)',room:'体育楼309',professor:'李志聪',timeslotId:4},{groupId: 5,groupName:'2021软件工程34班',module:'高级语言程序设计2',room:'崇师B415',professor:'李志聪',timeslotId:18},{groupId: 6,groupName:'2021数媒专业',module:'高级语言程序设计1',room:'崇师C105',professor:'赵微',timeslotId:18},{groupId: 6,groupName:'2021数媒专业',module:'高级语言程序设计(实)',room:'体育楼305',professor:'赵微',timeslotId:12},{groupId: 6,groupName:'2021数媒专业',module:'高级语言程序设计2',room:'体育楼309',professor:'赵微',timeslotId:5},{groupId: 6,groupName:'2021数媒专业',module:'游戏概论',room:'崇师B415',professor:'周国辉',timeslotId:7},{groupId: 6,groupName:'2021数媒专业',module:'游戏文化与鉴赏',room:'崇师C101',professor:'赵丽',timeslotId:10},{groupId: 6,groupName:'2021数媒专业',module:'游戏文化与鉴赏(实)',room:'理工一431',professor:'赵丽',timeslotId:8},{groupId: 7,groupName:'2021物联网工程',module:'高级语言程序设计1',room:'崇师C104',professor:'姚艳雪',timeslotId:14},{groupId: 7,groupName:'2021物联网工程',module:'高级语言程序设计(实)',room:'崇师C105',professor:'姚艳雪',timeslotId:7},{groupId: 7,groupName:'2021物联网工程',module:'高级语言程序设计2',room:'崇师B415',professor:'姚艳雪',timeslotId:11},{groupId: 7,groupName:'2021物联网工程',module:'物联网工程导论',room:'理工一411',professor:'李世明',timeslotId:18},{groupId: 7,groupName:'2021物联网工程',module:'物联网工程导论(实)',room:'理工一411',professor:'李世明',timeslotId:13},{groupId: 8,groupName:'2021大数据1班',module:'高级语言程序设计1',room:'理工一523',professor:'黄玉妍',timeslotId:13},{groupId: 8,groupName:'2021大数据1班',module:'高级语言程序设计(实)',room:'崇师C104',professor:'黄玉妍',timeslotId:17},{groupId: 8,groupName:'2021大数据1班',module:'高级语言程序设计2',room:'崇师D502',professor:'黄玉妍',timeslotId:4},{groupId: 19,groupName:'2019计科2班',module:'计算机网络',room:'崇师B616',professor:'王秀珍',timeslotId:1},{groupId: 19,groupName:'2019计科2班',module:'编译原理',room:'崇师C101',professor:'李玉霞',timeslotId:9},{groupId: 19,groupName:'2019计科2班',module:'信息技术课程标准与教材研究',room:'理工一521',professor:'宋耀文',timeslotId:13},{groupId: 19,groupName:'2019计科2班',module:'操作系统',room:'崇师C103',professor:'张军',timeslotId:8},{groupId: 19,groupName:'2019计科2班',module:'智能教育工程项目设计',room:'理工一519',professor:'朱海龙',timeslotId:18},{groupId: 19,groupName:'2019计科2班',module:'数据库设计与应用',room:'理工一429',professor:'刘月兰',timeslotId:2},{groupId: 19,groupName:'2019计科2班',module:'智能教育工程项目设计1-8编译原理9-16',room:'体育楼305',professor:'李玉霞',timeslotId:3},{groupId: 19,groupName:'2019计科2班',module:'信息技术课程标准与教材研究1-8&&计算机网络',room:'理工一411',professor:'王秀珍',timeslotId:7},{groupId: 19,groupName:'2019计科2班',module:'数据库设计与应用',room:'崇师C102',professor:'刘月兰',timeslotId:4},{groupId: 19,groupName:'2019计科2班',module:'机器人教育',room:'崇师C105',professor:'于延',timeslotId:10},{groupId: 20,groupName:'2019计科嵌入式',module:'编译原理',room:'理工一126',professor:'朱晓',timeslotId:5},{groupId: 20,groupName:'2019计科嵌入式',module:'操作系统',room:'崇师B616',professor:'于丹',timeslotId:4},{groupId: 20,groupName:'2019计科嵌入式',module:'C++程序设计',room:'理工一123',professor:'刘玉喜',timeslotId:14},{groupId: 20,groupName:'2019计科嵌入式',module:'ARM体系结构',room:'崇师D502',professor:'张广玲',timeslotId:10},{groupId: 20,groupName:'2019计科嵌入式',module:'数据库设计与应用',room:'理工一523',professor:'林琳',timeslotId:18},{groupId: 20,groupName:'2019计科嵌入式',module:'操作系统',room:'理工一431',professor:'于丹',timeslotId:13},{groupId: 20,groupName:'2019计科嵌入式',module:'计算机网络1-8编译原理9-16',room:'理工一521',professor:'王秀珍',timeslotId:3},{groupId: 20,groupName:'2019计科嵌入式',module:'C++程序设计',room:'体育楼307',professor:'刘玉喜',timeslotId:9},{groupId: 20,groupName:'2019计科嵌入式',module:'数据库设计与应用',room:'崇师C103',professor:'林琳',timeslotId:15},{groupId: 20,groupName:'2019计科嵌入式',module:'计算机网络',room:'理工一126',professor:'季伟东',timeslotId:2},{groupId: 21,groupName:'2019计科软件方向',module:'SSH开发技术',room:'体育楼211',professor:'李红宇',timeslotId:16},{groupId: 21,groupName:'2019计科软件方向',module:'编译原理',room:'理工一429',professor:'朱晓',timeslotId:12},{groupId: 21,groupName:'2019计科软件方向',module:'数据库设计与应用',room:'崇师C102',professor:'张广玲',timeslotId:15},{groupId: 21,groupName:'2019计科软件方向',module:'UML统一建模',room:'理工一521',professor:'刘月兰',timeslotId:7},{groupId: 21,groupName:'2019计科软件方向',module:'操作系统',room:'理工一117',professor:'于丹',timeslotId:18},{groupId: 21,groupName:'2019计科软件方向',module:'SSH开发技术',room:'崇师D502',professor:'李红宇',timeslotId:13},{groupId: 21,groupName:'2019计科软件方向',module:'计算机网络1-8编译原理9-16',room:'崇师C102',professor:'朱晓',timeslotId:10},{groupId: 21,groupName:'2019计科软件方向',module:'UML统一建模',room:'理工一411',professor:'刘月兰',timeslotId:8},{groupId: 21,groupName:'2019计科软件方向',module:'操作系统1-8&&数据库设计与应用',room:'理工一429',professor:'于丹',timeslotId:14},{groupId: 21,groupName:'2019计科软件方向',module:'单片机原理与应用',room:'体育楼309',professor:'穆全起',timeslotId:9},{groupId: 21,groupName:'2019计科软件方向',module:'计算机网络',room:'体育楼211',professor:'王秀珍',timeslotId:5},{groupId: 22,groupName:'2019软件工程架构方向',module:'操作系统',room:'崇师C306',professor:'伦立军',timeslotId:11},{groupId: 22,groupName:'2019软件工程架构方向',module:'UML统一建模',room:'理工一521',professor:'马宁',timeslotId:1},{groupId: 22,groupName:'2019软件工程架构方向',module:'软件测试与质量保证',room:'理工一133',professor:'边奕心',timeslotId:4},{groupId: 22,groupName:'2019软件工程架构方向',module:'移动终端应用开发基础',room:'崇师D502',professor:'李志聪',timeslotId:8},{groupId: 22,groupName:'2019软件工程架构方向',module:'软件需求分析',room:'体育楼309',professor:'丁云鸿',timeslotId:17},{groupId: 22,groupName:'2019软件工程架构方向',module:'软件测试与质量保证',room:'理工一126',professor:'边奕心',timeslotId:15},{groupId: 22,groupName:'2019软件工程架构方向',module:'操作系统',room:'理工一121',professor:'伦立军',timeslotId:6},{groupId: 22,groupName:'2019软件工程架构方向',module:'个人级软件开发',room:'理工一523',professor:'付伟',timeslotId:3},{groupId: 22,groupName:'2019软件工程架构方向',module:'计算机组成原理1-8个人级软件开发9-16',room:'崇师C306',professor:'李晶',timeslotId:18},{groupId: 22,groupName:'2019软件工程架构方向',module:'个人级软件开发',room:'理工一411',professor:'于晓东',timeslotId:5},{groupId: 22,groupName:'2019软件工程架构方向',module:'个人级软件开发',room:'崇师C104',professor:'房益龙',timeslotId:9},{groupId: 23,groupName:'2019软件工程互联方向',module:'UML统一建模',room:'理工一119',professor:'马宁',timeslotId:6},{groupId: 23,groupName:'2019软件工程互联方向',module:'操作系统',room:'崇师C102',professor:'伦立军',timeslotId:1},{groupId: 23,groupName:'2019软件工程互联方向',module:'计算机组成原理',room:'体育楼309',professor:'李晶',timeslotId:10},{groupId: 23,groupName:'2019软件工程互联方向',module:'移动终端应用开发基础',room:'体育楼309',professor:'李志聪',timeslotId:14},{groupId: 23,groupName:'2019软件工程互联方向',module:'软件测试与质量保证',room:'理工一521',professor:'边奕心',timeslotId:8},{groupId: 23,groupName:'2019软件工程互联方向',module:'软件测试与质量保证',room:'理工一431',professor:'边奕心',timeslotId:17},{groupId: 23,groupName:'2019软件工程互联方向',module:'个人级软件开发',room:'理工一521',professor:'付伟',timeslotId:15},{groupId: 23,groupName:'2019软件工程互联方向',module:'个人级软件开发',room:'理工一519',professor:'林琳',timeslotId:13},{groupId: 23,groupName:'2019软件工程互联方向',module:'个人级软件开发',room:'理工一411',professor:'林琳',timeslotId:4},{groupId: 23,groupName:'2019软件工程互联方向',module:'个人级软件开发',room:'体育楼209',professor:'石哗琼',timeslotId:5},{groupId: 23,groupName:'2019软件工程互联方向',module:'计算机组成原理1-8个人级软件开发9-16',room:'理工一429',professor:'石哗琼',timeslotId:11},{groupId: 24,groupName:'2019数媒',module:'计算机图形学',room:'崇师C306',professor:'崔艳玲',timeslotId:3},{groupId: 24,groupName:'2019数媒',module:'Unity3D',room:'理工一523',professor:'韩贤东',timeslotId:2},{groupId: 24,groupName:'2019数媒',module:'游戏引擎原理与实现',room:'理工一119',professor:'张明宇',timeslotId:9},{groupId: 24,groupName:'2019数媒',module:'ANDROID平台程序设计',room:'崇师C104',professor:'赵丽',timeslotId:1},{groupId: 24,groupName:'2019数媒',module:'游戏引擎原理与实现',room:'理工一519',professor:'张明宇',timeslotId:7},{groupId: 24,groupName:'2019数媒',module:'ANDROID平台程序设计1-8游戏职业与素质拓展9-16',room:'理工一523',professor:'赵丽',timeslotId:12},{groupId: 24,groupName:'2019数媒',module:'计算机网络',room:'理工一431',professor:'韩贤东',timeslotId:4},{groupId: 24,groupName:'2019数媒',module:'计算机网络(单)计算机图形学(双)',room:'崇师C102',professor:'韩贤东',timeslotId:16},{groupId: 24,groupName:'2019数媒',module:'游戏引擎原理与实现',room:'理工一126',professor:'张明宇',timeslotId:14},{groupId: 24,groupName:'2019数媒',module:'游戏场景设计',room:'崇师D502',professor:'邸佳奇',timeslotId:6},{groupId: 24,groupName:'2019数媒',module:'游戏英语',room:'崇师C306',professor:'段喜梅',timeslotId:17},{groupId: 25,groupName:'2019物联网工程',module:'数据处理与智能决策',room:'崇师B616',professor:'郑岩',timeslotId:14},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信技术',room:'崇师C103',professor:'杜军',timeslotId:3},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信课程设计',room:'理工一521',professor:'杜军',timeslotId:11},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信课程设计',room:'崇师B415',professor:'杜军',timeslotId:17},{groupId: 25,groupName:'2019物联网工程',module:'数据处理与智能决策',room:'崇师B415',professor:'郑岩',timeslotId:10},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信技术',room:'理工一117',professor:'杜军',timeslotId:8},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信课程设计',room:'理工一521',professor:'杜军',timeslotId:16},{groupId: 25,groupName:'2019物联网工程',module:'物联网通信课程设计',room:'崇师C102',professor:'杜军',timeslotId:12},{groupId: 25,groupName:'2019物联网工程',module:'计算机网络',room:'体育楼307',professor:'李世明',timeslotId:6},{groupId: 25,groupName:'2019物联网工程',module:'Linux高级服务应用',room:'理工一521',professor:'赵国生',timeslotId:2},{groupId: 25,groupName:'2019物联网工程',module:'计算机网络',room:'崇师B616',professor:'李世明',timeslotId:7},{groupId: 25,groupName:'2019物联网工程',module:'云计算技术1-8Linux程序设计9-16',room:'崇师C103',professor:'姜春茂',timeslotId:9},{groupId: 25,groupName:'2019物联网工程',module:'云计算技术1-8Linux程序设计9-16',room:'理工一119',professor:'姜春茂',timeslotId:4},{groupId: 25,groupName:'2019物联网工程',module:'密码学基础',room:'理工一431',professor:'赵国生',timeslotId:1},{groupId: 26,groupName:'2019大数据1班',module:'数据挖掘',room:'体育楼307',professor:'邵晶波',timeslotId:11},{groupId: 26,groupName:'2019大数据1班',module:'软件工程',room:'体育楼211',professor:'邵晶波',timeslotId:1},{groupId: 26,groupName:'2019大数据1班',module:'数据采集',room:'体育楼209',professor:'杨建柏',timeslotId:6},{groupId: 26,groupName:'2019大数据1班',module:'数据采集(实)',room:'体育楼307',professor:'杨建柏',timeslotId:15},{groupId: 26,groupName:'2019大数据1班',module:'数据挖掘',room:'体育楼211',professor:'邵晶波',timeslotId:8},{groupId: 26,groupName:'2019大数据1班',module:'软件工程',room:'理工一121',professor:'邵晶波',timeslotId:17},{groupId: 26,groupName:'2019大数据1班',module:'计算机网络',room:'崇师B415',professor:'马宁',timeslotId:2},{groupId: 26,groupName:'2019大数据1班',module:'Spark大数据快速运算',room:'体育楼211',professor:'张修茂',timeslotId:10},{groupId: 26,groupName:'2019大数据1班',module:'Spark大数据快速运算',room:'理工一521',professor:'张修茂',timeslotId:5},{groupId: 26,groupName:'2019大数据1班',module:'计算机网络',room:'理工一126',professor:'马宁',timeslotId:3},{groupId: 26,groupName:'2019大数据1班',module:'数据清洗',room:'体育楼305',professor:'杨建柏',timeslotId:4},{groupId: 26,groupName:'2019大数据1班',module:'数据清洗(实)',room:'理工一133',professor:'杨建柏',timeslotId:18},]