package ro.esolutions.specifications;

import org.springframework.data.jpa.domain.Specification;
import ro.esolutions.entities.Product;

/**
 * Created by BOGDAN on 2/8/2015.
 */
public class GenericSpecifications {

	public static <T> Specification<T> like(final String property, final String value) {
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get(property).as(String.class), "%" + value + "%");
	}
}
