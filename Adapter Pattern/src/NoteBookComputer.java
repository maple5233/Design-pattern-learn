/**
 * 笔记本电脑 测试客户端
 * Created by hongjiyao_2014150120 on 17-1-16.
 */
public class NoteBookComputer {
    /**
     * 使用三相插头要插三相插座
     */
    private ThreePlugIf plug;

    /**
     * 构造函数
     *
     * @param plug 插头
     */
    private NoteBookComputer(ThreePlugIf plug) {
        this.plug = plug;
    }

    /**
     * 使用插座供电
     */
    private void charge() {
        plug.powerWithThree();
    }

    public static void main(final String[] args) {
        GBTwoPlug gbTwoPlug = new GBTwoPlug(); // 现在只有二相插座
        ThreePlugIf threePlug = new TwoPlugAdapter(gbTwoPlug);
        NoteBookComputer noteBookComputer = new NoteBookComputer(threePlug);
        noteBookComputer.charge();
    }
}
