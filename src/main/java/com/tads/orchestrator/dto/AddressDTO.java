package com.tads.orchestrator.dto;

public record AddressDTO(
        String cep,
        String street,
        String number,
        String neighborhood,
        String city,
        String state,
        String complement) {
}

