# OpenCv Android Project Base
Basis for an OpenCv project, that uses the Java wrappers and native code as well.

## Getting Started

This project serves as a basis for all projects that need OpenCv. 
You can take this project and build on top of it or simply use it 
as a guide on how to set it up.

Note that this project was setup based on the instructions that can 
be found on the build.gradle file of the OpenCv SDK itself so, nothing new here.
 
However, to speed up project creation, I created this example that I'm using 
every time I need to setup up one project.
  
## Configuration

1. Download the OpenCv SDK

Download the latest OpenCv Android SDK from here: https://sourceforge.net/projects/opencvlibrary/files/opencv-android/

Once downloaded, extract it and place it wherever you prefer. 

2. Configure the OPENCV_HOME environment variable

For this project to work, you need to have the OPENCV_HOME environment 
variable.

With this variable set, you can use the OpenCv SDK without the need to 
copy it into the project itself.

Example:
````
OPENCV_HOME=/home/my-preferred-location/OpenCV-android-sdk
````

After this is setup, you simply import this project as you would do with
any other Android project. 

This setup also allows you to upgrade OpenCv SDK without the need to 
reconfigure the project - as long as the OPENCV_HOME variable is 
properly configured.

## Acknowledgments

Don't forget to check: https://opencv.org/ for additional details. 
Like I said, I'm just implementing what the OpenCv team explained ;)

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
