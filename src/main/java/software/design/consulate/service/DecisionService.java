package software.design.consulate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.design.consulate.model.Decision;
import software.design.consulate.model.dto.CreateApplicationDto;
import software.design.consulate.model.dto.CreateDecisionDto;
import software.design.consulate.model.dto.DecisionDto;
import software.design.consulate.repository.DecisionRepository;

import java.util.List;
import java.util.stream.Collectors;

import static software.design.consulate.model.dto.DecisionDto.from;


@Service
public class DecisionService {

    private DecisionRepository decisionRepository;

    public DecisionService(DecisionRepository decisionRepository) {
        this.decisionRepository = decisionRepository;
    }

    @Transactional(readOnly = true)
    public List<DecisionDto> findAll() {
        return decisionRepository.findAll()
                .stream()
                .map(DecisionDto::from)
                .collect(Collectors.toUnmodifiableList());
    }

    @Transactional
    public DecisionDto save(CreateDecisionDto createDecisionDto) {
        return from(decisionRepository.save(newDecision(createDecisionDto)));
    }

    private Decision newDecision(CreateDecisionDto applicationDto) {
        return new Decision(applicationDto.getMatter(), applicationDto.getDecisionType().toString(), applicationDto.getReason());
    }

}
