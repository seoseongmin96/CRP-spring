package crp.kr.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count " +
                    "8.existsById");
            switch (s.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                default:break;
            }
        }
    }
    @Data
    @AllArgsConstructor

    static class Member{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete();
        Member findById(String id);
        List<Member> findByName(String name);
        List<Member> findAll();
        int count();
        boolean existsById(String id);

    }

    static class MemberServiceImpl implements MemberService{
        private Map<String, Member> map;
        MemberServiceImpl(){
            map = new HashMap<>();
        }

        @Override public void save(Member member){ map.put(member.getUserid(), member);}

        @Override
        public void update(Member member) {

        }

        @Override
        public void delete() {

        }

        @Override
        public Member findById(String id) {
            return null;
        }

        @Override
        public List<Member> findByName(String name) {
            return null;
        }

        @Override
        public List<Member> findAll() {
            return null;
        }

        @Override
        public int count() {
            return 0;
        }

        @Override
        public boolean existsById(String id) {
            return false;
        }


    }
}


