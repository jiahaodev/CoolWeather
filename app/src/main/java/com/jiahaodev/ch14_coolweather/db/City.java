package com.jiahaodev.ch14_coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WilliamWu on 2017/2/11.
 *  功能：市级信息 实体类
 */

public class City extends DataSupport {

    private int id;//数据库
    private String cityName;
    private int cityCode;//网络版
    private int provinceId; //表示当前市所属省的id值(数据库中)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
