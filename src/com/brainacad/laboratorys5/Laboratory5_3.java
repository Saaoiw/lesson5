package com.brainacad.laboratorys5;

/**
 * Created by Work on 06.09.2016.
 */
public class Laboratory5_3 {
    public static void main(String[] args) {

        System.out.print( "* | " );

        for (int i = 1; i < 10; i++) {
            System.out.print( i + " " );
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print( "--" );
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print( i + " | " );
            for (int j = 1; j < 10 ; j++) {
                System.out.print( (i * j) + " ");
            }
            System.out.println();
        }
    }
}
