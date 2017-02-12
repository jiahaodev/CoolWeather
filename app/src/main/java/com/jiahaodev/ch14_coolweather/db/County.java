package com.jiahaodev.ch14_coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WilliamWu on 2017/2/11.
 * 功能：区（县）级信息 实体类
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherCode;//表示当前区（县）所对应的天气id（网络）
    private int cityId; //表示当前区（县）所属市的id值（数据库）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
