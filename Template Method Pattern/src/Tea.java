/**
 * 制作茶
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
class Tea extends RefreshBeverage {
    /**
     * 加调味料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    /**
     * 泡制饮料
     */
    @Override
    protected void brew() {
        System.out.println("用80℃的热水浸泡5分钟");
    }

    /**
     * 子类挂载了钩子函数
     *
     * @return 是否加入调料
     */
    @Override
    protected boolean isCustomerWantsCondiments() {
        return false;
    }
}
