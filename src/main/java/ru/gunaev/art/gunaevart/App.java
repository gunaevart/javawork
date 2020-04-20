package ru.gunaev.art.gunaevart;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSInputSource;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name = scanner.next();
        System.out.println("Введите телефон");
        int phone = scanner.nextInt();

        try {
            Dbmethods.addUserNew(name, phone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------");
        System.out.println("Запись " +name + " , " + phone + " Добавлена");
        System.out.println("---------------------------");

        try {
            Dbmethods.selectUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
