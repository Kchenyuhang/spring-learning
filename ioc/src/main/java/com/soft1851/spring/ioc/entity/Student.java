package com.soft1851.spring.ioc.entity;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class Student {
    private Integer id;
    private String name;
    private List<Phone> phones;
    private List<String> hobbies;

    public Student(Integer id, String name, List<Phone> phones, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.hobbies = hobbies;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", hobbies=" + hobbies +
                '}';
    }
}
