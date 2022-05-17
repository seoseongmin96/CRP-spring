package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class MaxMin {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        private int[] arr;
        private int max, min;
        @Override
        public String toString() {
            return String.format("최소값: %d, 최대값: %d", min, max);
        }
    }
    @FunctionalInterface private interface SolutionService {
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10};
        SolutionService f = e ->{
            int min = 10;
            for(int i : e.getArr()){
                if(i < min) min = i;
            }
            return Solution.builder().min(min).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }
}
