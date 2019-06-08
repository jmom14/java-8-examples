
package com.example.modelo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Person {

	protected long id;
	protected String name;
	protected String lastName;
	protected Date birthDate;
}
