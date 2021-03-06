/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model.placeholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;
import org.apache.camel.model.EnrichDefinition;
import org.apache.camel.spi.PropertyPlaceholderConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class EnrichDefinitionPropertyPlaceholderProvider implements PropertyPlaceholderConfigurer {

    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public EnrichDefinitionPropertyPlaceholderProvider(Object obj) {
        EnrichDefinition definition = (EnrichDefinition) obj;

        readPlaceholders.put("strategyRef", definition::getAggregationStrategyRef);
        writePlaceholders.put("strategyRef", definition::setAggregationStrategyRef);
        readPlaceholders.put("strategyMethodName", definition::getAggregationStrategyMethodName);
        writePlaceholders.put("strategyMethodName", definition::setAggregationStrategyMethodName);
        readPlaceholders.put("strategyMethodAllowNull", definition::getAggregationStrategyMethodAllowNull);
        writePlaceholders.put("strategyMethodAllowNull", definition::setAggregationStrategyMethodAllowNull);
        readPlaceholders.put("aggregateOnException", definition::getAggregateOnException);
        writePlaceholders.put("aggregateOnException", definition::setAggregateOnException);
        readPlaceholders.put("shareUnitOfWork", definition::getShareUnitOfWork);
        writePlaceholders.put("shareUnitOfWork", definition::setShareUnitOfWork);
        readPlaceholders.put("cacheSize", definition::getCacheSize);
        writePlaceholders.put("cacheSize", definition::setCacheSize);
        readPlaceholders.put("ignoreInvalidEndpoint", definition::getIgnoreInvalidEndpoint);
        writePlaceholders.put("ignoreInvalidEndpoint", definition::setIgnoreInvalidEndpoint);
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

