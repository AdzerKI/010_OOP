public class Task {
    // AI
    private static long id;
    // Название
    private String name;
    // Описание
    private String description;
    // Длительность, миллисекунд
    private long duration;
    // Дедлайн, дата
    private String deadline;
    // Приоритет
    private Priority priority;
    // ответственный
    private String supervisor;
    // уведомление о дедлайне
    //private List<String> notification;
    // Автор задачи
    private Person taskAuthor;
    // исполнитель
    private Person executor;

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", deadline=" + deadline +
                ", priority=" + priority +
                ", supervisor='" + supervisor + '\'' +
                ", taskAuthor=" + taskAuthor +
                ", executor=" + executor +
                '}';
    }

    public Task(String name, String description, long duration, String deadline, Priority priority,
                String supervisor, /*List<String> notification,*/ Person taskAuthor, Person executor) {
        id += id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.deadline = deadline; // new SimpleDateFormat("dd.MM.yyyy hh:mm");
        this.priority = priority;
        this.supervisor = supervisor;
        //this.notification = notification;
        this.taskAuthor = taskAuthor;
        this.executor = executor;
    }

    public String getDeadline() {
        return deadline;
    }

    public Person getExecutor() {
        return executor;
    }

    public int getExecutorId() {
        return executor.getId();
    }
}