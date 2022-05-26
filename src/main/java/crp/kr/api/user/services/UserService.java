package crp.kr.api.user.services;

import crp.kr.api.auth.domains.Messenger;
import crp.kr.api.user.domains.User;
import crp.kr.api.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;


public interface UserService {

    UserDTO login(UserDTO user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger update(User user);

    Messenger delete(User user);

    Messenger save(UserDTO user);

    Optional<User> findById(String userid);

    Messenger existsById(String userid);

    // custom

    List<User> findByUserName(String name);


    Messenger logout();
}
