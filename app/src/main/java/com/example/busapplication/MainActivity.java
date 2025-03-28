package com.example.busapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;

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
        myWebView.getSettings().setAllowFileAccess(true);
    }
}