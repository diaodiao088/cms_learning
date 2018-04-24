package com.zd.com.a20180419pullrefresh.app.lifecycle;

/**
 *
 * Created by cmcm on 18-4-20.
 *
 */

public interface ICubeFragment {

    void onEnter(Object data);

    void onLeave();

    void onBack();

    void onBackWithData(Object data);

    boolean processBackPressed();

}
