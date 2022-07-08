package com.suraj.junit.spring.springjunit;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.suraj.junit.spring.dto.*;
import com.suraj.junit.spring.dao.TicketDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TicketServiceImplTest {

	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	private TicketServiceImpl service;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testBuyTicketMethod() {
		when(dao.createTicket ((Ticket) any(Ticket.class))).thenReturn(1);
		int result = service.buyTicket("shree", "1234567098");
		assertEquals(result, 1);
	}
}
