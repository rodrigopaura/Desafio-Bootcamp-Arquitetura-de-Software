package io.bootcamp.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.bootcamp.cliente.model.Cliente;
import io.bootcamp.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
    private ClienteRepository repository;

    public Cliente criarCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarCliente(Long id) {
        return repository.findById(id);
    }

    public Cliente atualizarCliente(Long id, Cliente cliente) {
        cliente.setId(id);
        return repository.save(cliente);
    }

    public void excluirCliente(Long id) {
        repository.deleteById(id);
    }
}
