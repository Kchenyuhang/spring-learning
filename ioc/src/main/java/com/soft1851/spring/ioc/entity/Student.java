package com.soft1851.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class Student {
    private Integer id;
    private String name;
    private List<Phone> phones;
    private Map subjects;
    private List<String> hobbies;
    private Set axe;

    public Student(Integer id, String name, List<Phone> phones, List<String> hobbies, Map subjects, Set axe) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.axe = axe;
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

    public Map getSubjects() {
        return subjects;
    }

    public void setSubjects(Map subjects) {
        this.subjects = subjects;
    }

    public Set getAxe() {
        return axe;
    }

    public void setAxe(Set axe) {
        this.axe = axe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                ", subjects=" + subjects +
                ", hobbies=" + hobbies +
                ", axe=" + axe +
                '}';
    }
}
