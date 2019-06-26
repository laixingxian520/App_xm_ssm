package cn.kgc.app.ssm.common;

import lombok.Data;

/**
 * 公共返回的类
 */
@Data
public class ServerResponse<T> {
    /**
     * 状态码
     */
    private  Integer code;
    /**
     * 状态信息
     */
    private  String msg;
    /**
     * 返回的数据
     */
    private  T data;

    public ServerResponse(Integer code, String  msg){
        this.code=code;
        this.msg=msg;
    }
    public ServerResponse(Integer code){
        this.code=code;
    }

    public ServerResponse(Integer code, T data) {
        this.code = code;
        this.data = data;
    }
}
