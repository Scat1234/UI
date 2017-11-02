package com.neiltimothygm.csvconverter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * CSVUtils class is utilised to format List of string into CSV files
 * @author Neil Timothy
 * @version 1.0
 */
public class CSVUtils {
    private final char DEFAULT_SEPARATOR = ',';

    /**
     * This method is used to call the writeLine method with all correct parameters passed in
     * @param w the write object needed to execute the writeLine method
     * @param values the List of strings being evaluated
     * @throws IOException Constructs a new exception with the specified detail message
     */
    public void writeLine(Writer w, List<String> values) throws IOException {
        writeLine(w, values, DEFAULT_SEPARATOR, ' ');
    }

    /**
     * This method replaces "\" with escape characters
     * @param value takes a string to be formatted
     * @return a reformatted string escape characters
     */
    // https://tools.ietf.org/html/rfc4180
    public String followCVSformat(String value) {
        String result = value;
        if (result.contains("\"")) {
            result = result.replace("\"", "\"\"");
        }
        return result;
    }

    /**
     * This method takes a List of String and converts them into a CSV line
     * @param w writer Object
     * @param values values of a record in String Array
     * @param separators the separator used for each line
     * @param customQuote used to validate against separator
     * @throws IOException Constructs a new exception with the specified detail message
     */
    public void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {
        boolean first = true;

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            if (!first) {
                sb.append(separators);
            }
            if (customQuote == ' ') {
                sb.append(followCVSformat(value));
            } else {
                sb.append(customQuote).append(followCVSformat(value)).append(customQuote);
            }
            first = false;
        }
        sb.append("\n");
        w.append(sb.toString());
    }
}
