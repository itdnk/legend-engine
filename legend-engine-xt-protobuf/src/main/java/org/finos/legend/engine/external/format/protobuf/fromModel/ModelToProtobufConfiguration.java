// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.external.format.protobuf.fromModel;

import org.finos.legend.engine.external.format.protobuf.ProtobufFormatExtension;
import org.finos.legend.engine.external.shared.format.model.transformation.fromModel.ModelToSchemaConfiguration;

import java.util.Collections;
import java.util.Map;

public class ModelToProtobufConfiguration extends ModelToSchemaConfiguration
{
    public String javaPackage;
    public String javaOuterClassname;
    public Boolean javaMultipleFiles;
    public OptimizeMode optimizeFor;
    public Map<String, Object> customOptions = Collections.EMPTY_MAP;

    public ModelToProtobufConfiguration()
    {
        super(ProtobufFormatExtension.TYPE);
    }
}
