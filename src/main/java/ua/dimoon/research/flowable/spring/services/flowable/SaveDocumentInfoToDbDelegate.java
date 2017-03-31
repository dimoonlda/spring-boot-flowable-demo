package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.Document;
import ua.dimoon.research.flowable.spring.model.dto.DocumentResponseDto;
import ua.dimoon.research.flowable.spring.repositories.DocumentRepository;

@Service
public class SaveDocumentInfoToDbDelegate implements JavaDelegate {

    private DocumentRepository documentRepository;

    @Autowired
    public SaveDocumentInfoToDbDelegate setDocumentRepository(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
        return this;
    }

    @Override
    public void execute(DelegateExecution execution) {
        DocumentResponseDto documentResponseDto = execution.getVariable(GetDocumentInfoDelegate.DOCUMENT_VAR_NAME, DocumentResponseDto.class);
        documentRepository.save(new Document()
                .setNumber(documentResponseDto.getNumber())
                .setOwner(documentResponseDto.getOwner()));
    }
}
