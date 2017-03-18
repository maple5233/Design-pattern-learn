package ProxyWithJDK;

import Proxy.Car;
import Proxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * Created by hongjiyao_2014150120 on 17-3-18.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        /*
          loader 类加载器
          interfaces  实现接口
          h InvocationHandler
         */
        Movable m = (Movable) Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(), h);
        m.move();
    }
}
