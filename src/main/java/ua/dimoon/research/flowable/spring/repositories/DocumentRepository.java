package ua.dimoon.research.flowable.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dimoon.research.flowable.spring.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
