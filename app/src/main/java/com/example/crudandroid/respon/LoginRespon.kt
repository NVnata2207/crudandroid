package com.example.crudandroid.respon

import com.google.gson.annotations.SerializedName

//login respon untuk menampung data yang diambil dari api
class LoginRespon {
    @SerializedName("jwt")
    var jwt : String = ""
}