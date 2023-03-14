import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String request;

        // открываем сокет
        try (Socket socket = new Socket("localhost", 1234)) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                System.out.println("Введите строку: ");
                request = scanner.nextLine();

                // Если хотим завершить клиента пишем end
                if("end".equals(request))break;

                // отправляем на сервер
                dataOutputStream.writeUTF(request);
                // получаем данные с сервера и выводим
                System.out.println(dataInputStream.readUTF());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
