package co.edu.uniandes.badSmellsIdentifier;

import java.util.Arrays;
import java.util.List;

public class DataMetrics {
	
	public static final String INT = "Integer";
	
	public static final String FLOAT = "Float";
	
	/**
     * Total of lines of code.
     */
    public static Metric NUM_LOC =
        new Metric(
            "num_loc",
            "Total of lines of code",
            INT);
    
    /**
     * Total of input models.
     */
    public static Metric NUM_SRC_MODELS =
        new Metric(
            "num_src_models",
            "Total of input models",
            INT);

    /**
     * Total of output models
     */
    public static Metric NUM_TRG_MODELS =
            new Metric(
                "num_trg_models",
                "Total of output models",
                INT);

    /**
     * Average coverage of metamodels.
     */
    public static Metric AVERAGE_COVERAGE =
        new Metric(
            "average_coverage",
            "Average coverage of metamodels",
            FLOAT);

    /**
     * Total of lazy rules.
     */
    public static Metric NUM_LAZY_RULES =
        new Metric(
            "num_lazy_rules",
            "Total of lazy rules",
            INT);
    
    /**
     * Total of abstract rules.
     */
    public static Metric NUM_ABSTRACT_RULES =
        new Metric(
            "num_abstract_rules",
            "Total of abstract rules",
            INT);
    
    /**
     * Total of greedy rules.
     */
    public static Metric NUM_GREEDY_RULES =
        new Metric(
            "num_greedy_rules",
            "Total of greedy rules",
            INT);
    
    /**
     * Total of rules.
     */
    public static Metric NUM_RULES =
        new Metric(
            "num_rules",
            "Total of rules",
            INT);
    
    /**
     * Average of variables per rule.
     */
    public static Metric AVERAGE_VARIABLES_PER_RULE =
        new Metric(
            "avarage_variables_per_rule",
            "Average of variables per rule",
            FLOAT);
    
    /**
     * Total of operations.
     */
    public static Metric NUM_OPERATIONS =
        new Metric(
            "num_operations",
            "Total of operations",
            INT);
    
    /**
     * Total of unused operations.
     */
    public static Metric NUM_USELESS_OPERATIONS =
        new Metric(
            "num_useless_operations",
            "Total of unused operations",
            INT);
    
    /**
     * Total of libraries.
     */
    public static Metric NUM_LIBRARIES =
        new Metric(
            "num_libraries",
            "Total of libraries",
            INT);
    
    /**
     * Is the transformation declarative?
     */
    public static Metric IS_DECLARATIVE =
        new Metric(
            "is_declarative",
            "Declarative transformation?",
            INT);
    
    /**
     * Total of parameters
     */
    public static Metric NUM_PARAMETERS =
        new Metric(
            "num_parameters",
            "Total of parameters",
            INT);
    
    /**
     * Total of guards
     */
    public static Metric NUM_GUARDS =
        new Metric(
            "num_guards",
            "Total of guards",
            INT);
    
    /**
     * Total of calls to operations per rule
     */
    public static Metric NUM_CALL_OPERATIONS_PER_RULE =
        new Metric(
            "num_call_operations_per_rule",
            "Total of calls of operations per rule",
            INT);
    
    /**
     * Total of calls to lazy rules per rule
     */
    public static Metric NUM_CALL_LAZY_PER_RULE =
        new Metric(
            "num_call_lazy_per_rule",
            "Total of calls to lazy rules per rule",
            FLOAT);
    
    /**
     * Total of calls to lazy rules
     */
    public static Metric NUM_CALL_LAZY_RULE =
        new Metric(
            "num_call_lazy_rule",
            "Total of calls to lazy rules",
            INT);
    
    /**
     * Total of unused parameters
     */
    public static Metric NUM_USELESS_PARAMETERS =
        new Metric(
            "num_useless_parameters",
            "Total of unused parameters",
            INT);
    
    /**
     * Total of ifs
     */
    public static Metric NUM_IF =
        new Metric(
            "num_if",
            "Total of ifs being used",
            INT);
    
    /**
     * Total of self variables
     */
    public static Metric NUM_SELF =
        new Metric(
            "num_self",
            "Total of self variables",
            INT);
    
    /**
     * Total of iterators
     */
    public static Metric NUM_ITERATORS =
        new Metric(
            "num_iterators",
            "Total of iterators",
            INT);
    
    /**
     * Total of OCL operations
     */
    public static Metric NUM_OCL_OPERATIONS =
        new Metric(
            "num_ocl_operations",
            "Total of calls to operations isTypeof and iskindOf",
            INT);
    
    /**
     * Average size of input metamodels
     */
    public static Metric AVERAGE_SIZE_INPUT_MM =
        new Metric(
            "average_size_input_mm",
            "Average size of input metamodels",
            INT);
    
    /**
     * Average size of output metamodels
     */
    public static Metric AVERAGE_SIZE_OUTPUT_MM =
        new Metric(
            "average_size_output_mm",
            "Average size of output metamodels",
            INT);
    
    /**
     * Average coverage of input metamodels
     */
    public static Metric AVERAGE_COVERAGE_INPUT_MM =
        new Metric(
            "average_coverage_input_mm",
            "Average coverage of input metamodels",
            FLOAT);
    
    /**
     * Average coverage of output metamodels
     */
    public static Metric AVERAGE_COVERAGE_OUTPUT_MM =
        new Metric(
            "average_coverage_output_mm",
            "Average coverage of output metamodels",
            FLOAT);
    
    /**
     * Average coverage of bindings
     */
    public static Metric BINDINGS_COVERAGE =
        new Metric(
            "bindings_coverage",
            "Average coverage of bindings in output metamodels",
            FLOAT);
    
    /**
     * Total of ETL Files
     */
    public static Metric ETL_FILES =
        new Metric(
            "etl_files",
            "Total of ETL files in the project",
            INT);
    
    /**
     * List of metrics
     */
    public List<Metric> getMetrics() {
        return Arrays.asList(
        		NUM_LOC, NUM_SRC_MODELS, NUM_TRG_MODELS, AVERAGE_COVERAGE, NUM_LAZY_RULES, 
        		NUM_ABSTRACT_RULES, NUM_GREEDY_RULES, NUM_OPERATIONS, NUM_USELESS_OPERATIONS,
        		NUM_RULES, AVERAGE_VARIABLES_PER_RULE, NUM_LIBRARIES, IS_DECLARATIVE, NUM_PARAMETERS,
        		NUM_GUARDS, NUM_CALL_OPERATIONS_PER_RULE, NUM_CALL_LAZY_PER_RULE, NUM_CALL_LAZY_RULE,
        		NUM_USELESS_PARAMETERS, NUM_IF, NUM_SELF, NUM_ITERATORS, NUM_OCL_OPERATIONS,
        		AVERAGE_SIZE_INPUT_MM, AVERAGE_SIZE_OUTPUT_MM, AVERAGE_COVERAGE_INPUT_MM, AVERAGE_COVERAGE_OUTPUT_MM,
        		ETL_FILES);
    }
}