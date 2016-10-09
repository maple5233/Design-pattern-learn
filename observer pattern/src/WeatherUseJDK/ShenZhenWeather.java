package WeatherUseJDK;

import java.util.Observable;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 */
class ShenZhenWeather extends Observable {
    private String report = "";

    String getReport() {
        return report;
    }

     void setReport(String report) {
        this.report = report;
        this.setChanged(); //set change = true;
        // this.notifyObservers(report); //带参数的是推模型 传输的是一部分信息
        this.notifyObservers(); //不带参数的notifyObservers()是拉模型 传输的是整个自身对象
    }
}
