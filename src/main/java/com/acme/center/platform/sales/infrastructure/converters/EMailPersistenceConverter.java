package com.acme.center.platform.sales.infrastructure.converters;

import com.acme.center.platform.sales.domain.model.valueobjets.Email;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class EMailPersistenceConverter implements AttributeConverter<Email, String> {


    @Override
    public String convertToDatabaseColumn(Email attribute) {
        return attribute==null ? null : attribute.email();
    }

    @Override
    public Email convertToEntityAttribute(String dbData) {
        return dbData==null ? null : new Email(dbData);
    }
}
