package com.btsinfo.applitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNom;
    private EditText etPass;
    private Button btEnvoyer;
    private Spinner spNiveau;
    private String choix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNom = (EditText) findViewById(R.id.etNom);
        etPass = (EditText) findViewById(R.id.etMdp);
        btEnvoyer = (Button) findViewById(R.id.btEnvoyer);
        spNiveau = (Spinner) findViewById(R.id.spNiveau);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.niveau, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNiveau.setAdapter(adapter);

        spNiveau.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choix = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(adapterView.getContext(), choix, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        } {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click effectué", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void toResult(){
    Intent intent = new Intent()
}