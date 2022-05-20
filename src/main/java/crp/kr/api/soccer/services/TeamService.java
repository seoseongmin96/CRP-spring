package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findAll();
    List<Team> findAll(Sort sort);
    Page<Team> findAll(Pageable pageable);

    long count();

    String delete(Team team);

    String save(Team team);


    Optional<Team> findById(String teamid);

    boolean existsById(String teamid);

    String update(Team team);
}
