/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.language.XMLTokenizerExpression;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class XMLTokenizerExpressionPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public XMLTokenizerExpressionPropertyPlaceholderProvider(Object obj) {
        XMLTokenizerExpression definition = (XMLTokenizerExpression) obj;

        readPlaceholders.put("headerName", definition::getHeaderName);
        writePlaceholders.put("headerName", definition::setHeaderName);
        readPlaceholders.put("mode", definition::getMode);
        writePlaceholders.put("mode", definition::setMode);
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

