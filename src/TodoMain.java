import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class TodoMain {

    public static void main(String[] args) {

        cLMenu();

        System.out.println("Choose an option!");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Todo todo = new Todo();

        TodoWhat what = new TodoWhat("Walk the dog");
        TodoWhat what1 = new TodoWhat("Buy milk");
        TodoWhat what2 = new TodoWhat("Do homework");

        todo.add(what);
        todo.add(what1);
        todo.add(what2);

        if(input.matches("-l")) {
            System.out.println(todo);
        }


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

/*    public static void todoMain(){



        Todo todo = new Todo();

        TodoWhat what = new TodoWhat("Walk the dog");
        TodoWhat what1 = new TodoWhat("Buy milk");
        TodoWhat what2 = new TodoWhat("Do homework");

        todo.add(what);
        todo.add(what1);
        todo.add(what2);

        if(input=="-l") {
            System.out.println(todo);
        }
    } */

}
