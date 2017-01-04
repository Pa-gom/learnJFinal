<div class="pageContent">
    <div class="panelBar">
        <ul class="toolBar">
            <li class="line">line</li>
            <li><a class="add" href="/recruit/addDialog/4" target="navTab" mask="true"
                   title="添加通知公告"><span>添加</span></a>
            </li>
            <li class="line">line</li>
            <li><a title="确实要删除这些记录吗?" onclick="delInfoList()" class="delete"><span>批量删除</span></a></li>
            </li>
            <li class="line">line</li>
            <li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab"
                   title="实要导出这些记录吗?"><span>导出EXCEL</span></a></li>
            <li class="line">line</li>
        </ul>
    </div>
    <table class="table" width="100%" layoutH="74">
        <thead>
        <tr id="columnHead">
            <th width="2%" align="center"><input type="checkbox" class="checkboxCtrl" group="ids" value="xxx"></th>
            <th width="3%" align="center">编号</th>
            <th width="19%" align="center">招聘标题</th>
            <th width="12%" align="center">发布者</th>
            <th width="8%" align="center">发布时间</th>
            <th width="5%" align="center">点击量</th>
            <th width="5%" align="center">状态</th>
            <th width="6%" align="center">操作</th>
        </tr>
        </thead>
        <tbody id="stuTable">
        <#list recruitList.getList() as x>
            <tr target="sid_user" rel="${x_index}" class="infoList">
                <td><input class="selectTools" value="${x.empRecruitNo}" name="ids" type="checkbox"></td>
                <td>${x.empRecruitNo}</td>
                <td>${x.empRecruitTitle}</td>
                <td>${x.empRecruitPublisher}</td>
                <td>${x.empRecruitPublishDateTime}</td>
                <td>${x.empRecruitHits}</td>
                <#if x.empRecruitState == "0">
                    <td width="5%">待审核</td>
                    <td width="10%">
                        <a title="修改通知公告" class="btnEdit add" href="/recruit/modifyDialog/4-${x.empRecruitNo}"
                           target="dialog"
                           mask="true">修改</a>
                    </td>
                    <#elseif x.empRecruitState == "1">
                        <td width="5%">已发布</td>
                        <td width="10%">
                            <a title="删除" class="btnDel" onclick="delInfo(this)">删除</a>
                            <a title="修改通知公告" class="btnEdit add" href="/recruit/modifyDialog/4-${x.empRecruitNo}"
                               target="dialog"
                               mask="true">修改</a>
                        </td>
                </#if>
            </tr>
        </#list>
        </tbody>
    </table>
    <div class="panelBar">
        <div class="pages">
			<span>显示:共
			${recruitList.getList().size()}
			   条</span>
        </div>


        <div class="pagination" targettype="navTab" totalcount="200" numperpage="20" pagenumshown="10" currentpage="1">
            <ul>
                <li class="j-first disabled">
                    <a class="first" href="recruit/notice/1" target="navTab" title="通知公告管理"
                       rel="recruitInfo"><span>首页</span></a>
                </li>
                <#if currentPage gt 1>
                    <li class="j-prev disabled">
                        <a class="previous" href="recruit/notice/${currentPage-1}" target="navTab"
                           rel="recruitInfo"
                           title="通知公告管理"><span>上一页</span></a>
                    </li>
                </#if>
                <#list (currentPage-5)..(currentPage-1) as s>
                    <#if s gt 0>
                        <li class="j-num"><a href="recruit/notice/${s}" target="navTab" title="通知公告管理"
                                             rel="recruitInfo">${s}</a>
                        </li>
                    </#if>
                </#list>

                <li class="selected j-num"><a href="recruit/notice/${currentPage}" target="navTab"
                                              rel="noticeInfo"
                                              title="通知公告管理">${currentPage}</a></li>

                <#list (currentPage+1)..(currentPage+5) as s>
                    <#if s lte pageCount>
                        <li class="j-num"><a href="recruit/notice/${s}" target="navTab" title="通知公告管理"
                                             rel="recruitInfo">${s}</a>
                        </li>
                    </#if>
                </#list>
                <span>...</span>
                <#list (pageCount-1)..(pageCount) as s>
                    <#if s gt (currentPage+5)>
                        <li class="j-num"><a href="recruit/notice/${s}" target="navTab" title="通知公告管理"
                                             rel="recruitInfo">${s}</a>
                        </li>
                    </#if>
                </#list>
                <#if currentPage lt pageCount>
                    <li class="j-next">
                        <a class="next" href="recruit/notice/${currentPage+1}" target="navTab" rel="recruitInfo"
                           title="通知公告管理"><span>下一页</span></a>
                    </li>
                </#if>
                <li class="j-last">
                    <a class="last" href="recruit/notice/${pageCount}" target="navTab" rel="recruitInfo"
                       title="通知公告管理"><span>末页</span></a>
                </li>
                <li class="jumpto">
                    <input class="textInput" id="pageNum" onchange="jumpToPage()" type="text" size="4" value="1">
                    <a href="recruit/notice/1" id="goToUrl" target="navTab" title="通知公告管理"
                       rel="recruitInfo">跳转</a>
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
        url = url.replace("recruit/notice/1", "recruit/notice/" + num);
        $("#goToUrl").attr("href", url);
    }

    function delInfo(element) {
        var recruitNo = $($(element).parent().parent().parent().children("td:eq(1)")).text();
        $.ajax({
            type: "POST",
            url: "/recruit/delete/",
            data: {
                "recruitNo": recruitNo,
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
                list += "," + ($(this).parent().parent().parent().children("td:eq(1)")).text();
            } else {
                list = ($(this).parent().parent().parent().children("td:eq(1)")).text()
            }
        });
        $.ajax({
            type: "POST",
            url: "/recruit/deleteList/",
            data: {
                "recruitNo": list,
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
</script>