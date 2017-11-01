package rtc.nuntaporn.pangrang.engforfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rtc.nuntaporn.pangrang.engforfun.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmantMain, new MainFragment()).commit();

        }


    }   // Main Method

}   // Main Class
