import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by RobertBarber on 4/15/16.
 */
public class ReadWriteJson {
    static File f = new File("mag.json");
    public static void write(Magazine m) throws IOException{
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(m);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }
    static boolean fExist() {
        return f.exists();
    }

    public static Magazine read() throws FileNotFoundException {
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        JsonParser parser = new JsonParser();
        Magazine ret = parser.parse(contents, Magazine.class);
        return ret;
    }
}
