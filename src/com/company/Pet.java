package com.company;

import com.company.Color;
import com.company.Shelter;

import java.util.Random;

public class Pet {
    int age;
    Color color;
    Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public Pet() {
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    private int  generateDefaultAge(){
        Random random = new Random();
        int rand = random.nextInt(100);
        return rand;


    }


    public String  getInfo() {
        return  " Pet  [" + " age = "+age+
                ", shelter =" + shelter.getName ()+ "  "+
                shelter.getAddress() +"COLOR"+color+ "  ]";

    }
    private  void  setAge (){
        this.age = generateDefaultAge();
    }


}






