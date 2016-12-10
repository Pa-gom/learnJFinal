<!--
  Created by IntelliJ IDEA.
  User: Ezreal
  Date: 2016/12/6
  Time: 13:29
  To change this template use File | Settings | File Templates.
-->
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=9"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/listtsinghua.css"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/detail.css"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/purple.css"/>
    <link href="http://libs.baidu.com/fontawesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/1.7.1/jquery.min.js"></script>
    <script type="text/javascript" src="/themes/30480/fzu_new/js/common.js"></script>
    <title>福大信息 - 福州大学</title>
    <!-- Favicons -->
    <link rel="shortcut icon" href="/themes/30480/fzu_new/ico/favicon.ico">
    <link rel="apple-touch-icon" href="/themes/30480/fzu_new/ico/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/themes/30480/fzu_new/ico/apple-touch-icon-72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/themes/30480/fzu_new/ico/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/themes/30480/fzu_new/ico/apple-touch-icon-144.png">

    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/purple.css" id="themeCss"/>
    <!--<script type="text/javascript" src="/themes/30480/fzu_new/js/swapstyle.js"></script>-->
</head>

<body>
<#include "template/header.jsp" />
    <!-- Start Banner -->
    <div id="banner" style="background-image:url(/attach/2015/05/10/119502.jpg);">
        <!--
        <div id="cat" stytle="display:none;">
         <h1>福大信息</h1>
        </div>
        -->
    </div>
    <!-- End Banner -->
    <!-- Start Main -->
    <div id="main">
        <div id="lside2">
            <!-- Start Sidebar -->
            <div class="leftNav">
                <h3 id="submenu"><a class="fa fa-bars menuicon"></a>${currentColumnName}</h3>
                <ul class="yahei">
                    <li class="current"><i class="fa fa-plus"></i><a target="" href=''>${currentColumnName}</a></li>
                </ul>
            </div>
            <!-- End Sidebar -->
        </div>
        <div id="rside2">
            <br/>
            <h3>当前位置：<a href="/">首页</a>  > <a href='' >${currentColumnName}</a> </h3>
            <h1>${currentColumnName}</h1>
            <style>
                /*
                .list_main_content ul li{ height:30px; line-height:30px; padding-left:20px; text-align:left; }
                .list_main_content ul li a{ color:#33333; font-size:12px; }
                .list_time{ float:right; padding-right:25px; color:#999999; }
                */
                .ecms_pag { margin:0 auto; }
                .ecms_pagination { padding: 2px; margin-top:30px; height:22px; line-height:22px; float:left; padding-bottom:5px; }
                .ecms_pagination ul { margin: 0px; padding: 0px; text-align: left; font-size: 12px; }
                .ecms_drop { padding-left:5px; }
                .ecms_pagination li { padding-bottom: 1px; display: inline; list-style-type: none; } .ecms_pagination a { padding: 4px 8px; border: 1px solid #e5e5e5; color: #666666; text-decoration: none; }
                .ecms_pagination a:visited { padding: 4px 8px; background-color:#e5e5e5; color: rgb(46, 106, 177); text-decoration: none; border:1px solid #e5e5e5; }
                .ecms_pagination a:hover { color: rgb(0, 0, 0); background-color:#e5e5e5; }
                .ecms_pagination a:active { border: 1px solid #e5e5e5; color: rgb(0, 0, 0); background-color: lightyellow; }
                .ecms_pagination li.ecms_currentpage { margin-left:2px; padding: 5px 8px; color: rgb(255, 255, 255); font-weight: bold; background-color: #cf0000; }
                .ecms_pagination li.ecms_disablepage { padding: 4px 8px; border: 1px solid #e5e5e5; color: rgb(146, 146, 146); }
                .ecms_pagination li.ecms_nextpage { font-weight: bold; }
                * html .ecms_pagination li.ecms_currentpage { padding-right: 0px; margin-right: 5px; }
                * html .ecms_pagination li.ecms_disablepage { padding-right: 0px; margin-right: 5px; }
                .ecms_go { padding: 2px; margin:30px 30px 30px 0; height:22px; line-height:22px; float:right; padding-bottom:5px; font-size:12px; }
                .ecms_list_p6 { padding:3px 7px; border: 1px solid #e5e5e5; color: #666666; cursor:pointer; text-decoration: none; }
                .ecms_jump_input { width:30px; }
            </style>

            <ul class="list_main_content">
                <#list infoList.getList() as x>
                <li>
                    <span>${x.empRecruitPublishDateTime}</span>
                    <h3><a href="/detail/${x.empRecruitNo}" title="${x.empRecruitTitle}">${x.empRecruitTitle}</a></h3>
                </li>
                </#list>
            </ul>
            <script>
                function changeUrl() {
                    var url = $("#goToUrl").attr("href");
                    var num = $("#pageNum").val();
                    url = url.replace("1.html", num + ".html");
                    $("#goToUrl").attr("href", url);
                }
            </script>
            <div class="ecms_pag">
                <div class="ecms_pagination">
                    <ul>
                        <a class="ecms_disablepage" href="/html/fdxx/1.html"><</a>
                        <li class="ecms_currentpage">1</li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/2.html"><strong>2</strong></a></li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/3.html"><strong>3</strong></a></li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/4.html"><strong>4</strong></a></li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/5.html"><strong>5</strong></a></li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/6.html"><strong>6</strong></a></li>
                        <li><a class="ecms_pagenav" href="/html/fdxx/7.html"><strong>7</strong></a></li>
                        ...
                        <li><a href="/html/fdxx/239.html">239</a></li>
                        <li><a href="/html/fdxx/240.html">240</a></li>
                        <li class="nextpage"><a href="/html/fdxx/2.html"> ></a></li>
                    </ul>
                </div>
                <div class="ecms_go">
                    跳转：<input type="text" class="ecms_jump_input" id="pageNum" onchange="changeUrl()"/> 页 <a style="cursor:hand" class="list_p6" id="goToUrl" href="/html/fdxx/1.html">GO</a>
                </div>
                <div style="clear:both"></div>
            </div>

        </div>
    </div>
    <!-- End Main -->
<#include "template/footer.jsp" />
</body>
</html>
