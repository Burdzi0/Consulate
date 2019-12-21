package software.design.consulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software.design.consulate.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
