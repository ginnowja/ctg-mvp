package com.ctg.mvpservice.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctg.mvpservice.domain.persistence.EventEntity;
import com.ctg.mvpservice.domain.transfer.Event;
import com.ctg.mvpservice.repository.EventRepository;
/**
 * Business logic service. It's function is to convert DAOs to DTOs and back again.. it also is the primary location for any business rules
 * @author ginno
 *
 */
@Service
public class EventService {

	private static final Logger LOG = LoggerFactory.getLogger(EventService.class);

	@Autowired
	private EventRepository eventRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public Set<Event> getEvents() {
		LOG.info("Fetching all events..");
		Set<Event> result = new HashSet<>();
		Iterable<EventEntity> events = eventRepository.findAll();
		events.forEach(eventEntity -> result.add(modelMapper.map(eventEntity, Event.class)));

		return result;
	}

	public Event getEventByID(String id) {
		LOG.info(String.format("Fetching event by id: %s", id));
		Optional<EventEntity> eventEntity = eventRepository.findById(id);
		if (eventEntity.isPresent()) {
			return modelMapper.map(eventEntity.get(), Event.class);
		}
		return null;
	}
	
	public Event saveEvent(Event event) {
		EventEntity eventEntity = modelMapper.map(event, EventEntity.class);
		LOG.info("Persisting event: " + eventEntity.toString());
		return modelMapper.map(eventRepository.save(eventEntity), Event.class);
	}

}
