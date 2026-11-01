# Techsenger FontJars

Techsenger FontJars packages fonts as modular JARs (JPMS), with one JAR per font family. Each module contains the font
files and a single anchor class that other modules use to access those files as resources. No additional API is provided.

The font files are not stored in the source repository; they are downloaded from their official sources during the build.

The license of the project (Apache License, Version 2.0) does not apply to the fonts themselves: each font is distributed
under its own license, which is stored in the folder of the font inside its JAR.

## Table of Contents
* [Features](#features)
* [Modules](#modules)
* [Usage](#usage)
* [Requirements](#requirements)
* [Dependencies](#dependencies)
* [Code Building](#code-building)
* [License](#license)
* [Contributing](#contributing)
* [Support Us](#support-us)

## Features <a name="features"></a>

Key features of FontJars include:

* One JPMS module and one JAR per font family, so an application takes only the fonts it needs.
* An anchor class in every module: it gives access to the font files without any additional API.
* No binary files in the sources: fonts are downloaded during the build and verified by SHA-256.
* Only static fonts are included: one file per style (Regular, Bold, Italic, ...), without variable fonts.
* The license of every font is packaged next to the font files.

## Modules <a name="modules"></a>

| Artifact | Module | Anchor | Font |
|----------|--------|--------|------|
| `fontjars-inter` | `com.techsenger.fontjars.inter` | `Inter` | [Inter](https://github.com/rsms/inter) |
| `fontjars-jetbrains-mono` | `com.techsenger.fontjars.jetbrainsmono` | `JetBrainsMono` | [JetBrains Mono](https://github.com/JetBrains/JetBrainsMono) |
| `fontjars-mdi` | `com.techsenger.fontjars.mdi` | `Mdi` | [Material Design Icons](https://pictogrammers.com/library/mdi/) |
| `fontjars-techsenger-icons` | `com.techsenger.fontjars.techsengericons` | `TechsengerIcons` | [Techsenger Icons](https://github.com/techsenger/icons) |

The files of a font are resources of the package that has the name of the module, and the anchor class lies in the same
package. The package is exported and open, so any module can use the anchor class and read the files.

## Usage <a name="usage"></a>

Add the module to the `module-info.java` of your module:

```java
module com.example.app {
    requires com.techsenger.fontjars.inter;
}
```

Read a font file through the anchor class and register it. For example, in JavaFX:

```java
try (var stream = Inter.class.getResourceAsStream("Inter-Regular.ttf")) {
    Font.loadFont(stream, 14);
}
```

The names of the files are the names from the official distribution of the font, for example `Inter-Regular.ttf` or
`JetBrainsMono-Bold.ttf`. The license of the font lies in the same package.

## Requirements <a name="requirements"></a>

The modules require Java 25.

## Dependencies <a name="dependencies"></a>

Add only the fonts you need:

```
<dependency>
    <groupId>com.techsenger.fontjars</groupId>
    <artifactId>fontjars-inter</artifactId>
    <version>${fontjars.version}</version>
</dependency>
```

## Code Building <a name="code-building"></a>

To build the modules use standard Git and Maven commands:

    git clone https://github.com/techsenger/fontjars
    cd fontjars
    mvn clean install

The first build needs access to the Internet, as the fonts are downloaded from their official sources. The downloaded
files are cached by Maven, so the next builds do not download them again.

## License <a name="license"></a>

Techsenger FontJars is licensed under the Apache License, Version 2.0. The license applies to the code of the project
only and does not apply to the fonts: each font is distributed under its own license, which is stored in the folder of
the font.

## Contributing <a name="contributing"></a>

We welcome all contributions. You can help by reporting bugs, suggesting improvements, or submitting pull requests
with fixes and new features. If you have any questions, feel free to reach out — we’ll be happy to assist you.

## Support Us <a name="support-us"></a>

You can support our open-source work through [GitHub Sponsors](https://github.com/sponsors/techsenger).
Your contribution helps us maintain projects, develop new features, and provide ongoing improvements.
Multiple sponsorship tiers are available, each offering different levels of recognition and benefits.
