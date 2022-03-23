package io;


import java.io.File;

public class IO {

    public static void main(String[] args) {
        infoFileDir("c:/work/exadel/catalog/");
    }

    private static void infoFileDir(String path) {

        File file = new File(path);
        String[] list = file.list((dir, name) -> name.contains("."));

        for (int i = 0; i < list.length; i++) {
            File file1 = new File(path + list[i]);
            if (file1.isFile()) {
                System.out.println(file1.getAbsolutePath() + " is file");
            } else {
                System.out.println(file1.getAbsolutePath() + " is directory");
            }
        }

    }
}
