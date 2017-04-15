package ant.catch_up;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity_SearchForShows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__search_for_shows);
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
    }

    public void callGOTSeason(View v){
        Intent screen3 = new Intent(this, Activity_SelectSeason.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        startActivity(screen3);

    }

    public void callUserProfile(View v){
        Intent screen3 = new Intent(this, Activity_UserProfile.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        startActivity(screen3);
    }


}
