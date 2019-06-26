package cn.kgc.app.ssm.dao;

import cn.kgc.app.ssm.model.pojo.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 查询是否有userCOde
     *
     * @param userCode 给我的usercode
     * @return 返回结果
     */
    int checkUserCode(String userCode);

    /**
     * 查询用户输入进来的对象是否正确
     * @param userCode
     * @param
     * @return
     */
    User queryUserByUserCodeAndPassword(@Param("userCode") String userCode, @Param("userpassword") String userpassword);



    /**
     * 删除
     * @param id
     * @return
     */
    int del(int id);

    /**
     * 修改密码
     * @param userPassword
     * @param id
     * @return
     */
    int xgmm(@Param("userPassword") String userPassword, @Param("id") int id);
}
