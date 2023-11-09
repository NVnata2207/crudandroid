package com.example.crudandroid.respon

//user respon untuk menampung data yang diambil dari api
class UserRespon {
    var id: Int = 0
    var username : String = ""
    var email : String = ""
    var provider : String = ""
    var confirmed: String = ""
    var blocked: Boolean = false
    var createdAt : String = ""
    var updatedAt: String = ""
}