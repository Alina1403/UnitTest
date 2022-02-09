package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вы хотите перевести нанометры в миллиметры или наоборот?");
        System.out.println("Введите мм, если из мм в нм, введите нм, если из нм в мм");
        Scanner i = new Scanner(System.in);
        String enter = i.nextLine();
        if (!isaBoolean(enter)){
            System.out.println("Неккоректные данные");
        }
        if (enter.equals("мм")){
            System.out.print("Введите количество мм, разделяя целую и дробную часть точкой: ");
            BigDecimal nanometres = new BigDecimal(i.nextLine());
            nanometres = nanometres.setScale(5, RoundingMode.DOWN);
            System.out.println("ММ: " + nanometres + " НМ: " + getMultiply(nanometres));
        } else{
            System.out.print("Введите количество нм, разделяя целую и дробную часть точкой: ");
            BigDecimal millimetres = new BigDecimal(i.nextLine());
            millimetres = millimetres.setScale(5, RoundingMode.DOWN);
            System.out.println("НМ: " + millimetres + " ММ: " +
                    getDivide(millimetres));
        }
    }

    public static boolean isaBoolean(String enter) {
        return enter.equals("мм") || enter.equals("нм");
    }

    public static BigDecimal getDivide(BigDecimal millimetres) {
        return millimetres.divide(BigDecimal.valueOf(1000000));
    }

    public static BigDecimal getMultiply(BigDecimal nanometres) {
        return nanometres.multiply(BigDecimal.valueOf(1000000));
    }
}