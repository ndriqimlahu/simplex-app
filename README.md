# Simplex App

**Simplex App** is an Android mobile application designed to deliver an intuitive and feature-rich user experience. With a sleek, visually appealing interface, the app offers a wide range of functionalities to meet diverse user needs. It features easy-to-navigate menus, interactive list views and grid views, and a dynamic structure that adapts to user preferences. These elements make the app highly efficient for browsing, managing content, and exploring its features.

This project is developed with a focus on precision and modern Android design principles. It ensures a robust, responsive, and engaging platform suitable for both casual users and tech enthusiasts. The app includes adaptable layouts, interactive elements, and a seamless flow that enhances usability. With its commitment to providing a polished experience, the application reflects high standards of development, ensuring reliability and satisfaction for its users.

## Built With

This mobile application was developed using the following tools, technologies, and resources:
- **Android Studio**
- **Java**
- **XML**
- **Picasso**
- **Retrofit**
- **JSONPlaceholder Photos API** — [Visit the API](https://jsonplaceholder.typicode.com)

## Features

✅ **User-Friendly Interface:** The app provides a sleek, intuitive design that makes navigation easy for both casual users and tech enthusiasts.

✅ **Seamless Navigation:** Features such as side menus, grid views, and list views allow smooth transitions between different sections of the app.

✅ **Dynamic Content Management:** The app offers dynamic pages like product listings, photo albums, and feedback systems that adapt to user interactions.

✅ **Photo Album Integration:** Users can explore, view details, and interact with a photo album using an integrated photo list and detailed views.

✅ **Persistent Data Storage:** The app uses shared preferences to save, retrieve, and clear data, offering a persistent and customizable experience.

✅ **Online Data Fetching:** With integrated JSON parsing, the app can fetch and display dynamic content, providing a richer user experience by pulling data from external APIs.

✅ **Product Checkout Flow:** A simple, smooth process for users to browse and checkout products directly within the app, making it a functional e-commerce solution.

## Prerequisites

Before starting, ensure the following are installed on your system:
- **Java Development Kit (JDK)**
  - Download the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/).
  - Follow the [installation guide](https://docs.oracle.com/en/java/javase/23/install/overview-jdk-installation.html) to install and configure it properly.
  - Verify your JDK installation by running the following command in your terminal:
    ```
    java -version
    ```
  - Ensure your system's `PATH` is properly configured to allow Java commands to run globally from any location.
- **Android Studio**
  - Download the [Android Studio](https://developer.android.com/studio).
  - Follow the [installation guide](https://developer.android.com/studio/install) to install and set it up on your system.
  - During installation, ensure that the necessary SDK tools and platform dependencies are configured.

## Installation

1. Clone or download the repository to your local machine:
   ```
   git clone https://github.com/ndriqimlahu/simplex-app.git
   ```
2. Open the repository folder in **Android Studio**.
3. Locate the `MainActivity.java` file within the `src` directory to launch the application.
4. Run the application on an emulator or physical device. For testing, you can use the `Pixel 2 API 26` emulator.

## Screenshots

Below you can see some additional useful screenshots of what the mobile application looks like and how it can be used:

- Home page | Home page — Menu options | Log in form and feedback page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/01.1-Home%20page%20(Welcome).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/01.2-Home%20page%20(Check%20More).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/02-Login%20Form%20and%20Feedback%20page.png" align="top" width="32%" height="auto">
  <hr>
</div>

- Product Checkout page | Beauty and Beast page | Dessert ListView page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/03-Checkout%20page%20(Products).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/04-Beauty%20and%20Beast%20page.png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/05-Dessert%20ListView%20page%20(Example).png" align="top" width="32%" height="auto">
  <hr>
</div>

- Food ListView | Products GridView page | Static Fragment page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/06-Food%20ListView%20page%20(Example).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/07-Products%20GridView%20page%20(Example).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/08-Static%20Fragment%20page.png" align="top" width="32%" height="auto">
  <hr>
</div>

- Dynamic Fragment page — First Screen | Dynamic Fragment page — Second Screen | Drawer Layout page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/09.1-Dynamic%20Fragment%20page%20(First).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/09.2-Dynamic%20Fragment%20page%20(Second).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/10.1-Drawer%20Layout%20page.png" align="top" width="32%" height="auto">
  <hr>
</div>

- Drawer Layout page — Sidebar menu | Drawer Layout page — Option Popup | Album Photo page — Photo List
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/10.2-Drawer%20Layout%20page%20(Sidebar%20Menu).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/10.3-Drawer%20Layout%20page%20(Option%20Popup).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/11.1-Album%20Photo%20API%20page%20(List).png" align="top" width="32%" height="auto">
  <hr>
</div>

- Album Photo page — Photo Details | Album Photo page — Failed Popup | Shared Preferences page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/11.2-Album%20Photo%20API%20page%20(Photo%20Details).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/11.3-Album%20Photo%20API%20page%20(Failed%20Popup).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/12.1-Shared%20Preferences%20page.png" align="top" width="32%" height="auto">
  <hr>
</div>

- Shared Preferences page — Save Data | Shared Preferences page — Clear Data | Shared Preferences page — Retrieve Data
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/12.2-Shared%20Preferences%20page%20(Save%20Data).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/12.3-Shared%20Preferences%20page%20(Clear%20Data).png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/12.4-Shared%20Preferences%20page%20(Retrieve%20Data).png" align="top" width="32%" height="auto">
  <hr>
</div>

- JSON Parser page | Google Developers WebView page
<div>
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/13-JSON%20Parser.png" align="top" width="32%" height="auto">
  <img src="https://raw.githubusercontent.com/ndriqimlahu/simplex-app/main/preview/14-Google%20Developers%20WebView%20(Example).png" align="top" width="32%" height="auto">
</div>

## Support

If you find this project useful, please consider giving it a star!
