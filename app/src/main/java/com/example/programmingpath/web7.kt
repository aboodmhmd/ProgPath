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
import kotlinx.android.synthetic.main.web7.w1
import kotlinx.android.synthetic.main.web3.*

class web7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web7)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
            MainActivity14.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=YIUDgShB4Z8")
            MainActivity14.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=a9W7OpS4LfI&list=PLyuRouwmQCjlXvBkTfGeDTq79r9_GoMt9")
            MainActivity14.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=xmwI6VB_wUM&list=PLLAZ4kZ9dFpMGXTKXsBM_ZNpJwowfsP49")
            MainActivity14.clicked==4-> w1.loadUrl("https://www.youtube.com/watch?v=ae_DKNwK_ms")
            MainActivity29.clicked==5-> w1.loadUrl("https://www.youtube.com/watch?v=E_n0fyWFiOo")
            MainActivity29.clicked==6-> w1.loadUrl("https://www.youtube.com/watch?v=Apq8FuGNODM&list=PLF8OvnCBlEY25O_Ql0CrgQUAc5NVYkWF2")
            MainActivity29.clicked==7-> w1.loadUrl("https://www.youtube.com/watch?v=8H2G3VTXrO8&list=PLd6o9p13Lc50MNeph8RQaBILOHr8GMIkB")
            MainActivity29.clicked==8-> w1.loadUrl("https://www.youtube.com/watch?v=yJdvmEpaMmo")
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