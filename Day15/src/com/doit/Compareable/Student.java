package com.doit.Compareable;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> ,Comparator<Student>{
    String id;
    double score;

    public Student() {
    }

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score==o.score){
            return this.id.compareTo(o.id);
        }
        return Double.compare(this.score,o.score);

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';

    }



    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.score, o1.score);
    }
}
