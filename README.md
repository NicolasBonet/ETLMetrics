# Purpose:

This repository contains a manually choosen dataset of ETL transformations, those ETL files are available inside the dataset folder and they are splitted in two multiple folders. Those transformations were processed using [HAETAE](https://github.com/epsilonlabs/haetae) to generate a model representation of them in order to use those models to gather metrics and find bad smells in their original code. This repository also includes a tool used to identify the set of bad smells which includes an EVL file called "BadSmellsFinder.evl"  programatically executed to generate both Excel and HTML reports of the bad smells found on the models which represent the dataset source code.

# Tooling

The tool is available inside the "implementacion" folder, there you can find the following folders:

* html_template: The HTML template used by the HTML generator to create the html files.
* libs: The array of libraries used by the implementation
* metamodels: Both ETL and EOL metamodels.
* src/co/edu/uniandes/badSmellsChecker: The java implementation of the bad smells finder, and the EVL file used to identify the bad smells.

Below there is an extended explanation about some of those folders.

## src/co/edu/uniandes/badSmellsChecker/ProjectInfo.java

This file gathers construct metrics about the ETL original files

## src/co/edu/uniandes/badSmellsChecker/HTMLMetricsGenerator.java

This class generates HTML Reports with all the statements found in the ETL Project set at Project Analyzer.

## src/co/edu/uniandes/badSmellsChecker/models

Includes some test models (\*.xmi), test etl files (\*.etl), and the EOL and ETL ecore metamodels (.\*ecore) which cannot be removed!

## src/co/edu/uniandes/badSmellsChecker/evl

* BadSmellsFinder.evl: EVL built to find all the bad smells from the catalog following the description of each bad smell and browsing the models generated using HAETAE which has the ETL.ecore as their metamodel.
* HaetaeCaller.java: It's the file that programatically executes HAETAE to generate models.
* BadSmellsFinder.java: It's the main file of the entire program! This is the one that must be configured and run to gather metrics and the report!

# Evaluation

We've organized the dataset of ETL projects made by students on this repository, the structure of those projects is divided in three groups:

* Senior: ETL Transformations gathered from the official Epsilon repository.
* Github: ETL Transformations gathered from Github, they were found based on a search by extension and with more than 3kB of size.
* All the others: Transformations made by students in the Universidad de los Andes, they all belong to a third group named "Junior".

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

When they are succesfully installed, this ETLMetrics repository must be either cloned or downloaded and imported as a project inside Eclipse.

## Running the scripts

The dataset must be divided in three folders:

* ETL: Includes the dataset of ETL transformations.
* Models: It must be an empty folder where all the HaeTae models will be generated.
* Reports: Here the HTML and Excel reports must be generated.

To configure the location of those folders the constants in the BadSmellsChecker.java must be configured:

´´´private final static String modelPath = "/Users/nicolas/Desktop/Dataset/Models";
private final static String etlPath = "/Users/nicolas/Desktop/Dataset/ETL";
private final static String reportsPath = "/Users/nicolas/Desktop/Dataset/Reports";´´´
  
After those paths are set simply run the BadSmellsChecker.java, then go to the reportsPath folder and see the report.xls file which has the overall status of bad smells of all projects and there'll be also an XLS for each transformation with specific smells of it.
