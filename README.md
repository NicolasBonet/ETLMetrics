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

## badSmellsIdentifier

In BadSmellsIdentifier there are five files which are being used:

* EpsilonStandaloneExample.java: This file is used as a base to call Epsilon Methods using their API.
* EvlStandaloneExample.java: This is a test build to run the BadSmellsFinder.evl using its API.
* HTMLGenerator.java: This file invokes the results gattered by the EVL and builds a HTML file with the results.
* HaetaeCaller.java: This file finds all the ETL files placed inside the folder with all the transformations and runs HAETAE on each one to generate the ETL model.
* ProjectsAnalyzer.java: It attempts to run the EVL file on each model, it's also a test class.

## metamodels

Here the two metamodels used by HAETAE are stored and loaded by the Bad Smells Identifier scripts. They are called EOL.ecore and ETL.ecore. The later is an extension of the first one.

## finder

Here the only important file is called "BadSmellsFinder.evl" which is the EVL built to find all the bad smells from the catalog following the description of each bad smell and browsing the models generated using HAETAE which have the ETL.ecore as their metamodel.
