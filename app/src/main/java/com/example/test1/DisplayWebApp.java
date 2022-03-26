package com.example.test1;

import android.webkit.WebView;

import com.example.test1.R;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayWebApp {

    public static void displayWebApp(WebView browser, String url){
        browser.setWebViewClient(new WebViewClient());
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        browser.getSettings().setAllowContentAccess(true);
        browser.getSettings().setAllowFileAccess(true);
        browser.loadUrl(url);
    }

}
