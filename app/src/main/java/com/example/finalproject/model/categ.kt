package com.example.finalproject.model

data class categ (
    var idCat : Int,
    var nameCat : String , var imageCat : Int
        ){
    companion object{
        const val TABLE_NAME = "categ"
        const val COL_ID="idCat"
        const val COL_NAME ="nameCat"
        const val COL_IMAGE ="imageCat"
        const val TABLE_CREATE= "create table $TABLE_NAME ($COL_ID INTEGER PRIMARY KEY AUTOINCREMENT," +  "$COL_NAME TEXT NOT NULL, $COL_IMAGE INTEGER)"

    }
}