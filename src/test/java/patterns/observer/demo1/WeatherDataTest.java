package patterns.observer.demo1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by liumeng on 2016/3/27.
 */
public class WeatherDataTest {

    @Test
    public void testMeasurementsChanged() throws Exception {
        //初始化Subject
        WeatherData weatherData = new WeatherData();

        //订阅Subject
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //更新天气信息
        weatherData.setHumidity(20);
        weatherData.setPressure(30);
        weatherData.setTemperture(40);
        weatherData.measurementsChanged();

        weatherData.setHumidity(2);
        weatherData.setPressure(3);
        weatherData.setTemperture(4);
        weatherData.measurementsChanged();

    }
}