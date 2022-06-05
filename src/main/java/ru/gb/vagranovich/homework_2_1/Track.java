package ru.gb.vagranovich.homework_2_1;

public class Track implements Barrier {
    private final int length;

    public int getLength() {
        return length;
    }

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Somebody somebody) {
    somebody.run(this);
    }

    @Override
    public String toString() {
        return "Дорожка " +
                length +
                "метров";
    }
}
