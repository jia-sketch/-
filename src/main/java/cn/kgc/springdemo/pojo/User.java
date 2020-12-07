package cn.kgc.springdemo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: 贾浩然
 * 类名:SS
 * 创建时间: 2020/10/21 9:54
 */

@Data
@Table(name="smbms_user")
public class User {
    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    @Column(name = "userCode")
    private String userCode;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userPassword")
    private String userPassword;
}
