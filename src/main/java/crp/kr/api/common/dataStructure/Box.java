package crp.kr.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component @Data @Lazy
public class Box<T> {
    private final ArrayList<T> list;

    // save, update, delete, findAll, findByName, findById, count,existsById, clear
    // add, replace, remove, get(), get(i), X, clear

    public Box(){this.list = new ArrayList<>();}
    public void add(T t){list.add(t);}
    public void set(int i ,T t){list.set(i,t);}
    public void remove(T t){list.remove(t);}
    public Object[] findAll(){return list.toArray();}
    public T findById(int i){return list.get(i);}
    public int count(){return list.size();}
    public void clear(){list.clear();}

}
