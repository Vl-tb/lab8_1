package mail_types;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private static int numOfObj = 0;
    private int id;
    private String name;
    private Gender sex;
    private String mail;
    private int age;

    public Client(String name, Gender sex, int age){
        this.id = numOfObj;
        numOfObj++;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

