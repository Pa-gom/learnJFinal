<div class="pageContent">
    <form method="post" action="/recruit/save" onsubmit='return validateCallback(this,
        (function (json){
            if(json.saveResult == "0"){
                alertMsg.info("添加成功");
                navTab.closeCurrentTab();
                navTab.reload();
            }else{
                alertMsg.info("添加失败");
                navTab.reload();
                navTab.reload();
            }
            return false;
        }),
           "是否提交");' class="pageForm required-validate">
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 80px;">
            <div class="units">
                <dl>
                    <label> &nbsp;&nbsp;标&nbsp;&nbsp;&nbsp;&nbsp;题：&nbsp;&nbsp;</label>
                    <dd><input class="required" type="text" size="80" minlength="2" maxlength="100"
                               name="school.empRecruitTitle"/></dd>
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
                    <dd><input class="required" type="text" size="20" minlength="2" maxlength="10"
                               name="school.empContact"/></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>联系电话：</label>
                    <dd><input class="required phone" type="text" size="20" name="school.empTel"/></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>企业介绍：</label>
                    <dd><textarea name="school.empRecruitHostInfo" class="required" cols="80" rows="4"></textarea></dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>日期时间：</label>
                    <dd>
                        <input name="school.empRecruitDate" type="text" class="date" minDate="${minDate}"
                               maxDate="${maxDate}" value="${minDate}" readonly="true" placeholder="        请选择举办日期"/>
                        <a class="inputDateButton" href="javascript:;">选择</a>
                        <input type="text" name="school.empRecruitTime" value="09:00" class="date" dateFmt="HH:mm"
                               mmStep="15" readonly="true" placeholder="        请选择举办时间"/>
                        <a class="inputDateButton" href="javascript:;">选择</a>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>招聘方式：</label>
                    <dd>
                        <textarea name="school.empRecruitWay" class="required" cols="80" rows="4"></textarea>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>&nbsp;&nbsp;地&nbsp;&nbsp;&nbsp;&nbsp;点：&nbsp;&nbsp;</label>
                    <dd>
                        <textarea name="school.empRecruitAddress" class="required" cols="80" rows="4"></textarea>
                    </dd>
                </dl>
            </div>
            <div class="units">
                <dl>
                    <label>具体内容：</label>
                    <dd>
                        <textarea name="school.empRecruitContent" class="editor required" cols="80"
                                  rows="32"></textarea>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="formBar">
            <ul>
                <li>
                    <div class="buttonActive">
                        <div class="buttonContent">
                            <button type="submit">添加信息</button>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="button">
                        <div class="buttonContent">
                            <button type="reset">清空重输</button>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </form>
</div>
<script>
    //调整对话框大小，下列类名来自于生成的网页中，在本文件里找不到
    $('.units').css('width', '800px').css('margin-top', '25px').css('height', 'auto');
    $('.units label').width('auto');

    function getCity(index) {
        var province = $('.province:eq(' + index + ')').val();
        $.ajax({
            type: "POST",
            url: "/student/cityJson",
            data: {"province": province},
            dataType: "json",
            success: function (data) {
                var dataList = data.cityList;
                $(".city:eq(" + index + ")").empty();
                $(dataList).each(function (i, val) {
                    $(".city:eq(" + index + ")").append('<option value="' + val.city + '">' + val.city + '</option>');
                });

            },
            error: function (textStatus) {
                alert("error");
                console.info(msg);
            }
        });
    }

    function setStuLocation(index) {
        $(".location:eq(" + index + ")").val($(".province:eq(" + index + ")").val() + "," + $(".city:eq(" + index + ")").val());
    }
</script>