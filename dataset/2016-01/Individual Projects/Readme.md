# 2016-01 Group Projects
These projects were developed by each group of students to apply their knowledge on MDE to implement software in real contexts. They all had to develop a model transformation chain using an input made with Sirius, XText or UML and transform models with ETL + EGL in order to get the output which had to be functional software.

# Projects Specification
## Catalog
This project generates catalog-like applications for multiple platforms (ionic, Android and Windows Phone). The entry of this project is a text file parsed using XText which configures the main settings of the target applications. That input is converted into an architecture model for each platform using ETL, and later a group of EGL scripts generate the platform code.

## ClinicPro
They wanted to generate applications useful for clinics and hospitals in which some CRUD operations were perfomed in two platforms: Android and HTML. The transformation chain receives as an input a hand-made XMI model which is converted into a Business model and a GUI one. Both are then converted into code using EGL files.

## CRUD Java
The purpose of this project was to build CRUD applications using a backend in Java and a Web frontend, their input was a UML class diagram stereotyped using a profile they defined in which all the entities of the application were specified, this UML was then converted into a backend and frontend models which were later transformed into java and html code.

## Newsletter
In this group they defined a Sirius editor in which engineers were able to create the diagram and structure of a newsletter, this diagram was the input of a transformation-chain that converted them into HTML and Android models, both of them could be transformed into code for both technologies.

## SNAP
The context of this project is a business in which they are using a pseudocode called "SNAP" to create the structure of RPG applications. This group took those pseudocodes and parsed them into a model using XText, then using some ETL scripts they were able to converted that model into Android, HTML, Java and Swing models which can be transformed into code using EGL.

## WebCRUD
WebCrud is a project that wanted to automatize the creation of web platforms doing CRUD, the target application is build using Java Play as the backend and a frontend in jQuery. The ETL transformation received a parsed SQL file as the input, and then converted that model into a model of Java Play.

# Grades
To get an idea of the quality of each implementation we've provided the grades obtained from each group:

|Group      |Grade|
------------|-----|
|Catalog    | 4.7 |
|ClinicPro  | 3.7 |
|CRUD Java  | 3.8 |
|Newsletter | 4.9 |
|SNAP       | 4.5 |
|WebCRUD    | 4.9 |
