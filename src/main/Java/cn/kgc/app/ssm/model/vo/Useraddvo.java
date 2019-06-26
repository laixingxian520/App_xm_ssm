package cn.kgc.app.ssm.model.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
* 用户新增
 */
@Data
public class Useraddvo {
    @NotEmpty(message = "用户编码不能为空")
    private String userCode;   //用户编码
    @NotEmpty(message = "用户名称不能为空")
    private String userName;   //用户名称
    @NotEmpty(message = "用户密码不能为空")
    @Length(max = 12,min = 6,message = "密码长度是6-12")
    private String userPassword;       //用户密码
    @NotEmpty(message = "手机不能为空")
    @Length(max = 11,min = 7,message = "请输入正确的手机号")
    private String phone;   //手机
}
