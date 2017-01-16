/**
 * 三相转二相适配器
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug twoPlug; // 转换后的二相插座

    TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.twoPlug = gbTwoPlug;
    }

    /**
     * 使用三相电流供电
     */
    @Override
    public void powerWithThree() {
        System.out.println("经过转换：");
        twoPlug.powerWithTwo();
    }
}
