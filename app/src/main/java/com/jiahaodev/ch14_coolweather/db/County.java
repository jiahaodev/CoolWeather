package com.jiahaodev.ch14_coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WilliamWu on 2017/2/11.
 * 功能：区（县）级信息 实体类
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;//表示当前区（县）所对应的天气id
    private int cityId; //表示当前区（县）所属市省的id值

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

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
