package ChainOfResponsibility.Handler;

/**
 * 工厂类 生成责任链
 * Created by hongjiyao_2014150120 on 17-1-15.
 */
public class PriceHandlerFactory {

    /**
     * 简单工厂方法函数
     *
     * @return 一个价格处理人
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        return sales;
    }
}
