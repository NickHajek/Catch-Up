package ant.catch_up;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SearchForShowsRecommended extends AppCompatActivity {
    String xx = "";
    String yy = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_for_shows_recommended);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent screen3 = new Intent(this, Activity_UserProfile.class);
        Bundle extras = getIntent().getExtras();
        xx = extras.getString("xx");
        yy = extras.getString("yy");
    }

    public void startPopular(View v){
        Intent screen3 = new Intent(this, Activity_SearchForShows.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        screen3.putExtra("xx", xx);
        screen3.putExtra("yy", yy);
        startActivity(screen3);
    }

    public void startRecommended(View v){
        Intent screen3 = new Intent(this, SearchForShowsRecommended.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        screen3.putExtra("xx", xx);
        screen3.putExtra("yy", yy);
        startActivity(screen3);    }

    public void startNew(View v){

        Intent screen3 = new Intent(this, SearchForShowsNew.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        screen3.putExtra("xx", xx);
        screen3.putExtra("yy", yy);
        startActivity(screen3);
    }

    public void callGOTSeason(View v){
        Intent screen3 = new Intent(this, Activity_SelectSeason.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        screen3.putExtra("xx", xx);
        screen3.putExtra("yy", yy);
        startActivity(screen3);

    }


    public void callUserProfile(View v){
        Intent screen3 = new Intent(this, Activity_UserProfile.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        screen3.putExtra("xx", xx);
        screen3.putExtra("yy", yy);
        startActivity(screen3);
    }


    public void topicChosen(View v){
        Intent screen3 = new Intent(this, Activity_UserProfile.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        Button b = (Button)v;
        String buttontext = b.getText().toString();
        String temp = xx;
        xx = buttontext;
        yy = temp;
    }



}
