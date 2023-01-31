Build scan for the Maven build.
=========

The 'extensions.xml' and the 'gradle-enterprise.xml' are configurations used to perform build scans.When the `maven install `command is executed, some information during the build process will be collected and sent to [https://scans.gradle.com](https://scans.gradle.com) .
The information is only accessible via a randomly generated link, printed at the end of the build. You can delete the Build Scan when you are finished.
