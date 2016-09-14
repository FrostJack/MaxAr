package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[20];
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = random.nextInt(1000);

        System.out.println(Arrays.toString(a));

        int max = 0;
        for (int i = 1; i < a.length; i++)
            if (a[max]<a[i]) max = i;
        System.out.println(a[max]);
    }
}
