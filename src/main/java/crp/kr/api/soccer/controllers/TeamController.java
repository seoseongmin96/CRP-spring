package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.domains.Schedule;
import crp.kr.api.soccer.domains.Team;
import crp.kr.api.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {
    private final TeamService service;


    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Team team) {
        return service.delete(team);
    }

    @PostMapping("/join")
    public String save(@RequestBody Team team) {
        return service.save(team);
    }

    @GetMapping("/findById/{userid}")
    public Optional<Team> findById(@PathVariable String teamid) {
        return service.findById(teamid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String teamid) {
        return service.existsById(teamid);
    }

}
