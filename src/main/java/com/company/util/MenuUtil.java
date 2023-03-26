package com.company.util;

public class MenuUtil {
    public static void processMenu(int selectMenu) {
        if (selectMenu == 1) {
            StudentUtil.registerStudents();
        } else if (selectMenu == 2) {
            StudentUtil.printAllRegisteredStudents();
        } else if (selectMenu == 3) {
            StudentUtil.findStudentAndPrint();
        } else if (selectMenu == 4) {
            StudentUtil.updateStudentWithSameObject();
        } else if (selectMenu == 5) {
            System.exit(0);
        }
    }

    public static String requireName() {
        return InputUtil.requiredText("enter name");
    }

    public static String requireSurname() {
        return InputUtil.requiredText("enter surname");
    }

    public static int requireAge() {
        return InputUtil.requiredNumber("enter age");
    }

    public static String requireClassName() {
        return InputUtil.requiredText("enter class name");
    }
}
