package com.zd.demo.entity;// UserDO.java



import javax.persistence.*;
import java.util.Date;

/**
 * @Description: 用户
 * @author: zj
 * @date: 2020/5/12 21:33
 */
@Entity
@Table(name = "users")
public class UserDO {

    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,  // strategy 设置使用数据库主键自增策略；
            generator = "JDBC") // generator 设置插入完成后，查询最后生成的 ID 填充到该属性中。
    private Integer id;
    /**
     * 账号
     */
    @Column(nullable = false)
    private String username;
    /**
     * 密码（明文）
     * <p>
     * ps：生产环境下，千万不要明文噢
     */
    @Column(nullable = false)
    private String password;
    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}