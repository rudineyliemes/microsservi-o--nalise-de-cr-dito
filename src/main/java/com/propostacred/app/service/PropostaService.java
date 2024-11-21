package com.propostacred.app.service;

import com.propostacred.app.dto.PropostaRequestDTO;
import com.propostacred.app.dto.PropostaResponseDTO;
import com.propostacred.app.entity.Proposta;
import com.propostacred.app.mapper.PropostaMapper;
import com.propostacred.app.repositoty.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository repository;

    public PropostaResponseDTO criar (PropostaRequestDTO requestDTO) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(requestDTO);
        repository.save(proposta);
        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }

}
