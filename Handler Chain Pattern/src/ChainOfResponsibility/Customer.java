package ChainOfResponsibility;

// 只需要依赖PriceHandler 而不需要依赖它的具体实现（不管有多少种，也不管他们内部怎么变） 这就是处理者和请求者的解耦
import ChainOfResponsibility.Handler.PriceHandler;
import ChainOfResponsibility.Handler.PriceHandlerFactory;



import java.util.Random;

/**
 * 客户类 申请折扣
 * Created by hongjiyao_2014150120 on 17-1-15.
 */
public class Customer {

    /**
     * 处理人员
     */
    private PriceHandler priceHandler;

    /**
     * 处理人员的setter方法
     *
     * @param priceHandler 处理人员
     */
    private void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * 请求打折方法
     *
     * @param discount 折扣大小
     */
    private void requestDiscount(double discount) {
        priceHandler.processDiscount(discount);
    }

    /**
     * main函数
     *
     * @param args 命令行参数
     */
    public static void main(final String[] args) {
        Random rand = new Random();
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ": ");
            customer.requestDiscount(rand.nextDouble());
        }
    }
}
