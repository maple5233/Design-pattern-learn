package Weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 这是一个天气预报的抽象，会发布天气预报，提供增删订阅者的接口。
 */
class WeatherSubject {
    private List<WeatherObserver> observerList = new ArrayList<>();

    /**
     * 注册天气预报订阅者
     *
     * @param observer 订阅者
     */
    void attach(WeatherObserver observer) {
        observerList.add(observer);
    }

    /**
     * 移除天气预报订阅者者
     *
     * @param observer 订阅者
     */
    public void detach(WeatherObserver observer) {
        observerList.remove(observer);
    }

    /**
     * 发布天气预报
     */
    void notifyObservers() {
        for (WeatherObserver observer : observerList) {
            observer.update(this);
        }
    }
}
