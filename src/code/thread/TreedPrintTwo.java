package code.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LuSheng
 * @title: TreedPrintTwo
 * @projectName leetcode
 * @description: TODO
 * @date 2023/8/108:36
 */
public class TreedPrintTwo implements Runnable{
    private int num = 0;
    private ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    @Override
    public void run() {
        while(num < 100){
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "====>" + num);
                num++;
                condition.signal();
                if(num < 100) {
                    condition.await();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new TreedPrintTwo();
        Thread t1 = new Thread(runnable,"thread-1");
        Thread t2 = new Thread(runnable,"thread-2");
        t1.start();
        t2.start();

    }
}
