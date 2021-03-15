package edu.cs.birzeit.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
    }

    public void btnShow_onClick(View view) {
        String name = edtName.getText().toString().trim();
        if(!name.isEmpty()){
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }
    }
}