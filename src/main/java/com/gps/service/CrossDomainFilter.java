package com.gps.service;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class CrossDomainFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext cres, ContainerResponseContext arg1) throws IOException {
		arg1.getHeaders().add("Access-Control-Allow-Origin", "*");
		arg1.getHeaders().add("Access-Control-Allow-Credentials", "true");
		arg1.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		arg1.getHeaders().add("Access-Control-Max-Age", "1209600");
		arg1.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
	}

}
