package code.test_proxy.jdkProxy;

import code.test_proxy.staticProxy.service.StudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LuSheng
 * @title: TransactionHandler
 * @projectName leetcode
 * @description: TODO
 * @date 2023/6/1917:54
 */
public class TransactionHandler implements InvocationHandler {

    //增强类
    private DaoTransaction daoTransaction;
    //代理类
    private StudentService object;

    public TransactionHandler(DaoTransaction daoTransaction, StudentService studentService){
        this.daoTransaction = daoTransaction;
        this.object = studentService;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //如果是save方法，增强
        if("save".equals(method.getName())){
            daoTransaction.before();
            Object invoke = method.invoke(object, args);
            daoTransaction.after();
            return invoke;
        }

        return method.invoke(object,args);

    }
}
