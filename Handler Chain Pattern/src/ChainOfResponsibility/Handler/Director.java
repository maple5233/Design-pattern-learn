package ChainOfResponsibility.Handler;

/**
 * 销售总监 30%-40%折扣
 * Created by hongjiyao_2014150120 on 17-1-15.
 */
class Director extends PriceHandler {

    private static final double MAX_DISCOUNT = 0.40; // 最多40%折扣

    /**
     * 处理打折的方法
     *
     * @param discount 折扣大小
     */
    @Override
    public void processDiscount(double discount) {
        if (discount <= MAX_DISCOUNT) {
            System.out.println(this.getClass().getName() + "批准了折扣" + discount * 100 + "%");
        } else {
            successor.processDiscount(discount);
        }
    }
}
