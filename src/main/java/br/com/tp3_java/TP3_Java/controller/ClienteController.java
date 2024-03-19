package br.com.tp3_java.TP3_Java.controller;

import br.com.tp3_java.TP3_Java.models.Cliente;
import br.com.tp3_java.TP3_Java.services.ClienteService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/teste")
    public String home(){
        return "teste";
    }

    // Created - Okay

    @PostMapping(value = "api/create") // okay
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.CreateCliente(cliente));
    }

    // Read - Okay
    @GetMapping(value = "api") // okay
    public ResponseEntity<List<Cliente>> GetALL(){
        return ResponseEntity.ok().body(clienteService.GetAllClientes());
    }

    @GetMapping(value = "api/{id}") // okay
    public ResponseEntity<Cliente> GetById(@PathVariable Integer id){
        return ResponseEntity.ok().body(clienteService.getClienteById(id));
    }

    // Delete - Okay

    @DeleteMapping(value = "api/delete/{id}") // - Okay
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Update
    @PutMapping(value = "api/update/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Integer id, @RequestBody Cliente cliente){
        cliente.setId(id);
        return ResponseEntity.ok().body(clienteService.UpdatePassagemCliente(cliente));
    }
}
