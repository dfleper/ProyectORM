package aed.map;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Revision.class)
public abstract class Revision_ {

	public static volatile SingularAttribute<Revision, String> filtro;
	public static volatile SingularAttribute<Revision, Date> fecha;
	public static volatile SingularAttribute<Revision, String> frenos;
	public static volatile SingularAttribute<Revision, Coche> idCoche;
	public static volatile SingularAttribute<Revision, Integer> idRevision;
	public static volatile SingularAttribute<Revision, String> aceite;

}

