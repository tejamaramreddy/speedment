/**
 *
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.maven.abstractmojo;

import com.speedment.runtime.core.Speedment;
import com.speedment.tool.core.internal.util.ConfigFileHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Whitebox;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// Since ConfigFileHelper is final we need to use Powermock so it is possible to actually mock it.
//@RunWith(PowerMockRunner.class)
//@PrepareForTest({ConfigFileHelper.class})
public class AbstractReloadMojoTest {

//    private AbstractReloadMojo mojo;
//
//    @Mock
//    private File mockedConfigLocation;
//    @Mock
//    private Speedment mockedSpeedment;
//    @Mock
//    private ConfigFileHelper mockedConfigFileHelper;
//
//    @Before
//    public void setup() {
//        if (!Java9Util.isJava9()) {
//            mojo = new AbstractReloadMojoTestImpl();
//        }
//    }
//
//    @Test
//    public void execute() throws Exception {
//        if (!Java9Util.isJava9()) {
//
//            // Given
//            when(mockedSpeedment.getOrThrow(ConfigFileHelper.class)).thenReturn(mockedConfigFileHelper);
//            Whitebox.setInternalState(mojo, "configFile", mockedConfigLocation);
//
//            // When
//            mojo.execute(mockedSpeedment);
//
//            // Then
//            verify(mockedConfigFileHelper).setCurrentlyOpenFile(mockedConfigLocation);
//            verify(mockedConfigFileHelper).loadFromDatabaseAndSaveToFile();
//
//        }
//    }

}
