import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class Tester
{
    public static void main(String[] args)
    {
        try (Stream<String> lines = Files.lines(Paths.get("src/file.txt")))
        {
            lines.forEach(System.out::println);
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while trying to read the file.");
            e.printStackTrace();
        }
    }
}
