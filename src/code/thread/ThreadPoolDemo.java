package code.thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author LuSheng
 * @title: ThreadPoolDemo
 * @projectName leetcode
 * @description: TODO
 * @date 2023/8/109:21
 */
public class ThreadPoolDemo {

    /*
    * @author LuSheng
    * @Description  自定义线程池
    * @Date 9:21 2023/8/10
    * @Param
    * @return
    **/
    private static ThreadPoolExecutor buildThreadPoolExecutor(){
        return new ThreadPoolExecutor(2,
                20,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(10),
                new MyNamedThreadFactory("测试线程池"));
    }

    private static void dynamicModifyExecutor() throws InterruptedException{
        ThreadPoolExecutor threadPoolExecutor = buildThreadPoolExecutor();
        for(int i = 0 ; i < 30 ; i++){
            threadPoolExecutor.submit(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread().getName());
                        }
                    }
            );
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolDemo.dynamicModifyExecutor();
    }


}
