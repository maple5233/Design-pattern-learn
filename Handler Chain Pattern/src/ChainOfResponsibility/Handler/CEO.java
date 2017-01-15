package ChainOfResponsibility.Handler;

/**
 * CEO接受50-55%的请求，拒绝55%以上的
 * Created by hongjiyao_2014150120 on 17-1-15.
 */
class CEO extends PriceHandler{

    private static final double MAX_DISCOUNT = 0.55; // 最多55%折扣

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
            System.out.println(this.getClass().getName() + "拒绝了折扣" + discount * 100 + "%");
        }
    }
}
