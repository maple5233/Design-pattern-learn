package WeatherUseJDK;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 */
public class ClientUseJDK {
    public static void main(String[] args) {
        ShenZhenWeather shenZhenWeather = new ShenZhenWeather();
        PersonInShenZhen xiaoMing = new PersonInShenZhen("小明");
        PersonInShenZhen xiaoHong = new PersonInShenZhen("小红");
        shenZhenWeather.addObserver(xiaoMing);
        shenZhenWeather.addObserver(xiaoHong);
        shenZhenWeather.setReport("晴天");
    }
}
