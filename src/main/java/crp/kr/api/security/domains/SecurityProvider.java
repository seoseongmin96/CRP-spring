package crp.kr.api.security.domains;

import crp.kr.api.auth.domains.Role;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

/**
 * packageName : crp.kr.api.security.domains
 * fileName : SecurityProvider
 * author : SeongMinSeo
 * date : 2022-05-23
 * desc :
 * ============================================
 * DATE AUTHOR NOTE
 * ============================================
 * 2022-05-23 SeongMinSeo 최초 생성
 */
@Component
@RequiredArgsConstructor
@Log
public class SecurityProvider implements AuthenticationProvider {
    private final UserDetailsServiceImpl service;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securityKey;

    @Value("${security.jwt.token.expiration-length: 3600000}")
    private long validityInMs = 3600000; // 1h

    @PostConstruct
    protected void init(){
        securityKey = Base64.getEncoder().encodeToString(securityKey.getBytes());
        log.info("securityKey: "+securityKey);
    }

    public String createToken(String username, List<Role> roles){
        return "";
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}