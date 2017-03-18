package Proxy;

/**
 * 代理日志功能
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class CarLogProxy implements Movable {

    private Movable m;

    /**
     * 构造方法
     *
     * @param m 聚合的车
     */
    CarLogProxy(Movable m) {
        super();
        this.m = m;
    }

    /**
     * 行驶的方法
     */
    @Override
    public void move() {
        System.out.println("日志开始");
        m.move();
        System.out.println("日志结束");
    }
}
