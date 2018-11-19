package eserafini.com.br.studentcontrol.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eserafini.com.br.studentcontrol.R;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
