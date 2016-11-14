package HairFactory;

/**
 * 红发生产工厂
 * Created by hongjiyao_2014150120 on 16-10-21.
 */
class RedHairFactory extends HairFactory {
    /**
     * 根据类型来创建对象
     * @param key 类型
     * @return 创建的对象
     */
    @Override
    Hair getHair(String key) {
        if (LEFT.equals(key)) {
            return new RedLeftHair();
        } else if (RIGHT.equals(key)){
            return new RedRigntHair();
        }
        return null;
    }

    @Override
    Hair getHairByClassName(String className) {
        try {
            return (Hair)Class.forName("Red"+className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
