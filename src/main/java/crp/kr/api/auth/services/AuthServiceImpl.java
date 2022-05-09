package crp.kr.api.auth.services;

import crp.kr.api.auth.repositories.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl {
    private final AuthRepository repository;
}
