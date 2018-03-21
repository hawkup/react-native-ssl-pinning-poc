package com.example.app;

import android.util.Log;

import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.modules.network.ReactCookieJarContainer;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.CertificatePinner;

public class OkHttpCertPin {
    private static String hostname = "www.google.com";
    private static final String TAG = "OkHttpCertPin";

    public static OkHttpClient extend(OkHttpClient currentClient){
        try {
            CertificatePinner certificatePinner = new CertificatePinner.Builder()
                .add(hostname, "sha1/h6801m+z8v3zbgkRHpq6L29Esgfzhj89C1SyUCOQmqU=")
                .build();
            return currentClient.newBuilder().certificatePinner(certificatePinner).build();
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return currentClient;
    }
}