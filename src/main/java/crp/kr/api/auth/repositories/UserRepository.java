package crp.kr.api.auth.repositories;

import crp.kr.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    String login(User user);

    void update(User user);
}
