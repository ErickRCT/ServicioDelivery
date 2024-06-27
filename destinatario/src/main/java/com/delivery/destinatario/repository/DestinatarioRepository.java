package com.delivery.destinatario.repository;

import com.delivery.destinatario.entity.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatarioRepository extends JpaRepository<Destinatario, Long> {
}
