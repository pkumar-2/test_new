package com.codereq.cxfservices;

import javax.jws.WebService;

@WebService
public interface MathModule {
	public boolean isOdd(Integer number);
}
