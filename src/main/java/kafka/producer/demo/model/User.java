package kafka.producer.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User implements Serializable{

	private static final long serialVersionUID = -4173679614287201785L;
	
	@JsonProperty(value="NAME")
	private String name;
	@JsonProperty(value="department")
	private String dept;
	@JsonProperty("salary")
	private Long salary;
	@JsonProperty("addKey")
	private Address address;
}
