package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.domains.Stadium;
import crp.kr.api.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stadium")
@RequiredArgsConstructor
public class StadiumController {
    private final StadiumService service;


    @GetMapping("/findAll")
    public List<Stadium> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Stadium> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Stadium> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Stadium stadium) {
        return service.delete(stadium);
    }

    @PostMapping("/join")
    public String save(@RequestBody Stadium stadium) {
        return service.save(stadium);
    }

    @GetMapping("/findById/{userid}")
    public Optional<Player> findById(@PathVariable String stadiumid) {
        return service.findById(stadiumid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String stadiumid) {
        return service.existsById(stadiumid);
    }
}
