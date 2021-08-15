package by.stormnet.volodko.lesson5.task2;

import by.stormnet.volodko.lesson5.task2.Chair;

public class Main {
    public static void main(String[] args) {

        Chair Chair = new Chair("kitchen");
        Chair.seat sidenie =Chair.new seat();
        Chair.legs nozhki =Chair.new legs();
        Chair.back spinka =Chair.new back();

        sidenie.up();
        spinka.backward();
        nozhki.legs();
    }
}
