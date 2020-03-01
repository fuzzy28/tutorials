package org.jrue.tutorials;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import java.util.Locale;

public class CucumberRegistryConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return  Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(
                new DataTableType(CucumberBookTransformer.class, new CucumberBookTransformer()));

    }
}
