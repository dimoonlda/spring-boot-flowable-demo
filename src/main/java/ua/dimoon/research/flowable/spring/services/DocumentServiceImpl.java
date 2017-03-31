package ua.dimoon.research.flowable.spring.services;

import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.dto.DocumentResponseDto;

import java.util.Optional;
import java.util.UUID;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Override
    public Optional<DocumentResponseDto> getDocument() {
        String docNumber = UUID.randomUUID().toString();
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Optional.of(new DocumentResponseDto().setNumber(docNumber).setOwner("Test owner"));
    }
}
