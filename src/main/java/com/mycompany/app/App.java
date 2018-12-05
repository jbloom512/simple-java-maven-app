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
					// Add header and value to temp row
			System.out.print("Joey is cool");

		}//for
    }

    private final String getMessage() {
        return message;
    }

}
