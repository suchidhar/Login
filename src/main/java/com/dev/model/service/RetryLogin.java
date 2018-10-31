package com.dev.model.service;
import java.time.Duration;
import java.time.Instant;

import com.dev.beans.Credential;


public class RetryLogin {

	Credential cred=new Credential();

	public long timeDifference() {

		Instant start=cred.getStart();
		Instant stop=Instant.now();
		long differ=Duration.between(start,stop).toMillis();
		return differ;
	}
	public void countntime() {

		Instant time=Instant.now();
		cred.setStart(time);

	}

}