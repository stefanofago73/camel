/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ClaimCheckDefinition;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ClaimCheckDefinitionPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public ClaimCheckDefinitionPropertyPlaceholderProvider(Object obj) {
        ClaimCheckDefinition definition = (ClaimCheckDefinition) obj;

        readPlaceholders.put("key", definition::getKey);
        writePlaceholders.put("key", definition::setKey);
        readPlaceholders.put("filter", definition::getFilter);
        writePlaceholders.put("filter", definition::setFilter);
        readPlaceholders.put("strategyRef", definition::getAggregationStrategyRef);
        writePlaceholders.put("strategyRef", definition::setAggregationStrategyRef);
        readPlaceholders.put("strategyMethodName", definition::getAggregationStrategyMethodName);
        writePlaceholders.put("strategyMethodName", definition::setAggregationStrategyMethodName);
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

