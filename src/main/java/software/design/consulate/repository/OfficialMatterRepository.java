package software.design.consulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import software.design.consulate.model.Decision;
import software.design.consulate.model.OfficialMatter;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfficialMatterRepository extends JpaRepository<OfficialMatter, Long> {
    Optional<OfficialMatter> findByLocalId(Long localId);

    void deleteByLocalId(Long id);
}
