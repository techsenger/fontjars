/*
 * Copyright 2026 Pavel Castornii.
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

package com.techsenger.fontjars.mdi;

import java.net.URL;
import java.util.Objects;

/**
 * Font files of the module. The files are downloaded during the build and are packaged next to this enum.
 *
 * @author Pavel Castornii
 */
public enum Mdi {

    /** The file {@code materialdesignicons-webfont.ttf}. */
    WEBFONT("materialdesignicons-webfont.ttf");

    private final String fileName;

    Mdi(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Returns the URL of the font file. The URL can be used by any module.
     */
    public URL getUrl() {
        var url = Mdi.class.getResource(fileName);
        return Objects.requireNonNull(url, "Font file " + fileName + " is not found");
    }
}
