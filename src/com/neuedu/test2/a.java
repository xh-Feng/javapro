package com.neuedu.test2;

public class a {
    public static void main(String[] args) {
        int[] a = {1,5,3,4,42,65,85,26,11};
        for (int i=0;i<a.length-1;i++){
            int flag=0;
            for (int j = 0;j<a.length-1;j++){
                if (a[j]<a[j+1]){
                    int b =a[j+1];
                    a[j+1]=a[j];
                    a[j]=b;
                    flag++;
                }
            }
            if (flag==0)
                break;
        }
        for (int i:a)
            System.out.println(i);
    }
}
