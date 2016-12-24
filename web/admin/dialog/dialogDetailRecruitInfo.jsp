<div class="pageContent">
    <form method="post" action="/recruit/check" onsubmit='return validateCallback(this,
        (function (json){
            if(json.saveResult == "0"){
                alertMsg.info("审核完毕");
                 $.pdialog.close("checkSubmitInfo");
                 navTab.reload();
            }else{
                alertMsg.info("网络错误，稍后重试");
                $.pdialog.close("checkSubmitInfo");
                navTab.reload();
            }
            return false;
        }),
           "是否提交");' class="pageForm required-validate">
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 80px;">
            <input readonly="readonly" type="text" name="school.empRecruitNo" value="${info.empRecruitNo}" hidden/>
            <div class="units">
                <dl>
                    <label> &nbsp;&nbsp;标&nbsp;&nbsp;&nbsp;&nbsp;题：&nbsp;&nbsp;</label>

                    <dd><textarea readonly="readonly" cols="80" rows="4" maxlength="100"
                                  name="school.empRecruitTitle">${info.empRecruitTitle}</textarea></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>招聘类型：</label>
                    <dd>
                        <select name="school.empRecruitType">
                            <option value="${typeId}">${type}</option>
                        </select>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label> &nbsp;&nbsp;联系人：&nbsp;&nbsp;</label>
                    <dd><input readonly="readonly" value="${info.empContact}" class="required" type="text" size="20"
                               minlength="2" maxlength="10" name="school.empContact"/></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>联系电话：</label>
                    <dd><input readonly="readonly" value="${info.empTel}" class="required phone" type="text" size="20"
                               name="school.empTel"/></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>企业介绍：</label>
                    <dd><textarea readonly="readonly" name="school.empRecruitHostInfo" class="required" cols="80"
                                  rows="4">${info.empRecruitHostInfo}</textarea></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>日期时间：</label>
                    <dd>
                        <input readonly="readonly" name="school.empRecruitDate" type="text"
                               value="${info.empRecruitDate}"/>
                        <a class="inputDateButton" href="javascript:;">选择</a>
                        <input readonly="readonly" type="text" name="school.empRecruitTime"
                               value="${info.empRecruitTime}"/>
                        <a class="inputDateButton" href="javascript:;">选择</a>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>招聘方式：</label>
                    <dd>
                        <textarea readonly="readonly" name="school.empRecruitWay" class="required" cols="80"
                                  rows="4">${info.empRecruitWay}</textarea>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>&nbsp;&nbsp;地&nbsp;&nbsp;&nbsp;&nbsp;点：&nbsp;&nbsp;</label>
                    <dd>
                        <textarea readonly="readonly" name="school.empRecruitAddress" class="required" cols="80"
                                  rows="4">${info.empRecruitAddress}</textarea>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>具体内容：</label>
                    <dd>
                        <textarea readonly="readonly" name="school.empRecruitContent" cols="80"
                                  rows="20">${info.empRecruitContent}</textarea>
                    </dd>
                </dl>
            </div>
        </div>
        <input type="text" name="school.empRecruitState" value="0" id="recruitState" hidden/>
        <input type="text" name="school.empRecruitBack" value="" id="recruitBack" hidden/>
        <div class="formBar">
            <ul>
                <li>
                    <div class="buttonActive">
                        <div class="buttonContent">
                            <button type="button" onclick="closedialog()">&nbsp;&nbsp;关&nbsp;&nbsp;&nbsp;&nbsp;闭&nbsp;&nbsp;</button>
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


    function closedialog() {
        $.pdialog.closeCurrent();
    }
</script>