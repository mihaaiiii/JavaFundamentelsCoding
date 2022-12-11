package ro.mihaaiiii.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static float readFloatFromUser() {
         Scanner  keyBoard = getScanner();
        float floatNumber;
        try {
            floatNumber = keyBoard.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Please insert a float number");
            keyBoard.nextLine();
            floatNumber = readFloatFromUser();
        }
        return floatNumber;
    }


}
