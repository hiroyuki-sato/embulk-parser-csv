/*
 * Copyright 2021 The Embulk project
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

package org.embulk.guess.csv_all_strings;

import java.util.List;
import org.embulk.config.ConfigDiff;
import org.embulk.config.ConfigSource;
import org.embulk.guess.csv.CsvGuessPlugin;
import org.embulk.spi.BufferAllocator;
import org.embulk.util.guess.GuesstimatedType;

public class CsvAllStringsGuessPlugin extends CsvGuessPlugin {
    @Override
    protected ConfigDiff newColumn(final String name, final GuesstimatedType type) {
        final ConfigDiff column = CsvGuessPlugin.newConfigDiff();
        column.set("name", name);
        column.set("type", "string");
        return column;
    }

    @Override
    protected ConfigDiff guessLines(final ConfigSource config, final List<String> sampleLines, final BufferAllocator bufferAllocator) {
        return super.guessLines(config, sampleLines, bufferAllocator);
    }
}
