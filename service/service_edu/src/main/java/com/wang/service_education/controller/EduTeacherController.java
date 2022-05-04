package com.wang.service_education.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.commonutils.ResultMethods;
import com.wang.commonutils.UploadUtils;
import com.wang.service_education.entity.EduTeacher;
import com.wang.service_education.query.TeacherQuery;
import com.wang.service_education.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
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
//@RequestMapping("/service_education/edu-teacher")
@CrossOrigin
public class EduTeacherController {

    @Resource
    private UploadUtils uploadUtils;

    @Resource
    private EduTeacherService eduTeacherService;

    @ApiOperation(value="查询所有讲师")
    @GetMapping("/getTeacher")
    public ResultMethods getTeacher() {
        List<EduTeacher> data =  eduTeacherService.list(null);
        return ResultMethods.ok().data("items",data);
    }

    @ApiOperation(value="带分页的查询讲师")
    @GetMapping("/getSomeTeacher/{page}/{limit}")
    public ResultMethods getSomeTeacher(
        @ApiParam(name = "page", value = "当前页码", required = true)
        @PathVariable Long page,
        @ApiParam(name = "limit", value = "每页记录数", required = true)
        @PathVariable Long limit
    ) {
        Page<EduTeacher> pageParam = new Page<>(page, limit);
        eduTeacherService.page(pageParam, null);
        List<EduTeacher> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return  ResultMethods.ok().data("total", total).data("rows", records);
    }

    @ApiOperation(value = "分页查询讲师列表")
    @GetMapping("/getSomeTeacher2/{page}/{limit}")
    public ResultMethods pageQuery(
        @ApiParam(name = "page", value = "当前页码", required = true)
        @PathVariable Long page,
        @ApiParam(name = "limit", value = "每页记录数", required = true)
        @PathVariable Long limit,
        @ApiParam(name = "teacherQuery", value = "查询对象", required = false)
        TeacherQuery teacherQuery){
        Page<EduTeacher> pageParam = new Page<>(page, limit);
        eduTeacherService.pageQuery(pageParam, teacherQuery);
        List<EduTeacher> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return  ResultMethods.ok().data("total", total).data("rows", records);
    }

    @PostMapping("/getImg")
    public ResultMethods getImage(MultipartFile multipartFile) {
        String data = uploadUtils.upload(multipartFile);
        return ResultMethods.ok().data("data", data);
    }


}

