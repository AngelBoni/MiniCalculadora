package com.example.minicalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /*Obejetos visuales que tengo que recuperar*/

    private EditText editNumero1;
    private EditText editNumero2;
    private Button btnSumar;

    /*Fin*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editNumero1 = (EditText) findViewById(R.id.editNumero1);
        editNumero2 = (EditText) findViewById(R.id.editNumero2);
        btnSumar = (Button) findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String cadena1 = editNumero1.getText().toString();
            String cadena2 = editNumero2.getText().toString();
            int numero1 = Integer.parseInt(cadena1);
            int numero2 = Integer.parseInt(cadena2);
            int resultado = numero1 + numero2;

                Toast.makeText(MainActivity.this, "El resultado es: " + resultado, Toast.LENGTH_SHORT).show();

            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}