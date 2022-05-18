package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateElementsArray {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Solution{
        private int [] arr = {5,10,9,27,2,8,10,4,27,1};
    }

    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void test(){}
}
