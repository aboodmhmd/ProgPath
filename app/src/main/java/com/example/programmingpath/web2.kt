package com.example.programmingpath

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.web1.*
import kotlinx.android.synthetic.main.web2.w1
import kotlinx.android.synthetic.main.web2.*
import kotlinx.android.synthetic.main.web3.*

class web2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web2)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
            MainActivity48.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=SQHREey_Yuc&list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C")
            MainActivity48.clicked==2->w1.loadUrl("https://www.youtube.com/watch?v=SXmVym6L8dw&list=PLAC325451207E3105")
            MainActivity48.clicked==3->w1.loadUrl("https://www.youtube.com/watch?v=cRL5TorHINY&list=PL7WFbgpeASD3117pvlNaXZwK5q6H3XhZZ")
            MainActivity48.clicked==5-> w1.loadUrl("https://www.youtube.com/watch?v=QXeEoD0pB3E&list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3")
            MainActivity48.clicked==7-> w1.loadUrl("https://www.youtube.com/watch?v=1v8cMGdZZEQ&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8")
            MainActivity51.clicked==4-> w1.loadUrl("https://www.youtube.com/watch?v=hR3D1odn2TQ&list=PLF8OvnCBlEY2w-zdVPozupapiKzLzpyUZ")
            MainActivity51.clicked==6->w1.loadUrl("https://www.youtube.com/watch?v=rzqjYKyciUM&list=PLF8OvnCBlEY1j4hxoqXqJk08ASU7D_W87")
            MainActivity51.clicked==8->w1.loadUrl("https://www.youtube.com/watch?v=74_g1yb2_U4&list=PLF8OvnCBlEY1bObRpU9p5Ioqt9Ckeeruj")
            MainActivity51.clicked==9-> w1.loadUrl("https://www.youtube.com/watch?v=N3CXL3IStfY&list=PLF8OvnCBlEY0UEgX-PDJduL5Tyv4Estam")
            MainActivity51.clicked==10-> w1.loadUrl("https://www.youtube.com/watch?v=Qt9_WMNuYP0&list=PLF8OvnCBlEY1lalnvdYmz4O_x7wII8NiI")

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