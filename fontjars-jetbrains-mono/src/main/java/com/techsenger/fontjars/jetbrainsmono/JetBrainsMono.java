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

package com.techsenger.fontjars.jetbrainsmono;

import java.net.URL;
import java.util.Objects;

/**
 * Font files of the module. The files are downloaded during the build and are packaged next to this enum.
 *
 * @author Pavel Castornii
 */
public enum JetBrainsMono {

    /** The file {@code JetBrainsMono-Thin.ttf}. */
    THIN("JetBrainsMono-Thin.ttf"),

    /** The file {@code JetBrainsMono-ThinItalic.ttf}. */
    THIN_ITALIC("JetBrainsMono-ThinItalic.ttf"),

    /** The file {@code JetBrainsMono-ExtraLight.ttf}. */
    EXTRA_LIGHT("JetBrainsMono-ExtraLight.ttf"),

    /** The file {@code JetBrainsMono-ExtraLightItalic.ttf}. */
    EXTRA_LIGHT_ITALIC("JetBrainsMono-ExtraLightItalic.ttf"),

    /** The file {@code JetBrainsMono-Light.ttf}. */
    LIGHT("JetBrainsMono-Light.ttf"),

    /** The file {@code JetBrainsMono-LightItalic.ttf}. */
    LIGHT_ITALIC("JetBrainsMono-LightItalic.ttf"),

    /** The file {@code JetBrainsMono-Regular.ttf}. */
    REGULAR("JetBrainsMono-Regular.ttf"),

    /** The file {@code JetBrainsMono-Italic.ttf}. */
    ITALIC("JetBrainsMono-Italic.ttf"),

    /** The file {@code JetBrainsMono-Medium.ttf}. */
    MEDIUM("JetBrainsMono-Medium.ttf"),

    /** The file {@code JetBrainsMono-MediumItalic.ttf}. */
    MEDIUM_ITALIC("JetBrainsMono-MediumItalic.ttf"),

    /** The file {@code JetBrainsMono-SemiBold.ttf}. */
    SEMI_BOLD("JetBrainsMono-SemiBold.ttf"),

    /** The file {@code JetBrainsMono-SemiBoldItalic.ttf}. */
    SEMI_BOLD_ITALIC("JetBrainsMono-SemiBoldItalic.ttf"),

    /** The file {@code JetBrainsMono-Bold.ttf}. */
    BOLD("JetBrainsMono-Bold.ttf"),

    /** The file {@code JetBrainsMono-BoldItalic.ttf}. */
    BOLD_ITALIC("JetBrainsMono-BoldItalic.ttf"),

    /** The file {@code JetBrainsMono-ExtraBold.ttf}. */
    EXTRA_BOLD("JetBrainsMono-ExtraBold.ttf"),

    /** The file {@code JetBrainsMono-ExtraBoldItalic.ttf}. */
    EXTRA_BOLD_ITALIC("JetBrainsMono-ExtraBoldItalic.ttf");

    private final String fileName;

    JetBrainsMono(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Returns the URL of the font file. The URL can be used by any module.
     */
    public URL getUrl() {
        var url = JetBrainsMono.class.getResource(fileName);
        return Objects.requireNonNull(url, "Font file " + fileName + " is not found");
    }
}
