package entity;

import enums.CustomerType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-22T17:05:54")
@StaticMetamodel(Book.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile SingularAttribute<Customer, String> cName;
    public static volatile SingularAttribute<CustomerType, CustomerType> CustomerType;
    

}