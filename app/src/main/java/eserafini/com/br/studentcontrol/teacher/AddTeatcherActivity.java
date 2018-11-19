package eserafini.com.br.studentcontrol.teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eserafini.com.br.studentcontrol.R;

public class AddTeatcherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_teatcher);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
