/**
 * Copyright 2014 SAP AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aim.api.events;

/**
 * Interface for Synchronized event probes.
 * 
 * @author Alexander Wert
 * 
 */
public interface IMonitorEventProbe extends IEventProbe {

	String TYPE_WAIT_ON_MONITOR = "wait";
	String TYPE_ENTERED_MONITOR = "entered";

	/**
	 * Sets the thread.
	 * 
	 * @param thread
	 *            thread to set
	 */
	void setThread(Thread thread);

	/**
	 * Sets the monitor.
	 * 
	 * @param monitor
	 *            monitor to set
	 */
	void setMonitor(Object monitor);

	/**
	 * Sets the timestamp in microseconds.
	 * 
	 * @param timestamp
	 *            timestamp to set
	 */
	void setEventTimeStamp(long timestamp);

	/**
	 * Sets the type of the event - try to get monitor or get monitor.
	 * 
	 * @param type
	 *            type of the event
	 */
	void setEventType(String type);

}