package com.example.helloworld.test;

import com.example.helloworld.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;  
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;  
import static com.google.android.apps.common.testing.ui.espresso.Espresso.pressBack;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.closeSoftKeyboard;  
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;  
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;  
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;  
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;  
import static org.hamcrest.Matchers.allOf;  
import static org.hamcrest.Matchers.containsString;  
import static org.hamcrest.Matchers.instanceOf;  
import static org.hamcrest.Matchers.is; 

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;

public class HelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private Activity mActivity;
	private Instrumentation mInstrumentation;
	
	public HelloWorldTest() {
		super(MainActivity.class);
	}
	
	@Override
    public void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
        mInstrumentation = getInstrumentation();
        setActivityInitialTouchMode(false);
    }      

	public void testHelloWorld() {
		onView(withId(com.example.helloworld.R.id.helloworld))
		.check(matches(withText("Hello World!")));
	}
}
