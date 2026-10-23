package tn.esprit.autoloc.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClient;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/client")
public class ClientRestController {

    private final IClient clientService;

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addclient(client);
    }

    @GetMapping("/retrieve-all-clients")
    public List<Client> getAllClients() {
        return clientService.retrieveClient();
    }

    @GetMapping("/retrieve-client/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.retrieveClientById(id);
    }

    @DeleteMapping("/remove-client/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteclient(id);
    }
}