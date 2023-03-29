package com.company.util;
import com.company.bean.Student;
import com.company.main.Config;

public class StudentUtil {
    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        int age = MenuUtil.requireAge();
        String className = MenuUtil.requireClassName();

        Student student = new Student(name, surname, age, className);
        return student;
    }
    

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((i + 1) + " " + student.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requiredNumber("how many student registration");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("registration completed successfully1");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentAndPrint() {
        String text = InputUtil.requiredText("type name, surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                result[found++] = student;
            }
        }
        return result;
    }

    public static void updateStudentWithNewObject() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requiredNumber("necenci adama deyisiklik etmek isteyirsiniz?");
        System.out.println("yeni melumatlari daxil edin");
        Student student = StudentUtil.fillStudent();
        Config.students[i - 1] = student;
    }

    public static void updateStudentWithSameObject() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requiredNumber("nechenci adama deyisikliketmek isteyirsiniz?");
        Student selectedStudent = Config.students[i - 1];
        System.out.println("yeni melumatlari daxil edin");
        String changeParams = InputUtil.requiredText("neleri deyishmek isteyirsiniz?  meslen ''name");
        if (changeParams.contains("'name'")) {
            selectedStudent.setName(MenuUtil.requireName());
        }
        if (changeParams.contains("'surname'")) {
            selectedStudent.setSurname(MenuUtil.requireSurname());
        }
        if (changeParams.contains("'age'")) {
            selectedStudent.setAge(MenuUtil.requireAge());
        }
        if (changeParams.contains("'classname'")) {
            selectedStudent.setName(MenuUtil.requireClassName());
        }
    }
}

