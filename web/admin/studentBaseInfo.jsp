<div class="pageHeader">
    <form onsubmit="return navTabSearch(this);" action="demo_page1.html" method="post">
        <div class="searchBar">
            <table class="searchContent">
                <tr>
                    <td>
                        我的客户：<input type="text" name="keyword"/>
                    </td>
                    <td>
                        <select class="combox" name="">
                            <option value="">学院</option>
                            <option value="北京">北京</option>
                            <option value="上海">上海</option>
                            <option value="天津">天津</option>
                            <option value="重庆">重庆</option>
                            <option value="广东">广东</option>
                        </select>
                    </td>
                    <td>
                        <select class="combox" name="">
                            <option value="">专业</option>
                            <option value="北京">北京</option>
                            <option value="上海">上海</option>
                            <option value="天津">天津</option>
                            <option value="重庆">重庆</option>
                            <option value="广东">广东</option>
                        </select>
                    </td>
                    <td>
                        建档日期：<input type="text" class="date" readonly="true"/>
                    </td>
                </tr>
            </table>
            <div class="subBar">
                <ul>
                    <li>
                        <div class="buttonActive">
                            <div class="buttonContent">
                                <button type="submit">检索</button>
                            </div>
                        </div>
                    </li>
                    <li><a class="button" href="demo_page6.html" target="dialog" mask="true"
                           title="查询框"><span>高级检索</span></a></li>
                </ul>
            </div>
        </div>
    </form>
</div>
<div class="pageContent">
    <div class="panelBar">
        <ul class="toolBar">
            <li><a class="add" href="demo_page4.html" target="navTab"><span>添加</span></a></li>
            <li><a class="delete" href="demo/common/ajaxDone.html?uid={sid_user}" target="ajaxTodo"
                   title="确定要删除吗?"><span>删除</span></a></li>
            <li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab"><span>修改</span></a></li>
            <li class="line">line</li>
            <li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab"
                   title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
        </ul>
    </div>
    <table class="table" width="100%" layoutH="138">
        <thead>
        <tr>
            <th width="120" align="center">学院</th>
            <th width="120" align="center">专业</th>
            <th width="120" align="center">学号</th>
            <th width="100" align="center">姓名</th>
            <th width="100" align="center">性别</th>
            <th width="80" align="center">民族</th>
            <th width="120" align="center">籍贯</th>
            <th width="150" align="center">身份证号</th>
            <th width="120" align="center">政治面貌</th>
            <th width="100" align="center">入学年月</th>
            <th width="120" align="center">生源地</th>
            <th width="120" align="center">电话</th>
            <th width="200" align="center">联系地址</th>
            <th width="100" align="center">入学方式</th>
        </tr>
        </thead>
        <tbody>
        <#list studentList.getList() as x>
            <tr>
                <td>${x.empStudentCollege}</td>
                <td>${x.empStudentProfession}</td>
                <td>${x.empStudentNo}</td>
                <td>${x.empStudentName}</td>
                <td>${x.empStudentSex}</td>
                <td>${x.empStudentMinority}</td>
                <td>${x.empStudentLocation}</td>
                <td>${x.empStudentIdNo}</td>
                <td>${x.empStudentPoliticalStatus}</td>
                <td>${x.empStudentEntryStudyDate}</td>
                <td>${x.empStudentStuLocation}</td>
                <td>${x.empStudentTel}</td>
                <td>${x.empStudentAddress}</td>
                <td>${x.empStudentEntryStudyType}</td>
            </tr>
        </#list>
        </tbody>
    </table>
    <div class="panelBar">
        <div class="pages">
			<span>显示:共
			${studentList.getList().size()}
			   条</span>
        </div>


        <div class="pagination" targettype="navTab" totalcount="200" numperpage="20" pagenumshown="10" currentpage="1">
            <ul>
                <li class="j-first disabled">
                    <a class="first" href="/student/baseInfo/1" target="navTab" title="学生基本信息管理"><span>首页</span></a>
                </li>
                <#if currentPage gt 1>
                    <li class="j-prev disabled">
                        <a class="previous" href="/student/baseInfo/${currentPage-1}" target="navTab"
                           title="学生基本信息管理"><span>上一页</span></a>
                    </li>
                </#if>
                <#list (currentPage-5)..(currentPage-1) as s>
                    <#if s gt 0>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理">${s}</a>
                        </li>
                    </#if>
                </#list>

                <li class="selected j-num"><a href="/student/baseInfo/${currentPage}" target="navTab"
                                              title="学生基本信息管理">${currentPage}</a></li>

                <#list (currentPage+1)..(currentPage+5) as s>
                    <#if s lte pageCount>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理">${s}</a>
                        </li>
                    </#if>
                </#list>
                <span>...</span>
                <#list (pageCount-1)..(pageCount) as s>
                    <#if s gt (currentPage+5)>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理">${s}</a>
                        </li>
                    </#if>
                </#list>
                <#if currentPage lt pageCount>
                    <li class="j-next">
                        <a class="next" href="/student/baseInfo/${currentPage+1}" target="navTab"
                           title="学生基本信息管理"><span>下一页</span></a>
                    </li>
                </#if>
                <li class="j-last">
                    <a class="last" href="/student/baseInfo/${pageCount}" target="navTab"
                       title="学生基本信息管理"><span>末页</span></a>
                </li>
                <li class="jumpto">
                    <input class="textInput" id="pageNum" onchange="jumpToPage()" type="text" size="4" value="1">
                    <a href="/student/baseInfo/1" id="goToUrl" target="navTab" title="学生基本信息管理">跳转</a>
                </li>
            </ul>
        </div>

    </div>
</div>
<script>
    function jumpToPage() {
        var url = $("#goToUrl").attr("href");
        var num = $("#pageNum").val();
        var r = /^[0-9]*[1-9][0-9]*$/;
        if (!r.test(num) || num > ${pageCount}) {
            alert("请输入正确的页码");
            $("#pageNum").val("1");
            return false;
        }
        url = url.replace("/student/baseInfo/1", "/student/baseInfo/" + num);
        $("#goToUrl").attr("href", url);
    }

</script>