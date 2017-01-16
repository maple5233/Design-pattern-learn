/**
 * 提神饮料 模板方法模式的基类 提供算法框架
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
abstract class RefreshBeverage {


    /**
     * 制作提神饮料的模板方法
     * 封装了算法框架 不允许复写
     */
    final void prepareBeverageTemplate() {
        // 将水煮沸
        boilWater();
        // 泡制饮料
        brew();
        // 倒入杯中
        pourInCup();
        if (isCustomerWantsCondiments()) {
            // 加调味料
            addCondiments();
        }
    }

    /**
     * 询问是否加入调料的函数
     * Hook，钩子函数，提供一个默认或者空的实现
     * 具体的子类来决定是否挂钩和如何挂钩
     *
     * @return 是否加入调料
     */
    protected boolean isCustomerWantsCondiments() {
        return true;
    }

    /**
     * 加调味料
     */
    protected abstract void addCondiments();

    /**
     * 倒入杯中
     */
    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    /**
     * 泡制饮料
     */
    protected abstract void brew();

    /**
     * 将水煮沸
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }
}
