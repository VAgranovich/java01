package ru.gb.vagranovich.homework5;

public class homework5 {

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("������ �.�.", "�������", "ivanov@mail.ru", "+79097864312", 150000, 30);
        emplArray[1] = new Employee("������ �.�.", "����������", "petrov@mail.ru", "+79067843311", 250000, 35);
        emplArray[2] = new Employee("������ �.�.", "��������", "jdanov@mail.ru", "+79107524325", 50000, 50);
        emplArray[3] = new Employee("����� �.�.", "������", "selyuk@mail.ru", "+79167234333", 10000, 20);
        emplArray[4] = new Employee("������� �.�.", "��������� ������", "sidorov@mail.ru", "+79167544316", 350000, 45);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40) {
                emplArray[i].showEmployee();
            }
        }
    }
}
