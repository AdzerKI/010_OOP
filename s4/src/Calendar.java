import java.util.List;

public class Calendar<T> {
    private List<Task> taskList;

    public Calendar(List<Task> taskList) {
        this.taskList = taskList;
    }
    
    public List<Task> getTaskList() {
        return taskList;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "taskList=" + taskList +
                '}';
    }

    // Добавляем задачу в лист задач
    public void addTask(Task task){
        if (checkTask(task.getExecutorId())) this.taskList.add(task);
        else System.out.println("У сотрудника более 3-х задач, задача не может быть назначена.");
    }

    // Проверяем, есть ли у сотрудника более 3-х задач, если есть то ошибка
    private boolean checkTask(int id){
        int count = 0;
        for (Task t: this.taskList) {
            if (t.getExecutorId() == id) count++;
            if (count > 2) return false;
        }
        return true;
    }
}
