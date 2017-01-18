package impl;

import duck.FlyingStrategy;

/**
 * 用翅膀飞行
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
public class FlyWithWin implements FlyingStrategy {
    /**
     * 飞行接口
     */
    @Override
    public void performFly() {
        System.out.println("振翅高飞!");
    }
}
