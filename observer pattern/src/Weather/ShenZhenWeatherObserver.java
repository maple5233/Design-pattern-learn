package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 深圳的天气预报订阅者
 */

public class ShenZhenWeatherObserver implements WeatherObserver {

    private String name = "";

    private String planOfTomorrow = "呆在家。";

    public ShenZhenWeatherObserver(String name) {
        this.name = name;
    }

    /**
     * 通知观察者根据subject更新自己
     *
     * @param subject 传入的目标对象 用以获取目标对象的信息
     */
    @Override
    public void update(WeatherSubject subject) {
        String weatherOfTomorrow = ((ShenZhenWeatherSubject) subject).getWeatherReportContent();
        if (weatherOfTomorrow.contains("雨")) {
            this.planOfTomorrow = "呆在家。";
        } else if (weatherOfTomorrow.contains("晴")) {
            if (this.name.equals("小明")) {
                this.planOfTomorrow = "去踢球。";
            }
            if (this.name.equals("小红")) {
                this.planOfTomorrow = "去逛街。";
            }
        } else {
            this.planOfTomorrow = "呆在家。";
        }
        this.speak(((ShenZhenWeatherSubject) subject));
    }

    @Override
    public void subscribe(WeatherSubject subject) {
        ((ShenZhenWeatherSubject)subject).attach(this);
    }

    private void speak(ShenZhenWeatherSubject subject) {
        System.out.println(name + "说，根据天气预报，明天" + ShenZhenWeatherSubject.location + "天气是"
                + subject.getWeatherReportContent() + ",因此我明天将" + planOfTomorrow);
    }
}
