package com.abouzidi.gof;

import org.junit.Before;
import org.junit.Test;

public class GofTest {

	MessageService messageService;
	Command command;

	@Before
	public void setUp() throws Exception {

		messageService = new MessageService();
		command = new AsynchronousMessageCommand(messageService, "Hello");
	}

	@Test
	public void test() {
		command.execute();
	}

}
