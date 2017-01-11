# Purpose:

This repository contains a manually choosen dataset of ETL transformations, those ETL files are available inside the 2015-02 and 2016-01 folders. Those transformations were processed using [HAETAE](https://github.com/epsilonlabs/haetae) to generate a model representation of them in order to use those models to gather metrics about bad smells in their original code. The main purpose of this software is to identify the most common bad smells present at ETL transformations, for this purpose a catalog of bad smells was defined and is available [here](https://docs.google.com/document/d/1ko9W90KeJOuZQiycvN0LhLZeQbIXbMNYZJdz3qzSN7M/edit?usp=sharing), to identify bad smells this software includes an EVL file called "BadSmellsFinder.evl" which is programatically executed to generate both Excel and HTML reports of the badsmells found on the dataset.

# Tooling

Arquitectura de la solución, muestra como los archivos épsilon trabajan con el código Java

# Evaluation
·         Descripción del dataset que tenemos
# User manual
·         Un paso a paso de como correr el tooling sobre el dataset

# For researchers:

## ETLMetrics
We've organized some of the projects made by students on this repository the structure is the following:

### 2015-02
These are projects made by the students that took the course on the second semester of 2015.

### 2016-01
These are projects made by the students that took the course on the first semester of 2016.

## Folders description

In each folder, you can find the following sub-folders:
* "Individual Projects" where the students propose the problem and solution. Thus, each project is different from others and we've provided a description to give you an idea about the developed transformations.
* "Group Projects" includes the projects where the professor states a common problem and the students propose a solution.

In 2015-02, two different problems have been stated by the professor: "Blog2Calendar" and "Marketplace2SQL", a description of each one is provided with a readme.

In 2016-01, the problem stated by the professor was "SQL2Java", a description was also made explaining the context.

# For developers:

The entire logic is inside the "implementacion" folder. Inside you can see three important folders:

* finder: It includes the EVL file used to identify bad smells.
* html_template: The HTML template used by the HTML generator to create the html files.
* libs: The array of libraries used by the implementation
* metamodels: Both ETL and EOL metamodels.
* src: The java implementation of the bad smells finder.

Below there is extended explanation about some of those folders.

## /src/badSmellsIdentifier

In BadSmellsIdentifier there are five files which are being used:

* HaetaeCaller.java: This file finds all the ETL files placed inside the folder with all the transformations and runs HAETAE on each one to generate the ETL model at the output directory.
* ProjectsAnalyzer.java: It involves various methods used to generate the reports on both Excel and HTML.

## /src/generators

* ExcelGenerator.java: It create a file called report.xls with the full report of all bad smells found by the identifier.
* HTMLGenerator.java: It create a set of HTML files with the report of all bad smells found.

## /metamodels

Here the two metamodels used by HAETAE are stored and loaded by the Bad Smells Identifier scripts. They are called EOL.ecore and ETL.ecore. The later is an extension of the first one.

## /finder

Here the only important file is called "BadSmellsFinder.evl" which is the EVL built to find all the bad smells from the catalog following the description of each bad smell and browsing the models generated using HAETAE which have the ETL.ecore as their metamodel.
