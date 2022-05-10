package crp.kr.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class ItemCRUD {
    public static void main(String[] args) {

    }
    @Data
    @AllArgsConstructor
    class Item{
        private int id;
        private String name;
        private int price;

    }
    interface ItemService{

    }

    @RequiredArgsConstructor
    class ItemServiceImpl implements ItemService{

    }

}
