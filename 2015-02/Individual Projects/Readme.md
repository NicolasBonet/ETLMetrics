# 2015-02 Group Projects
These projects were developed by each group of students to apply their knowledge on MDE to implement software in real contexts. They all had to develop a model transformation chain using an input made with Models, Sirius, XText or UML and transform models with ETL + EGL in order to get the output which had to be functional software.

# Projects Specification
## Mobile Apps
This project generates mobile and web apps based on a configuration file parsed with XText. The model parsed by XText is then transformed into an Android model and a frontend model, both of them are used to generate the target application based on the configuration provided at the input.

## Angular CRUD
Their input is an XMI which represents how the application is structured, they have two ETL files which transform this XMI into two different models: Angular and Rails. They later transform those models into frontend and backend using both technologies.

## Multi-Layer Generation from Business Model
Their input is a business model having the configuration of the app to be generated which is transformed into an architectural model using an ETL file, thise model is then transformed in two different models: JEE and Angular, both are then transformed using EGL files into the frontend and backend of the target application.

## Web driver multi-platform
A grammatic parses WebAPI code made with C# which is used to transform that model into models for three technologies (Android, PHP and a frontend based on AngularJS).The output of the entire chain generates code for the three platforms.

## CRUD operations with Cobol
Cobiw code is parsed using Java code to create a model representation of it which is then transformed using ETL into a C# Model which is used to create .net code which is the output of the transformation, the same input model is transformed using some EGL scripts into CobolJoin and CobolLine code.

## JSON2SQL
This group designed a grammar which is able to parse JSON files into a XMI model using XText, this model can then be transformed using ETL into a SQL model which can generate Java code that creates the SQL database.

# Swing2AngularJS
Swing projects are analyzed using Modisco which generates a XMI model used by the transformation as an input to generated a HTML model used as a resource for the EGL scripts in order to generate AngularJS/HTML code which should operate similary to the Swing app.

|Group                                       |Grade|
|--------------------------------------------|-----|
|Mobile Apps                                 | 4.5 |
|Angular CRUD                                | 4.6 |
|Multi-Layer Generation from Business Model  | 4.2 |
|Web driver multi-platform                   | 4.7 |
|CRUD operations with Colbol                 | 4.6 |
|JSON2SQL                                    | 4.5 |
|Swing2AngularJS                             | 4.2 |
