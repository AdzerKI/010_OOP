package Controllers;

import Models.SumCalcImpl;

public class InputStreamController {
    public static String checkInput(String request){
        if (!request.isEmpty()){
            int x, y;
            String response = "";

            // Сложение
            if (request.contains("+")){
                String[] parts = request.split("\\+");
                x = Integer.parseInt(parts[0].replaceAll("\\D", ""));
                y = Integer.parseInt(parts[1].replaceAll("\\D", ""));
                new SumCalcImpl();
            } else if (){

            }
            return response;
        }
        return "Ошибка ввода, повторите ввод.";
    }
}
