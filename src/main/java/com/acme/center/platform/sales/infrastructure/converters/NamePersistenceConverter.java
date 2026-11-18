package com.acme.center.platform.sales.infrastructure.converters;

import com.acme.center.platform.sales.domain.model.valueobjets.Name;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class NamePersistenceConverter implements AttributeConverter<Name, String> {
    @Override
    public String convertToDatabaseColumn(Name attribute) {
        return attribute==null ? null : attribute.name();
    }

    @Override
    public Name convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Name(dbData);
    }
}
