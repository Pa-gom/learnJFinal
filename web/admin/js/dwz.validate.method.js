/**
 * @requires jquery.validate.js
 * @author 张慧华 z@j-ui.com
 */
(function ($) {
    if ($.validator) {
        $.validator.addMethod("alphanumeric", function (value, element) {
            return this.optional(element) || /^\w+$/i.test(value);
        }, "只允许输入数字、字母、下划线");

        $.validator.addMethod("lettersonly", function (value, element) {
            return this.optional(element) || /^[a-z]+$/i.test(value);
        }, "只允许输入字母");

        $.validator.addMethod("phone", function (value, element) {
            return this.optional(element) || /^[0-9 \(\)]{7,30}$/.test(value);
        }, "手机号格式错误");

        $.validator.addMethod("postcode", function (value, element) {
            return this.optional(element) || /^[0-9 A-Za-z]{5,20}$/.test(value);
        }, "邮政编码格式错误");
        $.validator.addMethod("idNumber", function (value, element) {
            var idcheck = /^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|(8[12])|91)\d{4}((19\d{2}(0[13-9]|1[012])(0[1-9]|[12]\d|30))|(19\d{2}(0[13578]|1[02])31)|(19\d{2}02(0[1-9]|1\d|2[0-8]))|(19([13579][26]|[2468][048]|0[48])0229))\d{3}(\d|X|x)?$/;
            return this.optional(element) || idcheck.test(value);
        }, "身份证号码格式错误"),
            $.validator.addMethod("alphaNumber", function (value, element) {
                return this.optional(element) || /^[0-9a-zA-Z]*$/g.test(value);
            }, "只允许输入字母和数字"),
        $.validator.addMethod("date", function (value, element) {
            value = value.replace(/\s+/g, "");
            if (String.prototype.parseDate) {
                var $input = $(element);
                var pattern = $input.attr('dateFmt') || 'yyyy-MM-dd';

                return !$input.val() || $input.val().parseDate(pattern);
            } else {
                return this.optional(element) || value.match(/^\d{4}[\/-]\d{1,2}[\/-]\d{1,2}$/);
            }
        }, "Please enter a valid date.");

        /*自定义js函数验证
         * <input type="text" name="xxx" customvalid="xxxFn(element)" title="xxx" />
         */
        $.validator.addMethod("customvalid", function (value, element, params) {
            try {
                return eval('(' + params + ')');
            } catch (e) {
                return false;
            }
        }, "Please fix this field.");

        $.validator.addClassRules({
            date: {date: true},
            alphanumeric: {alphanumeric: true},
            lettersonly: {lettersonly: true},
            phone: {phone: true},
            postcode: {postcode: true},
            idNumber: {idNumber: true},
            alphaNumber: {alphaNumber: true}
        });
        $.validator.setDefaults({errorElement: "span"});
        $.validator.autoCreateRanges = true;

    }

})(jQuery);