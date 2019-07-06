package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Integer height = 0;
    private Integer weight = 0;
    private String favoriteFood = "any";
    private Integer annualSalary = 0;
    private String sex = "male";

    public Person() {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.name = name;
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.age = Integer.MAX_VALUE;
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return null;
    }

    public Integer getAge() {

        return null;
    }
    public Integer getHeight(){

        return height;
    }

    public void setHeight(Integer height){

        this.height = height;
    }

    public void setWeight(Integer weight){

        this.weight = weight;
    }

    public Integer getWeight(){

        return weight;
    }

    public void setFavoriteFood(String favoriteFood){

        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood(){

        return favoriteFood;
    }

    public void setAnnualSalary(Integer annualSalary){

        this.annualSalary = annualSalary;
    }

    public Integer getAnnualSalary(){

        return annualSalary;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){

        return sex;
    }

}
