package cn.kgc.app.ssm.common;

public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS(0,"成功"),

    /**
     * 失败
     */
    ERROR(1,"失败")

    ;

    /**
     * 状态码
     */
    private int code;
    /**
     * 状态码的描述
     */
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
