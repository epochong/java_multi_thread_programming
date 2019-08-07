package unit.one.mythread_1_4;

/**
 * @author epochong
 * @date 2019/8/5 13:50
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 自定义线程类
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("构造-Thread.currentThread().getName() = " + Thread.currentThread().getName() + ":" +Thread.currentThread().isAlive());
        System.out.println("构造-this.isAlive() = " +this.getName()+ ":" + this.isAlive());
    }
    @Override
    public void run() {
        System.out.println("run-Thread.currentThread().getName() = " + Thread.currentThread().getName()+ ":" + Thread.currentThread().isAlive());
        System.out.println("run-this.getName() = " + this.getName() + ":" + this.isAlive());

    }
}
