package ru.netology.sqr;

public class SQRService {
    public int calcSQRNumber(int lowerLimit, int upperLimit) {
        int number = 0;
        for (int i = 1; i <= upperLimit; i++) {
            //пример с двумя последовательными операторами if для двух условий
            //if (i * i >= lowerLimit) {
            //    if (i * i <= upperLimit) {
            //        number = number + 1;
            //    }
            //пример с использованием &- И/AND (или |, если нужно ИЛИ/OR)
            if (i * i >= lowerLimit & i * i <= upperLimit) {
                number = number + 1;
            }
        }
        return number;
    }
}

