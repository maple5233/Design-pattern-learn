package HairFactory;

/**
 * 测试客户端
 * Created by hongjiyao_2014150120 on 16-10-21.
 */
public class Test {
    private static final String LEFT = "left";
    private static final String HAIR_FACTORY = "HairFactory";

    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
        Hair hairLeft = hairFactory.getHair(LEFT);
        /* 使用key来创建对象 */
        if (hairLeft != null) {
            hairLeft.draw();
        }
        /* 使用类名来创建对象 */
        Hair hairRight = hairFactory.getHairByClassName(HAIR_FACTORY + ".RightHair");
        if (hairRight != null) {
            hairRight.draw();
        }
        /* 使用红发工厂 */
        HairFactory redHairFactory = new RedHairFactory();
        Hair redHairLeft = redHairFactory.getHair(LEFT);
        if (redHairLeft != null) {
            redHairLeft.draw();
        }
    }
}
