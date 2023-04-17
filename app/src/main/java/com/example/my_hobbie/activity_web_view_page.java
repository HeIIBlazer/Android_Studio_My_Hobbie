package com.example.my_hobbie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_web_view_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://en.wikipedia.org/wiki/Linkin_Park");
    }




    public void GoToNewPage(View view){
        switch(view.getId()){
            case R.id.main_page:
                Intent intent= new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.album_page:
                Intent intent1= new Intent(this, activity_albumpage.class);
                startActivity(intent1);
                break;
            case R.id.info_page:
                Intent intent2= new Intent(this, activity_infopage.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
