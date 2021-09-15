package com.example.programmingpath

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

import kotlinx.android.synthetic.main.web3.*

class web3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web3)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true
        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
            MainActivity15.clicked==1->w1.loadUrl("https://www.youtube.com/watch?v=PYjyg0LNTfE&list=PLDoPjvoNmBAwClZ1PDcjWilxp9YERUbNt")
            MainActivity15.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=Iu1T7j2FA4M&list=PLDoPjvoNmBAzAeIcXA3_JsmSkPKOs9W-Y")
            MainActivity15.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=eKuNnpWhm7c&list=PLDoPjvoNmBAw6p0z0Ek0OjPzeXoqlFlCh")
            MainActivity21.clicked==4->w1.loadUrl("https://www.youtube.com/watch?v=xpZLS6R91rQ&list=PLr6-GrHUlVf96NLj3PQq-tmEB6woZjwEl")
            MainActivity50.clicked==8-> w1.loadUrl("https://www.youtube.com/watch?v=ySa58y1SRy0&list=PLMRqhzcHGw1b89DXHOVA77ozWXWmuBkWX")
            MainActivity21.clicked==10-> w1.loadUrl("https://www.youtube.com/watch?v=dD2EISBDjWM&list=PLr6-GrHUlVf_ZNmuQSXdS197Oyr1L9sPB")
            MainActivity50.clicked==11-> w1.loadUrl("https://www.youtube.com/watch?v=1Xqn5IHbusA&list=PL640F44F1C97BA581")
            MainActivity21.clicked==12-> w1.loadUrl("https://www.youtube.com/watch?v=qKoajPPWpmo&list=PLr6-GrHUlVf8JIgLcu3sHigvQjTw_aC9C")
            MainActivity55.clicked==5->w1.loadUrl("https://www.youtube.com/watch?v=Leoo1podBEI&list=PLF8OvnCBlEY1BC20Bl73DuyW3LE5sGCUH")
            MainActivity55.clicked==6-> w1.loadUrl("https://www.youtube.com/watch?v=Do9FwLLyupA&list=PLF8OvnCBlEY1LvgUqPxPGUrpGUl0jD09-")

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
