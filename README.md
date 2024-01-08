# KMP Mobile Notifications
This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - `commonMain` is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the
      folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for
  your project.

## Prepare the environment

- Install and configure the latest JDK 17+.
- If you have Gradle installed, make sure you use Gradle 8.1 or later.
- Install and configure the latest Android Studio for Android samples.
- Install and configure the latest Xcode for iOS samples.

Use the [KDoctor](https://github.com/Kotlin/kdoctor) tool to ensure that your development
environment is configured correctly:

1. Install KDoctor with [Homebrew](https://brew.sh/):

    ```text
    brew install kdoctor
    ```

2. Run KDoctor in your terminal:

    ```text
    kdoctor
    ```

   If everything is set up correctly, you'll see valid output:

   ```text
   Environment diagnose (to see all details, use -v option):
   [✓] Operation System
   [✓] Java
   [✓] Android Studio
   [✓] Xcode
   [✓] Cocoapods
   
   Conclusion:
     ✓ Your system is ready for Kotlin Multiplatform Mobile development!
   ```

Otherwise, KDoctor will highlight which parts of your setup still need to be configured and will
suggest a way to fix
them.

## KMPNotifier
Simple and easy to use Kotlin Multiplatform Push Notification library (using Firebase Cloud Messaging) targeting ios and android.
You can check out [Documentation](https://mirzemehdi.github.io/KMPNotifier) for full library api information.

Github Repo: https://github.com/mirzemehdi/KMPNotifier

## Firebase Cloud Messaging

Check this documentation https://firebase.google.com/docs/cloud-messaging

### Setup your google-services.json and Google-Service-Info.plist

- for iOS download Google-Service-Info.plist and move to /iosApp/iosApp in this project.
- for Android download google-services.json and move to /composeApp/src in this project.



Learn more
about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
