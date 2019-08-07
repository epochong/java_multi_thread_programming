package unit.one.mythread_1_4;

/**
 * @author epochong
 * @date 2019/8/5 13:52
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 测试类
 */
public class Main {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
       // countOperate.start();
        countOperate.setName("B");
        Thread thread = new Thread(countOperate);
        //thread.setName("A");
        thread.start();

    }
}
