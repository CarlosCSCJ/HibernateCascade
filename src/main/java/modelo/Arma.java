package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="armas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arma {
	
	@Id
	private String id;


	@OneToMany(mappedBy = "arma", cascade = CascadeType.ALL)
	private List<Personaje> personajes;


}
