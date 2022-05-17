package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxMin {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MinMax{
        private int num1 = 3;
        private int num2 = 1;
        private int num3 = 9;
        private int num4 = 5;
        private int num5 = 10;





    @Override
    public String toString() {
        int arr[] = {3, 1, 9, 5, 10};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return null;
    }
    }
    interface MaxMinService{}
    public static class MaxMinServiceImpl implements MaxMinService{}

    @Test
    void maxminTest(){
        int[] intArr = {3,1,9,5,10};
        Integer maxValue = Arrays.stream(intArr).max().getAsInt();
        System.out.println();



    }
}
