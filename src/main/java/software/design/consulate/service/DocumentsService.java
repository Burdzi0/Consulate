package software.design.consulate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.design.consulate.model.Document;
import software.design.consulate.model.dto.CreateDocumentDto;
import software.design.consulate.repository.DocumentsRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DocumentsService {

    private final static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");


    private DocumentsRepository documentsRepository;

    public DocumentsService(DocumentsRepository documentsRepository) {
        this.documentsRepository = documentsRepository;
    }

    @Transactional
    public void save(CreateDocumentDto createDocumentDto) {
        documentsRepository.save(newDocument(createDocumentDto));
    }

    private Document newDocument(CreateDocumentDto createDocumentDto) {
        Date birthday = null;
        Date creation = null;
        Date expire = null;

        try {
            birthday = format.parse(createDocumentDto.getBirthday());
            creation = format.parse(createDocumentDto.getCreationTime());
            expire = format.parse(createDocumentDto.getExpireTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Not a date!", e);
        }

        return new Document(
                createDocumentDto.getFirstName(),
                createDocumentDto.getLastName(),
                createDocumentDto.getMaidenName(),
                createDocumentDto.getSex(),
                createDocumentDto.getMartialState(),
                birthday,
                createDocumentDto.getNumber(),
                expire,
                createDocumentDto.getGenerator(),
                createDocumentDto.getDocumentType(),
                creation);
    }

    @Transactional(readOnly = true)
    public List<Document> findAll() {
        return documentsRepository.findAll();
    }

    @Transactional
    public void delete(Long id) {
        documentsRepository.deleteById(id);
    }
}
