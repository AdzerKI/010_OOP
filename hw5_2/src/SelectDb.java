import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectDb {

    // Получаем данные из файла txt
    public static void txt(String file, PhoneBook phoneBook){
        selectFrom(file, phoneBook, " ");
    }

    // Получаем данные из файла txt
    public static void csv(String file, PhoneBook phoneBook){
        selectFrom(file, phoneBook, ",");
    }

    // Получаем готовые строки из данных json
    public static void json(String file, PhoneBook phoneBook) {
        JSONArray jsonArray = new JSONArray(fileToString(file));

        // Перебираем массив json
        for (int i = 0; i < jsonArray.length(); i++) {
            String id = jsonArray.getJSONObject(i).getString("id");
            String lastName = jsonArray.getJSONObject(i).getString("фамилия");
            String firstName = jsonArray.getJSONObject(i).getString("имя");
            String patronymic = jsonArray.getJSONObject(i).getString("отчество");
            List<String> phone = parsePhones(jsonArray.getJSONObject(i).getString("телефон"));

            phoneBook.addContact(new Contact(Integer.parseInt(id),lastName,firstName,patronymic, phone));
        }
    }

    static String fileToString(String file) {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            return sb.toString().replace("\r\n", "");
        } catch (IOException ignored) {
        }

        return null;
    }

    private static void selectFrom(String file, PhoneBook phoneBook, String split){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            // Парсим файл построчно
            while ( (line  = br.readLine() ) != null) {
                // Разбиваем строку по пробелу
                String[] arr_line = line.split(split);

                // Кладем контакт в книгу
                phoneBook.addContact(new Contact(Integer.parseInt(arr_line[0]),arr_line[1],arr_line[2],arr_line[3], parsePhones(arr_line[4])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Парсим список телефонных номеров
    private static List<String> parsePhones(String str){
        String[] arr_phone = str.split(";");

        return new ArrayList<>(Arrays.asList(arr_phone));
    }
}
