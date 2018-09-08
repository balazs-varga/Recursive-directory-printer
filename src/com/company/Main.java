package com.company;

import java.io.File;

public class Main {

    static void RecursiveDirectoryPrinter(File[] array, int index, int dirIndent)
    {
        String dirIntend = " ";

        if(index == array.length)
            return;

        if(array[index].isDirectory())
        {
            System.out.println(dirIntend + "[" + array[index].getName() + "]");

            RecursiveDirectoryPrinter(array[index].listFiles(), 0, dirIndent + 1);
        }

        RecursiveDirectoryPrinter(array, ++index, dirIndent);
    }

    public static void main(String[] args) {
    }
}
