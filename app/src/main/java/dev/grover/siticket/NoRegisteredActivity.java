package dev.grover.siticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoRegisteredActivity extends AppCompatActivity {

    Button btnNoRegScanear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_registered);

        btnNoRegScanear = findViewById(R.id.btnNoRegScanear);

        btnNoRegScanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoRegisteredActivity.this, QrActivity.class);
                startActivity(intent);
            }
        });
    }
}