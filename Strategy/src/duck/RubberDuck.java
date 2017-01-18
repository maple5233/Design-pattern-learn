package duck;

import impl.FlyNoWay;

/**
 * 橡胶鸭
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
class RubberDuck extends Duck {

    RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    void display() {
        System.out.println("我全身黄，嘴巴红");
    }

    @Override
    void quack() {
        System.out.println("嘎～嘎～嘎～");
    }
}
