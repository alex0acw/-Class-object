package model;

public class Student {
    Integer age;
    String name;
    Gender gender;
    String ID;

    public Student() {
        this.age = 10;
        this.name = "dummy student";
        this.ID = "00001";
        this.gender = Gender.OTHER;
    }

    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }
}
