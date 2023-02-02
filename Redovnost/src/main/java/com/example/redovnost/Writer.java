package com.example.redovnost;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Writer {
    static BufferedWriter writer;       //Trebashe JavaScript da naucham namesto ovie gluposti

    static {
        try {
            writer = new BufferedWriter(new FileWriter("D:\\Java\\Redovnost\\Redovnost\\src\\main\\java\\com\\example\\redovnost\\redovnost"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Writer() throws IOException {
    }

    public static void writerPrva() throws IOException {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);


        if(date.getDayOfWeek()== DayOfWeek.WEDNESDAY || date.getDayOfWeek()== DayOfWeek.SATURDAY)
            writer.append(formattedDate).append(" 09:00-16:00\n");
        else
            writer.append(formattedDate).append(" 09:00-15:30\n");
    }

    public static void writerVtora() throws IOException {

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);

        if(date.getDayOfWeek()== DayOfWeek.WEDNESDAY || date.getDayOfWeek()== DayOfWeek.SATURDAY)
            writer.append(formattedDate).append(" 14:00-21:00\n");
        else
            writer.append(formattedDate).append(" 14:30-21:00\n");
    }
}
