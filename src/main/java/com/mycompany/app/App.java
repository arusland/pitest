package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    }

    public int calc(int i, int j) {
        if (i > j) {
            return (i - j) * 2;
        }

        if (j > i) {
            return (j - i) * 3;
        }

        return 42;
    }
}
