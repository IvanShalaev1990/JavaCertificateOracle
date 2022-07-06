package ua.com.javacertificateoracle.lesson22;

import javax.sound.midi.Soundbank;

public abstract class Bird extends Animal implements Speakable{
    public Bird(String name){
        super(name);
    }
    public abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + "sings");
    }
}
