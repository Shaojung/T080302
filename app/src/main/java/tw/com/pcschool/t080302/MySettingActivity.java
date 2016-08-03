package tw.com.pcschool.t080302;

import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MySettingActivity extends AppCompatPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentTransaction ft =
                getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content,
                new MyPrefFragment()).commit();
    }

}
