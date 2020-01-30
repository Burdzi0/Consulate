package software.design.consulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software.design.consulate.model.Document;

@Repository
public interface DocumentsRepository extends JpaRepository<Document, Long> {
}
