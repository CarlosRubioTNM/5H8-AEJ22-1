package edu.itch2.ej225h8.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowToast = findViewById(R.id.btnShowToast);
        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(getApplicationContext(),"Botón presionado", Toast.LENGTH_SHORT);
                t.show();
            }
        });
    }

}