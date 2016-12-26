<div class="pageContent">
    <form method="post" action="/contract/update" onsubmit='return validateCallback(this,
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
        <input type="text" size="25" value="${contract.empContractNo}" name="contract.empContractNo" hidden/>
        <div class="pageFormContent nowrap" layoutH="58" style="padding-left: 36px;">
            <div class="units">
                <label>企业名称</label>
                <input class="required" type="text" size="25" value="${contract.empCompanyName}"
                       name="contract.empCompanyName"/>
            </div>
            <div class="units">
                <label>信用代码</label>
                <input class="required alphaNumber" type="text" size="25" name="contract.empCompanyCode"
                       value="${contract.empCompanyCode}"/>
            </div>
            <div class="units">
                <label>法人代表</label>
                <input class="required" type="text" size="25" name="contract.empCompanyPresident"
                       value="${contract.empCompanyPresident}"/>
            </div>
            <div class="units">
                <label>企业类型</label>
                <select class="empCompanyType" name="contract.empCompanyType">
                    <#list compangTypeList as x>
                        <option value="${x.empCompanyTypeName}">${x.empCompanyTypeName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>企业联系人</label>
                <input class="required" type="text" size="25" name="contract.empCompanyContact"
                       value="${contract.empCompanyContact}"/>
            </div>
            <div class="units">
                <label>企业电话</label>
                <input class="required phone" type="text" size="25" name="contract.empCompanyContactTel"
                       value="${contract.empCompanyContactTel}"/>
            </div>
            <div class="units">
                <label>企业邮箱</label>
                <input class="required email" type="text" size="25" name="contract.empCompanyContactMail"
                       value="${contract.empCompanyContactMail}"/>
            </div>
            <div class="units">
                <label>就业岗位</label>
                <input class="required" type="text" size="25" name="contract.empCompanyJob"
                       value="${contract.empCompanyJob}"/>
            </div>
            <div class="units">
                <label>就业地址</label>
                <select class="province" onchange="getCity(0)">
                    <option>请选择</option>
                    <#list provinceList as x>
                        <option value="${x.province}">${x.province}</option>
                    </#list>
                </select>
                <select class="city required" onchange="setcontractLocation(0)" name="city1">
                    <option>请选择</option>
                </select>
                <input class="location" type="text" size="25" name="contract.empCompanyJobAddress" hidden/>
            </div>
            <div class="units">
                <label>签约时间</label>
                <input name="contract.empCompanyDate" type="text" class="required date" readonly="true"
                       placeholder="        请选择签约日期" value="${contract.empCompanyDate}"/>
                <a class="inputDateButton" href="javascript:;">选择</a>
            </div>
            <div class="units">
                <label>签约年限</label>
                <select class="years" name="contract.empCompanyYears">
                    <option value="1">一年</option>
                    <option value="2">二年</option>
                    <option value="3">三年</option>
                    <option value="5">五年</option>
                    <option value="0">其他</option>
                </select>
            </div>
            <div class="units">
                <label>学生姓名</label>
                <input class="required" type="text" size="25" name="contract.empContractStudentName"
                       value="${contract.empContractStudentName}"/>
            </div>
            <div class="units">
                <label>&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;&nbsp;</label>
                <#if contract.empContractStudentSex = "男">
                    <label class="radioButton" style="height: 21px;"><input name="contract.empContractStudentSex"
                                                                            type="radio" value="男"
                                                                            checked/>男</label>
                    <label class="radioButton" style="height: 21px;"><input name="contract.empContractStudentSex"
                                                                            type="radio"
                                                                            value="女"/>女</label>
                    <#elseif contract.empContractStudentSex = "女" >
                        <label class="radioButton" style="height: 21px;"><input name="contract.empContractStudentSex"
                                                                                type="radio" value="男"/>男</label>
                        <label class="radioButton" style="height: 21px;"><input name="contract.empContractStudentSex"
                                                                                type="radio" value="女"
                                                                                checked/>女</label>
                </#if>
            </div>
            <div class="units">
                <label>学生学号</label>
                <input class="required" type="text" size="25" name="contract.empContractStudentNo"
                       value="${contract.empContractStudentNo}"/>
            </div>
            <div class="units">
                <label>身份证号</label>
                <input class="required idNumber" type="text" size="25" name="contract.empContractStudentIdCode"
                       value="${contract.empContractStudentIdCode}"/>
            </div>
            <div class="units">
                <label>手机号码</label>
                <input class="required phone" type="text" size="25" name="contract.empContractStudentTel"
                       value="${contract.empContractStudentTel}"/>
            </div>
            <div class="units">
                <label>邮箱地址</label>
                <input class="required email" type="text" size="25" name="contract.empContractStudentMail"
                       value="${contract.empContractStudentMail}"/>
            </div>
            <div class="units">
                <label>所在年级</label>
                <select class="grade" name="contract.empContractStudentGrade">
                    <#list gradeList as x>
                        <option value="${x}">${x}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>所属学院</label>
                <select id="collegeBox2" class="collegeBox2" name="contract.empContractStudentCollege"
                        onchange="getProfessionList()">
                    <option value="">请选择学院</option>
                    <#list collegeList as x>
                        <option value="${x.empCollegeName}">${x.empCollegeName}</option>
                    </#list>
                </select>
            </div>
            <div class="units">
                <label>所在专业</label>
                <select id="professionBox2" class="professionBox2" name="contract.empContractStudentProfession">
                    <option value="">请选择专业</option>
                </select>
            </div>
            <div class="units">
                <label>所属行业</label>
                <select class="industry" name="contract.empContractStudentIndustry">
                    <#list industryList as x>
                        <option value="${x.empIndustryName}">${x.empIndustryName}</option>
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
    function getProfessionList() {
        var college = $("#collegeBox2").val();
        alert(college);
        $.ajax({
            type: "POST",
            url: "/student/professionJson",
            data: {"college": college},
            dataType: "json",
            success: function (data) {
                var dataList = data.professionList;
                $(".professionBox2 option:gt(0)").remove();
                $(dataList).each(function (i, val) {
                    $(".professionBox2").append('<option value="' + val.empProfessionName + '">' + val.empProfessionName + '</option>');
                });

                console.info(data);
            },
            error: function (textStatus) {
                alert("error");
                console.info(msg);
            }
        });
    }

    $(document).ready(function () {
        $('.empCompanyType').val("${contract.empCompanyType}");
        $('.province').val("${province}");
        getCity(0);
        $('.years').val("${contract.empCompanyYears}");
        $('.grade').val("${contract.empContractStudentGrade}");
        $('.collegeBox2').val("${contract.empContractStudentCollege}");
        getProfessionList();
        $('.industry').val("${contract.empContractStudentIndustry}");
        setTimeout(setData, 200);//设置延迟，必须等select的选项加载完后才能设置值
    });
    function setData() {
        $('.city').val("${city}");
        $('.professionBox2').val("${contract.empContractStudentProfession}");

        setTimeout(setcontractLocation(0), 200);
    }

    function setcontractLocation(index) {
        $(".location:eq(" + index + ")").val($(".province:eq(" + index + ")").val() + "," + $(".city:eq(" + index + ")").val());
    }

    function closedialog() {
        $.pdialog.close("modifyContract");
    }
</script>