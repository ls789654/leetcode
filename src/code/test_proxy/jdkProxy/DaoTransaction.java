package code.test_proxy.jdkProxy;

/**
 * @author LuSheng
 * @title: DaoTransaction
 * @projectName leetcode
 * @description: TODO
 * @date 2023/6/1917:57
 */
public class DaoTransaction {

    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }

}
