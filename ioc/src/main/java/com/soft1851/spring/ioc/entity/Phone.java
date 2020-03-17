package com.soft1851.spring.ioc.entity;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class Phone {
    private String name;
    private Double price;

    public Phone(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
