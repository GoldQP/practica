package com.acme.center.platform.sales.infrastructure.entities;

import com.acme.center.platform.sales.domain.model.valueobjets.Dni;
import com.acme.center.platform.sales.domain.model.valueobjets.Email;
import com.acme.center.platform.sales.domain.model.valueobjets.Name;
import com.acme.center.platform.sales.infrastructure.converters.DniPersistenceConverter;
import com.acme.center.platform.sales.infrastructure.converters.EMailPersistenceConverter;
import com.acme.center.platform.sales.infrastructure.converters.NamePersistenceConverter;
import com.acme.center.platform.shared.infrastructure.persistence.jpa.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerPersistenceEntity extends AuditableAbstractPersistenceEntity {

    @Convert(converter = NamePersistenceConverter.class)
    @Column(name = "name", nullable = false, updatable = false)
    private Name name;
    @Convert(converter = EMailPersistenceConverter.class)
    @Column(name = "email", nullable = false, updatable = false)
    private Email email;
    @Convert(converter = DniPersistenceConverter.class)
    @Column(name = "dni", nullable = false, updatable = false)
    private Dni dni;
}
