package cau01.kiemtratk.student.tdl_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnCau1;
    Button btnCau2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choncau);
        btnCau1 = findViewById(R.id.btnCau01);
        btnCau2 = findViewById(R.id.btnCau02);
        btnCau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Cau1.class);
                startActivity(int1);

            }
        });
        btnCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2= new Intent(MainActivity.this,Cau2.class);
                startActivity(int2);
            }
        });
    }
}
