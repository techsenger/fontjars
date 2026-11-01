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

package com.techsenger.fontjars.inter;

import java.net.URL;
import java.util.Objects;

/**
 * Font files of the module. The files are downloaded during the build and are packaged next to this enum.
 *
 * @author Pavel Castornii
 */
public enum Inter {

    /** The file {@code Inter-Thin.ttf}. */
    THIN("Inter-Thin.ttf"),

    /** The file {@code Inter-ThinItalic.ttf}. */
    THIN_ITALIC("Inter-ThinItalic.ttf"),

    /** The file {@code Inter-ExtraLight.ttf}. */
    EXTRA_LIGHT("Inter-ExtraLight.ttf"),

    /** The file {@code Inter-ExtraLightItalic.ttf}. */
    EXTRA_LIGHT_ITALIC("Inter-ExtraLightItalic.ttf"),

    /** The file {@code Inter-Light.ttf}. */
    LIGHT("Inter-Light.ttf"),

    /** The file {@code Inter-LightItalic.ttf}. */
    LIGHT_ITALIC("Inter-LightItalic.ttf"),

    /** The file {@code Inter-Regular.ttf}. */
    REGULAR("Inter-Regular.ttf"),

    /** The file {@code Inter-Italic.ttf}. */
    ITALIC("Inter-Italic.ttf"),

    /** The file {@code Inter-Medium.ttf}. */
    MEDIUM("Inter-Medium.ttf"),

    /** The file {@code Inter-MediumItalic.ttf}. */
    MEDIUM_ITALIC("Inter-MediumItalic.ttf"),

    /** The file {@code Inter-SemiBold.ttf}. */
    SEMI_BOLD("Inter-SemiBold.ttf"),

    /** The file {@code Inter-SemiBoldItalic.ttf}. */
    SEMI_BOLD_ITALIC("Inter-SemiBoldItalic.ttf"),

    /** The file {@code Inter-Bold.ttf}. */
    BOLD("Inter-Bold.ttf"),

    /** The file {@code Inter-BoldItalic.ttf}. */
    BOLD_ITALIC("Inter-BoldItalic.ttf"),

    /** The file {@code Inter-ExtraBold.ttf}. */
    EXTRA_BOLD("Inter-ExtraBold.ttf"),

    /** The file {@code Inter-ExtraBoldItalic.ttf}. */
    EXTRA_BOLD_ITALIC("Inter-ExtraBoldItalic.ttf"),

    /** The file {@code Inter-Black.ttf}. */
    BLACK("Inter-Black.ttf"),

    /** The file {@code Inter-BlackItalic.ttf}. */
    BLACK_ITALIC("Inter-BlackItalic.ttf");

    private final String fileName;

    Inter(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Returns the URL of the font file. The URL can be used by any module.
     */
    public URL getUrl() {
        var url = Inter.class.getResource(fileName);
        return Objects.requireNonNull(url, "Font file " + fileName + " is not found");
    }
}
