/**
 * 测试代码
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
public class Test {
    public static void main(final String[] args) {
        System.out.println("制备开始。");
        System.out.println();
        RefreshBeverage coffeeMaker = new Coffee();
        coffeeMaker.prepareBeverageTemplate();
        System.out.println("-----------------------------");
        RefreshBeverage teaMaker = new Tea();
        teaMaker.prepareBeverageTemplate();
        System.out.println();
        System.out.println("制备结束。");
    }
}
