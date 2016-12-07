/*
常用公共js
*/
//获取字符串占位长度
function getWordLength(str){
	var len=0;
	for (var i = 0; i < str.length; i++){
		if (str.charCodeAt(i) > 127 || str.charCodeAt(i) < 0){
			len+=2;
		}else{
			len++;
		}
	}
	return len;
}
//截取字符串占位长度
function cutWord(str,len,replaceStr){
	var relen=getWordLength(replaceStr);
	if(relen>len){
		for (var i = relen.length-1; i >= 0; i--){
			if (relen.charCodeAt(i) > 127 || relen.charCodeAt(i) < 0){
				len-=2;
			}else{
				len--;
			}
			if(len<0){
				 i++;
				 return replaceStr.substr(i,replaceStr.length-i);
			}
		}
	}else{
		len-=relen;
		for (var i = 0; i < str.length; i++){
			if (str.charCodeAt(i) > 127 || str.charCodeAt(i) < 0){
				len-=2;
			}else{
				len--;
			}
			if(len<0){
				 i--;
				 return str.substring(0,i)+replaceStr;
			}
		}
		return str
	}
}
//清除HTML代码
function htmlspecialchars(str) {
	return str.replace('&','&amp;').replace('<','&lt;').replace('>','&gt;').replace('"','&quot;');
}
//判断一个元素在数组中的位置
Array.prototype.indexOf = function(e){
	for(var i=0,j; j=this[i]; i++){
		if(j==e){return i;}
	}
	return -1;
}
/** 时间对象的格式化; **/
/* eg:format="yyyy-MM-dd hh:mm:ss"; */ 
Date.prototype.format = function(format){ 
	var o = { 
		"M+" : this.getMonth() + 1, // month 
		"d+" : this.getDate(), // day 
		"h+" : this.getHours(), // hour 
		"m+" : this.getMinutes(), // minute 
		"s+" : this.getSeconds(), // second 
		"q+" : Math.floor((this.getMonth() + 3) / 3), // quarter 
		"S" : this.getMilliseconds() 
		// millisecond 
	}
	if(/(y+)/.test(format)){ 
		format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4- RegExp.$1.length)); 
	} 

	for(var k in o){ 
		if(new RegExp("(" + k + ")").test(format)){ 
			format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length)); 
		} 
	} 
	return format; 
}
/*<a title="设为首页" onclick="this.style.behavior='url(#default#homepage)'; this.setHomePage('http://'+window.location.host);" href="javascript:void(0);">设为首页</a>
<a onclick="AddFavorite('http://'+window.location.host,'站名');" href="javascript:void 0;">加入收藏</a> <a onclick="AddFavorite(window.location,document.title)">加入收藏</a>*/
function AddFavorite(sURL, sTitle){
	try{
		window.external.addFavorite(sURL, sTitle);
	}catch (e){
		try{
			window.sidebar.addPanel(sTitle, sURL, "");
		}catch (e){
			alert("\u52a0\u5165\u6536\u85cf\u5931\u8d25\uff0c\u8bf7\u4f7f\u7528Ctrl+D\u8fdb\u884c\u6dfb\u52a0");
		}
	}
}
//本地存储
localData = {
	hname:location.hostname?location.hostname:'localStatus',
	isLocalStorage:window.localStorage?true:false,
	dataDom:null,

	initDom:function(){ //初始化userData
		if(!this.dataDom){
			try{
				this.dataDom = document.createElement('input');//这里使用hidden的input元素
				this.dataDom.type = 'hidden';
				this.dataDom.style.display = "none";
				this.dataDom.addBehavior('#default#userData');//这是userData的语法
				document.body.appendChild(this.dataDom);
				var exDate = new Date();
				exDate = exDate.getDate()+30;
				this.dataDom.expires = exDate.toUTCString();//设定过期时间
			}catch(ex){
				return false;
			}
		}
		return true;
	},
	set:function(key,value){
		if(this.isLocalStorage){
			window.localStorage.setItem(key,value);
		}else{
			if(this.initDom()){
				this.dataDom.load(this.hname);
				this.dataDom.setAttribute(key,value);
				this.dataDom.save(this.hname)
			}
			if(this.initDom()){
				this.dataDom.load(this.hname);
				this.dataDom.setAttribute(key,value);
				this.dataDom.save(this.hname)
			}
		}
	},
	get:function(key){
		if(this.isLocalStorage){
			return window.localStorage.getItem(key);
		}else{
			if(this.initDom()){
				this.dataDom.load(this.hname);
				return this.dataDom.getAttribute(key);
			}
		}
	},
	remove:function(key){
		if(this.isLocalStorage){
			localStorage.removeItem(key);
		}else{
			if(this.initDom()){
				this.dataDom.load(this.hname);
				this.dataDom.removeAttribute(key);
				this.dataDom.save(this.hname)
			}
		}
	}
}
//tab切换 满足公式
var mouseonClassName='cur';//'cur'
var mouseoffClassName='';//''
var tabBodyClassName='tabBody';//'news-wrap'
/**视图切换**/
function setViewSwitch(id,dt,opTime){
	var swBox;
	if(typeof id=="string"){
		swBox=document.getElementById(id);
	}else{
		swBox=id;
	}
	var views=[];
	var btns=[];
	var titles=[];
	var alll=swBox.getElementsByTagName('ul');
	for(var i1=0;i1<alll.length;i1++){
		if(alll[i1].className=='views'){
			//switchView(alll[i1],0);
			var lis=alll[i1].getElementsByTagName("li");
			for(var i=0;i<lis.length;i++){
				views.push(lis[i]);
			}
		}else if(alll[i1].className=='page'){
			var lis=alll[i1].getElementsByTagName('*');
			var index=0;
			for(var j1=0;j1<lis.length;j1++){
				if(lis[j1].className=='prePage'){
					lis[j1].onclick=preView(views,btns,titles);
				}else if(lis[j1].className=='nextPage'){
					lis[j1].onclick=nextView(views,btns,titles);
				}else if(lis[j1].tagName.toLocaleUpperCase()=='LI'){
					btns.push(lis[j1]);
					index++;
				}
			}
		}else if(alll[i1].className=='caption'){
			titles=alll[i1].getElementsByTagName('li');
		}
	}
	for(var i1=0;i1<btns.length;i1++){
		btns[i1].onclick=switchView(views,i1,btns,titles);
	}
	switchView(views,0,btns,titles)();
	if(dt){
		var goNextView=nextView(views,btns,titles);
		setInterval(function(){
			if(swBox.getAttribute("MouseOn")=='true'){return ;}
			goNextView();
		},dt);
	}
	swBox.onmouseover=function(){
		swBox.setAttribute("MouseOn",'true');
	};
	swBox.onmouseout=function(){
		swBox.setAttribute("MouseOn",'false');
	};
	function switchView(views,id,btns,titles){
		return function(){
			//console.log(id + " " + views[id].getAttribute("tid"));
			//console.log(id + " " + views[id].getAttribute("tid"));
			if(opTime) fadein(views[id],  opTime);
			views[id].parentNode.appendChild(views[id]);
			for(var i=0;i<views.length;i++){
				views[i].className=mouseoffClassName;
			}
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
	function nextView(views,btns,titles){
		return function(){
			var id;
			for(i=0;i<views.length;i++){
				if(views[i].className!=mouseoffClassName){
					views[i].className=mouseoffClassName;
					id=i;
				}
			}
			id++;
			if(id>=views.length) id=0;
			if(opTime) fadein(views[id],  opTime);
			views[id].parentNode.appendChild(views[id]);
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
	function preView(views,btns,titles){
		return function(){
			var id;
			for(i=0;i<views.length;i++){
				if(views[i].className!=mouseoffClassName){
					views[i].className=mouseoffClassName;
					id=i;
				}
			}
			id--;
			if(id<0) id=views.length-1;
			if(opTime) fadein(views[id],  opTime);
			views[id].parentNode.appendChild(views[id]);
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
}
function fadein(ele, durling) { 
	setOpacity(ele,0);
	var count=durling/50;
	var i=1;
	var timer = setInterval(function() {
		if (i < count) {
			setOpacity(ele, i / count*100);
		} else {
			setOpacity(ele,100);
			clearInterval(timer);
		}
		i++;
	},48);
}
function setOpacity(ele, alpha){
	ele.style.filter = 'alpha(opacity:'+parseInt(alpha)+')'; //设置IE的透明度
	ele.style.opacity = alpha / 100; //设置fierfox等透明度，注意透明度值是小数
}
/**视图滚动**/
function setViewScroll(id,dt,durling){
	var swBox;
	if(typeof id=="string"){
		swBox=document.getElementById(id);
	}else{
		swBox=id;
	}
	var views=[];
	var btns=[];
	var titles=[];
	var alll=swBox.getElementsByTagName('ul');
	for(var i1=0;i1<alll.length;i1++){
		if(alll[i1].className=='views'){
			var lis=alll[i1].getElementsByTagName("li");
			for(var i=0;i<lis.length;i++){
				views.push(lis[i]);
			}
		}else if(alll[i1].className=='page'){
			var lis=alll[i1].getElementsByTagName('*');
			var index=0;
			for(var j1=0;j1<lis.length;j1++){
				if(lis[j1].className=='prePage'){
					lis[j1].onclick=preView(views,btns,titles);
				}else if(lis[j1].className=='nextPage'){
					lis[j1].onclick=nextView(views,btns,titles);
				}else if(lis[j1].tagName.toLocaleUpperCase()=='LI'){
					btns.push(lis[j1]);
					index++;
				}
			}
		}else if(alll[i1].className=='caption'){
			titles=alll[i1].getElementsByTagName('li');
		}
	}
	for(var i1=0;i1<btns.length;i1++){
		btns[i1].onclick=switchView(views,i1,btns,titles);
	}
	switchView(views,0,btns,titles)();
	var goPreView=nextView(views,btns,titles);
	var goNextView=preView(views,btns,titles);
	if(dt){
		setInterval(function(){
			if(swBox.getAttribute("MouseOn")=='true'){return ;}
			goNextView();
		},dt);
	}
	var startX;
	var endX;
	swBox.addEventListener('touchstart', function (ev) {
		startX = ev.touches[0].pageX;
	}, false);
	swBox.addEventListener('touchmove', function (ev) {
		endX = ev.changedTouches[0].pageX;
		if(startX>endX){
			goPreView();
		}else if(startX<endX){
			goNextView();
		}
	}, false);

	swBox.onmouseover=function(){
		swBox.setAttribute("MouseOn",'true');
	};
	swBox.onmouseout=function(){
		swBox.setAttribute("MouseOn",'false');
	};
	function switchView(views,id,btns,titles){
		return function(){
			movTo(id);
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			for(var i=0;i<views.length;i++){
				views[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
	function nextView(views,btns,titles){
		return function(){
			var id;
			for(i=0;i<views.length;i++){
				if(views[i].className!=mouseoffClassName){
					views[i].className=mouseoffClassName;
					id=i;
				}
			}
			id++;
			if(id>=views.length) id=0;
			movTo(id);
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			for(var i=0;i<views.length;i++){
				views[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
	function preView(views,btns,titles){
		return function(){
			var id;
			for(i=0;i<views.length;i++){
				if(views[i].className!=mouseoffClassName){
					views[i].className=mouseoffClassName;
					id=i;
				}
			}
			id--;
			if(id<0) id=views.length-1;
			movTo(id);
			for(var i=0;i<btns.length;i++){
				btns[i].className=mouseoffClassName;
			}
			for(var i=0;i<titles.length;i++){
				titles[i].className=mouseoffClassName;
			}
			for(var i=0;i<views.length;i++){
				views[i].className=mouseoffClassName;
			}
			if(id<btns.length) btns[id].className=mouseonClassName;
			if(id<views.length) views[id].className=mouseonClassName;
			if(id<titles.length) titles[id].className=mouseonClassName;
		}
	}
	function movTo(id){
		var count=durling/16;
		var begin=views[id].parentNode.scrollLeft;
		var i=1;
		var timer = setInterval(function() {
			if (i < count) {
				views[id].parentNode.scrollLeft=begin+(views[id].offsetLeft-begin)*line(i/count);
			} else {
				views[id].parentNode.scrollLeft=(views[id].offsetLeft);
				clearInterval(timer);
			}
			i++;
		},16);
	}
	function line(rate){
		//return Math.sqrt(rate*100)/10;
		//return rate*rate;
		return rate+(1-rate)*rate*0.8;
	}
}


$(function(){//全站的导航效果
	if(!($.browser.msie && ($.browser.version <8 ))){
		$("#nav td").mouseenter(function(){
			$(this).children(".mask-line").show().width($(this).width()+2).height(10);
			$(this).children("ul").slideDown("fast");
		});
		$("#nav td").mouseleave(function (){
			$(this).children(".mask-line").hide();
			$(this).children("ul").hide();
		});
		$('#call-mbnav').click(function(){
			$('#mobile-nav').toggleClass('open');
		});
	}
	//小屏幕menu
	
	$("#submenu").toggle(function(){
		$(this).next().slideDown(100);
		},
		function(){
		if($("#submenu .menuicon").is(':visible')){$(this).next().slideUp(100)};
		}
	);
		//左侧menu
	$("div.leftNav li").each(function(){
		if($(this).find('ul:first').length>0){
			$(this).find('i:first').show();
			if($(this).hasClass('current')){
				$(this).find('i:first').removeClass("fa fa-plus");
				$(this).find('i:first').addClass("current fa fa-minus");
			}
		}else{
			$(this).find('i:first').hide();
		}
	});
	
	$("div.leftNav li i").click(function(){
		if($(this).siblings("ul").is(":visible")){
			$(this).removeClass("current fa fa-minus");
			$(this).addClass("fa fa-plus");
			$(this).siblings("ul").slideUp('fast');
		}else{
			$(this).removeClass("fa fa-plus");
			$(this).addClass("current fa fa-minus");
			$(this).siblings("ul").slideDown('fast');
		}
	});
	$("#notice").mouseover(function(){
		$("#noticeMore").show().mouseleave(function(){
			$(this).hide();
		});
	}).mouseleave(function(e){
		if(e.pageY<$(this).offset().top+10) $("#noticeMore").hide();
	});

//内链开新页面
	$( "a[href^=#]").attr("target","_self");

/*//rss 媒体福大
	$.get("/rss/getRss.do?catalogPath=-13045-13060-",function(data){
		var i=0;
		var s='';
		$(data).find("item").each(function(){
			if(i<8){
				var a=$(this);
				s+='<dd>&gt; <a target="_blank" href="'+a.children("link").text()+'" title="'+a.children("title").text()+'">'+cutWord(a.children("title").text(),50,"...")+'</a></dd>';
			}
			i++;
		});
		$("#MTFD dt").after(s);
	});*/
});
var inschool=false;