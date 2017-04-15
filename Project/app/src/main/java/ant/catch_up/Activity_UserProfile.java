package ant.catch_up;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class Activity_UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__user_profile);
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
        TextView N = (TextView)findViewById(R.id.Name);

        Intent screen3 = new Intent(this, Activity_UserProfile.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        N.setText(Value, TextView.BufferType.EDITABLE);
        Button button1 = (Button)findViewById(R.id.ButtonClicked1);
        Button button2 = (Button)findViewById(R.id.ButtonClicked2);
        String Value1 = extras.getString("xx");
        String Value2 = extras.getString("yy");
        button1.setText(Value1);
        button2.setText(Value2);

    }

    public void callShows(View v)
    {
        Intent screen3 = new Intent(this, Activity_SearchForShows.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        String xx =  extras.getString("xx");
        screen3.putExtra("xx", xx);
        String zz = extras.getString("zz");
        screen3.putExtra("zz", zz);
        startActivity(screen3);
    }


    public void gotoFeed(View v){
        Intent screen3 = new Intent(this, Activity_ShowFeed.class);
        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");
        screen3.putExtra("name", Value);
        String xx =  extras.getString("xx");
        screen3.putExtra("xx", xx);
        String zz = extras.getString("zz");
        screen3.putExtra("zz", zz);
        startActivity(screen3);

    }

}
