/*Создать телефонный справочник с возможностью импорта и экспорта данных
в нескольких форматах (txt, csv, xml, json)
под форматами понимаем структуру файлов, например: в файле на одной строке хранится одна часть записи,
пустая строка - разделитель

**Сделать клиент серверную версию, чтобы клиент вводил данные для справочника в консоль.*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        SelectDb.txt(Config.PATH_TO_DB + "\\phonebook.txt", pb);
        /*PhoneBook pb2 = new PhoneBook();
        PhoneBook pb3 = new PhoneBook();

        SelectDb.txt(Config.PATH_TO_DB + "\\phonebook.txt", pb);
        SelectDb.csv(Config.PATH_TO_DB + "\\phonebook.csv", pb2);
        SelectDb.json(Config.PATH_TO_DB + "\\phonebook.json", pb3);

        System.out.println(pb);
        UpdateDb.addTxt(Config.PATH_TO_DB + "\\phonebook.txt", "4 Федоров Кузьма Ильич 8-555-5-555-5-55");


        System.out.println(pb);
        System.out.println(pb2);
        System.out.println(pb3);*/

        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен");

            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                switch (clientRequest){
                    case "1":
                        dataOutputStream.writeUTF("Список контактов: \n" + pb);
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        dataOutputStream.writeUTF("Введите ID: ");
                        break;
                    case "end":
                        break;
                }
                /*if("end".equals(clientRequest)) break;
                System.out.println("Клиент->Сервер: " + clientRequest);
                dataOutputStream.writeUTF("Ответ от сервера клиенту: " + clientRequest);*/
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
