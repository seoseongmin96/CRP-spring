package crp.kr.api.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName : crp.kr.api.auth.domains
 * fileName : Article
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
@Table(name="articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue
    private long articleId;

    @Column @NotNull
    private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;
}