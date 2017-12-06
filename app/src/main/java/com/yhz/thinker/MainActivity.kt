package com.yhz.thinker

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.jetbrains.anko.doAsync
import java.net.URL

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply { text = "fix complete" })
    }

    override fun onStart() {
        super.onStart()
        doAsync {
            val str = URL("http://stats.jpush.cn").readText()
            Log.e(javaClass.simpleName, str)
        }
    }
}
