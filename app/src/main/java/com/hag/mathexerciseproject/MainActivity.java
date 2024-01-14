package com.hag.mathexerciseproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView tvMainFirstNum;
    private TextView tvMainSecondNum;
    private Button btnMainChallenge;

    private Button btnMultiTable;

    private  Button btnMulti20;

    private EditText etMainAnswer;

    Exercise exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        exercise=new Exercise();
    }



    private void initViews() {
        tvMainFirstNum = findViewById(R.id.tvMainFirstNum);
        tvMainSecondNum = findViewById(R.id.tvMainSecondNum);
        etMainAnswer = findViewById(R.id.etMainAnswer);
        btnMainChallenge= findViewById(R.id.btnMainChallenge);
        btnMainChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise.generateNumberChellenge();
                updateView();
            }
        });
        btnMultiTable= findViewById(R.id.btnMultiTable);
        btnMultiTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise.generateNumberMultiTable();
                updateView();
            }
        });

        btnMulti20= findViewById(R.id.btnMulti20);
        btnMultiTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exercise.generateNumberTillTwenty();
                updateView();
            }
        });

    }


    /**
     * update texts of view
     *
     */
    private void updateView() {
        tvMainFirstNum.setText(exercise.getNum1()+"");
        tvMainSecondNum.setText(exercise.getNum2()+"");
    }


    public void checkAnswer(View view) {
        if(exercise.answeredCorrect(etMainAnswer.getText().toString())){
            Toast.makeText(this, "success", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
        }
    }
}