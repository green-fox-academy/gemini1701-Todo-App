import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoMain {

    public static void main(String[] args) {

        cLMenu();

        System.out.println("Choose an option!");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.matches("-l")) {
            todoMain();
        }
        if (input.matches("-a")) {
            todoAdd();
        }
        if (input.matches("-r")) {
            todoRem();
        }


    }

    public static void cLMenu() {

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

    public static void todoMain() {

        try {
            Path filePath = Paths.get("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/todoList.txt");
            List<String> lines = Files.readAllLines(filePath);


            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        } catch (IOException e) {
            System.out.println("Unable to read file: todoList.txt");
        }

    }


    public static void todoAdd() {

        System.out.println("Add a task for the list!");
        Scanner scTask = new Scanner(System.in);
        String inputAdd = scTask.next();

        Path myPath = Paths.get("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/todoList.txt");
        List<String> newList = new ArrayList<>();
        newList.add(inputAdd);
        try {
            Files.write(myPath, newList, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write file: todoList.txt");
        }
    }

    public static void todoRem() {

        System.out.println("Remove a task from the list!");
        Scanner scTask = new Scanner(System.in);
        String inputRem = scTask.next();

        try {
            File inputFile = new File("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/todoList.txt");
            File outputFile = new File("C:/Users/Gemini006/greenfox/gemini1701-Todo-App/src/todoList.txt");

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    if (!line.equals(inputRem)) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            if (inputFile.delete()) {
                // Rename the output file to the input file
                if (!outputFile.renameTo(inputFile)) {
                    throw new IOException("Could not rename the file");
                }
            } else {
                throw new IOException("Could not delete original input file ");
            }
        } catch (IOException ex) {
            // Handle any exceptions
            ex.printStackTrace();


        }

    }
}


