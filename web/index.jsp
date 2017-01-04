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
    <script>
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

    /**
     * 截取时间字段中的日期
     * @param dateStr
     */
    function cutDate(dateStr){
        var str = dateStr;
        str=str.split("-")[2];
        document.write(str);
    }


    /**
     * 截取时间字段中的年和月
     * @param dateStr
     */
    function cutYearAndMonth(dateStr){
        var str = dateStr;
        str=str.split("-")[0]+str.split("-")[1];
        document.write(str);
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
    bannerNews.push({
        'title': "“12·4”国家宪法日",
        'link': "#",
        'mainImage': "./themes/30480/fzu_new/images/tem.jpg",
        'dateline': "2016-12-2"
    });
    bannerNews.push({
        'title': "银杏黄了（阳光园）",
        'link': "##",
        'mainImage': "./themes/30480/fzu_new/images/tem.jpg",
        'dateline': "2016-11-29"
    });
    bannerNews.push({
        'title': "学习贯彻十八届六中全会精神",
        'link': "#",
        'mainImage': "./attach/2016/12/02/249572.jpg",
        'dateline': "2016-11-4"
    });
    bannerNews.push({
        'title': "奥运冠军走进福州大学",
        'link': "#",
        'mainImage': "./attach/2016/12/02/249572.jpg",
        'dateline': "2011-10-28"
    });
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
                    break;
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
    <span class="more" style="margin-top:18px"><a target="_blank" href="/list/${firstNotice.empRecruitNo}-4">&gt;&gt;更多</a></span>
    <h3 class="hotNewstitle" >通知公告</h3>
    <div class="hotNews hotNews-2-3">
        <h3><a target="_blank" href="/detail/${firstNotice.empRecruitNo}">${firstNotice.empRecruitTitle}</a></h3>
        <p><script>cutSummary('${secondNotice.empRecruitHostInfo}',300)</script></p>
    </div>
    <div class="hotNews">
        <h3><a target="_blank" href="/detail/${secondNotice.empRecruitNo}">${secondNotice.empRecruitTitle}</a></h3>
        <p><script>cutSummary('${secondNotice.empRecruitHostInfo}',120)</script></p>
    </div>


    <div class="newslist">
        <dt class="yahei">校园招聘</dt>
        <#list schoolList.getList() as x>
            <li>
            <div class="date">
                <p><script>cutDate('${x.empRecruitDate}')</script></p>
                <script>cutYearAndMonth('${x.empRecruitDate}')</script>
            </div>
            <h4><a href="/detail/${x.empRecruitNo}" title="${x.empRecruitTitle}"  target="_blank"><script>cutSummary("${x.empRecruitTitle}",15)</script></a></h4>
            <p>时间：${x.empRecruitTime}</p>
            <p>地点：<script>cutSummary('${x.empRecruitAddress}',14)</script></p>
            </li>
        </#list>

        <span class="more" style="margin-top:0"><a target="_blank" href="/list/${schoolList.getList().get(0).empRecruitNo}-1">&gt;&gt;更多</a></span>

    </div>

    <dl class="newslist">
        <dt class="yahei" style="border-bottom-color: #46B7FA;">实习招聘</dt>
        <#list practiceList.getList() as x>
        <dd>&gt; <a target="_blank" href="/detail/${x.empRecruitNo}" title="${x.empRecruitTitle}">${x.empRecruitTitle}</a></dd>
        </#list>
        <span class="more"><a target="_blank" href="/list/${practiceList.getList().get(0).empRecruitNo}-2">&gt;&gt;更多</a></span>
    </dl>

    <dl class="newslist">
        <dt class="yahei" style="border-bottom-color:#e0823d;">网络招聘</dt>
        <#list netList.getList() as x>
        <dd>&gt; <a target="_blank" href="/detail/${x.empRecruitNo}" title="${x.empRecruitTitle}">${x.empRecruitTitle}</a></dd>
        </#list>
        <span class="more"><a target="_blank" href="/list/${netList.getList().get(0).empRecruitNo}-3">&gt;&gt;更多</a></span>
    </dl>


    <span class="more" style="margin-top:18px"><a target="_blank" href="/jobfairList/1">&gt;&gt;更多</a></span>
    <h3 class="hotNewstitle" >大型招聘会</h3>
    <div class="hotNews hotNews-2-3">
        <h3><a target="_blank" href="/jobfairDetail/${firstJobFair.empJobFairNo}">${firstJobFair.empJobFairTitle}</a></h3>

        <p><script>cutSummary('${firstJobFair.empJobFairContent}',200)</script></p>
    </div>
    <div class="hotNews">
        <h3><a target="_blank" href="/jobfairDetail/${secondJobFair.empJobFairNo}">${secondJobFair.empJobFairTitle}</a></h3>
        <p><script>cutSummary('${secondJobFair.empJobFairContent}',120)</script></p>
    </div>
</div>
<script>
    $(document).ready(function () {
        $.ajax({
            url: "/excel/readStuInfo",
            success: function (data) {
                alert(data.first);
                alert("success");
            }
        });
    });
</script>
<#include "template/footer.jsp"/>
</body>
</html>

