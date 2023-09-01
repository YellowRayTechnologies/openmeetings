/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.web.common.datetime;

import java.time.LocalDateTime;

import org.apache.wicket.extensions.markup.html.form.datetime.LocalDateTimeTextField;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.model.IModel;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.tempusdominus.AbstractTempusDominusWithIcon;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.form.tempusdominus.TempusDominusConfig;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.icon.FontAwesome6IconType;

public class OmDateTimePicker extends AbstractTempusDominusWithIcon<LocalDateTime> {
	private static final long serialVersionUID = 1L;

	public OmDateTimePicker(String id, IModel<LocalDateTime> model) {
		super(id, model, newConfig().withClass(LocalDateTime.class));
	}

	@Override
	protected FormComponent<LocalDateTime> newInput(String wicketId, String dateFormat) {
		return new LocalDateTimeTextField(wicketId, dateFormat);
	}

	static TempusDominusConfig newConfig() {
		return new TempusDominusConfig()
				.withAllowInputToggle(true)
				.withIcons(cfg -> cfg
						.withDateIcon(FontAwesome6IconType.calendar_s)
						.withTimeIcon(FontAwesome6IconType.clock_s)
						.withUpIcon(FontAwesome6IconType.arrow_up_s)
						.withDownIcon(FontAwesome6IconType.arrow_down_s)
						.withPreviousIcon(FontAwesome6IconType.arrow_left_s)
						.withNextIcon(FontAwesome6IconType.arrow_right_s)
						.withTodayIcon(FontAwesome6IconType.calendar_check_s)
						.withClearIcon(FontAwesome6IconType.eraser_s)
						.withCloseIcon(FontAwesome6IconType.xmark_s)
				);
	}
}
