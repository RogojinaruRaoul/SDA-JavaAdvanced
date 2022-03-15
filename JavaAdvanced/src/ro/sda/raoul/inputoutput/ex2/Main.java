package ro.sda.raoul.inputoutput.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("F:\\InputOutput\\Myfile.txt/");

        List<String> fileLines = Files.readAllLines(path);
        Map<String, Integer> map = new HashMap<>();

        for (String fileLine : fileLines) {
            String[] words = fileLine.split(" ");
            for (String word : words) {
                String newWord = word;
                if (word.contains("?")) {
                    map.putIfAbsent("?", 0);
                    int occurrences = map.get("?");
                    map.put("?", occurrences + 1);
                    newWord = newWord.replace("?", "");
                }
                map.putIfAbsent(newWord, 0);
                int occurrences = map.get(newWord);
                map.put(newWord, occurrences + 1);
            }
        }
        System.out.println(map);

        List<String> newFileContent = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newFileContent.add(entry.toString());
        }
        Files.write(path, newFileContent);
    }
}
