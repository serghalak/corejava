package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GolovachIO {

    public static void main(String[] args) {
        readFromInternet("http://www.google.com", "c://google.txt");
    }

    private static void readFromInternet(String stringUrl, String pathToWrite){
        try {
            URL url = new URL(stringUrl);
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            OutputStream os = new FileOutputStream(pathToWrite);
//            int readInt;
//            while((readInt = is.read()) != -1){
//                os.write(readInt);
//            }
            copy(is, os);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(InputStream src, OutputStream dst) {
        byte[] buff = new byte[64  * 1024];
        int readCount;
        try {
            while ((readCount = src.read(buff)) != -1) {
                dst.write(buff, 0, readCount);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
