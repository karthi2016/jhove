/**
 * 
 */
package edu.harvard.hul.ois.jhove.module.html;

/**
 * Enum used to externalise the XML module message Strings. Using an enum
 * INSTANCE as a "trick" to ensure a single instance of the class. String
 * constants should be prefixed according to their use in the module:
 * <ul>
 * <li>WRN_ for warning strings, often logger messages.</li>
 * <li>INF_ for informational messages.</li>
 * <li>ERR_ for error messages that indicate a file is invalid or not well
 * formed.</li>
 * </ul>
 * When adding new messages try to adopt the following order for the naming
 * elements:
 * <ol>
 * <li>PREFIX: one of the three prefixes from the list above.</li>
 * <li>ENTITY_NAME: the name of the entity causing the problem.</li>
 * <li>Problem: a short indicator of the problem type, e.g. MISSING, ILLEGAL,
 * etc.</li>
 * </ol>
 * The elements should be separated by underscores. The messages currently don't
 * follow a consistent vocabulary, that is terms such as invalid, illegal, or
 * malformed are used without definition.
 *
 * @author Thomas Ledoux
 * 
 */

public enum MessageConstants {
    INSTANCE;

    // From ParseHtml (beware file ParseHtml.java is derived from ParseHtml.jj...)
    
    // The "Missing return statement in function" message is generated by jacacc !!!
    // should never occur once the parser is correct...
    public static final String WRN_INCORRECT_AUTO_CLOSED_TAG = "Construction with \"/>\" is incorrect except in XHTML";
    public static final String ERR_HTML_PARSING_ERROR = "Parsing error";
    
    // From HtmlDocDesc
    public static final String ERR_HTML_ILLEGAL_TAG = "Tag illegal in context";
    public static final String ERR_HTML_UNKNOWN_TAG = "Unknown tag";
    public static final String ERR_HTML_UNDEFINED_ATTRIBUTE = "Undefined attribute for element";
    public static final String ERR_HTML_BAD_VALUE_IN_ATTRIBUTE = "Improper value for attribute";
    public static final String ERR_HTML_MISSING_ATTRIBUTE = "Missing required attribute";
    public static final String ERR_HTML_CLOSED_TAG_NO_OPEN = "Close tag without matching open tag";
    public static final String ERR_HTML_NO_HEAD_ELEMENT = "Document must have implicit or explicit HEAD element";
    public static final String ERR_HTML_BAD_PC_DATA = "PCData illegal in context";

    // From TokenMgrError
    public static final String ERR_LEXICAL_ERROR = "Lexical error";
}
