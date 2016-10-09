/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 具体的观察者，有更新的方法。
 */

public class ConcreteObserver implements Observer {

    private String observerStatus = "";
    /**
     * 通知观察者根据subject更新自己
     * @param subject 传入的目标对象 用以获取目标对象的信息
     */
    @Override
    public void update(Subject subject) {
        this.observerStatus = ((ConcreteSubject)subject).getSubjectStatus();
    }
}
