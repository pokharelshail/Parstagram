package com.example.parstagram_shail;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GaWvsF5o0elEZHkCDjyN0d6CcLIV4ko77TgW3x4U")
                .clientKey("oYVWCJ8ybD4swPeGQA1q3fDmhVKBR01xTMjmG0aj")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
