package com.colak.springtutorial.config;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.elasticsearch.client.RestClientBuilder;

import javax.net.ssl.SSLContext;
import java.io.File;

// @Configuration
public class HttpClientConfigImpl implements RestClientBuilder.HttpClientConfigCallback {

    @Override
    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
        try {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            UsernamePasswordCredentials usernamePasswordCredentials = new UsernamePasswordCredentials("elastic",
                    "javainuse");
            credentialsProvider.setCredentials(AuthScope.ANY, usernamePasswordCredentials);
            httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);

            String trustLocationStore = "E:\\trial\\elasticsearch-8.13.4-windows-x86_64\\elasticsearch-8.13.4\\config\\certs\\truststore.p12";
            File trustLocationFile = new File(trustLocationStore);

            SSLContextBuilder sslContextBuilder = SSLContexts.custom().loadTrustMaterial(trustLocationFile,
                    "javainuse".toCharArray());
            SSLContext sslContext = sslContextBuilder.build();
            httpClientBuilder.setSSLContext(sslContext);

        } catch (Exception exception) {
        }
        return httpClientBuilder;
    }
}
