package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

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
                Intent intent1= new Intent(this, activity_infopage.class);
                startActivity(intent1);
                break;
            case R.id.button_Web_View:
                Intent intent2= new Intent(this, activity_web_view_page.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
    // создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menu.add(0, 1, 0, "Albums");
        menu.add(0, 2, 0, "Browser");
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
                Intent intent2= new Intent(this, activity_web_view_page.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}