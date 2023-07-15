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
    void delete(@PathVariable Integer id){
        clientService.removeClientById(id);
    }

    @PutMapping("/client/phonenumber-update/{id}")
    ClientDto updatePhoneNumber( @RequestBody String phoneNumber, @PathVariable Integer id){
        return clientService.updatePhoneNumberById(id, phoneNumber);
    }
}