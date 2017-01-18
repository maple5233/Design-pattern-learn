package impl;

import duck.FlyingStrategy;

/**
 * 用火箭飞行
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
public class FlyWithRocket implements FlyingStrategy {
    /**
     * 飞行接口
     */
    @Override
    public void performFly() {
        System.out.println("用火箭在太空飞行!");
    }
}
