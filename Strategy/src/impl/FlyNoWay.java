package impl;

import duck.FlyingStrategy;

/**
 * 并不会飞
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
public class FlyNoWay implements FlyingStrategy {
    /**
     * 飞行接口
     */
    @Override
    public void performFly() {
        System.out.println("我不会飞QAQ");
    }
}
