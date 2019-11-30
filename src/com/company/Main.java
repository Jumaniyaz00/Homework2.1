package com.company;


public class Main {


    public static void main(String[] args){
        Dog dog=new Dog("dog1", "alabay", Color.WHITE, new Shelter("zoo", " alla archa"));
        dog.setAge(8);
        dog.setCommand(" Вставай");
        System.out.println(dog.getInfo());

        Dog dog2 = new Dog(Color.BLACK, new Shelter("dog2", "bishkek park"),"dog 2", "apchalka", "Отур ");
        dog2.setAge(21);
        System.out.println(dog2.getInfo());

        Dog dog3 = new Dog();
        dog3.setAge(12);
        dog3.setCommand(" иди ");
        dog3.setBreed(" pitbul");
        dog3.setName("dog3");
        dog3.setColor(Color.BROWN);
        dog3.setShelter(new Shelter("dog3", " cosmopark"));
        System.out.println(dog3.getInfo());

        dog3.makeVoice();
        dog3.makeVoice(3);
        dog3.makeVoice("alo", 6);

    }

}
