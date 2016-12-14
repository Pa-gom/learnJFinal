<!--
  Created by IntelliJ IDEA.
  User: Ezreal
  Date: 2016/12/6
  Time: 12:57
  To change this template use File | Settings | File Templates.
-->
<!DOCTYPE html >
<html>
<head>
    <meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=9"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/listtsinghua.css"/>
    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/details.css"/>
    <link href="http://libs.baidu.com/fontawesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/1.7.1/jquery.min.js"></script>
    <script type="text/javascript" src="/themes/30480/fzu_new/js/common.js"></script>
    <title>旗山群学讲坛第十讲：中国人口发展与政策调整趋势 - 福州大学</title>
    <!-- Favicons -->
    <link rel="shortcut icon" href="/themes/30480/fzu_new/ico/favicon.ico">
    <link rel="apple-touch-icon" href="/themes/30480/fzu_new/ico/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/themes/30480/fzu_new/ico/apple-touch-icon-72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/themes/30480/fzu_new/ico/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/themes/30480/fzu_new/ico/apple-touch-icon-144.png">

    <link rel="stylesheet" type="text/css" href="/themes/30480/fzu_new/css/purple.css" id="themeCss"/>
    <!--<script type="text/javascript" src="/themes/30480/fzu_new/js/swapstyle.js"></script>--></head>

<body>
<#include "/template/header.jsp"/>
    <!-- Start Banner -->

    <div id="banner" style="background-image:url(/attach/2016/12/02/249572.jpg);">

        <!--
<div id="cat">
<h1>讲座报告</h1>
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
                    <li class="current"><i class="fa fa-plus"></i><a target=""
                                                                     href='/jobfairList/1'>${currentColumnName}</a></li>
                </ul>
            </div>
            <!-- End Sidebar -->			</div>
        <div id="rside2">
            <br/>
            <h3>当前位置：<a href="/">首页</a> > <a href='/jobfairList/1'>${currentColumnName}</a></h3>
            <div class="detail_content_info">
                <h1>${jobfair.empJobFairTitle}</h1>
                <i><author>${jobfair.empJobFairPublisher}</author></i>
                <i><time>${jobfair.empJobFairPublishDateTime}</time></i>
            </div>
            <div style="width:100%;margin:10px; line-height: 28px; font-size: 16px;">


                ${jobfair.empJobFairContent}


            </div>
            <div style="clear:both"></div>
            <ul id="aboutNews" style="line-height:28px;margin-top: 20px;margin-bottom: 20px;">
                <li><b>下一篇：</b><a href="/html/jzbg/2016/12/06/bf133767-1666-4498-846d-12d39f0a87ad.html">图书馆信息资源讲座第180讲：轻享图书馆资源，完成毕业论文撰写</a></li></ul>
        </div>
    </div>
<#include "/template/footer.jsp" />
</body>
</html>

