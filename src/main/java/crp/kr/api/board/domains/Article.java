package crp.kr.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
@Data
public class Article {
    @Id Long id;
    private String projects;
    private String startData;
    private String status;
    private String team;
    private String progress;
    private String action;


}
