package com.itheima.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Demo04Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList();
        list.add(new Person("nico",31));
        list.add(new Person("ruirui",25));
        list.add(new Person("tiantian",2));
        list.add(new Person("mama",355));
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("famaly.txt"));
        os.writeObject(list);
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("famaly.txt"));
        Object obj = oi.readObject();
        ArrayList<Person> p = (ArrayList<Person>)obj;
        for(Person pe:p){
            System.out.println(pe);
            System.out.println(pe.getAge());
            System.out.println(pe.getName());
        }
        os.close();
        oi.close();

    }
}
