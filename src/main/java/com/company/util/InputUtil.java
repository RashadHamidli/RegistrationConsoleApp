package com.company.util;
<<<<<<<<< Temporary merge branch 1

=========
>>>>>>>>> Temporary merge branch 2
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
