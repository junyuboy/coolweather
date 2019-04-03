package com.example.aa.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aa on 2019/4/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temprature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
