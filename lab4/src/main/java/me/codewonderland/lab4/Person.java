package me.codewonderland.lab4;

/**
 * Created by aliceeaster on 2/9/17.
 */
public class Person {

    private String name;
    private String phone;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        // Step 5: Ensure the name longer than two letters
        if (newName.length() > 2) {
            name = newName;
        }
    }

    // Step 3: Put remaining getters and setters here

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 14) {
            this.phone = phone;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}