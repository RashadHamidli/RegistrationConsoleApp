package com.company.main;
import com.company.util.InputUtil;
import com.company.util.MenuUtil;


public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requiredNumber("What do you want to do? " +
                    "\n1. Registration student? " +
                    "\n2. Show all students? " +
                    "\n3. Find student?" +
                    "\n4. Update student" +
                    "\n5. Exit");
            MenuUtil.processMenu(menu);
        }
    }
}