package ru.gb.vagranovich.homework_2_1;

public class Wall implements Barrier {
    private final int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Somebody somebody) {
        somebody.jump(this);
    }

    @Override
    public String toString() {
        return "Стена " +
                height +
                " метров";
    }
}
