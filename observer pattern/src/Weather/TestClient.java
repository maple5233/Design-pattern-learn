package Weather;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 */
public class TestClient {
    public static void main(String[] args) {
        // 创建天气预报
        ShenZhenWeatherSubject shenZhenWeatherSubject = new ShenZhenWeatherSubject();
        // 创建订阅者
        ShenZhenWeatherObserver XiaoMing = new ShenZhenWeatherObserver("小明");
        ShenZhenWeatherObserver XiaoHong = new ShenZhenWeatherObserver("小红");
        // 注册订阅者
        XiaoHong.subscribe(shenZhenWeatherSubject);
        XiaoMing.subscribe(shenZhenWeatherSubject);
        // 发布天气
        shenZhenWeatherSubject.setWeatherReportContent("晴天");
        shenZhenWeatherSubject.setWeatherReportContent("雨天");
        shenZhenWeatherSubject.setWeatherReportContent("变化莫测的天气");
    }
}
