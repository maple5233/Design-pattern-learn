package duck;

import impl.FlyNoWay;

/**
 * 大黄鸭
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
class BigYellowDuck extends Duck {

    BigYellowDuck(){
        super();
        /**
         * 策略模式 好重用 不复写会运行报错
         */
        super.setFlyingStrategy(new FlyNoWay());
    }

    /**
     * 不使用策略模式 纯虚函数 强制复写（编译检查） 不好重用
     */
    @Override
    void display() {
        System.out.println("我身体大，全身黄");
    }

    /**
     * 不使用策略模式 虚函数 容易忘记复写 不好重用
     */
    @Override
    void quack() {
        System.out.println("我不会叫");
    }
}
