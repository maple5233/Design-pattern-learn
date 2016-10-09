package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 深圳的天气预报订阅者
 */

class ShenZhenWeatherObserver implements WeatherObserver {

    private static final String STAY_HOME = "呆在家。";
    private static final String GO_SHOPPING = "去逛街。";
    private static final String GO_TO_PLAY_FOOTBALL = "去逛街。";
    private static final String MIKE = "小明";
    private static final String MARY = "小红";
    private static final String RAINY = "雨";
    private static final String SUNNY = "晴";

    private String name = "";

    private String planOfTomorrow = STAY_HOME;

    ShenZhenWeatherObserver(String name) {
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
        if (weatherOfTomorrow.contains(RAINY)) {
            this.planOfTomorrow = STAY_HOME;
        } else if (weatherOfTomorrow.contains(SUNNY)) {
            if (this.name.equals(MIKE)) {
                this.planOfTomorrow = GO_TO_PLAY_FOOTBALL;
            }
            if (this.name.equals(MARY)) {
                this.planOfTomorrow = GO_SHOPPING;
            }
        } else {
            this.planOfTomorrow = STAY_HOME;
        }
        this.speak(((ShenZhenWeatherSubject) subject));
    }

    @Override
    public void subscribe(WeatherSubject subject) {
        ((ShenZhenWeatherSubject) subject).attach(this);
    }

    private void speak(ShenZhenWeatherSubject subject) {
        System.out.println(name + "说，根据天气预报，明天" + ShenZhenWeatherSubject.location + "天气是"
                + subject.getWeatherReportContent() + ",因此我明天将" + planOfTomorrow);
    }
}
