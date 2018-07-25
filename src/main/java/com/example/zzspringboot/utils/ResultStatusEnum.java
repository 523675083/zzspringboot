package com.example.zzspringboot.utils;

public enum ResultStatusEnum {
    //20000 状态的为返回成功值,尽量定1个值
    SUCCESS(20000, "操作成功"),
    SUCCESS_URL(20100, "操作成功,返回URL"),

    //30000~40000 状态为各种已经存在的状态
    INFO_IS_EXIST(30000, "信息已存在"),
    USER_IS_EXIST(30100, "用户已经存在"),
    APPSEQ_IS_EXIST(30101, "重复请求"),
    ETICKET_CODE_IS_EXIST(30102, "电子票码重复"),
    GROUP_NO_IS_EXIST(30103, "团号已存在，不可重复记录"),

    //40000~50000 状态的为各种查询失败的状态
    NO_DATA(40000, "数据不存在"),
    USER_NO_EXIST(40100, "用户不存在"),
    USER_ADD_ROLE_ERROR(40101, "用户配置角色失败"),
    USER_UPDATE_ERROR(40102, "用户修改失败"),
    USER_ADD_USERINFO_ERROR(40103, "用户员工修改失败"),
    USER_NO_ORG(40104, "用户查询组织异常"),
    USER_NO_ACCOUNT(40105, "组织没有现金账户用户"),
    REQUEST_DATA_NULL(40106, "参数为空"),
    PRODUCT_NO_EXIST(40900, "产品不存在"),
    PRODUCT_INCOMPLETE(40901, "产品信息不完整"),
    BANK_DISTRICT_NULL(40107, "开户行信息不存在"),
    CMBC_OPEN_NULL(40108, "民生银行开户返回信息不存在"),
    CMBC_OPEN_ERROR(40109, "民生银行开户失败"),
    CMBC_CANCEL_NULL(40110, "民生银行销户返回信息不存在"),
    CMBC_CANCEL_ERROR(40111, "民生银行销户失败"),
    ACCOUNT_CANCEL_ERROR(40112, "平台民生银行销户失败"),
    CMBC_BINDINGBANK_ERROR(40113, "民生银行绑卡失败"),
    CMBC_UNBINDINGBANK_ERROR(40114, "民生银行解除绑卡失败"),
    CMBC_ERROR(40115, "民生银行调用接口失败"),
    CMBC_WITHDRAW_ERROR(40116, "民生银行提现失败"),
    CMBC_RECHARGE_ERROR(40117, "民生银行充值失败"),
    CMBC_WAIT_PROCESS(40118, "民生银行提现处理中"),
    ACCOUNT_OPEN_ERROR(40119, "平台民生银行开户失败"),
    USER_GROUP_STOP(40120, "此用户所在组织已被停用"),
    USER_STOP(40121, "此用户已停用"),
    USER_NO_SINGLETON(40122, "多个账号使用该手机号"),

    //50000~60000 状态的为各种更新操作失败状态
    ERROR(50000, "异常"),
    NO_LOGIN(50001, "请先登录"),
    USER_UPDATE_FAIL(50100, "用户信息更新失败"),
    USER_ORG_DEL_FAIL(50101, "该部门下已有员工，请将员工转移部门后进行删除操作"),
    CMBC_INSERTLOG_ERROR(50102, "存储调用民生接口日志失败"),
    CMBC_UPDATELOG_ERROR(50103, "更新调用民生接口日志失败"),
    USER_NAME_PWD_ERROR(50104, "用户名或密码错误"),
    ORG_INVOICE_LIMIT_ERROR(50105, "分公司发票已超出使用数量或金额"),
    NO_ORG_SALES_DEPARTMENT(50106, "非营业部账号"),

    //50200~50300 参数非法导致操作失败状态
    USERNO_IS_NULL(50200, "用户号为空"),
    FUNDCHNO_IS_NULL(50201, "资金渠道编码为空"),
    AMT_IS_NULL(50202, "金额为空"),
    AMTTYPE_IS_NULL(50203, "发生金额类型为空"),
    FEE_IS_NULL(50204, "手续费为空"),
    APPSEQNO_IS_NULL(50205, "关联流水号为空"),
    USERTYPE_IS_NULL(50206, "用户类型为空"),
    ACCTYPE_IS_NULL(50207, "账户类型为空"),
    ACCNAME_IS_NULL(50208, "账户名称为空"),
    BUSICODE_IS_NULL(50209, "业务类型为空"),
    CHNTYPE_IS_NULL(50210, "资金渠道类型为空"),
    BUYER_IS_NULL(50211, "买家信息为空"),
    SELLER_IS_NULL(50212, "卖家信息为空"),
    DETAIL_IS_NULL(50213, "金额明细为空"),
    SYSID_IS_NULL(50214, "系统标示为空"),
    ACCNO_IS_NULL(50215, "账户号为空"),
    TRADENO_IS_NULL(50216, "交易号为空"),
    RELATENO_IS_NULL(50217, "关联单号为空"),
    PARAMETER_IS_NOT_NUMERIC(50218, "参数不是数字"),
    REQUEST_PARAMETER_IS_EMPTY(50219, "请求参数为空"),
    REQUEST_PARAMETER_NO_EXIST(50220, "参数异常"),

    //50300~50400 账户业务失败状态
    BAL_NOT_ENOUGH(50301, "帐户余额不足"),
    AMT_TOO_SMALL(50302, "交易金额不能少于1分钱"),
    ACCOUNT_STATE_ILLEGAL(50303, "账户状态非法"),
    USERTYPE_NO_EXIST(50304, "用户类型不存在"),
    AMT_IS_ILLEGAL(50305, "金额非法"),
    FRZAMT_NOT_ENOUGH(50306, "解冻余额不足"),
    FORBID_RECHARGE(50307, "帐户状态异常,不能充值"),
    FORBID_WITHDRAW(50308, "帐户状态异常,不能提现"),
    FORBID_PAY(50309, "帐户状态异常,不能支付"),
    FORBID_REFUND(50310, "帐户状态异常,不能退款"),
    ACCOUT_ERROR(50311, "帐户信息异常"),
    REFUND_ACCOUT_ISNULL(50312, "没有需要退款的帐户"),
    REFUND_AMT_ERROR(50313, "退款金额不能大于支付时金额"),
    REFUND_STATUS_ERROR(50314, "退款状态异常"),
    WITHDRAW_STATUS_ERROR(50315, "提现状态异常"),
    USER_ROLE_ERROR(50316, "当前用户角色错误"),
    DATE_ERROR(50317, "日期错误"),
    WITHDRAW_FREEZE_FAIL(50318, "提现冻结失败"),
    REFUND_AMT_ILLEGAL(50319, "退款金额非法"),
    REFUND_AMT_ISNULL(50320, "退款金额为空"),
    REFUND_NO_ISNULL(50321, "退款编号为空"),
    PAY_NO_ISNULL(50322, "支付信息为空"),
    REFUND_BATCH_NO_ISNULL(50323, "退款批次信息为空"),
    REFUND_WAY_UNKNOW(50324, "未知的退款方式"),
    WITHDRAW_APPROVAL_FAIL(50325, "提现审批失败"),
    WITHDRAW_APPROVAL_SUCCESS(50326, "提现审批已完成"),
    ACCOUNT_IS_LOCK(50327, "手续费账户余额不足，pos账户不可提现"),
    BAL_NOT_ENOUGH_NEW(50328, "帐户可使用余额不足,民生子账户暂不可用"),

    //50400~50500 用户认证授权失败状态
    UNDEFINED_AUTHTHIRD(50401, "未知的认证方法"),
    UNDEFINED_WITHDRAW(50402, "未知的提现方法"),
    AUTH_CODE_ERROR(50403, "动态验证码错误"),
    ALIPAY_ACCOUNTNO_ERROR(50404, "支付宝账号错误"),
    ERP_SIGNATURE_ERROR(50405, "ERP签名错误"),
    ERP_API_KEY_NODATA(50406, "api_key为空"),

    //10100~10200 发票返回状态码
    INVOICE_ERROR_PEOPLENUM(10100, "开票数量不能大于出游人数"),
    INVOICE_ERROR_OPENMONEY(10101, "开票总金额不能大于发票金额"),

    SELECT_ID_IS_NULL(60100, "查询ID为空"),
    REQUEST_DATA_FAULT(60101, "数据请求错误"),
    INSERT_DATA_FAULT(60102, "增加数据失败"),
    PASSWORD_IS_NULL(60103, "密码为空"),
    UPDATE_ERROR(60104, "修改失败"),
    PAY_PASSWORD_FAULT(60105, "支付密码错误"),
    PAY_PASSWORD_ISNULL(60106, "支付密码为空"),
    DELETE_DATA_FAULT(60107, "删除数据失败"),
    OLR_PASSWORD_IS_ERROR(60108, "旧密码错误"),

    COMMON_PASSENGER_MAX_BUCKET(70000, "当前常用旅客人数超过30人，无法添加！"),
    COMMON_PASSENGER_EXIST(70001, "已存在该证件号码的常旅客"),
    FLIGHT_ORDER_REFUND_EXIST(70002, "订单申请过退款需处理完，才可以继续申请"),

    TRAVELNUMBERHASALREADYEXISTED(8000, "行程编号已经存在，不可重复提交"),
    OPERATIONPRODUCTFAILURE(8001, "产品新增失败"),

    AUTHENTICATION_FAILURE(9000, "身份验证失败"),
    AN_INVALID_REQUEST(9001, "已经失效的请求");
    private int status;//返回状态值
    private String message;//返回信息


    private ResultStatusEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public static ResultStatusEnum resultMessage(int key) {
        switch (key) {
            case 20000:
                return SUCCESS;
            case 30000:
                return INFO_IS_EXIST;
            case 30100:
                return USER_IS_EXIST;
            case 40000:
                return NO_DATA;
            case 40100:
                return USER_NO_EXIST;
            case 40900:
                return PRODUCT_NO_EXIST;
            case 50000:
                return ERROR;
            case 50100:
                return USER_UPDATE_FAIL;
            default:
                return null;
        }
    }

    public static String getResultMessage(int key) {

        ResultStatusEnum[] values = ResultStatusEnum.values();
        for (ResultStatusEnum resultStatusEnum : values) {
            if (resultStatusEnum.getStatus() == key) {
                return resultStatusEnum.getMessage();
            }
        }
        return "";
    }

    public static ResultStatusEnum getResultStatusEnum(int key) {

        ResultStatusEnum[] values = ResultStatusEnum.values();
        for (ResultStatusEnum resultStatusEnum : values) {
            if (resultStatusEnum.getStatus() == key) {
                return resultStatusEnum;
            }
        }
        return null;
    }
}