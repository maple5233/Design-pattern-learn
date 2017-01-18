package duck;

import impl.FlyWithWin;

/**
 * 红头鸭
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
class RedHeadDuck extends Duck {

    /**
     * 构造函数
     */
    RedHeadDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    void display() {
        System.out.println("我的头是红色的!");
    }
}
