# EJB-playground

This is my sandbox to learn Enterprise Java Beans using:
* MacOSX
* Oracle Java SDK 1.8.
* Eclipse Neon
* JBoss Tool 4.4
* Wildfly 10

Subfolders are numbered from basic to more complex project; hopefuly anybody can follow them easily.

# Setting up Eclipse

*This project uses Eclipse Neon and Wildfly 10, which only support Java 1.8*

1. Download [Oracle Java SDK 1.8] if you don't have it yet.
1. Download [Wildfly 10] and extract it on your local folder (call it `[WILDFLY_HOME]`). You do not need to make it running as admin for easier developing and debugging process.
   * After extracting, test it by running `[WILDFLY_HOME]/bin/standalone.sh`
   * Open your browser and go to `http://127.0.0.1:8080`
   * During development, your application will be deployed in `[WILDFLY_HOME]/standalone/deployment` folder. You may need to delete them manually to refresh some caching.
   * Log files are stored in `[WILDFLY_HOME]/standalone/log` folder
1. Download [Eclipse Neon Java EE], and launch it
   * Open browser and go to [JBoss Tool 4.4.0.Final] webpage
   * Drag the installation icon to Eclipse to install JBoss development tool.
   * After restarting the Eclipse, try creating a JBoss server from server tab (if you don't see it, make sure you use JBoss or JEE perspective view -- see the top right corner of your Eclipse).
   * Open your browser and go to `http://127.0.0.1:8080`
   * When you develop a JBoss application, you can select target runtime to Wildfly 10 and Run it on the server directly from your Eclipse.
   * You can start and stop the Wildfly server directly from Eclipse.

# Useful pointers:

* [JBoss Quickstarts](https://github.com/jboss-developer/jboss-eap-quickstarts)
* [JBoss Docs](http://www.jboss.org/get-started/)

[Oracle Java SDK 1.8]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[Wildfly 10]: http://wildfly.org/downloads/
[Eclipse Neon Java EE]: https://eclipse.org/
[JBoss Tool 4.4.0.Final]: http://tools.jboss.org/downloads/jbosstools/neon/4.4.0.Final.html
