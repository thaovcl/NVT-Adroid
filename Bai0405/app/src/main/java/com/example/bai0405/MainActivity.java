package com.example.bai0405;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtKetQua;
    EditText edtHoTen;
    RadioButton radDaiHoc,radCaoDang;
    CheckBox chkC, chkJava, chkScript;
    Button btnLuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
        addEvent();
    }
    private  void addEvent(){

    }
    private void addView(){
        txtKetQua=findViewById(R.id.txtKetQua);
        edtHoTen=findViewById(R.id.edtHoten);
        radDaiHoc=findViewById(R.id.radDaihoc);
        radCaoDang=findViewById(R.id.radCaodang);
        chkC=findViewById(R.id.chkC);
        chkJava=findViewById(R.id.chkJava);
        chkScript=findViewById(R.id.chkJavascript);
        btnLuu=findViewById(R.id.btnLuu);
    }
}