package com.shiva.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //avoid to define findViewById
        setGetValue();
    }

    // fun is always used to create methods as a access modifier
   fun setGetValue(){
       //easy to set value
       my_view.text = "Shivaprakash.......";
       //easy to get value
       my.text = my_view.text;
   }
}
