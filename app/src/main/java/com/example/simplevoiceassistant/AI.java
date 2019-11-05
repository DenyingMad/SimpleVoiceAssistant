package com.example.simplevoiceassistant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AI {
    public static String getAnswer(String question){
        ArrayList<String> answer = new ArrayList<String>();
        question = question.toLowerCase();
        switch (question) {
            case "сколько времени":
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                String time = timeFormat.format(new Date());
                answer.add("Сейчас " + time);
                break;
            case "привет":
                answer.add("Что вас интересует?");
                break;
            case "как дела":
                answer.add("Всё впорядке, а ваша жизнь не рушится?");
                break;
//            case "какой сегодня день":
//                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//                String date = dateFormat.format(new Date());
//                answer.add("Сегодня " + date);
//                break;
            default:
                answer.add("Я вас не понимаю");
                break;
        }
        if (answer.size() > 0){
            return String.join(",", answer);
        }
        else return "Я не знаю ответа на этот вопрос";
    }


}
