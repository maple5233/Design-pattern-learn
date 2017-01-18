package duck;

import impl.FlyWithWin;

/**
 * 绿脖鸭
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
class MallardDuck extends Duck {

    /**
     * 构造函数
     */
    MallardDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    void display() {
        System.out.println("我的脖子是绿色的!");
    }
}
