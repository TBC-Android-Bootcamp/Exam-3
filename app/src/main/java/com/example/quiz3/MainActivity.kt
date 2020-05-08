package com.example.quiz3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        downloadModelList()
    }

    private fun downloadModelList(){
        (applicationContext as App).globalDataProvider.getModel().enqueue(object :
                Callback<List<Model>> {
            override fun onFailure(call: Call<List<Model>>, t: Throwable) {
                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                    call: Call<List<Model>>,
                    response: Response<List<Model>>
            ) {
                val models = response.body()
                Log.d("bacho", models.toString())
            }
        })
    }
}
