package com.propostacred.app.controller;

import com.propostacred.app.dto.PropostaRequestDTO;
import com.propostacred.app.dto.PropostaResponseDTO;
import com.propostacred.app.service.PropostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/proposta")
public class PropostaController {

    @Autowired
    private PropostaService service;

    @PostMapping
    public ResponseEntity<PropostaResponseDTO> criar (@RequestBody PropostaRequestDTO requestDTO) {

        PropostaResponseDTO retorno = service.criar(requestDTO);

        return ResponseEntity.ok(retorno);
    }

}
