package kafka.producer.demo.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable{
	
	private static final long serialVersionUID = 3309666499752467397L;
	private String fname;
	private String lname;

}
