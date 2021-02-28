package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    Spinner sp1, sp2;
    TextView show_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);
        editText = findViewById(R.id.edit1);
        sp1 = findViewById(R.id.spr1);
        sp2 = findViewById(R.id.spr2);
        show_result.findViewById(R.id.showresult1);
        try {
            String[] From = {"china", "USA", "Euro"};
            ArrayAdapter ad1 = new <String>ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, From);
            sp1.setAdapter(ad1);
            String[] To = {"Taka", "India Rupi", "Pakisthani "};
            ArrayAdapter ad2 = new <String>ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, To);

            sp2.setAdapter(ad2);
        } catch (Exception e) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double total;
                    Double amount = Double.parseDouble(editText.getText().toString());

                    if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "Taka") {
                        total = amount * 84;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "India Rupi") {
                        total = amount * 76;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "Pakisthani") {
                        total = amount * 169;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "China" && sp2.getSelectedItem().toString() == "India Rupi") {
                        total = amount * 11;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "China" && sp2.getSelectedItem().toString() == "Taka") {
                        total = amount * 13;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "China" && sp2.getSelectedItem().toString() == "Pakisthani") {
                        total = amount * 24;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "India Rupi") {
                        total = amount * 88;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Taka") {
                        total = amount * 102;
                        show_result.setText(String.valueOf(total));
                    } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Pakisthani") {
                        total = amount * 192;
                        show_result.setText(String.valueOf(total));
                    }

                }
            });
        }
    }
}
