public class AppFirstGame {

    public static void main(String[] args) {
        System.out.println("Hello World !");
        Login login = new Login("Tom","txt");
        login.writeInFiles("haha");


        FilesService.createFile("TOM.txt", "C:\\Users\\tlegu\\Desktop\\Java\\Cours\\FirstGame");

        FilesService.deleteFile("filename.txt");

        FilesService.writeInFile("Salut","TOM.txt");

        //filesService.readFile();





    }
}
