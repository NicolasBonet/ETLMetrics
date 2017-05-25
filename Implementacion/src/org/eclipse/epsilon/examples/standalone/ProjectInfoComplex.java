package org.eclipse.epsilon.examples.standalone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.dom.TransformationRule;
import org.eclipse.epsilon.etl.parse.EtlParser;

/**
 * Project information retriever!
 */
public class ProjectInfoComplex
{
	
	// Array of ETL Modules
	private ArrayList<EtlModule> modules;
	
	// Array of ETL files
	private ArrayList<File> etlFiles;
	
	// Array of input models
	private ArrayList<String> inputMetaModels;
	
	// Array of output models
	private ArrayList<String> outputMetaModels;
	
	// Average of input metamodels
	private int averageSizeInputMetamodels;
	
	// Average of output metamodels
	private int averageSizeOutputMetamodels;
	
	// Covered classes in input metamodels
	private double coveredClassesInputMetamodels;
		
	// Covered classes in output metamodels
	private double coveredClassesOutputMetamodels;
	
	// Total of parameters
	private int totalOfParameters;
	
	// Total of ifs
	private int totalOfIfs;
	
	// Total of iterators
	private int totalOfIterators;
	
	// Total of calls to the self variable
	private int totalOfSelfs;
	
	// Total of calls to oclIsKindOf and oclIsTypeOf
	private int totalCallsOclOperations;
	
	// Total of guards
	private int totalOfGuards;
	
	// Total of variables
	private int totalOfVariables;
	
	// Total of operations per rule
	private int operationsPerRule;
	
	// Total of calls to lazy rules
	private int callsToLazyRules;
	
	// Total of operations HWC
	private int operationsHwc;
	
	// Total of operations HNC
	private int operationsHnc;
	
	// Hashmap that stores all used operations
	private HashMap<String, Integer> usedOperations;
		
	// Hashmap that stores all used parameters
	private HashMap<String, Integer> usedParameters;
	
	/**
     * Default constructor.
     */
    public ProjectInfoComplex(String rootDir)
    {
    	// Call our super method!
    	super();
    	
    	// Initialize our attributes
    	this.etlFiles = new ArrayList<File>();
    	this.modules = new ArrayList<EtlModule>();
    	this.inputMetaModels = new ArrayList<String>();
    	this.outputMetaModels = new ArrayList<String>();
    	this.usedOperations = new HashMap<String, Integer>();
    	this.usedParameters = new HashMap<String, Integer>();
    	this.addEpsilonFiles(rootDir);
    	
    	// Initialize our integer attributes
    	totalOfParameters = totalOfIfs = totalOfIterators = totalOfSelfs = totalCallsOclOperations = totalOfGuards = 0;
    	totalOfVariables = operationsPerRule = callsToLazyRules = averageSizeOutputMetamodels = averageSizeInputMetamodels = 0;
    	coveredClassesOutputMetamodels = coveredClassesInputMetamodels = operationsHnc = operationsHwc = 0;
    	 
    	// Parse all ETL files
    	for (int i = 0; i < etlFiles.size(); i++)
    	{
	    	try {
	    		modules.add( new EtlModule() );
				modules.get(i).parse(etlFiles.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	// Setup all input and output metamodels
    	for (int i = 0; i < modules.size(); i++)
    	{
    		for (TransformationRule rule : modules.get(i).getTransformationRules())
    		{
				String metamodelEntradaName = rule.getSourceParameter().getTypeName().split("!")[1];
				
				if (!inputMetaModels.contains(metamodelEntradaName))
					inputMetaModels.add(metamodelEntradaName);
				
				for (int j = 0; j < rule.getTargetParameters().size(); j++)
    			{
					String[] partes = rule.getTargetParameters().get(j).getTypeName().split("!");
					if (partes.length > 1)
					{
	    				String metamodelSalidaName = partes[1];
						
						if (!outputMetaModels.contains(metamodelSalidaName))
							outputMetaModels.add(metamodelSalidaName);
					}
    			}
			}
    	}
    	
    	// Now we used EMF to get the average size of each metamodel
    	int totalInputModels = 0;
    	int totalOutputModels = 0;
    	int totalInputClasses = 0;
    	int totalOutputClasses = 0;
    	
    	/*for (int i = 0; i < models.size(); i++)
    	{
    		// Get the model!
    		Model model = models.get(i);
    		
    		// It's an input mode
    		if (model.getIsInput())
    		{
    			// Retrieve the metamodel
    			String mmPath = model.getMetamodelFilePath();
    			
    			// We need to get ride of the first directory as it's the project one
    			String thePath = rootDir + mmPath.substring( mmPath.indexOf("/", mmPath.indexOf("/") + 1) );
    			System.out.println("Original Path: " + thePath);
    			
    			if (System.getProperty("os.name").startsWith("Windows"))
    			{
    				thePath = "file:///" + thePath.replace('/', '\\').replace(" ", "");
    				System.out.println("Windows Path: " + thePath);
    			}
    			
    			System.out.println("Entrada Danada: " + thePath);
    			
    			// !!! Change it!
    			thePath = "file:///C:\\Users\\Admin\\Desktop\\etl2\\metamodels\\DB.ecore";
    			
    			System.out.println("Entrada Arreglada: " + thePath);
    			
    			XMIResource resource = new XMIResourceImpl(URI.createURI(thePath));
    			
    			try {
					resource.load(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			// Now count all elements
    			Object arr[]= resource.getContents().get(0).eContents().toArray();
    			
    			// Now check how many times are we calling each class
    			for (int j = 0; j < arr.length; j++)
    			{
    				// Array of classes!
    				if (arr[j] instanceof EClass)
    				{
    					// Get each class
    					EClass clase = (EClass) arr[j];
    					
    					// +1
    					totalInputClasses++;
    					
    					// See if it's covered
    					if (inputMetaModels.contains(clase.getName()))
    						coveredClassesInputMetamodels++;
    				}
    					
    			}
    			
    			// Do maths
    			averageSizeInputMetamodels += resource.getContents().get(0).eContents().size();
    			totalInputModels++;
    		}
    		
    		// It's an output model
    		if (model.getIsOutput())
    		{
    			// Retrieve the metamodel
    			String mmPath = model.getMetamodelFilePath();
    			
    			// We need to get ride of the first directory as it's the project one
    			String thePath = rootDir + mmPath.substring( mmPath.indexOf("/", mmPath.indexOf("/") + 1) );
    			System.out.println("Original Path: " + thePath);
    			
    			if (System.getProperty("os.name").startsWith("Windows"))
    			{
    				thePath = "file:///" + thePath.replace('/', '\\').replace(" ", "");
    				System.out.println("Windows Path: " + thePath);
    			}
    			
    			System.out.println("Salida Danada: " + thePath);
    			
    			// !!! Change it!
    			thePath = "file:///C:\\Users\\Admin\\Desktop\\etl2\\metamodels\\Class.ecore";
    			
    			System.out.println("Salida Arreglada: " + thePath);
    			
    			XMIResource resource = new XMIResourceImpl(URI.createURI(thePath));
    			
    			try {
					resource.load(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			// Get all elements
    			Object arr[]= resource.getContents().get(0).eContents().toArray();
    			
    			// Now check how many times are we calling each class
    			for (int j = 0; j < arr.length; j++)
    			{
    				// Array of classes!
    				if (arr[j] instanceof EClass)
    				{
    					// Get each class
    					EClass clase = (EClass) arr[j];
    					
    					// +1
    					totalOutputClasses++;
    					
    					// See if it's covered
    					if (outputMetaModels.contains(clase.getName()))
    						coveredClassesOutputMetamodels++;
    				}
    					
    			}
    			
    			// Do maths
    			averageSizeOutputMetamodels += resource.getContents().get(0).eContents().size();
    			totalOutputModels++;
    		}
    	}*/
    	
    	if (totalInputModels > 0)
			averageSizeInputMetamodels = averageSizeInputMetamodels / totalInputModels;
		
		if (totalOutputModels > 0)
			averageSizeOutputMetamodels = averageSizeOutputMetamodels / totalOutputModels;
    }
    
    /**
     * Returns the total of lines of code
     *
     * @return total of lines of code
     */
    public double getLoc() throws IOException
    {
    	int lines = 0;
    	
    	for (int i = 0; i < etlFiles.size(); i++)
    	{
    		lines += getLinesOfCode(etlFiles.get(i));
    	}
    	
    	return lines;
    }

    /**
     * Returns the total of input models
     *
     * @return total of input models
     */
    public double getNumSrcModels()
    {
    	return inputMetaModels.size();
    }
    
    /**
     * Returns the total of output models
     *
     * @return total of output models
     */
    public double getNumTrgModels()
    {
    	return outputMetaModels.size();
    }
    
    /**
     * Returns the average coverage of the transformation
     *
     * @return average coverage
     */
    public double getAverageCoverage()
    {
    	return -5;
    }
    
    /**
     * Returns the total of lazy rules
     *
     * @return total of lazy rules
     */
    public double getLazyRules()
    {
    	int cantidadDeLazyRules = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
	    	for (TransformationRule rule : modules.get(i).getTransformationRules()) {
				try
				{
					if (rule.isLazy()) {
						cantidadDeLazyRules++;
					}
				}
				catch (EolRuntimeException e){}
			}
    	}
    		
    	return cantidadDeLazyRules;
    }
    
    /**
     * Returns the total of abstract rules
     *
     * @return total of abstract rules
     */
    public double getAbstractRules()
    {
    	int cantidadDeAbstractRules = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
	    	for (TransformationRule rule : modules.get(i).getTransformationRules()) {
				try
				{
					if (rule.isAbstract()) {
						cantidadDeAbstractRules++;
					}
				}
				catch (EolRuntimeException e){}
			}
    	}
    		
    	return cantidadDeAbstractRules;
    }
    
    /**
     * Returns the total of greedy rules
     *
     * @return total of greedy rules
     */
    public double getGreedyRules()
    {
    	int cantidadDeGreedyRules = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
	    	for (TransformationRule rule : modules.get(i).getTransformationRules()) {
				try
				{
					if (rule.isGreedy()) {
						cantidadDeGreedyRules++;
					}
					
					rule.getBody().getBody();
				}
				catch (EolRuntimeException e){}
			}
    	}
    		
    	return cantidadDeGreedyRules;
    }
    
    /**
     * Returns the total of rules la cantidad de rules
     *
     * @return total of rules la cantidad de rules
     */
    public double getRules()
    {
    	int cantidadDeRules = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
    		cantidadDeRules += modules.get(i).getTransformationRules().size();
    	}
    	
    	return cantidadDeRules;
    }
    
    /**
     * Returns the total of operations
     *
     * @return total of operations
     */
    public double getOperations()
    {
    	int cantidadDeOperations = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
    		cantidadDeOperations += modules.get(i).getOperations().size();
    	}
    	
    	return cantidadDeOperations;
    }
    
    /**
     * Returns the total of operations HWC
     *
     * @return total of operations HWC
     */
    public double getOperationsHwc()
    {
    	int cantidadDeOperationsHwc = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
    		for (int o = 0; o < modules.get(i).getOperations().size(); o++)
    		{
    			if (modules.get(i).getOperations().get(o).getContextTypeExpression() != null && modules.get(i).getOperations().get(o).getContextTypeExpression().toString().compareTo("Any") != 0)
    				cantidadDeOperationsHwc++;
    		}
    	}
    	
    	return cantidadDeOperationsHwc;
    }
    
    /**
     * Returns the total of operations HNC
     *
     * @return total of operations HNC
     */
    public double getOperationsHnc()
    {
    	int cantidadDeOperationsHnc = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
    		for (int o = 0; o < modules.get(i).getOperations().size(); o++)
    		{
    			if (modules.get(i).getOperations().get(o).getContextTypeExpression() != null && modules.get(i).getOperations().get(o).getContextTypeExpression().toString().compareTo("Any") == 0)
    				cantidadDeOperationsHnc++;
    		}
    	}
    	
    	return cantidadDeOperationsHnc;
    }
    
    /**
     * Returns if the transformation is declarative
     *
     * @return true if there is at least one lazy rule, false if there are none
     */
    public boolean isDeclarative()
    {
    	for (int i = 0; i < modules.size(); i++)
    	{
	    	for (TransformationRule rule : modules.get(i).getTransformationRules()) {
				try
				{
					if (rule.isLazy()) {
						return true;
					}
				}
				catch (EolRuntimeException e){}
			}
    	}
    	
    	return false;
    }
    
    /**
     * Returns the total of libraries loaded by the transformation
     *
     * @return total of libraries
     */
    public double getLibraries()
    {
    	int cantidadDeLibrerias = 0;
    	
    	for (int i = 0; i < modules.size(); i++)
    	{
    		cantidadDeLibrerias += modules.get(i).getImports().size();
    	}
    	
    	return cantidadDeLibrerias;
    }
    
    /**
     * Returns the amount of parameters in all operations
     *
     * @return amount of parameters in all operations
     */
    public double getParameters()
    {
    	return totalOfParameters;
    }
    
    /**
     * Returns the total of guards
     *
     * @return the total of guards
     */
    public double getGuards()
    {
    	return totalOfGuards;
    }
    
    /**
     * Returns the average of variables
     *
     * @return average of variables
     */
    public double getPromVars()
    {
    	return totalOfVariables / (getOperations() + getRules());
    }
    
    /**
     * Returns the total of calls to lazy rules
     *
     * @return llamadosALazyRules
     */
    public double getCallsToLazyRules()
    {
    	return callsToLazyRules;
    }
    
    /**
     * Returns the ratio of calls of lazy rules per method
     *
     * @return double with the ratio
     */
    public double getPromCallsToLazyRules()
    {
    	return callsToLazyRules / (getOperations() + getRules());
    }
    
    /**
     * Returns the ratio of calls of operations per rule
     *
     * @return operationsPorRule
     */
    public double getCallsOperationsPerRule()
    {
    	return operationsPerRule;
    }
    
    /**
     * Returns the total of if
     *
     * @return cantidadDeIf
     */
    public double getNumIf()
    {
    	return totalOfIfs;
    }
    
    /**
     * Returns the total of calls to the self variable
     *
     * @return cantidadDeSelf
     */
    public double getNumSelf()
    {
    	return totalOfSelfs;
    }
    
    /**
     * Returns the total of iterators
     *
     * @return cantidadDeIterators
     */
    public double getNumIterators()
    {
    	return totalOfIterators;
    }
    
    /**
     * Returns the total of calls of OCL methods
     *
     * @return cantidadDeOclTypeKind
     */
    public double getNumOclOperations()
    {
    	return totalCallsOclOperations;
    }
    
    /**
     * Returns the total of unused operations
     *
     * @return result
     */
    public double getUselessOperations()
    {
    	int result = 0;
    	
    	Set set = usedOperations.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry) iterator.next();
			
			if ((Integer) me.getValue() == 0)
			{
				result++;
			}
		}
		
		return result;
    }
    
    /**
     * Returns the total of unused parameters
     *
     * @return result
     */
    public double getUselessParameters()
    {
    	int result = 0;
    	
    	Set set = usedParameters.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry) iterator.next();
			
			if ((Integer) me.getValue() == 0)
			{
				result++;
			}
		}
		
		return result;
    }
    
    /**
     * Returns the average of elements per input metamodel
     *
     * @return tamMetamodelsInput
     */
    public double getPromSizeInputMetamodels()
    {
    	return averageSizeInputMetamodels;
    }
    
    /**
     * Returns the average of elements per output metamodel
     *
     * @return tamMetamodelsOutput
     */
    public double getPromSizeOutputMetamodels()
    {
    	return averageSizeOutputMetamodels;
    }
    
    /**
     * Returns the coverage of classes in input metamodels
     *
     * @return elementosCubiertosInput
     */
    public double getCoverageInputMetamodels()
    {
    	return coveredClassesInputMetamodels;
    }
    
    /**
     * Returns the coverage of classes in output metamodels
     *
     * @return elementosCubiertosOutput
     */
    public double getCoverageOutputMetamodels()
    {
    	return coveredClassesOutputMetamodels;
    }
    
    /**
     * Collects information about operations
     */
    public void getOperationsInfo()
    {
    	// We must go through each module
    	for (int i = 0; i < modules.size(); i++)
    	{
    		int cantidadDeOperations =  modules.get(i).getOperations().size();
    		
    		// For each operation...
    		for (int j = 0; j < cantidadDeOperations; j++)
    		{
    			// We count the amount of parameters
    			totalOfParameters += modules.get(i).getOperations().get(j).getFormalParameters().size();
    			
    			// We store used operations in a HashMap to know unused ones
    			usedOperations.put(modules.get(i).getOperations().get(j).getName(), 0);
    			
    			// We call the treeRecollector method
    			treeRecollector(modules.get(i).getOperations().get(j).getChildren());
    			
    			// Prepare the list of parameters to verify if they are being used
    			List<Parameter> parameters = modules.get(i).getOperations().get(j).getFormalParameters();
    					
    			for (int p = 0; p < parameters.size(); p++)
	        	{
	    			usedParameters.put(parameters.get(p).getName(), 0);
	        	}
    			
    			// We call the method operationsRecollector to get operations metrics
    			operationsRecollector(modules.get(i).getOperations().get(j).getChildren(), parameters);
    		}
    		
    		// Now we must go through rules
    		int cantidadDeRules = modules.get(i).getTransformationRules().size();
    		
    		for (int l = 0; l < cantidadDeRules; l++)
    		{
    			// For each rull we must call treeRecollector
    			treeRecollector(modules.get(i).getTransformationRules().get(l).getChildren());
    			
    			// And rulesRecollector to get additional rules metrics
    			rulesRecollector(modules.get(i).getTransformationRules().get(l).getChildren());
    		}
    	}
    }
    
    /**
     * Recursive method that collects information about complexity and unused operations
     * @param: children (List<AST>)
     */
    public void treeRecollector(List<AST> children)
    {
    	// Each child must be checked here
    	int childrenSize = children.size();
    	for (int s = 0; s < childrenSize; s++)
    	{
    		AST child = children.get(s);
    		int childType = child.getType();
    		
    		//log.info("Name: " + child.toString() + " - Type: " + child.getType() + " - Line: " + child.getLine() + " - File: " + child.getFile().getName() );
    		
    		// For each one we must see how it affects metrics
    		if (childType == EtlParser.IF)
    			totalOfIfs++;
    		
    		if (childType == EtlParser.FOR || childType == EtlParser.WHILE)
				totalOfIterators++;
    		
    		if (childType == EtlParser.GUARD)
    			totalOfGuards++;
    		
    		if (child.toString().equals("self") && childType == EtlParser.FEATURECALL)
    			totalOfSelfs++;
    		
    		if ((child.toString().equals("isTypeOf") || child.toString().equals("isKindOf")) && childType == EtlParser.FEATURECALL)
    			totalCallsOclOperations++;
    		
    		if (child.toString().equals("var") && childType == EtlParser.VAR)
    			totalOfVariables++;
    		
    		if (child.toString().equals("equivalent") && childType == EtlParser.FEATURECALL)
    			callsToLazyRules++;
    		
    		// Count unused operations!
    		if (childType == EtlParser.FEATURECALL)
    		{
	    		for (int i = 0; i < modules.size(); i++)
	        	{
	    			for (int o = 0; o < modules.get(i).getOperations().size(); o++)
		    		{
	    				String operationName = modules.get(i).getOperations().get(o).getName();
	    				
		    			if (child.toString().equals(operationName))
		    			{
		    				usedOperations.put(operationName, 1);
		    			}
		    		}
	        	}
    		}
    		
    		// Search in childs
    		treeRecollector(child.getChildren());
    	}
    }
    
    /**
     * Recursive method that collects information about rules
     * @param: children (List<AST>)
     */
    public void rulesRecollector(List<AST> children)
    {
    	int childrenSize = children.size();
    	
    	for (int s = 0; s < childrenSize; s++)
    	{
    		AST child = children.get(s);
    		int childType = child.getType();
    		boolean searchInChilds = true;
    		
    		// Count unused operations
    		if (childType == EtlParser.FEATURECALL)
    		{
	    		for (int i = 0; i < modules.size(); i++)
	        	{
	    			for (int o = 0; o < modules.get(i).getOperations().size(); o++)
		    		{
	    				String operationName = modules.get(i).getOperations().get(o).getName();
	    				
		    			if (child.toString().equals(operationName))
		    			{
		    				searchInChilds = false;
		    				operationsPerRule++;
		    			}
		    		}
	    			
	    			for (int o = 0; o < modules.get(i).getTransformationRules().size(); o++)
		    		{
	    				String ruleName = modules.get(i).getTransformationRules().get(o).getName();
	    				
		    			if (child.toString().equals(ruleName))
		    			{
		    				searchInChilds = false;
		    			}
		    		}
	        	}
    		}
    		
    		// Search in childs
    		if (searchInChilds)
    			rulesRecollector(child.getChildren());
    	}
    }
    
    /**
     * Recursive method that collects information about operations
     * @param children (List<AST>)
     * @param parameters (List<Parameter>)
     */
    public void operationsRecollector(List<AST> children, List<Parameter> parameters)
    {
    	int childrenSize = children.size();
    	
    	for (int s = 0; s < childrenSize; s++)
    	{
    		AST child = children.get(s);
    		int childType = child.getType();
    		boolean searchInChilds = true;
    		
    		// Count used parameters
    		if (childType == EtlParser.FEATURECALL)
    		{
    			for (int i = 0; i < parameters.size(); i++)
	        	{
	    			if (child.toString().equals(parameters.get(i).getName()))
	    			{
	    				usedParameters.put(child.toString(), 1);
	    			}
	        	}
    			
    			for (int i = 0; i < modules.size(); i++)
	        	{
	    			for (int o = 0; o < modules.get(i).getOperations().size(); o++)
		    		{
	    				String operationName = modules.get(i).getOperations().get(o).getName();
	    				
		    			if (child.toString().equals(operationName))
		    			{
		    				searchInChilds = false;
		    			}
		    		}
	    			
	    			for (int o = 0; o < modules.get(i).getTransformationRules().size(); o++)
		    		{
	    				String ruleName = modules.get(i).getTransformationRules().get(o).getName();
	    				
		    			if (child.toString().equals(ruleName))
		    			{
		    				searchInChilds = false;
		    			}
		    		}
	        	}
    		}
    		
    		// Search in childs
    		if (searchInChilds)
    			operationsRecollector(child.getChildren(), parameters);
    	}
    }
    
    /**
     * Gets the array of ETL Files
     *
     * @return etlFiles
     */
    public ArrayList<File> getEtlFiles()
    {
    	return etlFiles;
    }
    
    /**
     * Sets the array of ETL files to the ones passed as parameter
     */
    public void setEtlFiles(ArrayList<File> etlFiles)
    {
    	this.etlFiles = etlFiles;
    }
    
    /**
     * Recursive method that finds and stores all ETL and Ecores
     */
    private void addEpsilonFiles( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addEpsilonFiles( f.getAbsolutePath() );
            }
            else if (f.getName().endsWith(".etl")) {
            	etlFiles.add(f);
            }
        }
    }
    
    /**
     * Method to count the number of lines of code, excluding comments
     */
    private static int getLinesOfCode(File f) throws IOException
    {
    	FileReader fr = new FileReader(f);
    	BufferedReader br = new BufferedReader(fr);
    	
    	int i = 0;
    	boolean isEOF = false;
    	
    	do
    	{
    		String t = br.readLine();
    		
	    	if(t!=null)
	    	{
		    	isEOF=true;
		    	t=t.replaceAll("\\n|\\t|\\s", "");
		    	
		    	if((!t.equals("")) && (!t.startsWith("//")))
		    		i = i + 1;
	    	}
	    	else
	    	{
	    		isEOF = false;
	    	}
    	}
    	while(isEOF);
    	
    	br.close();
    	fr.close();
    	return i;
    }
    
    /**
     * Metodo que registrar los logs
     */
	public void logLine(String string) {
		System.out.println(string);
	}
    
	/*public static void main(String[] args) {
    	
    	ProjectInfo pInfo = new ProjectInfo("/Users/nicolas/Desktop/TempDataset");
    	
    	pInfo.getOperationsInfo();
    	
    	System.out.println("# Rules: " + pInfo.getRules());
    	System.out.println("# Abstract Rules: " + pInfo.getAbstractRules());
    	System.out.println("# Lazy Rules: " + pInfo.getLazyRules());
    	System.out.println("# Greedy Rules: " + pInfo.getGreedyRules());
    	
    	System.out.println("# Operations: " + pInfo.getOperations());
    	try {
			System.out.println("# LOC: " + pInfo.getLoc());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("# Ifs: " + pInfo.getNumIf());
    	System.out.println("# Iterators: " + pInfo.getNumIterators());
    	
    	System.out.println("# Calls to lazy rules: " + pInfo.getCallsToLazyRules());
    	System.out.println("# Guards: " + pInfo.getGuards());
    	System.out.println("# Source Models: " + pInfo.getNumSrcModels());
    	System.out.println("# Target Models: " + pInfo.getNumTrgModels());
    	System.out.println("# OCL Operators: " + pInfo.getNumOclOperations());
    	
    	System.out.println("HWC: " + pInfo.getOperationsHwc());
    	System.out.println("HNC: " + pInfo.getOperationsHnc());
	}*/
}