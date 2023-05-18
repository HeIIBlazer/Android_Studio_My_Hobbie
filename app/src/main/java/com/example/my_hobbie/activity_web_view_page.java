package com.example.my_hobbie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_web_view_page extends AppCompatActivity {

    private EditText addressBar;
    private WebView webView;
    private Button buttonGo;
    private Button buttonStatic;

    private Button buttonPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        buttonGo =(Button)findViewById(R.id.button_go);
        buttonStatic =(Button)findViewById(R.id.button_static);
        addressBar =(EditText)findViewById(R.id.editText_addressBar);
        webView =(WebView)findViewById(R.id.webView);
        buttonPage = (Button) findViewById(R.id.button_MainPage);
        // Custom WebViewClient to handle event on WebView.
        // Kohandatud WebViewClient WebView sündmuste haldamiseks
        // Пользовательский WebViewClient для обработки событий в WebView
        webView.setWebViewClient(new MyWebViewClient(addressBar));
        buttonGo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goUrl();
            }
        });
        buttonStatic.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                showStaticContent();
            }
        });
    }
    private void goUrl() {
        String url = addressBar.getText().toString().trim();
        if(url.isEmpty()) {
            Toast.makeText(this,"Please enter url",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
    }
    private void showStaticContent()
    {
        String staticContent="<h2>Select web page</h2>" +
                "<ul><li><a href='http://eclipse.org'>Eclipse</a></li>"
                +"<li><a href='http://google.com'>Google</a></li></ul>"+
                "<li><a href='https://en.wikipedia.org/wiki/Linkin_Park'>Linkin Park Wiki</a></li></ul>"+
                "<li><a href='https://open.spotify.com/artist/6XyY86QOPPrYVGvF9ch6wz'>Linkin Park spotify</a></li></ul>"
                ;
        webView.loadData(staticContent, "text/html", "UTF-8");
    }
        public void GoToNewPage(View view){
            switch(view.getId()){
                case R.id.button_MainPage:
                    Intent intent= new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menu.add(0, 1, 0, "Albums");
        menu.add(0, 2, 0, "Main Page");
        menu.add(0, 3, 3, "Info");
        return super.onCreateOptionsMenu(menu);
    }
    // обработка нажатий
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();

        switch(id){
            case 1:
                Intent intent= new Intent(this, activity_albumpage.class);
                startActivity(intent);
                break;
            case 3:
                Intent intent1= new Intent(this, activity_infopage.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2= new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
