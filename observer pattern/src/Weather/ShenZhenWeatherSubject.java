package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 * 深圳的天气预报对象
 */
public class ShenZhenWeatherSubject extends WeatherSubject {
    public static final String location = "深圳";
    private String weatherReportContent = "";// 深圳的天气预报

    public void setWeatherReportContent(String weatherReportContent) {
        this.weatherReportContent = weatherReportContent;
        this.notifyObservers();
    }

    public String getWeatherReportContent() {
        return weatherReportContent;
    }
}
