package com.example.android.quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class NextLevel extends AppCompatActivity {
    int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_level);
        Button submit = (Button) findViewById(R.id.submit);
        Button start = (Button) findViewById(R.id.startthequiz);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFirstQuestionRadioButtonStatus();
                getSecoundQuestionStatus();
                getThirdQuestionCheckBoxesStatus();
                getFourthQuestionCheckBoxesStatus();
                if (Score > 0) {
                    Toast.makeText(getApplicationContext(), getString(R.string.Congratulation) + Score + getString(R.string.points), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.scored) + Score + getString(R.string.Next_time), Toast.LENGTH_LONG).show();
                }

            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextLevel.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void getSecoundQuestionStatus() {

        EditText qustion2_level2 = (EditText) findViewById(R.id.editText_qustion2_level2);
        String strInput = qustion2_level2.getText().toString().trim();

        if (strInput.equalsIgnoreCase("MONARCHY")) {
            Score = +1;
        }
    }

    public void getFirstQuestionRadioButtonStatus() {
        RadioButton checkBox1a = (RadioButton) findViewById(R.id.radioButton_Level2_1a);
        RadioButton checkBox1b = (RadioButton) findViewById(R.id.radioButton_Level2_1b);
        RadioButton checkBox1c = (RadioButton) findViewById(R.id.radioButton_Level2_1c);
        RadioButton checkBox1d = (RadioButton) findViewById(R.id.radioButton_Level2_1d);

        if (!checkBox1a.isChecked() && !checkBox1b.isChecked() && checkBox1c.isChecked() && !checkBox1d.isChecked()) {
            Score += 1;
        }
    }


    public void getThirdQuestionCheckBoxesStatus() {
        CheckBox checkBox3a = (CheckBox) findViewById(R.id.checkbox_Level2_3a);
        CheckBox checkBox3b = (CheckBox) findViewById(R.id.checkbox_Level2_3b);
        CheckBox checkBox3c = (CheckBox) findViewById(R.id.checkbox_Level2_3c);
        CheckBox checkBox3d = (CheckBox) findViewById(R.id.checkbox_Level2_3d);

        if (checkBox3a.isChecked() && !checkBox3b.isChecked() && !checkBox3c.isChecked() && !checkBox3d.isChecked()) {
            Score += 1;
        }
    }

    public void getFourthQuestionCheckBoxesStatus() {
        CheckBox checkBox3a = (CheckBox) findViewById(R.id.checkbox_Level2_4a);
        CheckBox checkBox3b = (CheckBox) findViewById(R.id.checkbox_Level2_4b);
        CheckBox checkBox3c = (CheckBox) findViewById(R.id.checkbox_Level2_4c);
        CheckBox checkBox3d = (CheckBox) findViewById(R.id.checkbox_Level2_4d);

        if (checkBox3a.isChecked() && !checkBox3b.isChecked() && !checkBox3c.isChecked() && !checkBox3d.isChecked()) {
            Score += 1;
        }
    }
}

