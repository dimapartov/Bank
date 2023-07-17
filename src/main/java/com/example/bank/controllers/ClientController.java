package com.example.bank.controllers;

import com.example.bank.dtos.ClientDto;
import com.example.bank.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    Iterable<ClientDto> all(){
        return clientService.getAll();
    }

    @PostMapping("/client/add")
    ClientDto newClient(@RequestBody ClientDto newClient){
        return clientService.addClient(newClient);
    }

    @GetMapping("/clients/{id}")
    ClientDto one(@PathVariable Integer id){
        return clientService.findClientById(id);
    }

    @DeleteMapping("/client/delete/{id}")
    String delete(@PathVariable Integer id){
        clientService.removeClientById(id);
        return "Client succesfully removed";
    }

    @PutMapping("/client/phonenumber-update/{id}")
    ClientDto updatePhoneNumber( @RequestBody String phoneNumber, @PathVariable Integer id){
        return clientService.updatePhoneNumberById(id, phoneNumber);
    }

    @GetMapping("/client/get-related-clients/{id}")
    Iterable<ClientDto> getRelatedClients(@PathVariable Integer id) {
        return clientService.getRelatedInTransactionClientsByClientId(id);
    }
}