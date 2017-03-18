package Proxy;

/**
 * 测试类
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car carTimeProxyWithExtend = new CarTimeProxyWithExtend();
        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);

        car.move();
        System.out.println("-------------------------");
        carTimeProxyWithExtend.move();
        carTimeProxy.move();
        System.out.println("-------------------------");
        carLogProxy.move();
    }
}
