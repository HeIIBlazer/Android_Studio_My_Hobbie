package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class activity_infopage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopage);
    }

    public void GoToNewPage(View view){
        switch(view.getId()){
            case R.id.main_page:
                Intent intent1= new Intent(this, activity_albumpage.class);
                startActivity(intent1);
                break;
            case R.id.Button_Albums:
                Intent intent2= new Intent(this, activity_infopage.class);
                startActivity(intent2);
            default:
                break;
        }
    }


}