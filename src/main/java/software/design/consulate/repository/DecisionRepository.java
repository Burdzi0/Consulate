package software.design.consulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import software.design.consulate.model.Decision;

import java.util.List;

@Repository
public interface DecisionRepository extends JpaRepository<Decision, Long> {
}
