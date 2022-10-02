package dev.grover.siticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisteredActivity extends AppCompatActivity {

    Button btnRegScanear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        btnRegScanear = findViewById(R.id.btnRegScanear);

        btnRegScanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisteredActivity.this, QrActivity.class);
                startActivity(intent);
            }
        });
    }
}