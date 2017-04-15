package ant.catch_up;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class Activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);
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


    public void callRegisterPage(View v) {
        Intent nxtscreen = new Intent(Activity_Login.this, Activity_SearchForShows.class);
        startActivity(nxtscreen);
    }

    //public void callUserProfile(View v) {
        //Intent nxtscreen = new Intent(this, Activity_UserProfile.class);
        //startActivity(nxtscreen);

        //Intent nxtscreen = new Intent(this, Activity_UserProfile.class);
        //Bundle extras = getIntent().getExtras();
        //String value = extras.getString("name");
        //nxtscreen.putExtra("name", value);
        //startActivity(nxtscreen);
    //}
}
