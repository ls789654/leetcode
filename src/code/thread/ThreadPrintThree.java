package code.thread;

/**
 * @author LuSheng
 * @title: ThreadPrint
 * @projectName leetcode
 * @description: TODO
 * @date 2023/5/1018:25
 */
public class ThreadPrintThree implements Runnable{

    private static Integer count = 0;

    public Integer flag = 0;


    public ThreadPrintThree(Integer flag){
        this.flag = flag;
    }


    @Override
    public void run() {
        while(true){
            synchronized (ThreadPrintThree.class){
                ThreadPrintThree.class.notify();
                if(count <= 100 && count%3 == flag){
                    System.out.println(Thread.currentThread().getName() + "      " + count);
                    ++count;
                    try {
                        ThreadPrintThree.class.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else if(count > 100){
                    break;
                }else{
                    try {
                        ThreadPrintThree.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Runnable thread1 = new ThreadPrintThree(0);
        Runnable thread2 = new ThreadPrintThree(1);

        Runnable thread3 = new ThreadPrintThree(2);

        Thread t = new Thread(thread1,"thread1");
        Thread t1 = new Thread(thread2,"thread2");
        Thread t2 = new Thread(thread3,"thread3");


        t.start();
        t1.start();
        t2.start();

    }
}
