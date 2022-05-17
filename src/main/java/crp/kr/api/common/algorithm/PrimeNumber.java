package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    static class Solution{
        int start, end;
        List<Integer> primes;

        @Override
        public String toString() {
            return String.format("시작점: %d, 도착점: %d");
        }
    }

    @FunctionalInterface
    private interface PrimeService{
        Solution solution(Solution solution);
    }
    @Test
    void testPrime(){

    }

}
