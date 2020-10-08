package cz.janakdom.backend.model;

import cz.janakdom.backend.model._base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfInterventionEntity extends BaseEntity {
    private Integer id;
    private String name;
}
