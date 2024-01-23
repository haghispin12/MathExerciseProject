package com.hag.mathexerciseproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView tvMainFirstNum;
    private TextView tvMainSecondNum;
    private Button btnMainChallenge;

    private Button btnMultiTable;

    private  Button btnMulti20;

    private EditText etMainAnswer;
    private int num1;
    private int num2;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }


    /**
     * initialize
      */
    private void initViews() {
        tvMainFirstNum = findViewById(R.id.tvMainFirstNum);
        tvMainSecondNum = findViewById(R.id.tvMainSecondNum);
        etMainAnswer = findViewById(R.id.etMainAnswer);
        btnMainChallenge= findViewById(R.id.btnMainChallenge);
        btnMainChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateNumberChallenge();
                updateView();
            }
        });
        btnMultiTable= findViewById(R.id.btnMultiTable);
        btnMultiTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateNumberMultiTable();
                updateView();
            }
        });

        btnMulti20= findViewById(R.id.btnMulti20);
        btnMulti20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateNumberTillTwenty();
                updateView();
            }
        });
    }


    /**
     * update texts of view
     *
     */
    private void updateView() {
        tvMainFirstNum.setText(num1+"");
        tvMainSecondNum.setText(num2+"");
    }

    /**
     * challenge
     */
    public  void  generateNumberChallenge(){
        Random r = new Random();
        num1 = r.nextInt(10);
        num2 = r.nextInt(10) + 10;
    }

    /**
     * multi table
     */
    public  void  generateNumberMultiTable(){
        Random r = new Random();
        num1 = r.nextInt(10);
        num2 = r.nextInt(90)+10;
    }

    /**
     * till 20
     */
    public  void  generateNumberTillTwenty(){
        Random r = new Random();
        this.num1 = r.nextInt(10);
        this.num2 = r.nextInt(10);
    }

    /**
     * check answer
     */
    public void checkAnswer() {
        result = num1*num2;
        String res=result+"";
        if(res.equals(etMainAnswer.getText().toString())){
            Toast.makeText(this, "success", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
        }
    }

}