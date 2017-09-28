import java.util.ArrayList;

public class Todo {

    private ArrayList<TodoWhat> whats;

    public Todo(){

        whats = new ArrayList<>();

    }

    public void add(TodoWhat what) {

        whats.add(what);

    }


    @Override

    public String toString() {

        String result = "";

        for(int i = 0; i < whats.size(); i++) {

            result += (i+1) + ". " + whats.get(i) + "\n";

        }

        return result;

    }

}
