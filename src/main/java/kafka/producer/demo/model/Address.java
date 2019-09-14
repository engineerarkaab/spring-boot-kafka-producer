package kafka.producer.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable{

	private static final long serialVersionUID = -8008730640851704215L;
	
	@JsonProperty(value="ADDRESS")
	private String address;
}
