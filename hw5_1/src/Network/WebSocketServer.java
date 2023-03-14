package Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static Controllers.InputStreamController.checkInput;

public class WebSocketServer {
    public static void start(){
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем подключения.");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();

                dataOutputStream.writeUTF(checkInput(clientRequest));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
