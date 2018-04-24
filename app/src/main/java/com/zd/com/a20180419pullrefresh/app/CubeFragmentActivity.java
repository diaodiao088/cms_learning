package com.zd.com.a20180419pullrefresh.app;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by cmcm on 18-4-19.
 *
 */
public class CubeFragmentActivity extends FragmentActivity {

    private boolean mCloseWarned;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.addToBackStack(null);
        transaction.commit();

    }
}
