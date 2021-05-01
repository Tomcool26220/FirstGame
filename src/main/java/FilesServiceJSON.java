import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


/**
 * TO COMMENT -> CTR+MAJ+:
 * TO OPTIMIZE IMPORTS -> CTRL+ALT+o
 * TO OPTIMIZE INDENTATION -> CTRL+ALT+l
 */
public class FilesServiceJSON {

    public static void javaObjectToJson(Object myObject, String path, String fileName) {

        ObjectMapper mapper = new ObjectMapper();
        // Java object to JSON file
        try {
            mapper.writeValue(new File(path, fileName), myObject);
            // Java object to JSON string, default compact-print
            String jsonString = mapper.writeValueAsString(myObject);
            System.out.println(jsonString);
            // pretty-print
            String jsonString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myObject);
            System.out.println(jsonString2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T jsonToJavaObject(String path, Class<T> myClass) {

        ObjectMapper mapper = new ObjectMapper();

        //JSON file to Java object
        try {

            Object obj = mapper.readValue(new File(path), myClass);

            System.out.println(obj.getClass());

            return myClass.cast(obj);

     /*       if (obj.getClass().equals(Student.class)) {
                Student student = (Student) obj;
                student.setClasse("6ème2");

                System.out.println(student);

                return student;
            }
            else if (obj.getClass().equals(Voiture.class)) {
                Student student = (Student) obj;
                student.setClasse("6ème2");
            }*/


        /*    Student student = (Student) mapper.readValue(new File("C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame\\src\\Tom_Lecommandoux.json"), object);

            //JSON string to Java Object
            Object obj3 = mapper.readValue("{'firstName': 'Toto', 'lastName': 'Lecommandoux', 'classe': '6ème1'}", object);*/


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

