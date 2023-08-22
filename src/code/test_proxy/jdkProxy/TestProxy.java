package code.test_proxy.jdkProxy;

import code.test_proxy.staticProxy.service.StudentService;
import code.test_proxy.staticProxy.service.impl.StudentServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author LuSheng
 * @title: TestProxy
 * @projectName leetcode
 * @description: TODO
 * @date 2023/6/1918:03
 */
public class TestProxy {

    public static void main(String[] args) {
//        System.out.println(1);
        //增强类
        DaoTransaction daoTransaction = new DaoTransaction();
        //代理类
        StudentService studentService = new StudentServiceImpl();
        //方法拦截处理器
        TransactionHandler transactionHandler =
                new TransactionHandler(daoTransaction,
                        studentService);

        //获取代理实例对象
        StudentService object = (StudentService) Proxy.newProxyInstance(StudentServiceImpl.class.getClassLoader(),
                StudentServiceImpl.class.getInterfaces(),
                transactionHandler);

        object.query("abc");
        object.save();
    }
}
