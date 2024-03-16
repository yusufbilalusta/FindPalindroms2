import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {


    public static void main(String[] args) {
        File file = new File("src\\odev.txt.txt");
        Stack stack = new Stack();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(stack.ispalindrom(line)){
                    stack.push(line);
                }
            }
            stack.yazdir();
            stack.elemanSay();
            stack.SondakiNoduSil();
            stack.yazdir();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}