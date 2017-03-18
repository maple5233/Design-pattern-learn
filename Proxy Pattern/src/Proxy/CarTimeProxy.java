package Proxy;

/**
 * 聚合的方式实现代理(推荐)
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class CarTimeProxy implements Movable {
    private Movable m;

    /**
     * 构造方法
     *
     * @param m 聚合的车
     */
    CarTimeProxy(Movable m) {
        super();
        this.m = m;
    }

    /**
     * 行驶的方法
     */
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("花去了" + (endTime - startTime) + "ms");
    }
}
