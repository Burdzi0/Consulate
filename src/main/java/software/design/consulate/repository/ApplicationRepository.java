package software.design.consulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software.design.consulate.model.Application;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    Optional<Application> findByLocalId(Long localId);
    Optional<Application> findByCentralId(Long centralId);
    void deleteByLocalId(Long id);
}
