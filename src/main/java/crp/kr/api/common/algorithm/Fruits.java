package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class Fruits {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class Solution{
        private int total, apple,grape, orange;
        private String result;

        @Override
        public String toString() {
            return String.format("A배열과 B배열은 %s 배열입니다",result);
        }
    }

     @FunctionalInterface private interface ISolution{
        Fruits.Solution solution(Fruits.Solution s);
    }
    @Test
    void test(){}
}
