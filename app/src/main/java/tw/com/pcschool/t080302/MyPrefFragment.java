package tw.com.pcschool.t080302;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Student on 2016/8/3.
 */
public class MyPrefFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypref);
    }
}
