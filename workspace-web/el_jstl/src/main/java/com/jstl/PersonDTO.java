package com.jstl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Data //기본생성자, setter/getter, toString(),...
public class PersonDTO {
	@NonNull
	private String name;
	private int age;
}
