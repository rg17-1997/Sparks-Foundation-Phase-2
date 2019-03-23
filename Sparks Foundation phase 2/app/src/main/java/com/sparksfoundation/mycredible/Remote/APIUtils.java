package com.sparksfoundation.mycredible.Remote;

import retrofit2.Retrofit;

public class APIUtils {

    private APIUtils(){

    };

    public static final String BASE_URL = "http://139.59.65.145:9090/";

    public static UserService getUserService()
    {
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }

}
