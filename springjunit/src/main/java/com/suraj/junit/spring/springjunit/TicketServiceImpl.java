package com.suraj.junit.spring.springjunit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.suraj.junit.spring.dao.TicketDAO;
import com.suraj.junit.spring.dto.Ticket;
import com.suraj.junit.spring.service.TicketService;

@Component
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketDAO dao;

	@Override
	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		getDao().createTicket(ticket );
		return 0;
	}

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

}
