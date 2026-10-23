package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;
import java.util.List;

public interface IClient {
    Client addclient(Client client);
    void deleteclient(long id);
    List<Client> retrieveClient();
    Client retrieveClientById(long id);
    Client updateClient(Client client);
}