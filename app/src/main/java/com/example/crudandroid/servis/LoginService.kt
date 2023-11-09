package com.example.crudandroid.servis

import com.example.crudandroid.data.LoginData
import com.example.crudandroid.respon.LoginRespon
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

//interface LoginService untuk mengirim data ke API
interface LoginService {
    @POST("auth/local")
    fun getData(@Body body: LoginData) : Call<LoginRespon>
}