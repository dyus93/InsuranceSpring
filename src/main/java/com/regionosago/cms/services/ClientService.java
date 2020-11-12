package com.regionosago.cms.services;

import com.regionosago.cms.dto.ClientDto;
import com.regionosago.cms.persistence.entities.Clients;
import com.regionosago.cms.persistence.repositories.ClientsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {

    private final ClientsRepository clientsRepository;

    public Optional getOneById(UUID id){
        return clientsRepository.findById(id);
    }

    public List<Clients> findAll(){
        return clientsRepository.findAll();
    }

    public void deleteById(UUID id){
        clientsRepository.deleteById(id);
    }

    public Clients saveClient(Clients client){
        return clientsRepository.save(client);
    }



    public String save(ClientDto clientDto){
        Clients client = Clients.builder()
                .surname(clientDto.getSurname())
                .name(clientDto.getName())
                .patronymic(clientDto.getPatronymic())
                .passport(clientDto.getPassport())
                .license(clientDto.getDriverLicense())
        .build();

        clientsRepository.save(client);
        return "redirect:/";
    }
}
