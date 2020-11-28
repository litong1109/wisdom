package com.s1.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@ApiModel(value = "用户模型")
@Component
@Data
public class SysUserEntity {

    private Long userId;

    private Long deptId;

    private String loginName;

    @ApiModelProperty(value="用户名称" ,required=true,example = "Leon")
    private String userName;

    private String userType;

    private String email;

    private String phonenumber;

    private String sex;

    private String avatar;

    private String password;

    private String salt;

    private String status;

    private String delFlag;

    private String loginIp;

    private Date loginDate;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

}
