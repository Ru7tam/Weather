package com.example.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    //liveDataCurrent создан для обновления верхней карточки с данными о сгодняшнем дне (погоде).
    val liveDataList = MutableLiveData<List<WeatherModel>>()
    //контейнер liveDataList используется для информации о погоде в нижней части экрана.
}