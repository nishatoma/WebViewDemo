package com.example.league95.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize WebView
        webView = findViewById(R.id.webView);
        //Enable JavaScript since most websites use it!
        webView.getSettings().setJavaScriptEnabled(true);
        //If you don't do this for most phones it will jump
        //To the phone's default browser view!
        webView.setWebViewClient(new WebViewClient());
        //Load  any URL you want :))
        //webView.loadUrl("https://www.google.ca/");

        //Load HTML content as well
        webView.loadData("<html><body><h1> Hi there!! </h1> </body> </html>", "text/html", "UTF-8");

    }
}
