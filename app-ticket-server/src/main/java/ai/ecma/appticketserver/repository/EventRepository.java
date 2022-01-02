package ai.ecma.appticketserver.repository;

import ai.ecma.appticketserver.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface EventRepository extends JpaRepository<Event, UUID> {

}
