package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    //@CsvSource({
    //        "6,10,99",
    //        "8,9,100",
    //        "3,200,300"
    //})
    @CsvFileSource(files = "src/test/resources/inputDataForTest.csv")
    public void testSQRNumber(int expected, int lowerRange, int upperRange) {
        SQRService service = new SQRService();
        int actual = service.calcSQRNumber(lowerRange, upperRange);
        Assertions.assertEquals(expected, actual);
    }
}
