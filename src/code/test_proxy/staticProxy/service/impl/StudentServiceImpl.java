package code.test_proxy.staticProxy.service.impl;

import code.test_proxy.staticProxy.domain.Student;
import code.test_proxy.staticProxy.service.StudentService;

/**
 * @author LuSheng
 * @title: StudentServiceImpl
 * @projectName leetcode
 * @description: TODO
 * @date 2023/6/1917:35
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void save() {
        System.out.println("保存学生信息");
    }

    @Override
    public Student query(String name) {
        Student student = new Student();
        student.setName(name);
        System.out.println(student.getName());
        return student;
    }
}
