package me.codewonderland.lab4;

/**
 * Created by aliceeaster on 2/9/17.
 */
public class Contacts {
    public static void main(String[] args) {

        Person sam = new Person();
        sam.setName("Sam Clemens");
        sam.setPhone("(212) 555-4723");
        sam.setAge(35);

        Person charles = new Person();
        charles.setName("Charles Dodgson");
        charles.setPhone("(212) 555-8492");
        charles.setAge(62);

        // Death and destruction
        sam.setName("");
        sam.setPhone("(212) 555-55555");
        sam.setAge(-100);

        charles.setName("pu");
        charles.setPhone("(212) 555-555");
        charles.setAge(0);

        System.out.println("------Contacts------");
        System.out.println();
        System.out.println(sam.getName());
        System.out.format("Tel: %s\n", sam.getPhone());
        System.out.format("Age: %d\n", sam.getAge());
        System.out.println();
        System.out.println(charles.getName());
        System.out.format("Tel: %s\n", charles.getPhone());
        System.out.format("Age: %d\n", charles.getAge());

    }
}