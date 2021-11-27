package homework_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class AplicationAnnotation {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        getAnnotation(Person.class,file);
    }



    public static void getAnnotation(Class<?> classes , File file) throws IOException {
        Field[] fields = classes.getDeclaredFields();
        FileWriter fr = new FileWriter(file);
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            if (field.getAnnotation(PersonAnnotation.class) instanceof PersonAnnotation){
                String a =field.getName();
                fr.write(" "+a);
                System.out.println(field.getName());

            }
        }
        fr.close();
    }
}
