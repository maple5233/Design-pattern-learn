package Proxy;

/**
 * 使用继承的方式来代理
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class CarTimeProxyWithExtend extends Car {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("花去了" + (endTime - startTime) + "ms");
        System.out.println("-------------------------");
    }
}
