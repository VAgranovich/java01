package ru.gb.vagranovich.homework_2_1;

public class Cat implements Somebody {
    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean active;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.active = true;
    }

    @Override
    public String toString() {
        return "��� " + name;
    }

    @Override
    public boolean isActive() {
        return this.active;
    }

    @Override
    public void jump(Wall wall) {
        if (isActive()) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.println(this + " ����������� " + wall);
            } else {
                System.out.println(this + " �� ����������� " + wall);
                active = false;
            }

        }
    }

    @Override
    public void run(Track track) {
        if (isActive()) {
            if (runLimit >= track.getLength()) {
                System.out.println(this + " �������� " + track);
            } else {
                System.out.println(this + " �� �������� " + track);
                active = false;
            }

        }

    }
}
