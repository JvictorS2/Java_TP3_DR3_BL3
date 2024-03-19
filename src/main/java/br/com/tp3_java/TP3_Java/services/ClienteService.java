package br.com.tp3_java.TP3_Java.services;

import br.com.tp3_java.TP3_Java.models.Cliente;
import br.com.tp3_java.TP3_Java.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente CreateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delete(Integer id){
        clienteRepository.deleteById(id);
    }

    public Cliente getClienteById(Integer id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    public List<Cliente> GetAllClientes(){
        return clienteRepository.findAll();
    }

    public Cliente UpdatePassagemCliente(Cliente novosDados){
        Optional<Cliente> cliente = clienteRepository.findById(novosDados.getId());
        UpdtPassagemCliente(cliente,novosDados);
        return clienteRepository.save(cliente.get());

    }

    private void UpdtPassagemCliente(Optional<Cliente> cliente, Cliente clienteComDadosNovos){
        cliente.get().setPassagem(clienteComDadosNovos.getPassagem());
    }
}
