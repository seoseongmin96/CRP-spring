package crp.kr.api.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Person {
        private String name, ssn;




    @Override
    public String toString() {
        String num= ssn.substring(7);
        String gender="";
        switch (num){
            case "1" : case "3":
                gender= "남성";
                break;
            case "2" : case "4":
                gender= "여성";
                break;
        }
        
        return String.format("이름: %s, 성별: %s", "나이 : %s",name,gender);
    }
}
    // 기능: 회원검색

    interface PersonService{
        List<Person> search(List<Person> arr);
    }
    static class PersonServiceImpl implements PersonService{
        @Override
        public List<Person> search(List<Person> list) {
            return list
                    .stream()
                    .filter(e -> e.getName().equals("유관순"))
                    .collect(Collectors.toList());
        }
    }
    @Test
    void personStreamTest(){

        List<Person> list = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("848928-4").build()
        );
        new PersonServiceImpl()
                .search(list)
                .forEach(System.out::print);
        // "홍길동", "900120-1"
        // "김유신", "970620-1"
        // "유관순", "848928-4"
        // 남성, 여성, 나이 판단 로직

    }
}

