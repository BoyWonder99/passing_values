package com.example.ransi.passing_values;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        Integer var_i = i.getIntExtra("val",10);

        TextView txt = (TextView) findViewById(R.id.main2_txt1);
        txt.setText(var_i.toString());

        Button btn = (Button) findViewById(R.id.main2_btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result","play");
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });

    }
}
