package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {
    List<Schedule> findAll();
    List<Schedule> findAll(Sort sort);
    Page<Schedule> findAll(Pageable pageable);

    long count();

    String delete(Schedule schedule);

    String save(Schedule schedule);


    Optional<Schedule> findById(String scheduleid);

    boolean existsById(String scheduleid);


}
