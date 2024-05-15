import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
class GFG {
    public static void main(String[] args)
    {
 
        // File name specified
        File obj = new File("myfile.txt");
          System.out.println("File Created!");
          try {
            File Obj = new File("myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter Writer
                = new FileWriter("myfile.txt");
            Writer.write(
                "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        File Obj = new File("myfile.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                               + Obj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
    }
}