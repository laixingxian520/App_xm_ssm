package cn.kgc.app.ssm.model.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Data
@Alias("user")
public class User implements Serializable {
    private    int      id;       //  主键ID
    private   String     userCode;   //用户编码
    private    String      userName;   //用户名称
    private    String     userPassword;       //用户密码
    private    Integer     gender;    //性别（1:女、 2:男）
    private    Date     birthday; //出生日期
    private     String    phone;   //手机
    private     String    address;   //地址
    private     Integer    userRole;    //用户角色（取自角色表-角色id）
    private   long   createdBy;       //创建者（userId）
    private    Date     creationDate;   //创建时间
    private     long   modifyBy;   //更新者（userId）
    private    Date    modifyDate;     //更新时间

    /**
     * 用户的角色名称
     */
    private String  roleName;



}
