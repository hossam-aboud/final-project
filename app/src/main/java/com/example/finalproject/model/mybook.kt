data class mybook(
    var id : Int,
    var img: Int,
    var name:String,
    var authername:String,
    var favic:Int,
    var deletic:Int){
    companion object{
        const val TABLE_NAME = "mybook"
        const val COL_ID= "id"
        const val COL_NAME ="name"
        const val COL_AUTHE_RNAME ="authername"
        const val TABLE_CREATE =
            "create table $TABLE_NAME($COL_ID INTEGER PRIMARY KEY, "+
                    "$COL_NAME TEXT NOT NULL, $COL_AUTHE_RNAME TEXT"

    }
}