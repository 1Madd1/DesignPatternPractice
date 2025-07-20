package org.example;

import org.example.decorator_pattern.BorderDecorator;
import org.example.decorator_pattern.GraphicalComponent;
import org.example.decorator_pattern.TextField;
import org.example.proxy_pattern.BusinessObject;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {
//        Proxy pattern
//        BusinessObject businessObject = BusinessObject.create();
//        businessObject.sayHi();

//        Decorator pattern
//        try {
//            OutputStream os = new FileOutputStream("test.zip");
//            os = new GZIPOutputStream(os); // Acts as a decorator
//            writeSomeContentToAnOutputStream(os);
//            os.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        GraphicalComponent tf = construct2LineHCAndersenPoem();
        tf = new BorderDecorator(tf);
        tf.paint();
    }

    public static GraphicalComponent constructHCAndersenPoem() {
//        Try with dynamic proxy/AspectJ
        GraphicalComponent tf = new TextField();
        tf = tf.addContent("To move, to breathe, to fly, to float,");
        tf = tf.addContent("To gain all while you give,");
        tf = tf.addContent("To roam the roads of lands remote,");
        tf = tf.addContent("To travel is to live.");
        tf = tf.addContent("-- H.C Andersen Poem --");
        return tf;
    }

    public static GraphicalComponent construct2LineHCAndersenPoem() {
        GraphicalComponent tf = new TextField();
        tf = tf.addContent("To move, to breathe, to fly, to float,");
        tf = tf.addContent("To gain all while you give,");
        return tf;
    }

//    public static void writeSomeContentToAnOutputStream(OutputStream os) throws IOException {
//        String someContent = "This is a test";
//        os = new BufferedOutputStream(os);
//        os.write(someContent.getBytes(Charset.forName("UTF-8")));
//    }
}