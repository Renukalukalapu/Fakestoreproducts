package com.service.fakestore.common;

import com.service.fakestore.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class authcommon {
    RestTemplate restTemplate;

    public authcommon(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDto validatetoken(String token){
        ResponseEntity<UserDto> userdto= restTemplate.getForEntity("http://localhost:8081/user/validate/"+token,UserDto.class);
        if(userdto.getBody()==null){
            return null;
        }
        return userdto.getBody();
    }
}
