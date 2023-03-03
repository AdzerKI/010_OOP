/*С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом
и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

Например:
Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответственный... - параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события, например, приближение дедлайна.

Должен быть класс Календарь, в который можно добавлять Задачи.
*** При пересечении задач по времени - выводить сообщение пользователю.

**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи,
время добавления записи, дедлайн задачи, ФИО автора и др*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Добавляем работников
        Person techDir = new Person(1, "Иванов", "Иван", "Иванович", Position.CTO);
        Person designerTL = new Person(2, "Петров", "Иван", "Петрович", Position.DESIGN_TEAM_LEADER);
        Person designerDev = new Person(3, "Сидоров", "Федор", "Спиридонович", Position.DESIGN_DEVELOPER);
        Person frontendTL = new Person(4, "Ушаков", "Дмитрий", "Олегович", Position.FRONTEND_TEAM_LEADER);
        Person frontendDev = new Person(5, "Ивашов", "Юрий", "Васильевич", Position.FRONTEND_DEVELOPER);
        Person backendTL = new Person(6, "Клименко", "Игорь", "Сергеевич", Position.BACKEND_TEAM_LEADER);
        Person backendDev = new Person(7, "Жук", "Станислав", "Юрьевич", Position.BACKEND_DEVELOPER);

        // Добавляем задачи
        Calendar<DesignTask> calendarD = new Calendar<>(new ArrayList<>());
        Calendar<FrontendTask> calendarF = new Calendar<>(new ArrayList<>());
        Calendar<BackendTask> calendarB = new Calendar<>(new ArrayList<>());
        System.out.println(calendarB);
        System.out.println(calendarF);
        System.out.println(calendarD);

        calendarB.addTask(new Task("test", "Test task", 1234, "23.03.2023 09:00", Priority.LOW, "TL", backendTL, backendDev));
        calendarB.addTask(new Task("test2", "Test task", 1234, "23.03.2023 09:00", Priority.LOW, "TL", backendTL, backendDev));
        calendarB.addTask(new Task("test3", "Test task", 1234, "23.03.2023 09:00", Priority.LOW, "TL", backendTL, backendDev));
        calendarB.addTask(new Task("test4", "Test task", 1234, "23.03.2023 09:00", Priority.LOW, "TL", backendTL, backendDev));
        calendarB.addTask(new Task("test5", "Test task", 1234, "23.03.2023 09:00", Priority.LOW, "TL", backendTL, backendDev));

        System.out.println(calendarB);}
}
