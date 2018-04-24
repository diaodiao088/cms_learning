package com.zd.com.a20180419pullrefresh.app.lifecycle;

/**
 * Created by cmcm on 18-4-19.
 *
 *
 * 这个生命周期有问题， 难道 onResume 就一定可见了吗
 *
 *
 */

public interface LifeCycleComponent {

    public void onBecomePartiallyInvisible();

    public void onBecomeVisible();

    public void onBecomeTotallyVisible();

    public void onBecomeVisibleFromTotallyInvisible();

    public void onDestroy();


}
