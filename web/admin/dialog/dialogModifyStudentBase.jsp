<div class="pageContent">
    <form method="post" action="/student/update" onsubmit='return validateCallback(this,
        (function (json){
            if(json.saveResult == "0"){
                alertMsg.info("修改成功");
                $.pdialog.closeCurrent();
                navTab.reload();
            }else{
                alertMsg.info("修改失败");
                $.pdialog.closeCurrent();
                navTab.reload();
            }
            return false;
        }),
           "是否提交");' class="pageForm required-validate">
        <input type="text" value="${info.empStudentQueue}" name="stu.empStudentQueue" hidden/>
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 36px;">
            <div class="units">
                <label> &nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;&nbsp;</label>
                <input class="required" type="text" size="25" minlength="2" maxlength="10"
                       value="${info.empStudentName}" name="stu.empStudentName"/>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;号：&nbsp;&nbsp;</label>
                <input class="required alphaNumber" type="text" size="25" minlength="8" maxlength="12"
                       value="${info.empStudentNo}" name="stu.empStudentNo"/>
            </div>
            <div class="units">
                <label>曾&nbsp;&nbsp;用&nbsp;&nbsp;名：</label>
                <input type="text" size="25" name="stu.empStudentOldName" value="${info.empStudentOldName}"/>
            </div>
            <div class="units">
                <label>姓名拼音：</label>
                <input class="lettersonly" type="text" size="25" minlength="2" maxlength="20"
                       value="${info.empStudentNameAlphaSpell}" name="stu.empStudentNameAlphaSpell"/>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;&nbsp;</label>
                <#if info.empStudentSex = "男">
                    <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio"
                                                                            value="男" checked/>男</label>
                    <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio"
                                                                            value="女"/>女</label>
                    <#elseif info.empStudentSex = "女" >
                        <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio"
                                                                                value="男"/>男</label>
                        <label class="radioButton" style="height: 21px;"><input name="stu.empStudentSex" type="radio"
                                                                                value="女" checked/>女</label>
                </#if>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;民&nbsp;&nbsp;&nbsp;&nbsp;族：&nbsp;&nbsp;</label>
                <select name="stu.empStudentMinority" class="minorityList">
                    <#list minorityList as x>
                        <option value="${x.empMinorityName}">${x.empMinorityName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;籍&nbsp;&nbsp;&nbsp;&nbsp;贯：&nbsp;&nbsp;</label>
                <select class="province" id="initProvince1" onchange="getCity(0)">
                    <option>请选择</option>
                    <#list provinceList as x>
                        <option value="${x.province}">${x.province}</option>
                    </#list>
                </select>
                <select class="city required" id="initCity1" onchange="setStuLocation(0)" name="city1"></select>
                <input class="location" type="text" size="25" name="stu.empStudentLocation" hidden/>
            </div>
            <div class="units">
                <label>政治面貌：</label>
                <select name="stu.empStudentPoliticalStatus" class="politicalList">
                    <#list politicalList as x>
                        <option value="${x.empPoliticalStatusName}">${x.empPoliticalStatusName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>婚姻状况：</label>
                <select name="stu.empStudentMarry" class="marryList">
                    <#list marryList as x>
                        <option value="${x.empStudentMarryName}">${x.empStudentMarryName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>生&nbsp;&nbsp;源&nbsp;&nbsp;地：</label>
                <select class="province" id="initProvince2" onchange="getCity(1)">
                    <option>请选择</option>
                    <#list provinceList as y>
                        <option value="${y.province}">${y.province}</option>
                    </#list>
                </select>
                <select class="stu city required" id="initCity2" onchange="setStuLocation(1)" name="city2"></select>
                <input class="location" type="text" size="25" name="stu.empStudentStuLocation" hidden/>
            </div>
            <div class="units">
                <label>联系地址：</label>
                <input class="required" type="text" size="25" value="${info.empStudentAddress}"
                       name="stu.empStudentAddress"/>
            </div>
            <div class="units">
                <label>联系电话：</label>
                <input class="required phone" type="text" size="25" value="${info.empStudentTel}"
                       name="stu.empStudentTel"/>
            </div>
            <div class="units">
                <label>邮政编码：</label>
                <input class="required postcode" type="text" size="25" value="${info.empStudentPostCode}"
                       name="stu.empStudentPostCode"/>
            </div>
            <div class="units">
                <label>身份证号：</label>
                <input class="required idNumber" type="text" size="25" value="${info.empStudentIdNo}"
                       name="stu.empStudentIdNo"/>
            </div>
            <div class="units">
                <label>考&nbsp;&nbsp;生&nbsp;&nbsp;号：</label>
                <input class="required alphanumeric" type="text" size="25" value="${info.empStudentExamNo}"
                       name="stu.empStudentExamNo"/>
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
                <input class="date required" type="text" size="25" value="${info.empStudentEntryStudyDate}"
                       name="stu.empStudentEntryStudyDate"/>
            </div>
            <div class="units">
                <label>所属学院：</label>
                <select id="collegeList" class="collegeList" name="stu.empStudentCollege"
                        onchange="showProfessionList()">
                    <#list collegeList as x>
                        <option value="${x.empCollegeName}">${x.empCollegeName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>具体专业：</label>
                <select class="professionBox" name="stu.empStudentProfession">
                    <option>请选择</option>
                </select>
            </div>
            <div class="units">
                <label>所在年级：</label>
                <select class="gradeList" name="stu.empStudentGrade">
                </select>
            </div>
            <div class="units">
                <label>曾读专业：</label>
                <input type="text" size="25" value="${info.empStudentOldProfession}"
                       name="stu.empStudentOldProfession"/>
            </div>
            <div class="units">
                <label>毕业时间：</label>
                <input class="required date" type="text" size="25" value="${info.empStudentLevelStudyDate}"
                       name="stu.empStudentLevelStudyDate"/>
            </div>
            <div class="units">
                <label>电子邮箱：</label>
                <input class="required email" type="text" size="25" value="${info.empStudentEmail}"
                       name="stu.empStudentEmail"/>
            </div>
            <div class="units">
                <label>培养层次：</label>
                <select class="levelList" name="stu.empStudentDevelopLevel">
                </select>
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
                            <button type="submit">修改信息</button>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="button">
                        <div class="buttonContent">
                            <button type="button" onclick="closedialog()">取消修改</button>
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


    $(document).ready(function () {
        var d = new Date();
        var currentYear = d.getFullYear();
        for (var i = 0; i < 8; i++) {
            $('.gradeList').append('<option value="' + (currentYear - i) + '">' + (currentYear - i) + '</option>');
        }
        $('.levelList').append('<option value="本科">本科</option>')
                .append('<option value="硕士">硕士</option>')
                .append('<option value="博士">博士</option>');

        initSomeData();

    });

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



    /**
     * 根据学院查询并显示专业列表
     */
    function showProfessionList() {
        var college = $("#collegeList option:selected").val();
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

    function initSomeData() {
        $('.minorityList').val("${info.empStudentMinority}");
        $('#initProvince1').val("${province1}");
        getCity(0);
        $('#initProvince2').val("${province2}");
        getCity(1);
        $('.collegeList').val("${info.empStudentCollege}");
        showProfessionList();
        setTimeout(setData, 200);//设置延迟，必须等select的选项加载完后才能设置值
    }

    function setData() {
        $('#initCity1').val("${city1}");
        $('#initCity2').val("${city2}");
        $('.professionBox').val("${info.empStudentProfession}");
        setTimeout(setStuLocation(0), 200);
        setTimeout(setStuLocation(1), 100);
    }

    function setStuLocation(index) {
        $(".location:eq(" + index + ")").val($(".province:eq(" + index + ")").val() + "," + $(".city:eq(" + index + ")").val());
    }


    function closedialog() {
        $.pdialog.close("modifyBase");
    }
</script>