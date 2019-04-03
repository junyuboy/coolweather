package com.example.aa.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aa on 2019/4/3.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
