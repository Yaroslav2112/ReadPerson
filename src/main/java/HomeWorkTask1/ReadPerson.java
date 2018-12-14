package HomeWorkTask1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream
                ("/home/yaroslav/IdeaProjects/Lesson10/src/main/resources/Person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();
        System.out.println(person1);
        System.out.println(person2);
        ois.close();
    }
}
