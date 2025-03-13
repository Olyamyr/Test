package lesson20;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;
    private String country;

    public Student(String name, int course, int age, String country) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name) && Objects.equals(country, student.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, country);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", country='" + country + '\'' +
                '}';
    }
}
