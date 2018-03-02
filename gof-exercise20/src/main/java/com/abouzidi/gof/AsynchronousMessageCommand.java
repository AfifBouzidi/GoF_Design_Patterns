package com.abouzidi.gof;

public class AsynchronousMessageCommand implements Command {

	private MessageService messageService;
	private String message;

	public AsynchronousMessageCommand(MessageService messageService, String message) {
		this.messageService = messageService;
		this.message = message;
	}

	public void execute() {
		messageService.sendMessage(message);
	}

}
