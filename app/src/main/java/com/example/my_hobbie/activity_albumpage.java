package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class activity_albumpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albumpage);
    }

    public void GoToNewPage(View view){
        switch(view.getId()){
            case R.id.main_page:
                Intent intent= new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.Info_Button:
                Intent intent2= new Intent(this, activity_infopage.class);
                startActivity(intent2);
            default:
                break;
        }
    }

}
