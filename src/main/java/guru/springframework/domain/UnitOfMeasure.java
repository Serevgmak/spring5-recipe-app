package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	private String description;
//	private BigDecimal amount;

//	@OneToOne
//	private Ingredient ingredient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public BigDecimal getAmount() {
//		return amount;
//	}
//
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}

//	public Ingredient getIngredient() {
//		return ingredient;
//	}
//
//	public void setIngredient(Ingredient ingredient) {
//		this.ingredient = ingredient;
//	}

}
