package com.jiahaodev.ch14_coolweather.gson;

/**
 * Created by WilliamWu on 2017/2/12.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }

}
