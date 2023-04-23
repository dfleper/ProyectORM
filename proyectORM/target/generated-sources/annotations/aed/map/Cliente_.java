package aed.map;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> apellido2;
	public static volatile SingularAttribute<Cliente, Integer> idCliente;
	public static volatile SingularAttribute<Cliente, String> nombreVia;
	public static volatile SingularAttribute<Cliente, String> apellido1;
	public static volatile SingularAttribute<Cliente, String> tipoVia;
	public static volatile SingularAttribute<Cliente, String> telefono;
	public static volatile SingularAttribute<Cliente, String> nombre;
	public static volatile SingularAttribute<Cliente, String> dni;
	public static volatile SingularAttribute<Cliente, String> numeroVia;
	public static volatile CollectionAttribute<Cliente, Coche> cocheCollection;

}

