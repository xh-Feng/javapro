package com.neuedu.test;

public class Baiyineizhishuhe {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= (i / 2) + 1; j++) {
                if ((i != 2) && (i % j == 0)) {
                    sum = sum + i;
                    break;
                }
            }
        }
        AddToSet p = new AddToSet();
        p.SetMin(2);
        p.SetMax(100);
        p.main();
        int x = p.main() - sum;
        System.out.println(x);
    }
}
