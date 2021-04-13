package com.example.demo;

public class Sample {
	
	public static void main( String as[] ) {
        for (int i = 0; i < 10; i++) {
            Controller f = new Controller(); // Avoid this whenever you can it's really expensive
        }
    }

}
