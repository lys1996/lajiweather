package com.lajiweather.android.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jy on 2017/5/30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
