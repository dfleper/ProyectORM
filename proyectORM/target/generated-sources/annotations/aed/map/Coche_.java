package aed.map;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Coche.class)
public abstract class Coche_ {

	public static volatile SingularAttribute<Coche, String> marca;
	public static volatile CollectionAttribute<Coche, Revision> revisionCollection;
	public static volatile SingularAttribute<Coche, Float> precio;
	public static volatile SingularAttribute<Coche, String> color;
	public static volatile SingularAttribute<Coche, Cliente> idCliente;
	public static volatile SingularAttribute<Coche, String> matricula;
	public static volatile SingularAttribute<Coche, String> modelo;
	public static volatile SingularAttribute<Coche, Integer> idCoche;

}

