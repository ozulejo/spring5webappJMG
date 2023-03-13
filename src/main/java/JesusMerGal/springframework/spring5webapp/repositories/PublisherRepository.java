package JesusMerGal.springframework.spring5webapp.repositories;

import JesusMerGal.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
