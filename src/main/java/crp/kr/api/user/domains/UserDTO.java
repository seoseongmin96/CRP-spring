package crp.kr.api.user.domains;

import crp.kr.api.user.domains.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * packageName : crp.kr.api.auth.domains
 * fileName : UserDto
 * author : SeongMinSeo
 * date : 2022-05-24
 * desc :
 * ============================================
 * DATE AUTHOR NOTE
 * ============================================
 * 2022-05-24 SeongMinSeo 최초 생성
 */
@Component
@Data
public class UserDTO {
    @ApiModelProperty(position = 0) private long userId;
    @ApiModelProperty(position = 1) String username;
    @ApiModelProperty(position = 2) String password;
    @ApiModelProperty(position = 3) String name;
    @ApiModelProperty(position = 4) String email;
    @ApiModelProperty(position = 5) private String regDate;
    @ApiModelProperty(position = 6) private String token;
    @ApiModelProperty(position = 7) private List<Role> roles;

}