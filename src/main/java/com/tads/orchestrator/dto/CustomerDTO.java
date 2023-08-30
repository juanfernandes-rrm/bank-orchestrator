package com.tads.orchestrator.dto;

import java.util.UUID;

public record CustomerDTO (
        UUID id,
        String name,
        String email,
        String cpf,
        AddressDTO address){}