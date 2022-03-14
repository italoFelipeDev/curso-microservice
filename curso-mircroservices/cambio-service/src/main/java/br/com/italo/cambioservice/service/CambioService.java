package br.com.italo.cambioservice.service;

import br.com.italo.cambioservice.repository.CambioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CambioService {

    private final CambioRepository repository;
}
