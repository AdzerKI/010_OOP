public class FrontendTask extends Task {
    // front task
    private boolean front;

    @Override
    public String toString() {
        return "FrontendTask{" +
                "front=" + front +
                "} " + super.toString();
    }

    public FrontendTask(String name, String description, long duration, String deadline, Priority priority,
                        String supervisor, /*List<String> notification,*/ Person taskAuthor, Person executor, boolean front) {
        super(name, description, duration, deadline, priority, supervisor, /*notification,*/ taskAuthor, executor);
        this.front = front;
    }
}
