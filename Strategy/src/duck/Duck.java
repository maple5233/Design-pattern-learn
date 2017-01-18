package duck;

/**
 * 鸭子应用的基类
 * 抽象了鸭子的行为：显示、鸣叫等
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
abstract class Duck {

    private FlyingStrategy flyingStrategy;

    /**
     * 叫声
     * 通用行为，由基类实现
     */
    void quack() {
        System.out.println("嘎嘎嘎!");
    }

    /**
     * setter方法
     *
     * @param flyingStrategy 飞行策略
     */
    void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    /**
     * 飞行接口
     */
    void fly() {
        flyingStrategy.performFly();
    }

    abstract void display();
}
