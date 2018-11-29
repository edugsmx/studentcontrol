package eserafini.com.br.studentcontrol.teacher;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import eserafini.com.br.studentcontrol.R;
import eserafini.com.br.studentcontrol.matter.AddMatterActivity;
import eserafini.com.br.studentcontrol.matter.InternMatterActivity;
import eserafini.com.br.studentcontrol.matter.MatterAdapter;
import eserafini.com.br.studentcontrol.ui.main.MainActivity;
import eserafini.com.br.studentcontrol.util.GridSpacingItemDecoration;

public class TeatcherActivity extends AppCompatActivity {

    String teatcherName[] = {"Lucas Azevedo", "Claudio Moreira", "Luisa Pereira"};
    RecyclerView recyclerView;
    GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatcher);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.teatcher_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeatcherActivity.this, AddTeatcherActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.teatcher_recyclerView);
        TeatcherAdapter adapter = new TeatcherAdapter(TeatcherActivity.this, teatcherName);
        recyclerView.setAdapter(adapter);
        layoutManager = new GridLayoutManager(TeatcherActivity.this, 1);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(1, spacingInPixels, true));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        adapter.setOnItemClickListener(new TeatcherAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(TeatcherActivity.this, InternTeatcherActivity.class);
                startActivity(intent);
            }
        });
    }
}
