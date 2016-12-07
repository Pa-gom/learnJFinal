<!--
  Created by IntelliJ IDEA.
  User: Ezreal
  Date: 2016/12/6
  Time: 11:40
  To change this template use File | Settings | File Templates.
-->
<!--必须在这里重新设置字符集，否则会乱码-->
<div id="mobile-nav">
    <a href="javascript:void(0);" id="call-mbnav"><i class="fa fa-bars menuicon"></i></a>
    <ul>
        <li><a href="http://news.fzu.edu.cn">首页</a></li>
        <li><a href="">生源信息</a>
            <ul>
                <li><a href="">本科毕业生生源信息</a></li>
                <li><a href="">硕士毕业生生源信息</a></li>
                <li><a href="">博士毕业生生源信息</a></li>
            </ul>
        </li>
        <li><a href="javascript:void(0)">招聘服务</a>
            <ul>
                <li><a href="">校园招聘</a></li>
                <li><a href="">网络招聘</a></li>
                <li><a href="">实习招聘</a></li>
                <li><a href="">大型招聘会</a></li>
            </ul>
        </li>
        <li><a href="">政策法规</a>
            <ul>
                <li><a href="http://www.fzu.edu.cn">国家政策</a></li>
                <li><a href="http://www.fzu.edu.cn">校园政策</a></li>
            </ul>
        </li>
        <li><a href="javascript:void(0)">下载专区</a></li>
        <li><a href="">中心介绍</a></li>
        <li><a href="./html/zjfd/1.html">走进校园</a>
            <ul>
                <li><a href="./html/zjfd/bgxx/1.html">办公信息</a></li>
                <li><a href="./html/zjfd/syxx/1.html">实用信息</a></li>
            </ul>
        </li>
    </ul>
</div>
<div id="all">
    <!-- Start Header -->
    <div id="header-bg" class="header-bg">
        <div id="header" class="cont">
            <div id="theme" style="margin-top: 16px;">
                <a href="javascript:setTheme('purple');void 0" style="color:purple;font-size: 1.5em;" title="默认风格">▃</a>
                <a href="javascript:setTheme('red');void 0" style="color:red;font-size: 1.5em;" title="红色风格">▃</a>
                <a href="javascript:setTheme('green');void 0" style="color:green;font-size: 1.5em;" title="绿色风格">▃</a>
                <a href="javascript:setTheme('lightblue');void 0" style="color:lightblue;font-size: 1.5em;" title="浅蓝风格">▃</a>
                <a href="javascript:setTheme('blue');void 0" style="color:blue;font-size: 1.5em;" title="深蓝风格">▃</a>
            </div>
            <script>
                function setTheme(t){
                    document.getElementById("themeCss").href="/themes/30480/fzu_new/css/"+t+".css";
                    localData.set("theme",t);
                }
                if(localData.get("theme")){
                    setTheme(localData.get("theme"));
                }
            </script>
            <a id="logo" href="./">
                <img src="/themes/30480/fzu_new/images/logo.gif" style="float: left;"/>
            </a>
            <form id="searcher" action="/html/search.html" method="post">
                <input type="text" value="" name="keyword"/><button><i class="fa fa-search"></i></button>
            </form>
            <div id="nav">
                <table cellspacing="0">
                    <tr>
                        <td><a target="_blank" href="http://news.fzu.edu.cn">首页</a></td>
                        <td><a target="_self" href="./html/yxsz/1.html">招聘服务<i class="fa">&#xf107;</i></a>
                            <ul>
                                <li><a href="">校园招聘</a></li>
                                <li><a href="">网络招聘</a></li>
                                <li><a href="">实习招聘</a></li>
                                <li><a href="">大型招聘会</a></li>
                            </ul>
                        </td>
                        <td><a target="_self" href="./html/xxgk/1.html">生源信息<i class="fa">&#xf107;</i></a>
                            <ul>
                                <li><a target="_self" href="./html/xxgk/xxjj/1.html">本科生生源信息</a></li>
                                <li><a target="_self" href="./html/xxgk/xrld/1.html">硕士生生源信息</a></li>
                                <li><a target="_self" href="./html/xxgk/ysfc/1.html">博士生生源信息</a></li>
                            </ul>
                        </td>
                        <td><a href="">政策法规<i class="fa">&#xf107;</i></a>
                            <ul>
                                <li><a href="">国家政策</a></li>
                                <li><a href="">学校政策</a></li>
                            </ul>
                        </td>
                        <td><a href="">下载专区</a></td>
                        <td><a href="">中心介绍</a></td>
                        <td><a target="_self" href="./html/zjfd/1.html">走进校园<i class="fa">&#xf107;</i></a>
                            <ul>
                                <li><a target="_self" href="/html/zjfd/bgxx/1.html">办公信息</a></li>
                                <li><a target="_self" href="/html/zjfd/syxx/1.html">实用信息</a></li>
                            </ul>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>  <!-- End Header -->
    <!-- Start Headline -->
    <!-- End Headline -->
    <!-- Start Banner -->