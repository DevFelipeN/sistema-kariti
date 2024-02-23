package com.example.kariti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class CadTurmaActivity extends AppCompatActivity {
    ImageButton voltar;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_turma);

        toolbar = findViewById(R.id.myToolBarMenu);
        setSupportActionBar(toolbar);

        voltar = findViewById(R.id.imgBtnVoltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ArrayList<String> teste = new ArrayList<>();
        teste.add("nome1");
        teste.add("nome2");
        teste.add("nome3");
        teste.add("nome4");
        teste.add("nome5");
        teste.add("nome6");
        teste.add("nome7");
        teste.add("nome8");
        ListView listView = findViewById(R.id.listView);
        AdapterExclAluno adapter = new AdapterExclAluno(this, teste);
        listView.setAdapter(adapter);
    }
}