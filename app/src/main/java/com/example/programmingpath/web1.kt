package com.example.programmingpath

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.web1.*
import kotlinx.android.synthetic.main.web1.w1
import kotlinx.android.synthetic.main.web3.*

class web1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web1)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            MainActivity10.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=HalXZUHfKLA&list=PLLWMQd6PeGY3t63w-8MMIjIyYS7MsFcCi")
            MainActivity10.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=mM3zB3QWuv8&list=PLC601DEA22187BBF1")
            MainActivity10.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=2NWeucMKrLI&list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq")
            MainActivity10.clicked==4-> w1.loadUrl("https://www.youtube.com/watch?v=YR6fxe1wa8g&list=PLS1QulWo1RIZz6uDid--I09EOImRmPHS0")
        }

    }

    class mywebviewclient: WebViewClient(){
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url:String): Boolean {
            view?.loadUrl(url)
            return true
        }
    }
}
