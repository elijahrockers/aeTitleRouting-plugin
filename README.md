# XNAT 1.7 TemplatePlugin #

This is the XNAT 1.7 Template Plugin. It provides a basic XNAT plugin project that you can use 
as a basis for creating your own custom plugins. It includes examples of most basic XNAT plugin
functions. You should keep and expand the parts you need and remove those you don't.

> **Note:** Search throughout your new plugin project for the string "TODO:". This has been added
 in comments throughout the template project to help you find areas you may need to modify or 
 remove for your particular plugin project.  

The XNAT 1.7 Workshop provides a more detailed and operational example. This can be found [on 
the XNAT wiki's Workshop 2016 space](https://wiki.xnat.org/display/XW2) and in the [XNAT 1.7 Workshop
plugin source-code repository](https://github.com/XnatWorkshop/xnat-template-plugin).

# Building #

To build the XNAT 1.7 template plugin:

1. If you haven't already, clone this repository and cd to the newly cloned folder.
1. Build the plugin: `./gradlew jar` (on Windows, you can use the batch file: `gradlew.bat jar`). This should build the plugin in the file **build/libs/xnat-template-plugin-1.0.0.jar** (the version may differ based on updates to the code).
1. Copy the plugin jar to your plugins folder: `cp build/libs/xnat-template-plugin-1.0.0.jar /data/xnat/home/plugins`

> **Note:** This plugin is not really meant to be built and run inside of XNAT. You _can_ build it, but
 the results may not be what you expect. Instead, this is meant as a starting point for developing a
 new plugin. Once you've implemented your own functionality in the plugin, you should replace the
 contents of this README with your own documentation. You can then build and deploy your plugin using 
 the build described above. 
