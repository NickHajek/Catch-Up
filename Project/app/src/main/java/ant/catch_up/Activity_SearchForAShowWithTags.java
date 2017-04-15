package ant.catch_up;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Activity_SearchForAShowWithTags extends AppCompatActivity {

    // create a Hash Map (sorta like a Python dictionary)
    // for adding total reamining run time in a series

    Map GoTMap = new HashMap();
        // syntax: map key == season.episode (eg, 1.2 = season 1, episode 2)
        //         map value == run time, in minutes
        // there may be some errors here, I'm getting some red squiggly ilnes...

    GoTMap.put(1.1, new int (61));
    GoTMap.put(1.2, new int (55));
    GoTMap.put(1.3, new int (57));
    GoTMap.put(1.4, new int (55));
    GoTMap.put(1.5, new int (54));
    GoTMap.put(1.6, new int (52));
    GoTMap.put(1.7, new int (57));
    GoTMap.put(1.8, new int (58));
    GoTMap.put(1.9, new int (56));
    GoTMap.put(1.10, new int (52));

    // display_Season.setText(VARIABLE FROM OTHER ACTIVITY- what season am I on?)
    // display_Episode.setText(VARIABLE FROM ANOTHER ACTIVITY - what episode am I on?)
    // let's say for example that the user has finished season 1, episode 3.
    // In this case, TTRvalue should be equal to the sum of the run times for episodes 1.4-1.10.
    // TTRvalue = GoTMap.get(1.4)+ GoTMap.get(1.5) + GoTMap.get(1.6)... + GoTMap.get(1.10)
    // TTRhours = TTRvalue / 60 (division with remainder!!!!)
    // TTRminutes = ^^ the remainder from above
    // display_TTR.setText(TTRhours + " hours " + TTRminutes + " minutes")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__search_for_ashow_with_tags);
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

}
