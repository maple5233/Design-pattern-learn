package WeatherUseJDK;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hongjiyao_2014150120 on 16-10-9.
 */
class PersonInShenZhen implements Observer {
    private String name;

    PersonInShenZhen(String name) {
        this.name = name;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        // System.out.println(name + "收到了推送来的天气预报："+arg); //推模型
        System.out.println(name + "收到了天气预报，并且阅读了天气预报消息："+((ShenZhenWeather)o).getReport());
    }
}
