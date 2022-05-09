package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class TeamController {
    private final TeamService service;

}
