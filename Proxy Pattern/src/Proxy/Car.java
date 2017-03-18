package Proxy;

import java.util.Random;

/**
 * 车
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class Car implements Movable {

    /**
     * 行驶的方法
     */
    @Override
    public void move() {
        System.out.println("我开始开车");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我结束开车");
    }
}
