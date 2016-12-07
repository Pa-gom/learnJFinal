<!--
  Created by IntelliJ IDEA.
  User: Ezreal
  Date: 2016/12/6
  Time: 11:16
  To change this template use File | Settings | File Templates.
-->
<!DOCTYPE html>
<head>
    <meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=9"/>
    <link rel="stylesheet" type="text/css" href="./themes/30480/fzu_new/css/style.css">
    <link rel="stylesheet" type="text/css" href="./themes/30480/fzu_new/css/index.css">
    <link href="http://libs.baidu.com/fontawesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/1.7.1/jquery.min.js"></script>
    <script type="text/javascript" src="./themes/30480/fzu_new/js/common.js"></script>
    <title>首页 - 校园就业中心</title>
    <!-- Favicons -->
    <link rel="shortcut icon" href="./themes/30480/fzu_new/ico/favicon.ico">
    <link rel="apple-touch-icon" href="./themes/30480/fzu_new/ico/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="./themes/30480/fzu_new/ico/apple-touch-icon-72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="./themes/30480/fzu_new/ico/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="./themes/30480/fzu_new/ico/apple-touch-icon-144.png">

    <link rel="stylesheet" type="text/css" href="./themes/30480/fzu_new/css/purple.css" id="themeCss"/>
    <!--<script type="text/javascript" src="./themes/30480/fzu_new/js/swapstyle.js"></script>--><script language="javascript" type="text/javascript">
    /*
     *截取信息简介
     *summaryStr:String 信息简介
     *lengTh:int 截取的长度
     */
    function cutSummary(summaryStr,lengTh){
        if(summaryStr.length>lengTh){
            summaryStr=summaryStr.substring(0,lengTh)+"...";
        }
        document.write(summaryStr);
    }
    $(function(){
        $('.btn_close2').click(function(){
            $('.top_notice').hide();
        });
    });
</script>
</head>

<body>
<#include "template/header.jsp"/>
<div id="banner" style="height:400px">
    <a id="mainImage" href="http://npc.people.com.cn/GB/28320/391019/" target="_blank"><img src="./attach/2016/12/02/249572.jpg" onload="this.style.visibility='visible'"/></a>
    <div class="caption"><div class="date">2016.12.2</div><a href="http://npc.people.com.cn/GB/28320/391019/" target="_blank">“12·4”国家宪法日</a></div>
    <a class="prev fa" href="javascript:loadPrevBanner();void 0">&#xf060;</a>
    <a class="next fa" href="javascript:loadNextBanner();void 0">&#xf061;</a>
</div>
<div id="calender">
    <a id="prevMouth" href="javascript:loadPrevCalender();void 0;">&lt;</a>
    <span class="Mouth">3</span>月
    <span id="days">
    </span>
    <a id="nextMouth" href="javascript:loadNextCalender();void 0;">&gt;</a>
</div>
<script>
    var myDate = new Date();
    var curMouth=myDate.getFullYear()*12+myDate.getMonth();
    var curBanner=0;//当前Banner
    var maxMouth=curMouth;//翻页的上限
    var minMouth=2015*12+2;//翻页的下限(年*12+月,)
    var bannerNews=[];

    bannerNews.push({'title':"“12·4”国家宪法日",'link':"http://npc.people.com.cn/GB/28320/391019/",'mainImage':"./attach/2016/12/02/249572.jpg",'dateline':"2016-12-2"});
    bannerNews.push({'title':"银杏黄了（阳光园）",'link':"##",'mainImage':"./attach/2016/12/02/249572.jpg",'dateline':"2016-11-29"});
    bannerNews.push({'title':"学习贯彻十八届六中全会精神",'link':"http://news.fzu.edu.cn/html/fdyw/2016/11/04/ca339ac4-06ed-4567-967d-787d88331541.html",'mainImage':"./attach/2016/12/02/249572.jpg",'dateline':"2016-11-4"});
    bannerNews.push({'title':"奥运冠军走进福州大学",'link':"http://news.fzu.edu.cn/html/fdyw/2016/10/31/37b046ba-7d58-4633-88b8-486fdfb3cf0a.html",'mainImage':"./attach/2016/12/02/249572.jpg",'dateline':"2016-10-28"});
    loadBanner(curBanner);
    loadCalender(curMouth);


    //载入指定的Banner
    function loadBanner(index){
        var curBannerNews;
        curBannerNews=bannerNews[index];
        fadein($("#banner img").css("min-height","400px").removeAttr("src").attr("src",curBannerNews.mainImage)[0],400);
        var a=$("#banner a").not("[href^='javascript']").attr("href",curBannerNews.link).attr("target",curBannerNews.link.indexOf("#")==0?"_self":"_blank");
        if(curBannerNews.link.indexOf("#") ==0){
            a.removeAttr("href");
        }
        $("#banner .caption .date").text(curBannerNews.dateline.replace(/\-/g,'.'));
        $("#banner .caption a").text(curBannerNews.title);
        var arr=curBannerNews.dateline.split('-');
        curMouth=parseInt(arr[0])*12+parseInt(arr[1])-1;
        loadCalender(curMouth);
        curBanner=index;
        if(index+1>=bannerNews.length){
            $("#banner .prev").css("visibility","hidden");
        }else{
            $("#banner .prev").css("visibility","visible");
        }
        if(index <= 0){
            $("#banner .next").css("visibility","hidden");
        }else{
            $("#banner .next").css("visibility","visible");
        }
    }
    function loadNextBanner(){
        if(curBanner>0){
            curBanner--;
            loadBanner(curBanner);
        }
    }
    function loadPrevBanner(){
        if(curBanner<bannerNews.length-1){
            curBanner++;
            loadBanner(curBanner);
        }
    }
    //载入指定月份的月历
    function loadCalender(m){
        var year;
        var mouth;
        year=parseInt(m/12);
        mouth=m%12+1;
        var daycount=31;
        if(mouth==4 || mouth==6 || mouth==9 || mouth==11){
            daycount=30;
        }else if(mouth==2){
            if(year%4==0){
                daycount=29;
            }else{
                daycount=28;
            }
        }
        var s='';
        for(var i=1;i<=daycount;i++){
            var haveNews=false;
            for(var j=0;j<bannerNews.length;j++){
                var t=year+'-'+mouth+'-'+i;
                if(bannerNews[j].dateline==t){
                    if(bannerNews[j].mainImage==$("#banner img").attr("src")){
                        s+='<a href="javascript:loadBanner('+j+');void 0" class="cur">'+i+'</a>';
                    }else{
                        s+='<a href="javascript:loadBanner('+j+');void 0">'+i+'</a>';
                    }
                    //new Image().src = bannerNews[j].mainImage;//预加载图片
                    haveNews=true;
                    break ;
                }
            }
            if(!haveNews) s+='<span>'+i+'</span>';
        }
        $("#days").html(s).find("a").click(function(){
            $("#days a").attr("class","");
            this.className="cur";
        });
        $("#calender .Mouth").text(mouth);
    }
    function loadNextCalender(){
        if(curMouth<maxMouth){
            curMouth++;
            loadCalender(curMouth);
        }
    }
    function loadPrevCalender(){
        if(curMouth>=minMouth){
            curMouth--;
            loadCalender(curMouth);
        }
    }
</script>
<!-- End Banner -->
<!-- Start Main -->
<div id="main">
    <span class="more" style="margin-top:18px"><a target="_blank" href="http://news.fzu.edu.cn">&gt;&gt;更多</a></span>
    <h3 class="hotNewstitle" >通知公告</h3>
    <div class="hotNews hotNews-2-3">
        <h3><a target="_blank" href="http://news.fzu.edu.cn/html/fdyw/2016/12/02/f12ee1ca-8aef-4857-b623-54f638623786.html">徐艺军教授入选2016年全球“高被引科学家”名单</a></h3>

        <p>新闻中心讯/据Clarivate Analytics（原汤森路透知识产权与科技事业部）2016年11月16日正式公布的2016年全球“高被引科学家(Highly Cited Researchers 2016)”名单，共有136名中国大陆科研人员入选。福州大学化学学院徐艺军教授入选2016年度化学学科领域的全球高被引科学家，也是福大作为第一单位进入2016年全球“高被引科学家”名单的唯一学者。2016年全球“高被引科学家”名单是从ESI的21个自然和社会科学领域甄选出3000余位科研人员，这些科研人员在2004年1月至2014年12月共11年间发表的高被引论文（即在同年度、同...</p>
    </div>
    <div class="hotNews">
        <h3><a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/01/188ea158-8331-4197-aded-47bd0f35239d.html">福建日报、东南网、网易（2016-12-1）： 福州大学：双创教育，让大学生勇敢追梦</a></h3>

        <p>本报记者　陈旻　通讯员　许晓凤福州大学科技节上，双车演示现场。于佳卉　摄在最近举行的第二届中国“互联网+”大学生创新创业大赛全国总决赛上，福大北斗通信团队捧回了金奖，并与太冠资本成...</p>
    </div>

    <dl class="newslist">
        <dt class="yahei">校园招聘</dt>
        <#list schoolList.getList() as x>
        <dd>&gt; <a target="_blank" href="/detail/${x.empRecruitNo}" title="${x.empRecruitTitle}">${x.empRecruitTitle}</a></dd>
        </#list>
        <span class="more"><a target="_blank" href="./html/fdxx/1.html">&gt;&gt;更多</a></span>
    </dl>

    <dl class="newslist">
        <dt class="yahei" style="border-bottom-color:#e0823d">网络招聘</dt>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/01/188ea158-8331-4197-aded-47bd0f35239d.html"  title="福建日报、东南网、网易（2016-12-1）： 福州大学：双创教育，让大学生勇敢追梦">福建日报、东南网、网易（2016-12-1）： 福州...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/04/c647f896-e474-4b49-aef3-6475b9ff6168.html"  title="北京晨报（2016-12-4）：黄进清：都市里的“牛”庄主">北京晨报（2016-12-4）：黄进清：都市里的“...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/03/4180109d-3f72-4b69-b0c0-5ed020973e99.html"  title="福州晚报（2016-12-2）：真厉害 他带团队研发两大“神器”">福州晚报（2016-12-2）：真厉害 他带团队研发...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/03/8632d7a5-7781-4fd1-b273-ae6ef150f78f.html"  title="海西晨报（2016-12-2）：他们在低调与宁静中修炼漆艺">海西晨报（2016-12-2）：他们在低调与宁静中...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/03/4e939f83-3e63-4382-a803-a229b4fa775f.html"  title="海峡法治在线、网易（2016-12-2）：百万级畅销作家大冰做客福州大学漫谈读书">海峡法治在线、网易（2016-12-2）：百万级畅...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/03/db82f515-0528-4e03-8158-d9430270b2cb.html"  title="中国青年网（2016-12-2）：福州大学多措并举助推“体验式生命教育”">中国青年网（2016-12-2）：福州大学多措并举...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/02/5c310527-dde5-4ddb-a5d0-5d9f15b33075.html"  title="中国新闻网、凤凰网（2016-12-2）：福大学子“易起跑”月成绩惊人 总步数高达9.59亿">中国新闻网、凤凰网（2016-12-2）：福大学子...</a></dd>

        <dd>&gt; <a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/01/237fc939-f317-452d-b09c-034246a4c97a.html"  title="福建日报（2016-12-1）：就近取材　就地成才">福建日报（2016-12-1）：就近取材　就地成才</a></dd>
        <span class="more"><a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/1.html">&gt;&gt;更多</a></span>
    </dl>
    <div class="newslist">
        <dt class="yahei">实习招聘</dt>


        <li><div class="date"><p>01</p>2016-12</div>
            <h4><a href="./html/jzbg/2016/11/30/8d5e4064-fba1-4832-a64d-7ce7e1c5ba76.html" title="两学一做系列讲座：两学一做系列讲座：创业型大学建设中创新创业教育探索"  target="_blank"><script>cutSummary("两学一做系列讲座：创业型大学建设中创新创业教育探索",15)</script></a></h4>
            <p>时间：15:00</p>
            <p>地点：<script>cutSummary('福州大学旗山校区法学楼216学术报告厅',14)</script></p>
        </li>
        <li><div class="date"><p>28</p>2016-11</div>
            <h4><a href="./html/jzbg/2016/11/28/568718a4-c0dd-4cef-86ea-389fba3b8078.html" title="学术讲座：东南法学名家讲坛：共犯的本质"  target="_blank"><script>cutSummary("东南法学名家讲坛：共犯的本质",15)</script></a></h4>
            <p>时间：19:00</p>
            <p>地点：<script>cutSummary('福州大学旗山校区法学楼216学术报告厅',14)</script></p>
        </li>
        <li><div class="date"><p>29</p>2016-11</div>
            <h4><a href="./html/jzbg/2016/11/27/85be275a-c750-417e-835a-6658a5869e53.html" title="学术报告：博雅论坛第65期：西方经济理论与中国经济发展中的若干重大问题"  target="_blank"><script>cutSummary("博雅论坛第65期：西方经济理论与中国经济发展中的若干重大问题",15)</script></a></h4>
            <p>时间：10:00</p>
            <p>地点：<script>cutSummary('经管北楼316',14)</script></p>
        </li>
        <span class="more" style="margin-top:0"><a target="_blank" href="./html/jzbg/1.html">&gt;&gt;更多</a></span>

    </div>

    <span class="more" style="margin-top:18px"><a target="_blank" href="http://news.fzu.edu.cn">&gt;&gt;更多</a></span>
    <h3 class="hotNewstitle" >大型招聘会</h3>
    <div class="hotNews hotNews-2-3">
        <h3><a target="_blank" href="http://news.fzu.edu.cn/html/fdyw/2016/12/02/f12ee1ca-8aef-4857-b623-54f638623786.html">徐艺军教授入选2016年全球“高被引科学家”名单</a></h3>

        <p>新闻中心讯/据Clarivate Analytics（原汤森路透知识产权与科技事业部）2016年11月16日正式公布的2016年全球“高被引科学家(Highly Cited Researchers 2016)”名单，共有136名中国大陆科研人员入选。福州大学化学学院徐艺军教授入选2016年度化学学科领域的全球高被引科学家，也是福大作为第一单位进入2016年全球“高被引科学家”名单的唯一学者。2016年全球“高被引科学家”名单是从ESI的21个自然和社会科学领域甄选出3000余位科研人员，这些科研人员在2004年1月至2014年12月共11年间发表的高被引论文（即在同年度、同...</p>
    </div>
    <div class="hotNews">
        <h3><a target="_blank" href="http://news.fzu.edu.cn/html/mtfd/2016/12/01/188ea158-8331-4197-aded-47bd0f35239d.html">福建日报、东南网、网易（2016-12-1）： 福州大学：双创教育，让大学生勇敢追梦</a></h3>

        <p>本报记者　陈旻　通讯员　许晓凤福州大学科技节上，双车演示现场。于佳卉　摄在最近举行的第二届中国“互联网+”大学生创新创业大赛全国总决赛上，福大北斗通信团队捧回了金奖，并与太冠资本成...</p>
    </div>
</div>
<%@ include file="template/footer.jsp" %>
</body>
</html>

