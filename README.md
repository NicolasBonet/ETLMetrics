# Purpose:

This repository contains a manually choosen dataset of ETL transformations, those ETL files are available inside the 2015-02 and 2016-01 folders. Those transformations were processed using [HAETAE](https://github.com/epsilonlabs/haetae) to generate a model representation of them in order to use those models to gather metrics about bad smells in their original code, for this purpose a catalog of bad smells was defined and is available [here](https://docs.google.com/document/d/1ko9W90KeJOuZQiycvN0LhLZeQbIXbMNYZJdz3qzSN7M/edit?usp=sharing). This repository also includes a tool used to identify the set of bad smells which includes an EVL file called "BadSmellsFinder.evl"  programatically executed to generate both Excel and HTML reports of the bad smells found on the models which represent the dataset source code.

# Tooling

The tool is available inside the "implementacion" folder, there you can find the following folders:

* finder: It includes the EVL file used to identify bad smells.
* html_template: The HTML template used by the HTML generator to create the html files.
* libs: The array of libraries used by the implementation
* metamodels: Both ETL and EOL metamodels.
* src: The java implementation of the bad smells finder.

Below there is an extended explanation about some of those folders.

## /src/badSmellsIdentifier

In BadSmellsIdentifier there are five files which are being used:

* HaetaeCaller.java: This file finds all the ETL files placed inside the folder with all the transformations (the dataset) and runs HAETAE on each one to generate the ETL model at the output directory.
* ProjectsAnalyzer.java: It involves various methods used to generate the reports on both Excel and HTML.

## /src/generators

* ExcelGenerator.java: It creates a file called report.xls with the full report of all bad smells found by the identifier.
* HTMLGenerator.java: It creates a set of HTML files with the report of all bad smells found.

## /metamodels

Here the two metamodels used by HAETAE are stored and loaded by the Bad Smells Identifier scripts. They are called EOL.ecore and ETL.ecore. The later is an extension of the first one.

## /finder

Here the only important file is called "BadSmellsFinder.evl" which is the EVL built to find all the bad smells from the catalog following the description of each bad smell and browsing the models generated using HAETAE which has the ETL.ecore as their metamodel.


# Evaluation

We've organized the dataset of ETL projects made by students on this repository, the structure of those projects is the following:

## 2015-02
These are projects made by the students that took the course on the second semester of 2015.

## 2016-01
These are projects made by the students that took the course on the first semester of 2016.

### Folders description

In each of those two folders you can find the following sub-folders:

* "Individual Projects" where the students propose the problem and solution. Thus, each project is different from others and we've provided a description to give you an idea about the developed transformations.
* "Group Projects" includes the projects where the professor states a common problem and the students propose a solution.

In 2015-02, two different problems have been stated by the professor: "Blog2Calendar" and "Marketplace2SQL", a description of each one is provided with a readme.

In 2016-01, the problem stated by the professor was "SQL2Java", a description was also made explaining the context.

# User manual

There are four steps involved in the execution of the tool to generate HTML and Excel reports about bad smells present on the defined dataset:

0. Setup environment: Eclipse and a set of plugins must be installed to execute this tool.
1. Remove existing models: Existing models must be removed in order to generate the new ones.
2. Generate ETL Models: HAETAE must be executed over the dataset to generate all the ETL models used by the tool on the next step.
3. Generate reports: With all the models generated it's possible to create both reports.

## Setup environment

In order to use this tool the developer must install [https://www.eclipse.org/](Eclipse Modeling Tools), mars version and after it's installed the following plugins are required:

* [Epsilon](https://www.eclipse.org/epsilon/)
* [HAETAE](https://github.com/epsilonlabs/haetae)

When they are succesfully installed, this ETLMetrics repository must be either cloned or downloaded and imported as a project inside Eclipse. The last step is to setup your own paths where the dataset, models and reports are available, to do this simply modify the constants defined at HaetaeCaller.java and ProjectsAnalyzer.java which are inside the co.edu.uniandes.badSmellsIdentifier package.

TODO hacer un ANT para automatizar la ejecución y explicar lo que se tiene que modificar en ese ant

## Remove existing models

To avoid using old model versions in the bad smells discovering process, it is necessary to remove the existing models using either Eclipse or your file explorer.

## Generate ETL Models

To execute HAETAE over the entire dataset execute the file co.edu.uniandes.badSmellsIdentifier.HaetaeCaller.java as a Java Application, this will run HAETAE over all the ETL files available in the dataset directory and place generated models inside the output directory defined on that file.

## Generate reports

Now you can generate two kind of reports: HTML and Excel, this can be done executing the two java files available inside the generators folder which are ExcelGenerator.java and HTMLGenerator.java. The first one creates a new file at the root of the project called report.xls with a report of the bad smells found using the EVL script. The second one generates one HTML file for each model found on the models folder with a report based on the bad smells found, and also creates one index file which is automatically opened in your default web browser with a summary of all the bad smells identified in the dataset and a menu which can be used to browse the reports.
