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
import kotlinx.android.synthetic.main.web6.w1
import kotlinx.android.synthetic.main.web3.*

class web6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web6)


        w1.webViewClient=mywebviewclient()
        w1.settings.javaScriptEnabled=true
        w1.settings.displayZoomControls=true
        w1.settings.builtInZoomControls=true


        when
        {
            // https://drive.google.com/file/d/1FNEnuQRRQmQvFMTmNQim8ey4xSYUi2oW/view
            MainActivity13.clicked==1-> w1.loadUrl("https://www.youtube.com/watch?v=6a-o4ALSe64&list=PLovfz5BWiPa3VIOdSjLrV1cu2sKFiXixh")
            MainActivity13.clicked==2-> w1.loadUrl("https://www.youtube.com/watch?v=88ICN1gVKSM&list=PL_gX69xPLi-lGe7iRt6DqTZ7PpIrNq8ep")
            MainActivity13.clicked==3-> w1.loadUrl("https://www.youtube.com/watch?v=-Rf4fZDQ0yw&list=PLjgj6kdf_snaw8QnlhK5f3DzFDFKDU5f4")
            MainActivity13.clicked==4-> w1.loadUrl("https://www.youtube.com/watch?v=xC-c7E5PK0Y")
            MainActivity28.clicked==5-> w1.loadUrl("https://www.youtube.com/watch?v=nx489B78ZJ4")
            MainActivity28.clicked==6-> w1.loadUrl("https://www.youtube.com/watch?v=23DF2V1z9UE&list=PLMYF6NkLrdN9oTARJ9BE1EChtcsPjPEZQ")
            MainActivity28.clicked==7-> w1.loadUrl("https://www.youtube.com/watch?v=-Rf4fZDQ0yw&list=PLjgj6kdf_snaw8QnlhK5f3DzFDFKDU5f4")
            MainActivity28.clicked==8-> w1.loadUrl("https://www.youtube.com/watch?v=jjjHwCkwUMQ&list=PL1565idytjOR18Ja9EfWsmPDGrJ9L40cf")
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