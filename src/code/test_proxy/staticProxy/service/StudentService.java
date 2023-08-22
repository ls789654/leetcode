package code.test_proxy.staticProxy.service;

import code.test_proxy.staticProxy.domain.Student;

/**
 * @author LuSheng
 */
public interface StudentService {
    /**
    * @author LuSheng
    * @Description 添加学生
    * @Date 17:32 2023/6/19
    * @Param []
    * @return void
    **/
    void save();


    /***
    * @author LuSheng
    * @Description 查询xues
    * @Date 17:35 2023/6/19
    * @Param [name]
    * @return void
    **/
    Student query(String name);



}
