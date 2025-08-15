package io.github.Guimaraes131.ovni;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OvniService {

    private final OvniRepository repository;

    public List<Ovni> index() {
        return repository.findAll();
    }
}
