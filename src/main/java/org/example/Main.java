package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("ivan", new ArrayList<>(), "Информатика");
        student1.getGrades().add(4.5);
        student1.getGrades().add(5.0);

        Student student2 = new Student("stas", new ArrayList<>(), "Информатика");
        student2.getGrades().add(2.5);
        student2.getGrades().add(4.0);

        Student student3 = new Student("vova", new ArrayList<>(), "Матеша");
        student3.getGrades().add(4.5);
        student3.getGrades().add(5.0);

        Student student4 = new Student("fil", new ArrayList<>(), "Информатика");
        student4.getGrades().add(4.5);
        student4.getGrades().add(4.5);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student4);
        students.add(student4);
        students.add(student4);
        students.add(student4);


        List<Student> list = students.stream().filter(x -> x.getAverageGrade() >= 4.5 && x.getSpeciality().equals("Информатика"))
                .limit(5).collect(Collectors.toList());


        print(list);

    }

    private static void print(List<Student> list) {
        list.stream().forEach(System.out::println);
    }
}