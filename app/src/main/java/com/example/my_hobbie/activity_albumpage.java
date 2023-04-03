package com.example.my_hobbie;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;

import kotlin.reflect.KFunction;

public class activity_albumpage extends AppCompatActivity {

    int images[] = {
            R.drawable.hybrid_theory_album_cover,
            R.drawable.meteora_album_cover,
            R.drawable.minutes_to_midnight_album_cover,
            R.drawable.a_thousand_suns_album_cover,
            R.drawable.living_things_album_cover,
            R.drawable.hunting_party_album_cover,
            R.drawable.one_more_light_album_cover
    };

    ImageButton Next;
    ImageButton Previous;

    ImageView Album_Cover;

    int i=0;

    TextView Album_Name;
    TextView Genre;

    TextView Link;

    String[] album_names;
    String[] genres;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albumpage);
        Link = (TextView) findViewById(R.id.LINK);
        Link.setMovementMethod(LinkMovementMethod.getInstance());

        Resources res = getResources();
        album_names = res.getStringArray(R.array.Album_Names);
        genres = res.getStringArray(R.array.Genre);

        Album_Cover = (ImageView) findViewById(R.id.imageAlbumCover);
        Album_Name = (TextView) findViewById(R.id.Album_Name);
        Genre = (TextView) findViewById(R.id.textViewGenre);

        Next =(ImageButton) findViewById(R.id.imageButtonNext);
        Previous = (ImageButton) findViewById(R.id.imageButtonPrevious);






        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i>6)
                    i=0;
                Album_Cover.setImageResource(images[i]);
                Album_Name.setText(album_names[i]);
                Genre.setText(genres[i]);


            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                if(i<0)
                    i=6;
                Album_Cover.setImageResource(images[i]);
                Album_Name.setText(album_names[i]);
                Genre.setText(genres[i]);


            }
        });
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
