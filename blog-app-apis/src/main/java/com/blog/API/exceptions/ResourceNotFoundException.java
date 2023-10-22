//package com.blog.API.exceptions;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class ResourceNotFoundException extends RuntimeException {
//
//	String resourceName;
//	String fieldName;
//	long fieldValue;
//
//	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
//		//super(String.format("%s ot found wih %s : %d", resourceName, fieldValue));
//		super(String.format("%s not found with %s : %d", resourceName, fieldName, fieldValue));
//
//		this.resourceName = resourceName;
//		this.fieldName = fieldName;
//		this.fieldValue = fieldValue;
//	}
//
//}
package com.blog.API.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	String resourceName;
	String fieldName;
	long fieldValue;

	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {

		super(String.format("%s not found with %s : %d", resourceName, fieldName, fieldValue));

		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
