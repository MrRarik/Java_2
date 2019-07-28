//Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.

        package DayOfWeekMain;

import static DayOfWeekMain.Day.*;

public class DayOfWeekMain {
    public static void main(String[] args) {
        int g;
        g = Sunday.getWorkingHours();

        if (g > 0) {
            System.out.println("До конца недели осталось: " + g);
        } else {
            System.out.println("Сегодня выходной");
        }

    }
}
