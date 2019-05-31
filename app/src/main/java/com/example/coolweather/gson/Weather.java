package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;
    public Basic basic;
    public Update update;
    public Now now;
    public LifeStyle lifeStyle;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}