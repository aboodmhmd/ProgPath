package com.example.programmingpath

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.web3.*
import kotlinx.android.synthetic.main.web1.*
import kotlinx.android.synthetic.main.web4.w1
import kotlinx.android.synthetic.main.web3.*

class Web4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web4)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
                       MainActivity44.clicked==6-> w1.loadUrl("https://www.youtube.com/watch?v=qVU3V0A05k8&list=PL0eyrZgxdwhwBToawjm9faF1ixePexft-")
            MainActivity44.clicked==9-> w1.loadUrl("https://www.youtube.com/watch?v=3AYoipyqOkQ&list=PL6n9fhu94yhXQS_p1i-HLIftB9Y7Vnxlo")
            MainActivity44.clicked==13-> w1.loadUrl("https://www.youtube.com/watch?v=ZGWVXUFq220&list=PL5eJgcQ87sgfUrc6an-0Swam0kQXVYnuw&index=2")
            MainActivity49.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=-u9_T_CLZHY&list=PLDoPjvoNmBAzH72MTPuAAaYfReraNlQgM")
            MainActivity49.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=mvZHDpCHphk&list=PLDoPjvoNmBAyE_gei5d18qkfIe-Z8mocs&index=1")
            MainActivity49.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=8d2brY2rcQg&list=PLCIJjtzQPZJ86NI0dqvIpIgMEG9gLrHz7")


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