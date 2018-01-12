/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.blade.cli;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

/**
 * @author Gregory Amerson
 */
@Parameters(commandNames = {"init"}, commandDescription = InitCommand.DESCRIPTION)
public class InitCommandArgs {

	public String getName() {
		return name;
	}

	public boolean isForce() {
		return force;
	}

	public boolean isRefresh() {
		return refresh;
	}

	public boolean isUpgrade() {
		return upgrade;
	}

	@Parameter(names = {"-f", "--force"}, description = "create anyway if there are files located at target folder")
	private boolean force;

	@Parameter(description = "[name]")
	private String name;

	@Parameter(names = {"-r", "--refresh"}, description ="force to refresh workspace template")
	private boolean refresh;

	@Parameter(names = {"-u", "--upgrade"}, description ="upgrade plugins-sdk from 6.2 to 7.0")
	private boolean upgrade;

}