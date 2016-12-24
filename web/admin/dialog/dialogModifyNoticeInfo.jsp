<div class="pageContent">
    <form method="post" action="/recruit/update" onsubmit='return validateCallback(this,
        (function (json){
            if(json.saveResult == "0"){
                alertMsg.info("修改成功");
                $.pdialog.closeCurrent();
                navTab.reload();
            }else{
                alertMsg.info("修改失败");
                navTab.reload();
            }
            return false;
        }),
           "是否提交");' class="pageForm required-validate">
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 80px;">
            <input type="text" name="school.empRecruitNo" value="${info.empRecruitNo}" hidden/>
            <div class="units">
                <dl>
                    <label> &nbsp;&nbsp;标&nbsp;&nbsp;&nbsp;&nbsp;题：&nbsp;&nbsp;</label>
                    <dd><input value="${info.empRecruitTitle}" class="required" type="text" size="80" minlength="2"
                               maxlength="100" name="school.empRecruitTitle"/></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>文章类型：</label>
                    <dd>
                        <select name="school.empRecruitType">
                            <option value="${typeId}">${type}</option>
                        </select>
                    </dd>
                </dl>
            </div>

            <input value="无" type="text" size="20" name="school.empContact" hidden/>

            <input value="无" type="text" size="20" name="school.empTel" hidden/>

            <input value="无" name="school.empRecruitHostInfo" cols="80" rows="4" hidden/>

            <input name="school.empRecruitDate" value="无" hidden/>

            <input value="无" type="text" name="school.empRecruitTime" hidden/>
            <input value="无" name="school.empRecruitWay" cols="80" rows="4" hidden/>

            <input value="无" name="school.empRecruitAddress" cols="80" rows="4" hidden/>
            <div class="units">
                <dl>
                    <label>具体内容：</label>
                    <dd>
                        <textarea name="school.empRecruitContent" class="editor required" cols="80"
                                  rows="32">${info.empRecruitContent}</textarea>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="formBar">
            <ul>
                <li>
                    <div class="buttonActive">
                        <div class="buttonContent">
                            <button type="submit">修改信息</button>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </form>
</div>
<script>
    //调整对话框大小，下列类名来自于生成的网页中，在本文件里找不到
    $('.dialog').css('top', '22%');
    $('.dialog').css('left', '20%');
    $('.dialog').css('width', '1000px');
    $('.dialog').css('height', '520px');
    $('.dialogContent').css('width', '988px');
    $('.dialogContent').css('height', '520px');
    $('.units').css('width', '800px').css('margin-top', '25px').css('height', 'auto');
    $('.units label').width('auto');
    //输入框阴影位置暂时无法控制，先删除
    $('.shadow').remove();

</script>