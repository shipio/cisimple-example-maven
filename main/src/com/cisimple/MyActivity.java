package com.cisimple;

import android.app.Activity;
import android.os.Bundle;
import com.cisimple.dependency1.*;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SomeOtherClass instance = new SomeOtherClass();
        setContentView(R.layout.main);
    }
}
