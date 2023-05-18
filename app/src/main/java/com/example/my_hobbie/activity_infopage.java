package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;

public class activity_infopage extends AppCompatActivity {

    int images[] = {
            R.drawable.chester,
            R.drawable.mike,
            R.drawable.joe,
            R.drawable.rob,
            R.drawable.brad,
            R.drawable.dave
    };

    ImageButton Next;
    ImageButton Previous;

    ImageView Band_Photo;

    int i=0;

    TextView Person_Name;
    TextView Place;
    TextView Info;
    TextView Name_Change;

    String[] person_name;
    String[] place;

    String[] change_name;

    String[] info;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infopage);

        Resources res = getResources();
        person_name = res.getStringArray(R.array.Band);
        place = res.getStringArray(R.array.Place);
        info = res.getStringArray(R.array.Info);
        change_name = res.getStringArray(R.array.BandInfo);

        Band_Photo = (ImageView) findViewById(R.id.Photo_Person);
        Person_Name = (TextView) findViewById(R.id.Name);
        Place = (TextView) findViewById(R.id.Place);
        Info = (TextView) findViewById(R.id.Info);
        Name_Change = (TextView) findViewById(R.id.InfoAbout);

        Next =(ImageButton) findViewById(R.id.imageButtonNext2);
        Previous = (ImageButton) findViewById(R.id.imageButtonPrevious2);

        String info_about = "Info about ";

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>5)
                    i=0;
                Band_Photo.setImageResource(images[i]);
                Person_Name.setText(person_name[i]);
                Place.setText(place[i]);
                Info.setText(info[i]);
                Name_Change.setText(info_about + "" + change_name[i]);
            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<0)
                    i=5;
                Band_Photo.setImageResource(images[i]);
                Person_Name.setText(person_name[i]);
                Place.setText(place[i]);
                Info.setText(info[i]);
                Name_Change.setText(info_about + "" + change_name[i]);
            }
        });

//        Previous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i--;
//                if(i<0)
//                    i=6;
//                Album_Cover.setImageResource(images[i]);
//                Album_Name.setText(album_names[i]);
//                Genre.setText(genres[i]);
//
//
//            }
//        });
//    }

    }

    public void GoToNewPage(View view){
        switch(view.getId()){
            case R.id.Main_Page_Button:
                Intent intent1= new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.Albums_Button:
                Intent intent2= new Intent(this, activity_albumpage.class);
                startActivity(intent2);
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menu.add(0, 1, 0, "Albums");
        menu.add(0, 2, 0, "Browser");
        menu.add(0, 3, 3, "Main Page");
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
                Intent intent1= new Intent(this, MainActivity.class);
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