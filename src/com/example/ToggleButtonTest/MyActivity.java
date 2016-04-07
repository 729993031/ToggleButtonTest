package com.example.ToggleButtonTest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MyActivity extends Activity {
    ToggleButton toggle;
    Switch switcher;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toggle=(ToggleButton)findViewById(R.id.toggle);
        switcher=(Switch)findViewById(R.id.switcher);
        final LinearLayout test=(LinearLayout)findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener=new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button
                    , boolean isChecked) {
                if(isChecked)
                {
                    test.setOrientation(1);
                    toggle.setChecked(true);
                    switcher.setChecked(true);
                }
                else {
                    test.setOrientation(0);
                    toggle.setChecked(false);
                    switcher.setChecked(false);
                }


            }
        };
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);

    }
}
