package crp.kr.api.security.domains;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * packageName : crp.kr.api.security.domains
 * fileName : Messenger
 * author : SeongMinSeo
 * date : 2022-05-23
 * desc :
 * ============================================
 * DATE AUTHOR NOTE
 * ============================================
 * 2022-05-23 SeongMinSeo 최초 생성
 */

@Getter
@Builder
public class Messenger {
    private String message, code;
    private int status;
}