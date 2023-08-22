package code.test_proxy.staticProxy;

import code.test_proxy.staticProxy.domain.Student;
import code.test_proxy.staticProxy.service.StudentService;
import code.test_proxy.staticProxy.service.impl.StudentServiceImpl;

/**
 * @author LuSheng
 * @title: StaticProxy
 * @projectName leetcode
 * @description: TODO
 * @date 2023/6/1917:38
 */
public class StaticProxy implements StudentService {

    //目标类对象
    private StudentServiceImpl studentService;


    public StaticProxy(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @Override
    public void save() {
        System.out.println("增强");
        studentService.save();
    }

    @Override
    public Student query(String name) {
        System.out.println("增强");
        return studentService.query(name);
    }
}

//不利于代码拓展，比如接口中新添加一一个抽象方法时，所有实现类都需要重新实现，否则报错
//代理对象需要创建很多,这种设计很不方便和麻烦(增强方法)

