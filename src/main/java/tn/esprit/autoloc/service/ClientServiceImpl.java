package tn.esprit.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.IClientRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClient {

    private final IClientRepo clientRepo;

    @Override
    public Client addclient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void deleteclient(long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public List<Client> retrieveClient() {
        return clientRepo.findAll();
    }

    @Override
    public Client retrieveClientById(long id) {
        return clientRepo.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }
}