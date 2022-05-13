package crp.kr.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component @Data @Lazy
public class Box<K,V> {
    private HashMap<K, V> map;

    public Box() {
        this.map = new HashMap<>();
    }
    public void put(K k , V v){map.put(k , v);}
    public void replace(K k , V v){map.replace(k ,v);}
    public void remove(K k , V v){map.remove(k , v);}
    public List<V> values(){return map.values().stream().collect(Collectors.toList());}
    public V get(String id){return map.get(id);}
    public int size(){return map.size();}
    public void clear(){map.clear();}
}






