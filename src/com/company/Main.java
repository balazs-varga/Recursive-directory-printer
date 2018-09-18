package com.company;

import java.io.File;

public class Main {

    static void RecursiveDirectoryPrinter(File[] array, int index, int dirIndent)
    {
        String dirIntend = getIntend(dirIndent);

        if (index == array.length) {
            return;
        }

        if (array[index].isDirectory())
        {
            System.out.println(dirIntend + "[" + array[index].getName() + "]");

            RecursiveDirectoryPrinter(array[index].listFiles(), 0, dirIndent + 1);
        }

        RecursiveDirectoryPrinter(array, ++index, dirIndent);
    }

    private static String getIntend(int intend) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < intend; i++) {
            stringBuilder.append(" |--");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String mainDirectoryPath = "/Users/balazsvarga/JavaCodes/Recursive-directory-printer";

        File mainDirectory = new File(mainDirectoryPath);

        if (mainDirectory.exists() && mainDirectory.isDirectory())
        {
            File array[] = mainDirectory.listFiles();

            RecursiveDirectoryPrinter(array, 0, 0);
        }
    }
}
