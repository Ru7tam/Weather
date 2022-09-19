package com.example.weather.fragments

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Fragment.isPermissionGranted(p: String):Boolean{
    //проверка на уже имеющееся разрешение
     return ContextCompat.checkSelfPermission(
         activity as AppCompatActivity, p) == PackageManager.PERMISSION_GRANTED
    //проверка, возвращает ли функция нам "0", то есть PERMISSION_GRANTED(true,либо же все таки false)
}