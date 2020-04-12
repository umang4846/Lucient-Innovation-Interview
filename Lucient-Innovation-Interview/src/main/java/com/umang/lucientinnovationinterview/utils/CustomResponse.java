package com.umang.lucientinnovationinterview.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CustomResponse  {
	

	@Builder.Default private int code = 200;
	private boolean status;
	private String message;
	private Object data;
}