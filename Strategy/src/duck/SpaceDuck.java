package duck;

import impl.FlyWithRocket;

/**
 * 太空鸭
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
class SpaceDuck extends Duck {

    SpaceDuck() {
        super();
        super.setFlyingStrategy(new FlyWithRocket());
    }

    @Override
    void display() {
        System.out.println("我戴头盔");
    }

    @Override
    void quack() {
        System.out.println("我通过无线电与你通信");
    }
}
