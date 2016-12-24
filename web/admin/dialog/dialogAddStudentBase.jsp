<div class="pageContent">
    <form method="post" action="/student/save" onsubmit='return validateCallback(this,
        (function (json){
            if(json.saveResult == "0"){
                alertMsg.info("添加成功");
                 $.pdialog.closeCurrent();
            }else if(json.saveResult == "1"){
                alertMsg.info("该学号已存在");
            }else if(json.saveResult == "2"){
                alertMsg.info("该身份证号已存在");
            }
            return false;
        }),
           "是否提交");' class="pageForm required-validate">
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 36px;">
            <div class="units">
                <label> &nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;&nbsp;</label>
                <input class="required" type="text" size="25" minlength="2" maxlength="10" name="stu.empStudentName"/>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;号：&nbsp;&nbsp;</label>
                <input class="required alphaNumber" type="text" size="25" minlength="8" maxlength="12"
                       name="stu.empStudentNo"/>
            </div>
            <div class="units">
                <label>曾&nbsp;&nbsp;用&nbsp;&nbsp;名：</label>
                <input type="text" size="25" name="stu.empStudentOldName"/>
            </div>
            <div class="units">
                <label>姓名拼音：</label>
                <input class="lettersonly" type="text" size="25" minlength="2" maxlength="20"
                       name="stu.empStudentNameAlphaSpell"/>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;&nbsp;</label>
                <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio" value="男"
                                                                        checked/>男</label>
                <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio"
                                                                        value="女"/>女</label>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;民&nbsp;&nbsp;&nbsp;&nbsp;族：&nbsp;&nbsp;</label>
                <select name="stu.empStudentMinority">
                    <#list minorityList as x>
                        <option value="${x.empMinorityName}">${x.empMinorityName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;籍&nbsp;&nbsp;&nbsp;&nbsp;贯：&nbsp;&nbsp;</label>
                <select class="province" onchange="getCity(0)">
                    <option>请选择</option>
                    <#list provinceList as x>
                        <option value="${x.province}">${x.province}</option>
                    </#list>
                </select>
                <select class="city required" onchange="setStuLocation(0)" name="city1"></select>
                <input class="location" type="text" size="25" name="stu.empStudentLocation" hidden/>
            </div>
            <div class="units">
                <label>政治面貌：</label>
                <select name="stu.empStudentPoliticalStatus">
                    <#list politicalList as x>
                        <option value="${x.empPoliticalStatusName}">${x.empPoliticalStatusName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>婚姻状况：</label>
                <select name="stu.empStudentMarry">
                    <#list marryList as x>
                        <option value="${x.empStudentMarryName}">${x.empStudentMarryName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>生&nbsp;&nbsp;源&nbsp;&nbsp;地：</label>
                <select class="province" onchange="getCity(1)">
                    <option>请选择</option>
                    <#list provinceList as y>
                        <option value="${y.province}">${y.province}</option>
                    </#list>
                </select>
                <select class="stu city required" onchange="setStuLocation(1)" name="city2"></select>
                <input class="location" type="text" size="25" name="stu.empStudentStuLocation" hidden/>
            </div>
            <div class="units">
                <label>联系地址：</label>
                <input class="required" type="text" size="25" name="stu.empStudentAddress"/>
            </div>
            <div class="units">
                <label>联系电话：</label>
                <input class="required phone" type="text" size="25" name="stu.empStudentTel"/>
            </div>
            <div class="units">
                <label>邮政编码：</label>
                <input class="required postcode" type="text" size="25" name="stu.empStudentPostCode"/>
            </div>
            <div class="units">
                <label>身份证号：</label>
                <input class="required idNumber" type="text" size="25" name="stu.empStudentIdNo"/>
            </div>
            <div class="units">
                <label>考&nbsp;&nbsp;生&nbsp;&nbsp;号：</label>
                <input class="required alphanumeric" type="text" size="25" name="stu.empStudentExamNo"/>
            </div>
            <div class="units">
                <label>考生类别：</label>
                <select name="stu.empStudentExamType">
                    <#list examTypeList as x>
                        <option value="${x.empExamTypeName}">${x.empExamTypeName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>入学时间：</label>
                <input class="date required" type="text" size="25" name="stu.empStudentEntryStudyDate"/>
            </div>
            <div class="units">
                <label>所属学院：</label>
                <select name="stu.empStudentCollege">
                    <#list collegeList as x>
                        <option value="${x.empCollegeName}">${x.empCollegeName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>具体专业：</label>
                <input class="required" type="text" size="25" name="stu.empStudentProfession"/>
            </div>
            <div class="units">
                <label>所在年级：</label>
                <input class="required digits" type="text" size="25" name="stu.empStudentGrade"/>
            </div>
            <div class="units">
                <label>曾读专业：</label>
                <input type="text" size="25" name="stu.empStudentOldProfession"/>
            </div>
            <div class="units">
                <label>毕业时间：</label>
                <input class="required date" type="text" size="25" name="stu.empStudentLevelStudyDate"/>
            </div>
            <div class="units">
                <label>电子邮箱：</label>
                <input class="required email" type="text" size="25" name="stu.empStudentEmail"/>
            </div>
            <div class="units">
                <label>培养层次：</label>
                <input class="required" type="text" size="25" name="stu.empStudentDevelopLevel"/>
            </div>
            <div class="units">
                <label>入学方式：</label>
                <select name="stu.empStudentEntryStudyType">
                    <#list entryTypeList as x>
                        <option value="${x.empEntryTypeName}">${x.empEntryTypeName}</option>
                    </#list>
                </select>
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
    $('.dialog').css('top', '22%');
    $('.dialog').css('left', '20%');
    $('.dialog').css('width', '1000px');
    $('.dialog').css('height', '520px');
    $('.dialogContent').css('width', '988px');
    $('.dialogContent').css('height', '520px');
    $('.units').css('float', 'left')
            .css('width', '460px')
            .css('padding-top', '12px');
    $('.units label').width('auto');

    //输入框阴影位置暂时无法控制，先删除
    $('.shadow').remove();

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