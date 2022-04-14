package fr.isika.cda14.efund.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda14.efund.entity.project.Event;
import fr.isika.cda14.efund.repositories.EventRepository;

@Stateless
public class EventService {
	
	@Inject
	private EventRepository eventRepo;
	
	public List<Event> getAllEvents() {
		
		return eventRepo.findAll();
	}

}