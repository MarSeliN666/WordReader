package Main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("FileToRead.txt");
        List<String> lines = Files.readAllLines(Paths.get(String.valueOf(file)), StandardCharsets.UTF_8);
        String s = lines.toString();
        StringTokenizer st = new StringTokenizer(s, " \n\r");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
