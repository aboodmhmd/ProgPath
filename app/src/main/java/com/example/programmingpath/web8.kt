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
import kotlinx.android.synthetic.main.web8.w1
import kotlinx.android.synthetic.main.web3.*

class web8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web8)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
            MainActivity25.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=VkUwJONdpvs&list=PLF8OvnCBlEY0UU030QzRv506rculmtGQ2")
            MainActivity25.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=2qTJglOu55g&list=PLeDJ7sxASv3SV-F1VbF4VKoHM6nXm3m4S")
            MainActivity25.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=gh-OzzgGdxg&list=PLrD0HM23WhqFB7O20Vk92Nb9-3zvBpdbt")
            MainActivity25.clicked==4-> w1.loadUrl("https://www.youtube.com/watch?v=xUKoFV_cITw&list=PLeDJ7sxASv3SImUl8umihE0pHFLPXCQF1")
            MainActivity26.clicked==5-> w1.loadUrl("https://www.youtube.com/watch?v=hDnhf9Kxt8k")
            MainActivity26.clicked==6-> w1.loadUrl("https://www.youtube.com/watch?v=R61lfHXILQ4&list=PL3Q7j24OtvTSBpQf-HIaJpn-JOAft5sVE")
            MainActivity26.clicked==7-> w1.loadUrl("https://www.youtube.com/watch?v=u8DNygzljXY&list=PLWUvrI0mg8VLrvq3n2iu45lhCo69uluDK")
            MainActivity26.clicked==8-> w1.loadUrl("https://www.youtube.com/watch?v=ggPCEDdIWxs&list=PLSM8fkP9ppPqPZZLtrRd7q1FTfKgHHjE7")

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