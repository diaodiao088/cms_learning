package com.zd.com.a20180419pullrefresh.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zd.com.a20180419pullrefresh.app.lifecycle.IComponentContainer;
import com.zd.com.a20180419pullrefresh.app.lifecycle.ICubeFragment;
import com.zd.com.a20180419pullrefresh.app.lifecycle.LifeCycleComponent;
import com.zd.com.a20180419pullrefresh.app.lifecycle.LifeCycleComponentManager;

/**
 * Created by cmcm on 18-4-20.
 */

public abstract class CubeFragment extends Fragment implements ICubeFragment,IComponentContainer {

    protected Object mDataIn;
    private boolean mFirstResume = true;

    private LifeCycleComponentManager mComponentContainer = new LifeCycleComponentManager();

    protected abstract View createView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState);

    public CubeFragmentActivity getContext(){
        return (CubeFragmentActivity) getActivity();
    }


    @Override
    public void onEnter(Object data) {
        mDataIn = data;
    }

    @Override
    public void onLeave() {
        mComponentContainer.onBecomeVisibleFromTotallyInvisible();
    }

    @Override
    public void onBack() {
        mComponentContainer.onBecomeVisibleFromTotallyInvisible();
    }

    @Override
    public void onBackWithData(Object data) {
        mComponentContainer.onBecomeVisibleFromTotallyInvisible();
    }

    @Override
    public boolean processBackPressed() {
        return false;
    }

    @Override
    public void addComponent(LifeCycleComponent component) {

    }
}
