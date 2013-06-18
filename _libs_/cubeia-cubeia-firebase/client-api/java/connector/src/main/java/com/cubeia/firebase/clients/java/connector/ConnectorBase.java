/**
 * Copyright (C) 2011 Cubeia Ltd <info@cubeia.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cubeia.firebase.clients.java.connector;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.cubeia.firebase.api.util.Arguments;

public abstract class ConnectorBase implements Connector {

	protected final Logger log = Logger.getLogger(getClass());
	protected final ExecutorService dispatcher = Executors.newSingleThreadExecutor();
	protected final List<PacketListener> listeners = new CopyOnWriteArrayList<PacketListener>();
	protected final boolean useHandshake;
	protected final int handshakeSignature;
	
	protected ConnectorBase(boolean useHandshake, int handshakeSignature) {
		this.useHandshake = useHandshake;
		this.handshakeSignature = handshakeSignature;
	}
	
	public void addListener(PacketListener handler) {
		Arguments.notNull(handler, "handler");
		listeners.add(handler);
	}

	public void removeListener(PacketListener handler) {
		Arguments.notNull(handler, "handler");
		listeners.remove(handler);
	}
}
