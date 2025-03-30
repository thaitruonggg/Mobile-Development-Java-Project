package com.example.lab1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab1.model.Question;

public class MainActivity extends AppCompatActivity {
    private static final String QUESTION_INDEX = "index";

    // Declare buttons and textview
    private Button mButtonTrue;
    private Button mButtonFalse;
    private Button mButtonNext;
    private Button mButtonPrevious;
    private TextView mTextViewQuestion, mTextViewCorrectedAnswer, mTextViewIncorrectedAnswer;
    private int mCorrectedAnswer = 0, mIncorrectedAnswer = 0;

    // Declare Current Index to count the question
    private int mCurrentIndex = 0;

    // Declare Question Bank
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_1, false),
            new Question(R.string.question_2, true),
            new Question(R.string.question_3, true)
    };

    //Declare Update question
    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getResId();
        mTextViewQuestion.setText(question);
    };

    // Declare check answer
    private void checkAnswer(boolean userAnswer) {
        boolean correctedAnswer = mQuestionBank[mCurrentIndex].isAnswerTrue();

        int messageResId = 0;
        if (userAnswer == correctedAnswer) {
            mCorrectedAnswer++;
            messageResId = R.string.answer_correct;
        } else {
            mIncorrectedAnswer++;
            messageResId = R.string.answer_incorrect;
        }
        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
        mTextViewCorrectedAnswer.setText(String.format("Corrected: %d", mCorrectedAnswer));
        mTextViewIncorrectedAnswer.setText(String.format("Incorrected: %d", mIncorrectedAnswer));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTrue = (Button) findViewById(R.id.btnTrue);
        mButtonFalse = (Button) findViewById(R.id.btnFalse);
        mButtonNext = (Button) findViewById(R.id.btnNext);
        mButtonPrevious = (Button) findViewById(R.id.btnPrevious);
        mTextViewQuestion = (TextView) findViewById(R.id.tvQuestion);
        updateQuestion();
        mTextViewCorrectedAnswer = (TextView) findViewById(R.id.tvCorrectedAnswer);
        mTextViewIncorrectedAnswer = (TextView) findViewById(R.id.tvIncorrectedAnswer);

        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                checkAnswer(true);
            }
        });

        mButtonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                checkAnswer(false);
            }
        });

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                updateQuestion();
            }
        });

        mButtonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentIndex <= 0)
                    mCurrentIndex = mQuestionBank.length - 1;
                else
                    mCurrentIndex = mCurrentIndex - 1;
                updateQuestion();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save Question Index
        outState.putInt(QUESTION_INDEX, mCurrentIndex);
    }

    protected void onStart() {
        super.onStart();
        //Write Log
    }

    protected void onStop() {
        super.onStop();
        //Write Log
    }



}