package ro.esolutions.specifications;

import org.springframework.data.jpa.domain.Specification;
import ro.esolutions.entities.Category;
import ro.esolutions.entities.Product;

/**
 * Created by BOGDAN on 2/8/2015.
 */
public class ProductSpecifications {

    public static Specification<Product> nameEquals(final String name) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("name").as(String.class), name);
    }

    public static Specification<Product> codeEquals(final String code) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("code").as(String.class), code);
    }

    public static Specification<Product> categoryEquals(final Category category) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("category.id").as(Long.class), category.getId());
    }

    public static Specification<Product> acquisitionPriceEquals(final Double acquisitionPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("acquisitionPrice").as(Double.class), acquisitionPrice);
    }

    public static Specification<Product> acquisitionPriceBetween(final Double lowerPrice, final Double upperPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.between(root.get("acquisitionPrice").as(Double.class), lowerPrice, upperPrice);
    }

    public static Specification<Product> acquisitionPriceGreaterThanOrEqualsTo(final Double lowerPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("acquisitionPrice").as(Double.class), lowerPrice);
    }

    public static Specification<Product> actualPriceEquals(final Double acquisitionPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("actualPrice").as(Double.class), acquisitionPrice);
    }

    public static Specification<Product> actualPriceBetween(final Double lowerPrice, final Double upperPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.between(root.get("actualPrice").as(Double.class), lowerPrice, upperPrice);
    }

    public static Specification<Product> actualPriceGreaterThanOrEqualsTo(final Double lowerPrice) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("actualPrice").as(Double.class), lowerPrice);
    }

    public static Specification<Product> descriptionLike(final String description) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("description").as(String.class), "%" + description + "%");
    }
}
