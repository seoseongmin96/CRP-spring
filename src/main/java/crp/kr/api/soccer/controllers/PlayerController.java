package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;


    @GetMapping("/findAll")
    public List<Player> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Player> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Player> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Player player) {
        return service.delete(player);
    }

    @PostMapping("/join")
    public String save(@RequestBody Player player) {
        return service.save(player);
    }

    @GetMapping("/findById/{userid}")
    public Optional<Player> findById(@PathVariable String playerid) {
        return service.findById(playerid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String playerid) {
        return service.existsById(playerid);
    }
}
