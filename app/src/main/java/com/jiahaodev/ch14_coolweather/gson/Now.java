package com.jiahaodev.ch14_coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WilliamWu on 2017/2/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
