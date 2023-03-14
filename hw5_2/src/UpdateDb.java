import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateDb {

    public static void addTxt(String file, String string) {
        writeToFile(file, string);
    }

    public static void addCsv(){

    }

    public static void addJson(){

    }

    // Запись в файл
    private static void writeToFile(String file, String string){

        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(string);
        } catch (IOException ignored) {
        }
    }

}
