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
    <title>生源信息列表</title>
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
<#include "/template/header.jsp" />
<!-- Start Banner -->
<div id="banner" style="background-image:url(/themes/30480/fzu_new/images/tem.jpg);">
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
            <#list studentsInfoList.getList() as x>
                <li>
                    <span>${x.empPublishDate}</span>
                    <h3><a href="/studentsInfoDetail/${x.id}" title="${x.empTitle}">${x.empTitle}</a></h3>
                </li>
            </#list>
        </ul>
        <script>
            function changeUrl() {
                var url = $("#goToUrl").attr("href");
                var num = $("#pageNum").val();
                var r = /^[0-9]*[1-9][0-9]*$/;
                if (!r.test(num) || num > ${pageCount}) {
                    alert("请输入正确的页码");
                    $("#pageNum").val("");
                    return false;
                }
                url = url.replace("/studentsInfo/${typeId}-1", "/studentsInfo/${typeId}-" + num);
                $("#goToUrl").attr("href", url);
            }
        </script>
        <div class="ecms_pag">
            <div class="ecms_pagination">
                <ul>
                    <#if currentPage gt 1>
                        <a class="ecms_disablepage" href="/studentsInfo/${typeId}-${currentPage-1}"><</a>
                    </#if>
                    <#list (currentPage-5)..(currentPage-1) as s>
                        <#if s gt 0>
                            <li><a class="ecms_pagenav" href="/studentsInfo/${typeId}-${s}">${s}</a></li>
                        </#if>
                    </#list>
                    <li class="ecms_currentpage">${currentPage}</li>
                    <#list (currentPage+1)..(currentPage+5) as s>
                        <#if s lte pageCount>
                            <li><a class="ecms_pagenav" href="/studentsInfo/${typeId}-${s}">${s}</a></li>
                        </#if>
                    </#list>
                    ...
                    <#list (pageCount-1)..(pageCount) as s>
                        <#if s gt (currentPage+5)>
                            <li><a class="ecms_pagenav" href="/studentsInfo/${typeId}-${s}">${s}</a></li>
                        </#if>
                    </#list>

                    <#if currentPage lt pageCount>
                        <li class="nextpage"><a href="/studentsInfo/${typeId}-${currentPage+1}">></a></li>
                    </#if>
                </ul>
            </div>
            <div class="ecms_go">
                跳转：<input type="text" class="ecms_jump_input" id="pageNum" onchange="changeUrl()"/> 页 <a
                    style="cursor:hand" class="list_p6" id="goToUrl" href="/studentsInfo/${typeId}-1">GO</a>
            </div>
            <div style="clear:both"></div>
        </div>

    </div>
</div>
<!-- End Main -->
<#include "/template/footer.jsp" />
</body>
</html>
