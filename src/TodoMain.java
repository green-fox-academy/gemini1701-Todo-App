import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TodoMain {

    public static void main(String[] args) {

        cLMenu();
        todoMain();



    }

    public static void cLMenu(){

        try {
            Path filePath = Paths.get("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/menu.txt");
            List<String> lines = Files.readAllLines(filePath);

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        } catch (IOException e) {
            System.out.println("Unable to read file: menu.txt");
        }

    }

    public static void todoMain(){

        System.out.println("Choose an option!");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.matches("-l")) {

            try {
                Path filePath = Paths.get("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/todoList.txt");
                List<String> lines = Files.readAllLines(filePath);

                for (int i = 0; i < lines.size(); i++) {
                    System.out.println(lines.get(i));
                }

            } catch (IOException e) {
                System.out.println("Unable to read file: todoList.txt");
            }
        }else{
            System.out.println("Choose an option!");
        }
        }

        



    }


