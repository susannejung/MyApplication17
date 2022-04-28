package com.example.myapplication17;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    boolean ok=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.buttonknap);
        Button btn1=findViewById(R.id.buttonknap1);
        TextView t=findViewById(R.id.tekstfelt);
        CheckBox cb=findViewById(R.id.checkBox1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ok==true)
                    t.setText("Pernille");
                else
                    t.setText("Susanne");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t.getText()=="Pernille")
                    t.setText("Hanne");
                else if(t.getText()=="Susanne")
                    t.setText("Else");

                if(cb.isChecked())
                    t.setText(("Checkbox er checked"));
            }
        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ok=true;
            }
        });

    }
}