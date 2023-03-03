public class BackendTask extends Task {
    // core task
    private boolean core;
    // ...

    @Override
    public String toString() {
        return "BackendTask{" +
                "core=" + core +
                "} " + super.toString();
    }

    public BackendTask(String name, String description, long duration, String deadline, Priority priority,
                       String supervisor, /*List<String> notification,*/ Person taskAuthor, Person executor, boolean core) {
        super(name, description, duration, deadline, priority, supervisor, /*notification,*/ taskAuthor, executor);
        this.core = core;
    }
}
