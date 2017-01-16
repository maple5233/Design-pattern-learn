/**
 * 单例模式
 * 应用场合： 有些对象只需要一个，我们要保证它有且只有一个
 * 类型：饿汉模式
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
class Singleton {

    private static boolean hasOne = false;

    /**
     * 默认构造方法设置private 避免外部直接new出来
     * 判断hasOne来防止反射攻击
     */
    private Singleton() {
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
     * 类加载的时候就已经加载这个静态实例 所以叫做饿汉
     */
    private static Singleton instance = new Singleton();

    /**
     * 获取实例
     *
     * @return 实例
     */
    static Singleton getInstance() {
        return instance;
    }

}
