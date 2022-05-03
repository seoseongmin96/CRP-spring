package crp.kr.api.domains;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Component
public class User {

    private String userid;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String birth;
    private String address;
}
