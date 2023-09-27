package com.example.test_estudo.test_estudo;

public class Calculator {

    public Integer add(int ...values){
        int sum = 0;
        for (int value : values){
            sum += value;
        }
        return sum;
    }

    public Integer subtract(int ...values){
        int result = 0;
        for (int i = 1; i <= values.length; i++){
            if (i==1){
                result = values[0];
            }
            else
            {
                result -= values[i-1];
            }
        }
        return result;
    }

    public Integer multiply(int ...values){
        int result = 0;
        for (int i = 1; i <= values.length; i++){
            if (i==1){
                result = values[0];
            }
            else
            {
                result *= values[i-1];
            }
        }
        return result;

    }

    public Integer divide(int ...values){
        int result = 0;
        for (int i = 1; i <= values.length; i++){
            if (i==1){
                result = values[0];
            }
            else
            {
                result /= values[i-1];
            }
        }
        return result;

    }
}
