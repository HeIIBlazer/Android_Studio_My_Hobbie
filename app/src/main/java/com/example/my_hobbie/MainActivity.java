package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToNewPage(View view){
        switch(view.getId()){
            case R.id.Button_Albums:
                Intent intent= new Intent(this, activity_albumpage.class);
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