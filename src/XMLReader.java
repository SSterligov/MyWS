import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class XMLReader {
    public static String read(String bodyPath){
        StringBuilder result = new StringBuilder();
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(bodyPath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String line: lines){
            result.append(line).append(System.lineSeparator());
        }
        return result.toString();
    }
}
