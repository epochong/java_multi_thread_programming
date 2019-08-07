package unit.one.mythread_1_2_2;

/**
 * @author epochong
 * @date 2019/8/4 22:21
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
