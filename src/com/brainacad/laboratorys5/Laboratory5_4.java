package com.brainacad.laboratorys5;

/**
 * Created by Work on 06.09.2016.
 */
public class Laboratory5_4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 3; i < 300; i++) {
            if ( ((i % 3) == 0) || ( (i % 4) == 0 )) {
                count ++;
                System.out.println(i);
                if (count == 10) break;
            }
        }
    }
}
