package com.example.busapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize WebView
        myWebView = findViewById(R.id.myWebView);
        // Enable JavaScript for dynamic content
        myWebView.getSettings().setJavaScriptEnabled(true);
        // Set a custom WebViewClient to handle navigation within the app
        myWebView.setWebViewClient(new WebViewClient());
        // Load your website URL
        myWebView.loadUrl("file:///android_asset/index.html");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setAllowFileAccess(true);
    }

    function setLanguage(language) {
  currentLanguage = language;

  document.getElementById('appTitle').textContent = language === 'tc' ? '翠綠巴士路線資料' : 'Bus Route Information';
  document.getElementById('index-text').textContent = language === 'tc' ? '首頁' : 'Homepage';
  document.getElementById('search-text').textContent = language === 'tc' ? '搜尋' : 'Search';
  document.getElementById('stored-text').textContent = language === 'tc' ? '儲存路線' : 'Stored Routes';
  document.getElementById('dark-button').textContent = language === 'tc' ? '切換深色模式' : 'Toggle Dark Mode';

  fetchRoutes();
    }
}