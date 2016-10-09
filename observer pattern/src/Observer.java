/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 定义一个更新的接口，给观察者们通知以更新。
 */
public interface Observer {
    /**
     * 通知观察者根据subject更新自己的接口
     * @param subject 传入的目标对象 用以获取目标对象的信息
     */
    void update(Subject subject);
}
