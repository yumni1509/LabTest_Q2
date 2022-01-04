package com.example.labtest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.database.sqlite.SQLiteDatabase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        private fun createDB(){
            val db = openOrCreateDatabase("mydata", MODE_PRIVATE, null)
            subToast("Database mydata created!")
            val sqlText = "CREATE TABLE IF NOT EXISTS user" +
                    "(Username VARCHAR(30) NOT NULL," +
                    "Password VARCHAR(30) NOT NULL " +
                    ");"
            subToast("Table user created!")
            db.execSQL(sqlText)
            var nextSQL = "INSERT INTO user(username, password) VALUES ('ahmad', 'ahmad1234');"
        }
        private fun subToast(msg: String){
            Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
        }
    }
}