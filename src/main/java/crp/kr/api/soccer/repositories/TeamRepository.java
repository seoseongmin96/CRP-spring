package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

interface TeamCustomRepository{
//    void update(Team team);
    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
    @Query(value = "SELECT TEAM_NAME FROM ORDER BY TEAM_NAME")
    List<String> findTeamNameAsc();
}
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
