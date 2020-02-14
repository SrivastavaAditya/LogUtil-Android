# LogUtil-Android
Android library for working with Log file in Android SDK

(i) Creating Library
  Step 1: 
    File->New->New Module
  Step 2: 
    Select Android Library
  Step 3:
    Name the Android Library as <MODULE-NAME>
  Step 4: 
    Add a class in <PROJECT-NAME>/<MODULE-NAME>/src/main/java/com.example.<MODULE-NAME> path
  

(ii)  Library Usage Techniques
  (a) To use the Library within the same project
    Step 1: 
      Add the following line in your app level build.gradle
        implementation project(path: ':MODULE-NAME')
    Step 2:
      Sync your project.
    Step 3: 
      Use the library

  (b) To use the Library as an external library in another project
    Step 1:
      Commit and push your changes/code to github.
    Step 2:
      Open "jitpack.io" website
    Step 3:
      Add your repository URL in the Textbox and click 'LookUp' button
    Step 4:
      A list of all Releases, Builds, Branches and Commits will be displayed
    Step 5:
      Choose any 1 of them and click 'Get It' button
    Step 6:
      Your library dependency will be created. To use it in your project add the following in your project level build.gradle
        allprojects {
          repositories {
            ...
            maven { url 'https://jitpack.io' 
            }
          }
        }
      And finally add following in your module level build.gradle
        dependencies {
          implementation 'com.github.SrivastavaAditya:LogUtil-Android:Tag'
        }
    Step 7: 
      Sync your Project.
    Step 8: 
      Use the library.
