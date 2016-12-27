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