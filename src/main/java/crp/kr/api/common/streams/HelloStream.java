package crp.kr.api.common.streams;

import crp.kr.api.common.dataStructure.AppleApp;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 한국어 안녕, 영어로 Hello
public class HelloStream {
    @Data
    public static class Hello{
        private String greeting, inLanguage;

        public Hello(Builder builder){
            this.greeting = builder.greeting;
            this.inLanguage = builder.inLanguage;
        }
        static public class Builder{
            private String greeting, inLanguage;
            public Builder greeting(String greeting){this.greeting=greeting; return this;}
            public Builder inLanguage(String inLanguage){this.inLanguage=inLanguage; return this;}
            public Hello build(){return new Hello (this);}
        }

        @Override
        public String toString() {
            return String.format(" 인사 : %s, %s", inLanguage,greeting);
        }
    }
    interface HelloService{
        Set<String> greet(String[] arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<String> greet(String[] arr) {
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("영어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test
    void helloTest(){
        String[] arr = {"한국어 안녕","영어 Hello"};
        HelloService s = new HelloServiceImpl();
        Set<String> s2 = s.greet(arr);
        s2.forEach(System.out::print);
    }
}
