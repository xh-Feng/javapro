package com.neuedu.test;

public class AddToSet {
    private int min;
    private int max;
    public void SetMin(int min){
        this.min = min;
    }
    public void SetMax(int max){
        this.max = max;
    }
    public int main(){
        int sum = 0;
        for(int i = min; i <= max; i++){
            sum = sum + i;
        }
       /* System.out.println(sum);*/
        return sum;
    }
}
