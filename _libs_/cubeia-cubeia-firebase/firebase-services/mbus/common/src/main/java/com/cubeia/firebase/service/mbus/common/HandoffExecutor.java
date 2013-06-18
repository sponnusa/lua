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
package com.cubeia.firebase.service.mbus.common;

import com.cubeia.firebase.api.server.Haltable;

/**
 * A handoff executor is a runnable services which sits between the message
 * source and the queue(s) which are accessed by the mbus clients. An executor
 * have several strategies to choose from.
 * 
 * @author Lars J. Nilsson
 */
public interface HandoffExecutor extends Haltable {

	/**
	 * Stop the execution of this handoff component.
	 */
	public void destroy();

}