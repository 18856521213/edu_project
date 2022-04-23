package com.wang.service_education.controller;


import com.wang.commonutils.ResultMethods;
import com.wang.service_education.entity.EduTeacher;
import com.wang.service_education.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author Amos
 * @since 2022-04-21
 */
@Api(description="讲师管理")
@RestController
@RequestMapping("/service_education/edu-teacher")
@CrossOrigin
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @ApiOperation(value="查询所有讲师")
    @GetMapping("/getTeacher")
    public ResultMethods aa() {
        List<EduTeacher> data =  eduTeacherService.list(null);
        return ResultMethods.ok().data("items",data);
    }


}

