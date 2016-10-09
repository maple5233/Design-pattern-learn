package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 定义一个更新的接口，给天气预报订阅者们通知以更新。
 */
interface WeatherObserver {
    /**
     * 天气预报订阅者更新自己状态的接口
     * @param subject 传入的天气预报对象 用以获取天气信息
     */
    void update(WeatherSubject subject);
    void subscribe(WeatherSubject subject);
}
