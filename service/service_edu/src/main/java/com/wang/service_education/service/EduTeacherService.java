package com.wang.service_education.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.service_education.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.service_education.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author Amos
 * @since 2022-04-21
 */
public interface EduTeacherService extends IService<EduTeacher> {
    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
