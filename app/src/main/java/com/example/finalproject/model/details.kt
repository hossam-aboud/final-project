package com.example.finalproject.model
data class details(
    var id : Int,
    var name: String,
    var outher: String,
    var category: String,
    var year: String,
    var description: String,
    var language: String,
    var num: String,
    var copy: Int,
    var shelf: String, var img: Int
){
    companion object{
        const val TABLE_NAME = "details"
        const val  COL_ID  ="id"
        const val COL_IMAGE="img"
        const val COL_NAME ="name"
        const val COL_OUTHER ="outher"
        const val COL_CATEG="category"
        const val COL_YEAR ="year"
        const val COL_DESCRIPTION ="description"
        const val COL_LANG="language"
        const val COL_NUM ="num"
        const val COL_COPY ="copy"
        const val COL_SHELF="shelf"





        const val TABLE_CREATE= "create table $TABLE_NAME ($COL_ID INTEGER PRIMARY KEY,$COL_NAME TEXT ," + "$COL_OUTHER TEXT NOT NULL, $COL_IMAGE INTEGER" +
                ", \"$COL_CATEG TEXT ,\"$COL_YEAR INTEGER ,\"$COL_DESCRIPTION TEXT ,\"$COL_LANG TEXT ,\"$COL_NUM INTEGER" +
                ",\"$COL_COPY INTEGER ,\"$COL_SHELF TEXT)"

    }
}
