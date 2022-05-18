package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CheckSameArray {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Solution{
        private int[] arr1 = {1,3,2};
        private int[] arr2 = {2,3,1};

        @Override
        public String toString() {
            return String.format("",arr1,arr2);
        }
    }

    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void test(){}
}
