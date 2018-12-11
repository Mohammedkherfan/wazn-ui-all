package com.wazn.ui.service;

import com.wazn.ui.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HomeService {

    private final RestTemplate restTemplate;

    private final String GET_ALL_URL = "http://localhost:6789/wazn/accounts/all";
    private final String GET_URL_BY_ID = "http://localhost:6789/wazn/accounts/";
    private final String SAVE = "http://localhost:6789/wazn/accounts/";

    @Autowired
    public HomeService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<GetAllDataResponse> getAll(){
        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL,GetAllDataResponse[].class)).collect(Collectors.toList());
    }

    public GetAllDataResponse getAllById(String mobile){
        return restTemplate.getForObject(GET_URL_BY_ID + mobile + "/all", GetAllDataResponse.class);
    }

    public void save(String mobile, String comment) {
        String url = "http://localhost:6789/wazn/accounts/"+mobile+"/"+comment+"/save";
        Map<String, String> map = new HashMap<String, String>();
        map.put("mobile", mobile);
        map.put("comment", comment);
        restTemplate.put(url, map);
    }

    public void status(String mobile, String status) {
        String url = "http://localhost:6789/wazn/accounts/"+mobile+"/"+status+"/status";
        Map<String, String> map = new HashMap<String, String>();
        map.put("mobile", mobile);
        map.put("status", status);
        restTemplate.put(url, map);
    }

    public Boolean checkMeeting(String mobile) {
        String url = "http://localhost:6789/wazn/accounts/"+mobile+"/checkMeeting";
        Map<String, String> map = new HashMap<String, String>();
        map.put("mobile", mobile);
        Boolean object = restTemplate.getForObject(url, Boolean.class, map);
        return object;
    }

    public List<ListUserResponse> listUser() {
        String url = "http://localhost:6789/wazn/users/listUsers";
        return Arrays.stream(restTemplate.getForObject(url,ListUserResponse[].class)).collect(Collectors.toList());
    }

    public AddUserResponse addAdminUser(AddUserRequest request) {
        String url = "http://localhost:6789/wazn/users/addUser";
        AddUserResponse addUserResponse = restTemplate.postForObject(url, request, AddUserResponse.class);
        return addUserResponse;
    }

    public void editAdminUser(UpdateUserRequest request) {
        String url = "http://localhost:6789/wazn/users/"+request.getUserName()+"/updateUser";
        UpdateUserResponse updateUserResponse = restTemplate.postForObject(url, request, UpdateUserResponse.class);
    }
}
