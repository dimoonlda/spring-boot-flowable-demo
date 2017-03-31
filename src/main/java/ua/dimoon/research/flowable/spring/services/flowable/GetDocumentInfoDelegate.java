package ua.dimoon.research.flowable.spring.services.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimoon.research.flowable.spring.model.dto.DocumentResponseDto;
import ua.dimoon.research.flowable.spring.services.DocumentService;

import java.util.Optional;

@Service
public class GetDocumentInfoDelegate implements JavaDelegate {
    public static final String DOCUMENT_VAR_NAME = "documentResponseDto";

    private DocumentService documentService;

    @Autowired
    public GetDocumentInfoDelegate setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
        return this;
    }

    @Override
    public void execute(DelegateExecution execution) {
        Optional<DocumentResponseDto> documentInfoOptional = documentService.getDocument();
        documentInfoOptional.ifPresent(System.out::println);
        documentInfoOptional.ifPresent(documentResponseDto -> execution.setVariable(DOCUMENT_VAR_NAME, documentResponseDto));
    }
}
