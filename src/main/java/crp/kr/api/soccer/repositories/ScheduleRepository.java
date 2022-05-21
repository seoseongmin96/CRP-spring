package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface ScheduleCustomRepository{
// 스케줄 날짜만 수정이 되도록 하시오
}
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
