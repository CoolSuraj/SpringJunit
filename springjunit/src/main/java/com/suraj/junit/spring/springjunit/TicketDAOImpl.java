package com.suraj.junit.spring.springjunit;

import org.springframework.stereotype.Component;

import com.suraj.junit.spring.dao.TicketDAO;
import com.suraj.junit.spring.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	@Override
	public int createTicket(Ticket ticket) {
		
		return 1;
	}

}
