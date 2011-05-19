/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.greenhouse.api;

import java.io.Serializable;


/**
 * @author Roy Clarkson
 */
public class Room implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long parentId;

	private long id;

	private String label;
	
	public Room(long parentId, long id, String label) {
		this.parentId = parentId;
		this.id = id;
		this.label = label;
	}

	public long getParentId() {
		return parentId;
	}

	public long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}
}