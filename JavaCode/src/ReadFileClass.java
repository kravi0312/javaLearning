import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFileClass {
    public static void main(String arg[]) throws IOException {
        Path filepath = FileSystems.getDefault().getPath("","file.txt");
        List<String> lines = Files.readAllLines(filepath);
        for (int i=0 ; i<lines.size() ; i++)
        {
            System.out.println(lines.get(i));
        }
        //print line using for each
        lines.forEach((str)-> System.out.println(str));
    }
}
