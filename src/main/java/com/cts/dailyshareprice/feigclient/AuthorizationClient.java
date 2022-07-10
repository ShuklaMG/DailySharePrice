package com.cts.dailyshareprice.feigclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "${AUTH.URL}", name = "AUTHORIZATION-SERVICE")
public interface AuthorizationClient {

	@GetMapping("/getuname")
	public String getUname(@RequestHeader("Authorization") String authorization);

}
