package org.example;

import org.example.proxy_pattern.BusinessObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
//        Proxy pattern
//        BusinessObject businessObject = BusinessObject.create();
//        businessObject.sayHi();

        try {
            OutputStream os = new FileOutputStream("test.txt");
            writeSomeContentToAnOutputStream(os);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeSomeContentToAnOutputStream(OutputStream os) throws IOException {
        String someContent = "This is a test";
        os.write(someContent.getBytes(Charset.forName("UTF-8")));
    }
}