package com.hag.mathexerciseproject;

import androidx.lifecycle.MutableLiveData;

import java.util.Random;


public class Exercise {
    private int num1;
    private int num2;
    private int result;


    public Exercise() {

    }


    //till twenty
    public  void  generateNumberTillTwenty(){
        Random r = new Random();
        this.num1 = r.nextInt(10);
        this.num2 = r.nextInt(10);
        result = num1*num2;
    }

    public  void  generateNumberChellenge(){
        Random r = new Random();
        this.num1 = r.nextInt(10);
        this.num2 = r.nextInt(10)+10;
        result = num1*num2;
    }

    public  void  generateNumberMultiTable(){
        Random r = new Random();
        this.num1 = r.nextInt(10);
        this.num2 = r.nextInt(90)+10;
        result = num1*num2;
    }


    public boolean isTrue(String answer){
        int ans=Integer.valueOf(answer);
        if(ans==result){
            return true;
        }else{
            return false;
        }
    }




    /**
     *
     * @param answer
     * @return
     * התוצאה שהמשתמש הכניס
     */
    public boolean answeredCorrect(String answer)    {
        String res=result+"";
        return (res.equals(answer));
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
