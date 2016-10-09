/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 继承自抽象目标对象，是具体的目标对象。可以是天气预报啊之类的。负责把自己的状态发送出去给观察者们。
 */
public class ConcreteSubject extends Subject {
    private String subjectStatus = "";// 要发送的自身状态

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
        this.notifyObservers();
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }
}
