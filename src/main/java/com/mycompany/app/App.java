package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
		for (int j = 0; j < 50; j++) {
			System.out.println("This is a test");

		}//for
    }

    private final String getMessage() {
        return message;
    }

}
