/**
 * 制作咖啡
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
class Coffee extends RefreshBeverage {
    /**
     * 加调味料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    /**
     * 泡制饮料
     */
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡10分钟");
    }
}
