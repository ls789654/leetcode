package code.singleton;

/**
 * @author LuSheng
 * @title: Singleton
 * @projectName leetcode
 * @description: 单例模式（懒汉模式）
 * @date 2023/5/10/18:13
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton ==null){
            synchronized (LazySingleton.class){
                if(lazySingleton ==null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}




