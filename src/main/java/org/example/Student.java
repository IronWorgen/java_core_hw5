package org.example;

import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String speciality;

    public Student(String name, List<Double> grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.speciality = speciality;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double getAverageGrade(){
        double gradesSum  = grades.stream().mapToDouble(x->x).sum();

        return gradesSum/grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
