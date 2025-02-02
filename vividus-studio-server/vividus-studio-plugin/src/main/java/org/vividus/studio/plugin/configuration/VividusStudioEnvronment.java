/*-
 * *
 * *
 * Copyright (C) 2020 - 2021 the original author or authors.
 * *
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
 * *
 */

package org.vividus.studio.plugin.configuration;

import com.google.inject.Singleton;

import org.eclipse.core.resources.IProject;

@Singleton
public class VividusStudioEnvronment
{
    private IProject project;

    public IProject getProject()
    {
        return project;
    }

    public void setProject(IProject project)
    {
        this.project = project;
    }
}
