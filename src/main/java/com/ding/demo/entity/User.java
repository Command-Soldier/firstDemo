package com.ding.demo.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author DingShiWei
 * @since 2018-10-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 用户身份
     */
    private String role;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 注册时间
     */
    @TableField("regTime")
    private LocalDateTime regTime;

    /**
     * 注册IP
     */
    @TableField("regIp")
    private String regIp;


}
