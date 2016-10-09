import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 这是一个目标对象的抽象，会观察观察者，提供增删观察者的接口。
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    protected void notifyObservers() {
        for (Observer observer:observerList) {
            observer.update(this);
        }
    }
}
