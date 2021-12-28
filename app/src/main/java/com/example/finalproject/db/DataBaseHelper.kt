package com.example.finalproject.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.finalproject.model.AddBook
import com.example.finalproject.model.categ
import mybook

class DataBaseHelper (context: Context):
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    private var db: SQLiteDatabase
    init {
        db = this.writableDatabase
    }
    override fun onCreate(p0: SQLiteDatabase?) {
        p0!!.execSQL(mybook.TABLE_CREATE)
        p0!!.execSQL(AddBook.TABLE_CREATE)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE IF EXISTS ${mybook.TABLE_NAME}")
        onCreate(p0)
        p0!!.execSQL("DROP TABLE IF EXISTS ${AddBook.TABLE_NAME}")
        onCreate(p0)
    }
    //-------------------------------------------------------------------
    fun insertBook( name:String, authername:String , category:String, year:Int, description:String, language:String, num:Int, copy:Int, shelf:String):Boolean{
        val cv = ContentValues()
//        cv.put(AddBook.COL_IMAGE, img)
        cv.put(AddBook.COL_NAME, name)
        cv.put(AddBook.COL_OUTHER, authername)
        cv.put(AddBook.COL_CATEG, category)
        cv.put(AddBook.COL_YEAR, year)
        cv.put(AddBook.COL_DESCRIPTION, description)
        cv.put(AddBook.COL_LANG, language)
        cv.put(AddBook.COL_NUM, num)
        cv.put(AddBook.COL_COPY, copy)
        cv.put(AddBook.COL_SHELF, shelf)
        return db.insert(AddBook.TABLE_NAME, null, cv)>0
    }

    fun insertmybook(img: Int, name:String, authername:String):Boolean{
        val cv = ContentValues()
        cv.put(mybook.COL_ID, img)
        cv.put(mybook.COL_NAME, name)
        cv.put(mybook.COL_AUTHE_RNAME, authername)
        return db.insert(mybook.TABLE_NAME, null, cv)>0


    }
    fun insertCateg (img: Int , name: String): Boolean{
        val cv = ContentValues()
        cv.put(mybook.COL_ID, img)
        cv.put(mybook.COL_NAME, name)
        return db.insert(categ.TABLE_NAME, null, cv)>0
    }




    fun getAllCateg(): ArrayList<categ> {
        val data = ArrayList<categ>()
        val c =
            db.rawQuery("SELECT * FROM ${categ.TABLE_NAME} ORDER BY ${categ.COL_ID} DESC", null)

        c.moveToFirst()
        while (!c.isAfterLast) {
            //val s = Student(c.getInt(c.getColumnIndex(Student.COL_ID)),c.getString(1),c.getDouble(2))
            //c.count
            val s = categ(c.getInt(0), c.getString(1), c.getInt(2))
            data.add(s)
            c.moveToNext()
        }
        c.close()
        return data
    }

//    fun deleteCateg(id:Int) : Boolean{
//        //return db.delete(Student.TABLE_NAME,"${Student.COL_ID} = ? and name = ?", arrayOf(id.toString(),"")) >0
//        return db.delete(Student.TABLE_NAME,"${Student.COL_ID} = $id",null) >0
//    }





























    fun getAllBooks():ArrayList<AddBook>{
        var books = ArrayList<AddBook>()
        val cursor = db.rawQuery("select * from ${AddBook.TABLE_NAME} order by ${AddBook.COL_NAME} desc", null)
        cursor.moveToFirst()
        while (!cursor.isAfterLast){
            val s = AddBook(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getInt(8),cursor.getString(9),cursor.getInt(10))
            books.add(s)
            cursor.moveToNext()

        }
        cursor.close()
        return  books
    }
    fun deletemybook(img: Int): Boolean {
        //return db.delete(Student.TABLE_NAME, "${Student.COL_ID} = ? and name = ? ", arrayOf(id.toString(),name)) > 0
        return db.delete(mybook.TABLE_NAME, "${mybook.COL_ID} = $img", null) > 0
    }

    fun updateStudent(img: Int, name: String, authername: String): Boolean {
        val cv = ContentValues()

        cv.put(mybook.COL_ID, img)
        cv.put(mybook.COL_NAME, name)
        cv.put(mybook.COL_AUTHE_RNAME, authername)
        return db.update(mybook.TABLE_NAME, cv, "${mybook.COL_ID} = $img", null) > 0
    }



    companion object{
        const val DATABASE_NAME="bookdb"
        const val DATABASE_VERSION = 1

    }
}