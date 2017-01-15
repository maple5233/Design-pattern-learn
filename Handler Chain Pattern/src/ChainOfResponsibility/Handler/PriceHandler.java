package ChainOfResponsibility.Handler;

/**
 * 价格处理人 抽象类
 * Created by hongjiyao_2014150120 on 17-1-15.
 */
public abstract class PriceHandler {

    /**
     * 直接后继，用于传递请求
     */
    PriceHandler successor;

    /**
     * 设置successor
     *
     * @param successor 直接后继
     */
    void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理打折的方法
     *
     * @param discount 折扣大小
     */
    public abstract void processDiscount(double discount);
}
