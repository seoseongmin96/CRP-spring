package crp.kr.api.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// 키(height) , 몸무게 ( weight ) , 생년월일ssn ( 900101-1 ) , id는 없다.
public class BmiList {
    public static void main(String[] args) {

    }
    @Data static class Bmi{
        private double height, weight;
        private String ssn;
    }
    interface BmiService{
        void save(Bmi bmi);
        void update(int i, Bmi bmi);
        void delete(Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findByGender(String gender);
        Bmi findById(int i);
        int count();
    }
    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> list;
        public BmiServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Bmi bmi) {
            list.add(bmi);
        }

        @Override
        public void update(int i, Bmi bmi) {
            list.set(i,bmi);
        }

        @Override
        public void delete(Bmi bmi) {
            list.remove(bmi);
        }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public Bmi findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }
    }
}
