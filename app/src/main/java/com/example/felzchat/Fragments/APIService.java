package com.example.felzchat.Fragments;

import com.example.felzchat.Notifications.MyResponse;
import com.example.felzchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAeskNyOA:APA91bGfcO3zmr5f9MMjZA-swJkHzR-UBZX3Auf47GuRI-6jtwPoySCXqBbJMmTiKcwmcoIBDD0Yb8w-JPfHTbOr69NyIvmAI326CFAT79FsIvulnwPEVdgQ0sUeyS12zlBTnHhirNe7"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
