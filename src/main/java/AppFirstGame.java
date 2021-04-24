public class AppFirstGame {

    public static void main(String[] args) {
        System.out.println("Hello World !");
        Login login = new Login("Tom","txt");
        login.writeInFiles("haha");
        FilesService.createFile("Tom_Lecommandoux.txt", "C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame");
        FilesService.createFile("TOM.txt", "C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame");

        FilesService.deleteFile("filename.txt");


        Student student = new Student("Tom", "Lecommandoux", "6ème 1");

        FilesServiceJSON.javaObjectToJson(student,"C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame");

        Student myStudent = FilesServiceJSON.jsonToJavaObject("C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame");

        System.out.println(student.toString()); // -> Student@dfd3711

        Student student2 = new Student(student.getFirstName(), student.getLastName(), student.getClasse());

        System.out.println(student2.toString()); // -> Student@dfd3711

        Student student3 = student2;

        System.out.println(student3.toString()); // -> Student@dfd3711

        student.setFirstName("Toto");
        student2.setLastName("Titi");

        System.out.println(student.getFirstName() + student.getLastName()); // -> TotoTiti TotoLecommandoux

        FilesService.writeInFile(student.toString(),"Tom_Lecommandoux.txt");
        FilesService.writeInFile(student.toString(),"TOM.txt");

        //filesService.readFile();
    }
}
