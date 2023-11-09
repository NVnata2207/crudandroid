package com.example.crudandroid.servis

import com.example.crudandroid.data.RegisterData
import com.example.crudandroid.respon.LoginRespon
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

//interface RegisterService untuk mengirim data ke API
interface RegisterService {
    @POST("auth/local/register")
    fun saveData(@Body body: RegisterData) : Call<LoginRespon>
}