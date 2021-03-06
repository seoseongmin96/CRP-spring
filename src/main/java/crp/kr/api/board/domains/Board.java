package crp.kr.api.board.domains;




import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName : crp.kr.api.auth.domains
 * fileName : Board
 * author : SeongMinSeo
 * date : 2022-05-18
 * desc :
 * ============================================
 * DATE AUTHOR NOTE
 * ============================================
 * 2022-05-18 SeongMinSeo 최초 생성
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boardId;
    @Column private @NotNull
    String boardname;
    @Column(name = "created_date") @NotNull private String createdDate;

    @OneToMany(mappedBy = "board")
    List<Article> article = new ArrayList<>();

}
