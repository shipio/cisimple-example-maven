android-maven-sample
====================

Sample android project with dependencies which leverages maven

==Building
1. Setup your android sdks via the Android Tools
2. Install Maven possibly like `brew install maven` or `apt-get install maven3`
3. Clone [Maven Android SDK Deployer]: https://github.com/mosabua/maven-android-sdk-deployer
4. `cd maven-android-sdk-deployer`
5. Install your Android SDKs into your local maven repo with Maven Android SDK Deployer `mvn install -P4.1`
6. `cd ..`
7. Clone [this project]: https://github.com/cisimple-team/android-maven-sample
8. `cd android-maven-sample`
9. `mvn install`

==Building an APK and Deploy to Emulator or Device
1. From this project directory `mvn install android:apk android:deploy`

For more information about the maven build steps that are available please see [Maven Android Plugin]: http://code.google.com/p/maven-android-plugin/ 