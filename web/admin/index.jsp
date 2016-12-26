<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>就业管理中心</title>

    <link href="/admin/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="/admin/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="/admin/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
    <link href="/admin/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
    <!--[if IE]>
    <link href="/admin/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
    <![endif]-->

    <!--[if lt IE 9]>
    <script src="/admin/js/speedup.js" type="text/javascript"></script>
    <script src="/admin/js/jquery-1.11.3.min.js" type="text/javascript"></script><![endif]-->
    <!--[if gte IE 9]><!-->
    <script src="/admin/js/jquery-2.1.4.min.js" type="text/javascript"></script><!--<![endif]-->

    <script src="/admin/js/jquery.cookie.js" type="text/javascript"></script>
    <script src="/admin/js/jquery.validate.js" type="text/javascript"></script>
    <script src="/admin/js/jquery.bgiframe.js" type="text/javascript"></script>
    <script src="/admin/xheditor/xheditor-1.2.2.min.js" type="text/javascript"></script>
    <script src="/admin/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
    <script src="/admin/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>

    <!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->
    <script type="text/javascript" src="/admin/chart/raphael.js"></script>
    <script type="text/javascript" src="/admin/chart/g.raphael.js"></script>
    <script type="text/javascript" src="/admin/chart/g.bar.js"></script>
    <script type="text/javascript" src="/admin/chart/g.line.js"></script>
    <script type="text/javascript" src="/admin/chart/g.pie.js"></script>
    <script type="text/javascript" src="/admin/chart/g.dot.js"></script>

    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=6PYkS1eDz5pMnyfO0jvBNE0F"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js"></script>

    <script src="/admin/js/dwz.core.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.util.date.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.validate.method.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.barDrag.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.drag.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.tree.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.accordion.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.ui.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.theme.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.switchEnv.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.alertMsg.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.contextmenu.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.navTab.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.tab.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.resize.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.dialog.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.dialogDrag.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.sortDrag.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.cssTable.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.stable.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.taskBar.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.ajax.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.pagination.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.database.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.datepicker.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.effects.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.panel.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.checkbox.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.history.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.combox.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.file.js" type="text/javascript"></script>
    <script src="/admin/js/dwz.print.js" type="text/javascript"></script>

    <!-- 可以用dwz.min.js替换前面全部dwz.*.js (注意：替换时下面dwz.regional.zh.js还需要引入)
    <script src="bin/dwz.min.js" type="text/javascript"></script>
    -->
    <script src="/admin/js/dwz.regional.zh.js" type="text/javascript"></script>

    <script type="text/javascript">
        $(function () {
            DWZ.init("dwz.frag.xml", {
                loginUrl: "login_dialog.html", loginTitle: "登录",	// 弹出登录对话框
//		loginUrl:"login.html",	// 跳到登录页面
                statusCode: {ok: 200, error: 300, timeout: 301}, //【可选】
                pageInfo: {
                    pageNum: "pageNum",
                    numPerPage: "numPerPage",
                    orderField: "orderField",
                    orderDirection: "orderDirection"
                }, //【可选】
                keys: {statusCode: "statusCode", message: "message"}, //【可选】
                ui: {hideMode: 'offsets'}, //【可选】hideMode:navTab组件切换的隐藏方式，支持的值有’display’，’offsets’负数偏移位置的值，默认值为’display’
                debug: false,	// 调试模式 【true|false】
                callback: function () {
                    initEnv();
                    $("#themeList").theme({themeBase: "themes"}); // themeBase 相对于index页面的主题base路径
                }
            });
        });
    </script>

</head>

<body>
<div id="layout">
    <div id="header">
        <div class="headerNav">
            <p style="font-size: 28px;color: red;margin: 14px 20px;">就业管理系统</p>
            <ul class="nav">
                <li><a href="#" target="dialog" height="400">您好，${name}</a></li>
                <li><a href="/">退出</a></li>
            </ul>
            <ul class="themeList" id="themeList">
                <li theme="default">
                    <div class="selected">蓝色</div>
                </li>
                <li theme="green">
                    <div>绿色</div>
                </li>
                <li theme="red">
                    <div>红色</div>
                </li>
                <li theme="purple">
                    <div>紫色</div>
                </li>
                <li theme="silver">
                    <div>银色</div>
                </li>
                <li theme="azure">
                    <div>天蓝</div>
                </li>
            </ul>
        </div>

        <!-- navMenu -->

    </div>

    <div id="leftside">
        <div id="sidebar_s">
            <div class="collapse">
                <div class="toggleCollapse">
                    <div></div>
                </div>
            </div>
        </div>
        <div id="sidebar">
            <div class="toggleCollapse"><h2>就业管理中心</h2>
                <div>收缩</div>
            </div>

            <div class="accordion" fillSpace="sidebar">
                <div class="accordionHeader">
                    <h2><span>Folder</span>就业信息管理</h2>
                </div>
                <div class="accordionContent">
                    <ul class="tree treeFolder">
                        <li><a>学生信息管理</a>
                            <ul>
                                <li><a href="/student/baseInfo/1" target="navTab" rel="studentBaseInfo">学生基本信息管理</a>
                                </li>
                            </ul>
                        </li>
                        <li><a>就业协议管理</a>
                            <ul>
                                <li><a href="/contract/1" target="navTab" rel="contractInfo">签约信息管理</a></li>
                            </ul>
                        </li>
                        <li><a>就业情况统计</a>
                            <ul>
                                <li><a href="" target="navTab" rel="bmap">毕业生就业情况统计</a></li>
                                <li><a href="" target="navTab" rel="page1" fresh="false">毕业生就业率统计</a>
                                </li>
                            </ul>
                        </li>

                    </ul>

                </div>
                <div class="accordionHeader">
                    <h2><span>Folder</span>招聘信息管理</h2>
                </div>
                <div class="accordionContent">
                    <ul class="tree treeFolder">
                        <li><a>招聘信息管理</a>
                            <ul>
                                <li><a href="/recruit/school/1" target="navTab" rel="schoolInfo">校园招聘管理</a></li>
                                <li><a href="/recruit/practice/1" target="navTab" rel="practiceInfo">实习招聘管理</a></li>
                                <li><a href="/recruit/network/1" target="navTab" rel="networkInfo">网络招聘管理</a></li>
                                <li><a href="/recruit/notice/1" target="navTab" rel="noticeInfo">通知公告管理</a></li>
                            </ul>
                        </li>
                        <li><a>招聘信息审核</a>
                            <ul>
                                <li><a href="/uncheckRecruit/school/1" target="navTab"
                                       rel="uncheckSchoolInfo">校园招聘审核</a></li>
                                <li><a href="/uncheckRecruit/practice/1" target="navTab" rel="uncheckPracticeInfo">实习招聘审核</a>
                                </li>
                                <li><a href="/uncheckRecruit/network/1" target="navTab"
                                       rel="uncheckNetworkInfo">网络招聘审核</a></li>
                                <li><a href="/recruit/refuse/1" target="navTab" rel="refuseInfo">查看驳回信息</a></li>
                            </ul>
                        </li>
                        <li><a>笔试面试场地管理</a>
                            <ul>
                                <li><a href="" target="navTab" external="true">场地信息管理</a></li>
                                <li><a href="" target="navTab" external="true">场地申请管理</a></li>
                            </ul>
                        </li>
                        <li><a>企业信息管理</a>
                            <ul>
                                <li><a href="dwz.frag.xml" target="navTab" external="true">企业信息管理</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div id="container">
        <div id="navTab" class="tabsPage">
            <div class="tabsPageHeader">
                <div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
                    <ul class="navTab-tab">
                        <li tabid="main" class="main"><a href="javascript:;"><span><span
                                class="home_icon">我的主页</span></span></a></li>
                    </ul>
                </div>
                <div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
                <div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
                <div class="tabsMore">more</div>
            </div>
            <ul class="tabsMoreList">
                <li><a href="javascript:;">我的主页</a></li>
            </ul>
            <div class="navTab-panel tabsPageContent layoutBox">
                <div class="page unitBox">

                </div>
            </div>
        </div>
    </div>

</div>

<div id="footer">221300416_饶观亮_专业实习设计</div>

</body>
</html>