package code.singleton;

/**
 * @author LuSheng
 * @title: HungrySingleton
 * @projectName leetcode
 * @description: TODO
 * @date 2023/7/3116:26
 */
public class HungrySingleton {

    private volatile static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    private HungrySingleton getInstance(){
        return instance;
    }
}
