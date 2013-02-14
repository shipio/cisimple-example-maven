# Building Android projects with cisimple and Maven
[https://www.cisimple.com](https://www.cisimple.com)

## About
This is an example project for setting up an Android build process that uses Maven on [cisimple](https://www.cisimple.com).

## Setup Instructions

### 1. From the cisimple Dashboard, select "New Job"

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot1.png "Screenshot 1")

### 2. Select "Use Another Repsoitory" to expose the url and branch input fields.  Use the url of this repository (https://github.com/cisimple-team/cisimple-example-maven.git) and set the branch to master, then click "Create Job".

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot2.png "Screenshot 2")

### 3. Click the "Add Build Step" button and select "Build An Android Maven Project".

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot3.png "Screenshot 3")

### 4. In the build step dialog, make sure "Android Package" is selected and click "Save".

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot4.png "Screenshot 4")

### 5. Review the Job configuration and click "Create Job".

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot5.png "Screenshot 5")

### 6. The build should complete successfully and you will find the compiled APK under artifacts.

![alt text](https://raw.github.com/cisimple-team/cisimple-example-maven/master/readme-images/screenshot6.png "Screenshot 6")

