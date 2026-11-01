# Techsenger FontJars

Techsenger FontJars packages fonts as modular JARs (JPMS), with one JAR per font family. Each module contains the font
files, the license of the font and an enum with a constant for every file, so no names of files are written by hand
in the code that uses the fonts.

The project contains only the fonts that are used by Techsenger projects. It is not a general collection of fonts.

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
* An enum in every module with a constant for every font file; it gives the URL of the file, so the code does not
  depend on resource paths.
* No binary files in the sources: fonts are downloaded during the build and verified by SHA-256.
* Only static fonts are included: one file per style (Regular, Bold, Italic, ...), without variable fonts.
* The license of every font is packaged next to the font files.

## Modules <a name="modules"></a>

| Artifact | Module | Enum | Font |
|----------|--------|------|------|
| `fontjars-inter` | `com.techsenger.fontjars.inter` | `Inter` | [Inter](https://github.com/rsms/inter) |
| `fontjars-jetbrains-mono` | `com.techsenger.fontjars.jetbrainsmono` | `JetBrainsMono` | [JetBrains Mono](https://github.com/JetBrains/JetBrainsMono) |
| `fontjars-mdi` | `com.techsenger.fontjars.mdi` | `Mdi` | [Material Design Icons](https://pictogrammers.com/library/mdi/) |
| `fontjars-techsenger-icons` | `com.techsenger.fontjars.techsengericons` | `TechsengerIcons` | [Techsenger Icons](https://github.com/techsenger/icons) |

The files of a font are resources of the package that has the name of the module, and the enum lies in the same package.
The name of a constant is the name of the file without the name of the font and the extension: `Inter-BoldItalic.ttf`
is `Inter.BOLD_ITALIC`. The package is exported, so any module can use the enum.

## Usage <a name="usage"></a>

Add the module to the `module-info.java` of your module:

```java
module com.example.app {
    requires com.techsenger.fontjars.inter;
}
```

Get the URL of a font file from the enum and register the font. For example, in JavaFX:

```java
Font.loadFont(Inter.REGULAR.getUrl().toExternalForm(), 14);
```

To register all the files of a font, go through the constants:

```java
for (var font : Inter.values()) {
    Font.loadFont(font.getUrl().toExternalForm(), 14);
}
```

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
