package org.example.Exel;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class exel {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fileName;
        while (true) {

            System.out.println("Введите наименование файла");

            fileName = in.next();

            if (Objects.equals(fileName, "stop")) {
                System.out.println("Завершение работы");
                break;
            }

            try {
                new File("src/main/resources/Files/" + fileName + ".xlsx");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Excel файл успешно создан!");
        }

    }
}