package com.example.mongodb.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
public class Category {
    @Id
    private Long id;
    private String name;
    private Integer count;
    private List<Long> parents;
    private List<Facet> facets;
    private String value;

    public static class Facet{
        private String id; //the id, which is a concatenation of lower-cased facet name and value.

        private String name;//the facet name with original casing, e.g. “Accessory Type”
        private String value;//the facet value with original casing, e.g. “Hosiery”. Important note: here the value should be the family value is possible, e.g. “White” rather than “Ivory”. Those facets will be used for searching items, and the family value is better for that purpose.
        private Integer count;//the number of items that have this facet. This count will be important in defining the order of attributes in a query when doing faceted search.
    }
}
