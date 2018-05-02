package br.com.wedosoft.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebVieww extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		WebView webview = new WebView(this); setContentView(webview);
		webview.loadUrl("file:///android_asset/exemplo/index.html");
    }

}
