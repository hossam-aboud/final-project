package com.example.finalproject.model

data class favorite (
    var img: Int,
    var name:String,
    var authername:String,
    var favic:Int,
    var deletic:Int
        ){
    companion object{
        const val TABLE_NAME1 = "favorite"
        const val COL_IMG1= "img"
        const val COL_NAME1 ="name"
        const val AUTHER_NAME1 ="authername"
        const val TABLE_CREATE1 =
            "create table $TABLE_NAME1($COL_IMG1 INTEGER PRIMARY KEY, "+
                    "$COL_NAME1 TEXT NOT NULL, $AUTHER_NAME1 TEXT"

    }
}