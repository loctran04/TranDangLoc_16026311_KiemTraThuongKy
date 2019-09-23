package cau01.kiemtratk.student.tdl_cau1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cau2_ketqua extends AppCompatActivity {
    Button btnBack;
    TextView edtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau2_ketqua);
        btnBack = findViewById(R.id.btnBack);
        edtResult = findViewById(R.id.edtResult);
        Intent getInt = getIntent();
        edtResult.setText(getInt.getStringExtra("result"));
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Cau2_ketqua.this,Cau2.class);
                startActivity(back);
            }
        });
    }
}
