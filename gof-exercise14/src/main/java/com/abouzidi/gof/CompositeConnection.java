package com.abouzidi.gof;

import java.util.ArrayList;
import java.util.List;

public class CompositeConnection extends Connection {

	private List<Connection> connections = new ArrayList<Connection>();

	@Override
	public void connect() {
		for (Connection con : connections) {
			con.connect();
		}
	}

	public void addConnection(Connection connection) {
		connections.add(connection);
	}

}
