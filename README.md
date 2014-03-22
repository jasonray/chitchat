Overview
========
chitchat is a typical chat application.

I am building this as an example of using dropwizard [http://bit.ly/WcgD9s]

How-to compile
==============
You can compile using the gradle wrapper or the native gradle
```
./gradlew clean fatJar
```

How-to run
==========
```
./deploy.sh
```

You may have to grant executable rights `chmod a+x deploy.sh`


Opening in Eclipse
==================
If you use Eclipse, the gradle scripts are nice enough to create your eclipse project and classpath files.

First time only
---------------
If you have gradle installed, run:
```
./gradlew eclipse
```
Now you can import the project into eclipse.

Updating classpath files
------------------------
If you update dependencies, pull the new libs into your classpath:
```
gradle eclipseClasspath
```

Configuration
=============

Change port
-----------
### Command Line
main port: `-Ddw.http.port=9090`
admin port: `-Ddw.http.adminPort=9091`

### Config File
```
http:
	port: 9090
	adminPort:9091
