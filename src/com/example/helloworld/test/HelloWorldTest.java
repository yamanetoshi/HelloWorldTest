package com.example.helloworld.test;

import com.example.helloworld.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;

import android.test.ActivityInstrumentationTestCase2;

public class HelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	public HelloWorldTest() {
		super(MainActivity.class);
	}

	public void testHelloWorld() {
		onView(ViewMatchers.withId(com.example.helloworld.R.id.helloworld))
		.check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
	}
}
