package ua.dimoon.research.flowable.spring.services;

import ua.dimoon.research.flowable.spring.model.dto.DocumentResponseDto;

import java.util.Optional;

public interface DocumentService {
    Optional<DocumentResponseDto> getDocument();
}
