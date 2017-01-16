/**
 * 测试类
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
public class Test {

    public static void main(final String[] args) {
        // 饿汉模式
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("同个实例");
        } else {
            System.out.println("不同实例");
        }
        // 懒汉模式
        Singleton2 singleton3 = Singleton2.getInstance();
        Singleton2 singleton4 = Singleton2.getInstance();
        if (singleton3 == singleton4) {
            System.out.println("同个实例");
        } else {
            System.out.println("不同实例");
        }
        // 枚举类
        SingleTon3 singleTon5 = SingleTon3.INSTANCE;
        SingleTon3 singleTon6 = SingleTon3.INSTANCE;
        singleTon5.Test();
        singleTon6.Test();
    }
}
