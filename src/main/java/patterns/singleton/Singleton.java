package patterns.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liumeng on 2016/4/12.
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (singleton == null) {
                singleton = new Singleton();
            }


        }
        return singleton;

    }


    public static void main(String[] args) {
        final Set<Singleton> singletons = new HashSet<Singleton>();
        for (int i = 0; i < 100000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    singletons.add(Singleton.getInstance());
                }
            }).start();
        }

        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(singletons);
    }

}
