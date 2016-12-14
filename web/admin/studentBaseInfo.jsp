<div class="pageHeader">
    <form>
        <div class="searchBar">
            <table class="searchContent">
                <tr>
                    <td>学院：
                        <select class="collegeBox" id="college" onchange="showProfessionList()">
                            <option value="">请选择学院</option>
                            <#list collegeList as x>
                                <option value="${x.empCollegeName}">${x.empCollegeName}</option>
                            </#list>
                        </select>
                    </td>
                    <td>专业：
                        <select class="professionBox" id="profession">
                            <option value="">请选择专业</option>
                        </select>
                    </td>
                    <td>
                        年级：<input type="text" id="grade"/>
                    </td>
                    <td>
                        学号：<input type="text" id="stuNum"/>
                    </td>
                    <td>
                        性别：
                        <select class="" id="sex">
                            <option value="">不限</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                    </td>
                    <td>
                        姓名：<input type="text" id="stuName"/>
                    </td>
                    <td>
                        培养层次：
                        <select class="" id="level">
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
                                <button type="button" onclick="query()">检索</button>
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
            <th width="120" align="center">姓名</th>
            <th width="120" align="center">性别</th>
            <th width="120" align="center">民族</th>
            <th width="120" align="center">籍贯</th>
            <th width="120" align="center">身份证号</th>
            <th width="120" align="center">政治面貌</th>
            <th width="120" align="center">入学年月</th>
            <th width="120" align="center">生源地</th>
            <th width="120" align="center">电话</th>
            <th width="120" align="center">联系地址</th>
            <th width="120" align="center">入学方式</th>
        </tr>
        </thead>
        <tbody id="stuTable">
        <#list studentList.getList() as x>
            <tr id="columnHead">
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

    /**
     * 根据条件查询并返回结果
     *
     * 由于框架的原因，刷新表格必须至少保留原来一行的框，否则左右拉伸会无效
     * 解决方法：将保留的那行数据换成新数据的第一行，后续的继续输出，加入空数据判断
     */
    function query() {
        var college = $('#college').val();
        var profession = $('#profession').val();
        var grade = $('#grade').val();
        var stuNum = $('#stuNum').val();
        var sex = $('#sex').val();
        var stuName = $('#stuName').val();
        var level = $('#level').val();
        var r = /^[0-9]*[1-9][0-9]*$/;
        if (grade != "") {
            if (!r.test(grade) || grade < 2000 || grade > 2100) {
                alert("输入的年级不符合要求");
                return false;
            }
        }
        $.ajax({
            type: "POST",
            url: "/student/baseInfoListJson/1",
            data: {
                "college": college,
                "profession": profession,
                "grade": grade,
                "stuNum": stuNum,
                "sex": sex,
                "stuName": stuName,
                "level": level
            },
            dataType: "json",
            success: function (data) {
                $('#stuTable tr:gt(0)').remove();
                var dataList = data.studentList;
                if (!(dataList.length > 0)) {
                    $('#stuTable tr:eq(0) td').text('暂无数据');
                    return false;
                }
                var row1 = new Array(dataList[0].empStudentCollege, dataList[0].empStudentProfession, dataList[0].empStudentNo,
                        dataList[0].empStudentName, dataList[0].empStudentSex, dataList[0].empStudentMinority, dataList[0].empStudentLocation,
                        dataList[0].empStudentIdNo, dataList[0].empStudentPoliticalStatus, dataList[0].empStudentEntryStudyDate, dataList[0].empStudentStuLocation,
                        dataList[0].empStudentTel, dataList[0].empStudentAddress, dataList[0].empStudentEntryStudyType);
                $('#stuTable tr:eq(0)').css('overflow', 'hidden');
                $('#stuTable tr:eq(0)').css('white-space', 'nowrap');
                $('#stuTable tr:eq(0) td').each(function (i) {
                    $(this).text(row1[i]);
                });
                $(dataList).each(function (i, val) {
                    if (i > 0) {
                        $('#stuTable').append('<tr style="text-align:center;overflow:hidden; white-space:nowrap;">' +
                                '<td width="' + $('#columnHead td:eq(0)').width + 'px">' + val.empStudentCollege + '</td>' +
                                '<td width="' + $('#columnHead td:eq(1)').width + 'px">' + val.empStudentProfession + '</td>' +
                                '<td width="' + $('#columnHead td:eq(2)').width + 'px">' + val.empStudentNo + '</td>' +
                                '<td width="' + $('#columnHead td:eq(3)').width + 'px">' + val.empStudentName + '</td>' +
                                '<td width="' + $('#columnHead td:eq(4)').width + 'px">' + val.empStudentSex + '</td>' +
                                '<td width="' + $('#columnHead td:eq(5)').width + 'px">' + val.empStudentMinority + '</td>' +
                                '<td width="' + $('#columnHead td:eq(6)').width + 'px">' + val.empStudentLocation + '</td>' +
                                '<td width="' + $('#columnHead td:eq(7)').width + 'px">' + val.empStudentIdNo + '</td>' +
                                '<td width="' + $('#columnHead td:eq(8)').width + 'px">' + val.empStudentPoliticalStatus + '</td>' +
                                '<td width="' + $('#columnHead td:eq(9)').width + 'px">' + val.empStudentEntryStudyDate + '</td>' +
                                '<td width="' + $('#columnHead td:eq(10)').width + 'px">' + val.empStudentStuLocation + '</td>' +
                                '<td width="' + $('#columnHead td:eq(11)').width + 'px">' + val.empStudentTel + '</td>' +
                                '<td width="' + $('#columnHead td:eq(12)').width + 'px">' + val.empStudentAddress + '</td>' +
                                '<td width="' + $('#columnHead td:eq(13)').width + 'px">' + val.empStudentEntryStudyType + '</td></tr>');
                    }
                });
            },
            error: function (textStatus) {
                alert("error");
                console.info(msg);
            }
        });


    }
</script>