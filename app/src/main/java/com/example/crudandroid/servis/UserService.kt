package com.example.crudandroid.servis

import com.example.crudandroid.data.UpdateData
import com.example.crudandroid.respon.LoginRespon
import com.example.crudandroid.respon.UserRespon
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

//interface UserService untuk interaksi data dengan API
interface UserService {
//    get untuk mengambil data dari API
    @GET("users")
    fun getData(): Call<List<UserRespon>>

//    delete untuk menghapus data dari API
    @DELETE("users/{id}")
    fun delete(@Path("id") id: Int): Call<UserRespon>

//    put untuk mengupdate data dari API
    @PUT("users/{id}")
    fun save(@Path("id") id: String?, @Body body: UpdateData): Call<LoginRespon>
}