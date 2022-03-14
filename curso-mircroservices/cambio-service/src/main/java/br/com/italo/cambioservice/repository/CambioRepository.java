package br.com.italo.cambioservice.repository;

import br.com.italo.cambioservice.entity.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long> {
}
