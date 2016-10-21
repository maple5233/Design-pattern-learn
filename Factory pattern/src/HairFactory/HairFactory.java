package HairFactory;

/**
 * 发型工厂类
 * Created by hongjiyao_2014150120 on 16-10-21.
 */
class HairFactory {
    static final String LEFT = "left";
    static final String RIGHT = "right";
    /**
     * 根据类型来创建对象
     * @param key 类型
     * @return 创建的对象
     */
    Hair getHair (String key) {
        if (LEFT.equals(key)) {
            return new LeftHair();
        } else if (RIGHT.equals(key)){
            return new RightHair();
        }
        return null;
    }

    /**
     * 根据类名来生产实例
     * @param className 类名
     * @return 创建的对象
     */
     Hair getHairByClassName (String className){
        try {
            return (Hair)Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
         return null;
    }
}
