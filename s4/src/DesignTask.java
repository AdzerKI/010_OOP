public class DesignTask extends Task {
    // тип планшета для рисования
    private String drawingTablet;
    //...

    @Override
    public String toString() {
        return "DesignTask{" +
                "drawingTablet='" + drawingTablet + '\'' +
                "} " + super.toString();
    }

    public DesignTask(String name, String description, long duration, String deadline, Priority priority,
                      String supervisor, /*List<String> notification,*/ Person taskAuthor, Person executor,
                      String drawingTablet) {
        super(name, description, duration, deadline, priority, supervisor, /*notification,*/ taskAuthor, executor);
        this.drawingTablet = drawingTablet;
    }

    public String getDrawingTablet() {
        return drawingTablet;
    }

    public void setDrawingTablet(String drawingTablet) {
        this.drawingTablet = drawingTablet;
    }
}
