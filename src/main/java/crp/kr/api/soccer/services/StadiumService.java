package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StadiumService {


    List<Stadium> findAll();

    List<Stadium> findAll(Sort sort);

    Page<Stadium> findAll(Pageable pageable);

    long count();

    String delete(Stadium stadium);

    String save(Stadium stadium);


    Optional<Player> findById(String stadiumid);

    boolean existsById(String stadiumid);


    String update(Stadium stadium);}
