package duck;

/**
 * 测试程序
 * Created by hongjiyao_2014150120 on 17-1-18.
 */
public class DuckTest {
    public static void main(final String[] args) {
        System.out.println("测试鸭子程序:");
        System.out.println("---------------------------------");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();

        System.out.println("---------------------------------");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("---------------------------------");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();

        System.out.println("---------------------------------");

        Duck bigYellowDuck = new BigYellowDuck();
        bigYellowDuck.display();
        bigYellowDuck.fly();
        bigYellowDuck.quack();

        System.out.println("---------------------------------");

        Duck spaceDuck = new SpaceDuck();
        spaceDuck.display();
        spaceDuck.fly();
        spaceDuck.quack();

        System.out.println("---------------------------------");

        System.out.println("测试完毕!");
    }
}
