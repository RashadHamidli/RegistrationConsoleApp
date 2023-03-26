package com.company.util;
<<<<<<< HEAD
=======

>>>>>>> 37123e78e14a5a205dfb2219207432facac61a14
import java.util.Scanner;

public class InputUtil {
    public static String requiredText(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        String answer = scanner.nextLine();
        return answer;
    }
    public static int requiredNumber(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        int answer = scanner.nextInt();
        return answer;
    }
}
