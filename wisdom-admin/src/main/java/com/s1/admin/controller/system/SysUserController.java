package com.s1.admin.controller.system;

import com.s1.system.entity.SysUserEntity;
import com.s1.system.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@Api(value = "测试", tags = "测试")
@RestController
@RequestMapping("/system/user")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;


    @ApiOperation(value = "查询列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "参数长度在0到100之间", name = "title", dataType = "string", paramType = "query"),
            @ApiImplicitParam(value = "发布时间：格式为yyyy-MM", name = "releaseTime", dataType = "string", paramType = "query"),
            @ApiImplicitParam(value = "排序属性", defaultValue = "created_time", name = "sort", dataType = "string", paramType = "query", required = false),
            @ApiImplicitParam(value = "排序方式", name = "orders", dataType = "string", paramType = "query", required = false)
    })
    @GetMapping(value = "/test")
    public List<SysUserEntity> selectList(){
        return sysUserService.selectList();
    }

}
