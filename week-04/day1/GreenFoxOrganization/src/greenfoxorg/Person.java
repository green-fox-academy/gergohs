package greenfoxorg;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String gender;

    public void introduce() {
        System.out.println(("Hi, i'm " + name + ", a " + age + " year old " + gender));
    }

    public void getGoal() {
        System.out.println("My goal is: live for the moment!");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }




    }



