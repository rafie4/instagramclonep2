package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Xy0jfU5OT2uePGXl5Y439O3Xh4ICqACalkUeBRKB")
                .clientKey("t3hzOcNArW0h5o80v8FhFQbUKIYkya28olqDFtRv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}