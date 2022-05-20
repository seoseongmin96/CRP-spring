package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface StadiumCustomRepository {
//    Stadium update(Stadium stadium);
}
@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
