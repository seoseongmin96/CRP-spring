package crp.kr.api.security.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import crp.kr.api.auth.domains.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName : crp.kr.api.security.domains
 * fileName : UserDetailsImpl
 * author : SeongMinSeo
 * date : 2022-05-23
 * desc :
 * ============================================
 * DATE AUTHOR NOTE
 * ============================================
 * 2022-05-23 SeongMinSeo 최초 생성
 */
@Getter
@RequiredArgsConstructor
public class UserDetailsImpl implements UserDetails {
     private final long userid;
     private final String username;
     @JsonIgnore private final String password;
     private final String name;
     private final String email;

    public static UserDetailsImpl build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                .collect(Collectors.toList());

        return new UserDetailsImpl(user.getUserId(),user.getUsername(), user.getPassword(),
                user.getName(), user.getEmail(), authorities);
    }

    private final Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}