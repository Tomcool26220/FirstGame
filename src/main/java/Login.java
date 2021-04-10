import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Login {

    private String message;
    private String fileName;
    private String fileType;

    public Login(String fileName,String fileType) {
        this.fileName = fileName;
        try {
            File myObj = new File(fileName + "." + fileType);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void writeInFiles(String message){
        this.message = message;
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(message);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}












}
