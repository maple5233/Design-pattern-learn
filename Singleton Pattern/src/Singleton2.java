/**
 * 类型：懒汉模式
 * 懒汉模式加载类快，但是运行时获取对象慢 饿汉模式相反
 * 懒汉模式是线程不安全的
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
class Singleton2 {

    private static boolean hasOne = false;

    /**
     * 默认构造方法设置private 避免外部直接new出来
     * 判断hasOne来防止反射攻击
     */
    private Singleton2() {
        synchronized (Singleton.class) {
            if (!hasOne) {
                hasOne = true;
            } else {
                throw new RuntimeException("单例模式遭到攻击!");
            }
        }
    }

    /**
     * 唯一的实例
     * 类加载的时候未加载这个静态实例 所以叫做懒汉
     */
    private static Singleton2 instance;

    /**
     * 获取实例
     *
     * @return 实例
     */
    static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
