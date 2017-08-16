package com.example.android.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1, mButtonChoice2, mButtonChoice3, mButtonChoice4;
    private String mAnswer;
    static int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextpage = (Button) findViewById(R.id.nextpage);
    // Create a new intent to open the {@link NumbersActivity}
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextLevel.class);
                startActivity(intent);

            }
        });

        mScoreView = (TextView) findViewById(R.id.scoreLevel1);
        mQuestionView = (TextView) findViewById(R.id.questionLevel1);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        checkQuestion();
        updateQuestion();

        // Listener Button  1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore += 1;
                    updateScore(mScore);
                    checkQuestion();
                    updateQuestion();
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.wrong, Toast.LENGTH_SHORT).show();
                    checkQuestion();
                    updateQuestion();
                }
            }
        });

        // Listener Button  2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore += 1;
                    updateScore(mScore);
                    checkQuestion();
                    updateQuestion();
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.wrong, Toast.LENGTH_SHORT).show();
                    checkQuestion();
                    updateQuestion();
                }
            }
        });

        // Listener Button  3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore += 1;
                    updateScore(mScore);
                    checkQuestion();
                    updateQuestion();
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.wrong, Toast.LENGTH_SHORT).show();
                    checkQuestion();
                    updateQuestion();
                }
            }
        });

        // Listener Button  4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice4.getText() == mAnswer) {
                    mScore += 1;
                    updateScore(mScore);
                    checkQuestion();
                    updateQuestion();
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.wrong, Toast.LENGTH_SHORT).show();
                    checkQuestion();
                    updateQuestion();
                }
            }
        });
    }

    private void checkQuestion() {
        if (mQuestionNumber == 5) {
            mQuestionNumber = 0;
            mScoreView.setText("0");
            mScore = 0;
        }
    }

    private void updateQuestion() {

        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    // Update score
    public void updateScore(int point) {

        mScoreView.setText("" + mScore);
    }
}









