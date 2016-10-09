package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 深圳的天气预报对象
 */
class ShenZhenWeatherSubject extends WeatherSubject {
    static final String location = "深圳";
    private String weatherReportContent = "";// 深圳的天气预报

    void setWeatherReportContent(String weatherReportContent) {
        this.weatherReportContent = weatherReportContent;
        this.notifyObservers();
    }

    String getWeatherReportContent() {
        return weatherReportContent;
    }
}
