package com.example.networkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)

        GlobalScope.launch {

            val result = quoteApi.getQuotes()

            if (result != null) {
                Log.d("MyData:", result.body().toString())
            }
        }


    }
}