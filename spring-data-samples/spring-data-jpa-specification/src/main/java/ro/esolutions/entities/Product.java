package ro.esolutions.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by BOGDAN on 2/8/2015.
 */
@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String code;

	@Column(nullable = false)
	private String name;

	@Column
	private String description;

	@Column
	private Double acquisitionPrice;

	@Column
	private Double actualPrice;

	@ManyToOne
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAcquisitionPrice() {
		return acquisitionPrice;
	}

	public void setAcquisitionPrice(Double acquisitionPrice) {
		this.acquisitionPrice = acquisitionPrice;
	}

	public Double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}