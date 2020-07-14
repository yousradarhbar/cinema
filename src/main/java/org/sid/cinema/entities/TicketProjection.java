package org.sid.cinema.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj",types={org.sid.cinema.entities.Ticket.class})
public interface TicketProjection {

	public Long getId();
	public String getNomClient();
	public double getPrix();
	public Integer getCodePayement();
	public boolean getReservee();
	public Places getPlace();
	
	
}
