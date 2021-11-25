package client;

import lombok.Getter;

@Getter
public class Client {
    private static int idCounter = 0;
    private int uniqueId;
    private Sex sex;
    private int age;
    private String name;
    private String email;

    public Client(String name, int age, Sex sex, String email) {
        this.uniqueId = idCounter;
        idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
