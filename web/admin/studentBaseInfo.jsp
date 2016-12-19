<div class="pageHeader">
    <form id="pagerForm" action="/student/baseInfo/1" method="post" onsubmit="return submitQuery(this)">
        <div class="searchBar">
            <table class="searchContent">
                <tr>
                    <td>学院：
                        <select id="collegeBox" class="collegeBox" name="college" onchange="showProfessionList()">
                            <option value="">请选择学院</option>
                            <#list collegeList as x>
                                <option value="${x.empCollegeName}">${x.empCollegeName}</option>
                            </#list>
                        </select>
                    </td>
                    <td>专业：
                        <select id="professionBox" class="professionBox" name="profession">
                            <option value="">请选择专业</option>
                        </select>
                    </td>
                    <td>
                        年级：<input type="text" name="grade"/>
                    </td>
                    <td>
                        学号：<input type="text" name="stuNum"/>
                    </td>
                    <td>
                        性别：
                        <select class="" name="sex">
                            <option value="">不限</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                    </td>
                    <td>
                        姓名：<input type="text" name="stuName"/>
                    </td>
                    <td>
                        培养层次：
                        <select class="" name="level">
                            <option value="">不限</option>
                            <option value="本科">本科</option>
                            <option value="硕士">硕士</option>
                            <option value="博士">博士</option>
                        </select>
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
                </ul>
            </div>
        </div>
    </form>
</div>
<div class="pageContent">
    <div class="panelBar">
        <ul class="toolBar">
            <li><a class="add" href="/student/addDialog" target="dialog" mask="true" title="添加学生信息"><span>添加</span></a>
            </li>
            <li><a title="确实要删除这些记录吗?" onclick="delInfoList()" class="delete"><span>批量删除</span></a></li>
            </li>
            <li class="line">line</li>
            <li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab"
                   title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
            <!--<li><a target="selectedLoad" rel="ids" postType="string" href="studentBaseInfo.jsp" class="icon"><span>批量Dialog Load逗号分隔</span></a></li>-->
        </ul>
    </div>
    <table class="table" width="100%" layoutH="150">
        <thead>
        <tr id="columnHead">
            <th width="22"><input type="checkbox" class="checkboxCtrl" group="ids" value="xxx"></th>
            <th width="120" align="center">学院</th>
            <th width="120" align="center">专业</th>
            <th width="100" align="center">学号</th>
            <th width="80" align="center">姓名</th>
            <th width="40" align="center">性别</th>
            <th width="60" align="center">民族</th>
            <th width="120" align="center">籍贯</th>
            <th width="120" align="center">身份证号</th>
            <th width="80" align="center">政治面貌</th>
            <th width="80" align="center">入学年月</th>
            <th width="120" align="center">生源地</th>
            <th width="120" align="center">电话</th>
            <th width="120" align="center">联系地址</th>
            <th width="120" align="center">入学方式</th>
            <th width="100" align="center">操作</th>
        </tr>
        </thead>
        <tbody id="stuTable">
        <#list studentList.getList() as x>
            <tr target="sid_user" rel="${x_index}" class="infoList"
                style="text-align:center;overflow:hidden; white-space:nowrap;">
                <td><input class="selectTools" value="${x.empStudentNo}" name="ids" type="checkbox"></td>
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
                <td>
                    <a title="删除" class="btnDel" onclick="delInfo(this)">删除</a>
                    <a title="编辑学生信息" class="btnEdit add" href="/student/modifyDialog/${x.empStudentNo}" target="dialog"
                       mask="true" title="修改学生信息">编辑</a>
                </td>
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
                    <a class="first" href="/student/baseInfo/1" target="navTab" title="学生基本信息管理"
                       rel="studentBaseInfo"><span>首页</span></a>
                </li>
                <#if currentPage gt 1>
                    <li class="j-prev disabled">
                        <a class="previous" href="/student/baseInfo/${currentPage-1}" target="navTab"
                           rel="studentBaseInfo"
                           title="学生基本信息管理"><span>上一页</span></a>
                    </li>
                </#if>
                <#list (currentPage-5)..(currentPage-1) as s>
                    <#if s gt 0>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理"
                                             rel="studentBaseInfo">${s}</a>
                        </li>
                    </#if>
                </#list>

                <li class="selected j-num"><a href="/student/baseInfo/${currentPage}" target="navTab"
                                              rel="studentBaseInfo"
                                              title="学生基本信息管理">${currentPage}</a></li>

                <#list (currentPage+1)..(currentPage+5) as s>
                    <#if s lte pageCount>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理"
                                             rel="studentBaseInfo">${s}</a>
                        </li>
                    </#if>
                </#list>
                <span>...</span>
                <#list (pageCount-1)..(pageCount) as s>
                    <#if s gt (currentPage+5)>
                        <li class="j-num"><a href="/student/baseInfo/${s}" target="navTab" title="学生基本信息管理"
                                             rel="studentBaseInfo">${s}</a>
                        </li>
                    </#if>
                </#list>
                <#if currentPage lt pageCount>
                    <li class="j-next">
                        <a class="next" href="/student/baseInfo/${currentPage+1}" target="navTab" rel="studentBaseInfo"
                           title="学生基本信息管理"><span>下一页</span></a>
                    </li>
                </#if>
                <li class="j-last">
                    <a class="last" href="/student/baseInfo/${pageCount}" target="navTab" rel="studentBaseInfo"
                       title="学生基本信息管理"><span>末页</span></a>
                </li>
                <li class="jumpto">
                    <input class="textInput" id="pageNum" onchange="jumpToPage()" type="text" size="4" value="1">
                    <a href="/student/baseInfo/1" id="goToUrl" target="navTab" title="学生基本信息管理"
                       rel="studentBaseInfo">跳转</a>
                </li>
            </ul>
        </div>

    </div>
</div>
<script>


    /**
     * 跳转到指定页面
     */
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

    /**
     * 根据学院查询并显示专业列表
     */
    function showProfessionList() {
        var college = $(".collegeBox option:selected").val();
        $.ajax({
            type: "POST",
            url: "/student/professionJson",
            data: {"college": college},
            dataType: "json",
            success: function (data) {
                var dataList = data.professionList;
                $(".professionBox option:gt(0)").remove();
                $(dataList).each(function (i, val) {
                    $(".professionBox").append('<option value="' + val.empProfessionName + '">' + val.empProfessionName + '</option>');
                });

                console.info(data);
            },
            error: function (textStatus) {
                alert("error");
                console.info(msg);
            }
        });
    }

    function delInfo(element) {
        var stuNo = $($(element).parent().parent().parent().children("td:eq(3)")).text();
        $.ajax({
            type: "POST",
            url: "/student/delete/",
            data: {
                "stuNo": stuNo,
            },
            dataType: "json",
            success: function (data) {
                //data.resultCode 0表示删除成功，1表示没有找到该数据项，不管怎样，刷新后都不再显示
                navTab.reload();
            },
            error: function (msg) {
                alert("删除失败");
            }
        });
    }


    function delInfoList() {
        var list = "";
        $('.selectTools:checked').each(function (i) {
            if (i > 0) {
                list += "," + ($(this).parent().parent().parent().children("td:eq(3)")).text();
            } else {
                list = ($(this).parent().parent().parent().children("td:eq(3)")).text()
            }
        });
        $.ajax({
            type: "POST",
            url: "/student/deleteList/",
            data: {
                "stuNo": list,
            },
            dataType: "json",
            success: function (data) {
                //data.resultCode 0表示删除成功，1表示没有找到该数据项，不管怎样，刷新后都不再显示
                navTab.reload();
            },
            error: function (msg) {
                alert("删除失败");
            }
        });
    }

    var condition;
    function submitQuery(form) {
        condition = $(form).serializeArray();
        navTab.reload(form.action, condition);
        return false;
    }
</script>