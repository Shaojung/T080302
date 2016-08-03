package tw.com.pcschool.t080302;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSave(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();

        sp = getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("nickname", str);
        editor.commit();
    }

    public void clickLoad(View v)
    {

    }
}
