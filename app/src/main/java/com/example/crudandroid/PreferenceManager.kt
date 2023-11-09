package com.example.crudandroid

import android.content.Context
import android.content.SharedPreferences

//class PreferenceManager digunakan untuk menyimpan data sementara
class PreferenceManager(context: Context) {

//membuat variabel sharedPreferences dengan tipe SharedPreferences untuk menyimpan data sementara
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("auth", Context.MODE_PRIVATE)

//fungsi untuk menyimpan data ke dalam shared preferences
    fun saveData(key: String, value: String) {
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

//fungsi untuk mengambil data dari shared preferences
    fun getData(key: String): String {
        return sharedPreferences.getString(key, "") ?: ""
    }
}