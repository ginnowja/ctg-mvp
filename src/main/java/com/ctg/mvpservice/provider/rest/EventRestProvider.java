package com.ctg.mvpservice.provider.rest;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctg.mvpservice.domain.transfer.Event;
import com.ctg.mvpservice.service.EventService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

/**
 * This is our rest controller.. it's really just the 'rest shell' for our service layer. 
 * @author ginno
 *
 */
@RestController
public class EventRestProvider {
	
	public static final Logger LOG = LoggerFactory.getLogger(EventRestProvider.class);
	
	@Autowired
	private EventService eventService;
	
	@Operation(summary = "Get All Events", description = "Fetches all events from the database")
	@GetMapping("/events")
	public Collection<Event> getEvents(){
		return eventService.getEvents();
	}
	
	@Operation(summary = "Get event by Id", description = "Gets an event by Id.")
	@ApiResponse(responseCode = "404", description = "Object by Id not found")
	@GetMapping("/events/{id}")
	public Event getEventById(@PathVariable(required = true, name = "id") String id){
		return eventService.getEventByID(id);
	}
	
	@Operation(summary = "Save an event", description = "Saves an event.. this is a bit sloppy as this is a 'post' but this will actually update (read: override) an existing event if the Id matches something that already exists")
	@PostMapping("/events")
	public Event saveEvent(Event event) {
		return eventService.saveEvent(event);
	}

}
