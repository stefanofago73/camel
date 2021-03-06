/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.dataformat.FlatpackDataFormat;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class FlatpackDataFormatPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public FlatpackDataFormatPropertyPlaceholderProvider(Object obj) {
        FlatpackDataFormat definition = (FlatpackDataFormat) obj;

        readPlaceholders.put("definition", definition::getDefinition);
        writePlaceholders.put("definition", definition::setDefinition);
        readPlaceholders.put("textQualifier", definition::getTextQualifier);
        writePlaceholders.put("textQualifier", definition::setTextQualifier);
        readPlaceholders.put("delimiter", definition::getDelimiter);
        writePlaceholders.put("delimiter", definition::setDelimiter);
        readPlaceholders.put("parserFactoryRef", definition::getParserFactoryRef);
        writePlaceholders.put("parserFactoryRef", definition::setParserFactoryRef);
        readPlaceholders.put("id", definition::getId);
        writePlaceholders.put("id", definition::setId);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }

}

