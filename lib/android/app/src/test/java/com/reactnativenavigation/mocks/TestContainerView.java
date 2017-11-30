package com.reactnativenavigation.mocks;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.reactnativenavigation.viewcontrollers.ContainerViewController;
import com.reactnativenavigation.views.TopBar;

public class TestContainerView extends View implements ContainerViewController.ContainerView {

	private TopBar topBar;

	public TestContainerView(final Context context) {
		super(context);
		topBar = new TopBar(context, this);

	}

	@Override
	public boolean isReady() {
		return false;
	}

	@Override
	public View asView() {
		return this;
	}

	@Override
	public void destroy() {
	}

	@Override
	public void sendContainerStart() {
	}

	@Override
	public void sendContainerStop() {
	}

	@Override
	public void sendOnNavigationButtonPressed(String id, String buttonId) {
	}

	@Override
	public String getContainerId() {
		return null;
	}
}
