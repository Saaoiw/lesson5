package com.brainacad.laboratorys5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Work on 06.09.2016.
 */
public class Laboratory5_6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        System.out.println("Please input N:");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum +i;
        }

        System.out.println("The Sum:" + sum);
        System.out.println("The Avg:" + (sum/n));
    }
}
