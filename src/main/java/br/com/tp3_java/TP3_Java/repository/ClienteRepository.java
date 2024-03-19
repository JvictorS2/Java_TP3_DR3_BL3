package br.com.tp3_java.TP3_Java.repository;

import br.com.tp3_java.TP3_Java.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
