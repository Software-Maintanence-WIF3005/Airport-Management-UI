# Airport Management UI

Develop from January 2020 to June 2020 in Madrid, Spain.

## About:

This Java user interface is design to manage an airport, allowing the user to check, add, and remove flights, routes, airports, and airlines. The interface has a modern and clean esthetic to be as easy to use for the user as possible. The interface also gives extensive feedback to the user of what is happening to avoid the user to make mistakes. To do this, the interface uses a combination of dialogs and color combinations. 

In the dialogs departure, there are three main types: confirmation (to confirm the user that an action has been successfully completed), verification (to made the user verify again the action about to be executed), and error (to let the user know something is missing or wrong). Every dialog also has a custom text depending of the action the dialog is showing.

In the color’s departure, most of the colors of the interface are design to give visual hints of the actions or situations currently happening in the interface. Giving the color green to all actions and buttons to confirm or accept, the color red to all actions and buttons to remove or deny and giving the color blue to all actions and buttons that gives some kind or information. The dialogs are also color match depending of their type been confirmation green, verification yellow, and error red.

## Team:

This project was developed by my self during the second semester of my year studing in the Politecnico di Milano, but done remotly from Spain due to Covid19.

## Development:

First, I did a first design mockup of the interface using the program Pencil, designing all the main pages and parts of the interface. In these mockups I laid down the structure and layout of the interface, having a main page with four tabs, each one of them containing a part of the interface: Flights, Routes, Airports, and Airlines. Each of the tabs following the same internal layout to give continuity to the interface and make it easier to use for the user. The layout of all tabs is compose of a big table in the middle where all the information is displayed, a search bar on top where the user is able to search by field or keyword in the table below, and finally an action bar in the bottom with the two main actions buttons to add or delete information from the current table. These mockups can be seen in the mockups folder inside the project. 

After having a clear idea of how the interface must be, I started coding it using Java with the JavaFx libraries, together with Scene Builder to create the interface in an easier and faster way. For the coding I used the design pattern Model View Controller to arrange the code, but with a slight modification due to a limitation of JavaFx, where the controller and the view of each page has to be in the same folder in order to work. Also mention that the interface is fully responsive, so it can adapt to most screen size and resolutions. Although the interface is not currently connected to a database in the background, I coded all the methods and controllers so if in the future I want to connect a database, the only thing I will had to do is insert the methods to connect to it in each controller. Once all the interface was coded, I started to design and implement the color skin and the style of the interface using CSS.

## Languages and tools:

During the development of this project the following lenguages and tools were used:

- <img alt="Eclipse" width="26px" src="https://img1.freepng.es/20180404/ikq/kisspng-eclipse-computer-icons-integrated-development-envi-eclipse-5ac531df4c83e5.0059858415228727993134.jpg"/> Eclipse
- <img alt="Pencil" width="26px" src="https://pencil.evolus.vn/styling/images/logo-shadow.png"/> Pencil
- <img alt="Java" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/java/java.png"/> Java
- <img alt="JavaFx" width="26px" src="https://raw.githubusercontent.com/github/explore/00edd8b9cf9eb98be328184dcc257f3b1b930c6b/topics/javafx/javafx.png"/> JavaFx
- <img alt="Scene Builder" width="26px" src="https://i2.wp.com/gluonhq.com/wp-content/uploads/2015/02/SceneBuilderLogo.png?fit=781%2C781&ssl=1"/> Scene Builder

## Images of the proyect:

Application main page:

<img alt="Main page" width="650" src="/img/MainPage.PNG"/>

Add new route page:

<img alt="Add route page" width="650" src="/img/AddRoutePage.PNG"/>

New route added confirmation dialog:

<img alt="Add route confirmation" width="650" src="/img/AddRouteConfirmation.PNG"/>

Delete airport confirmation dialog:

<img alt="Delete airport confirmation" width="650" src="/img/DeleteAirportConfirmation.PNG"/>

Empty field search error dialog:

<img alt="Empty field search error" width="650" src="/img/EmptyFieldSearchError.PNG"/>