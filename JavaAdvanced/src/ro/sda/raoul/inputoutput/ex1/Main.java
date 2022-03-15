package ro.sda.raoul.inputoutput.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\InputOutput\\Myfile.txt/");
        StringBuffer fileContent = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {

                fileContent.append(fileLine);
                fileContent.append("\n");
            }
        }
        String newFileContent= fileContent.toString().replace("Lala","Buna");

        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(newFileContent);

        }
    }
}
