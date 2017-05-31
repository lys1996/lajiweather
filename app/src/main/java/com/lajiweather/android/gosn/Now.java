package com.lajiweather.android.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jy on 2017/5/30.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
