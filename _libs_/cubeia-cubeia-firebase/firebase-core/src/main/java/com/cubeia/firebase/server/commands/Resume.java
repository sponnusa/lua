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
package com.cubeia.firebase.server.commands;

import com.cubeia.firebase.api.command.Command;


/*
 * After cluster topology changes this command is sent
 * from the master to the entire cluster to resume communications.
 */

public class Resume extends Command<ResumeMessage> {

	private static final long serialVersionUID = 1956794812051579058L;

	public Resume() {
		super(Types.RESUME.ordinal());
	}
	
	public Resume(ResumeMessage msg) {
		super(Types.RESUME.ordinal());	
		setAttachment(msg);
	}
}
