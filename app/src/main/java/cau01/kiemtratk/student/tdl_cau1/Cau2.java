package cau01.kiemtratk.student.tdl_cau1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cau2 extends AppCompatActivity{
    EditText edtNumA;
    EditText edtNumB;
    EditText edtNumC;
    Button btnGiai;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau2_giaiphuongtrinh);
        btnGiai = findViewById(R.id.btnGiai);
        edtNumA = findViewById(R.id.edtNumA);
        edtNumB = findViewById(R.id.edtNumB);
        edtNumC = findViewById(R.id.edtNumC);
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cau2.this,Cau2_ketqua.class);
                float soA,soB,soC;

                if(edtNumA.getText().toString() == null | edtNumB.getText().toString() == null |edtNumC.getText().toString() == null){
                    String error = "Chưa nhập!";
                    intent.putExtra("result",error);
                }
                else {
                    soA = Float.parseFloat(edtNumA.getText().toString());
                    soB = Float.parseFloat(edtNumB.getText().toString());
                    soC = Float.parseFloat(edtNumC.getText().toString());
                    String kq = giaiPTB2(soA, soB, soC);
                    intent.putExtra("result", kq);
                }
                startActivity(intent);
            }
        });
    }
    private String giaiPTB2(float a, float b,float c){
        float delta = (b*b) - (4*a*c);
        float x1,x2;

        if(delta<0){
            x1 = x2 =0;
            return "Phương trình vô nghiệm";
        }
        else if(delta == 0 ){
            x1 = x2 = -b/(2*a);
            return "Phương trình có nghiệm kép";
        }
        else if(delta > 0){
            delta = (float) Math.sqrt(delta);
            x1 = (-b + delta) / (2*a);
            x2 = (-b - delta) / (2*a);
            return "Phương trình có 2 nghiệm phân biệt";
        }
        return "";
    }
}
