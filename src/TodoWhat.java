public class TodoWhat {

    private String name;

    private boolean completed;


    public TodoWhat(String name) {

        this.name = name;

    }

    public void complete() {

        this.completed = true;

    }

    @Override

    public String toString() {

        return (completed ? "[x] " : "[ ] ") + name;

    }

}
