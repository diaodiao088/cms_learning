package com.zd.com.a20180419pullrefresh.app.lifecycle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zd on 18-4-20.
 * <p>
 * comments :
 */

public class LifeCycleComponentManager implements IComponentContainer {

    private HashMap<String , LifeCycleComponent> mComponentList;

    public LifeCycleComponentManager(){

    }

    @Override
    public void addComponent(LifeCycleComponent component) {
        if (component != null){
            if (mComponentList == null){
                mComponentList = new HashMap<String , LifeCycleComponent>();
            }

            mComponentList.put(component.toString() , component);
        }
    }


    public void onBecomeVisibleFromTotallyInvisible(){

        if (mComponentList == null){
            return;
        }

        Iterator<Map.Entry<String , LifeCycleComponent>> it = mComponentList.entrySet().iterator();
        while (it.hasNext()){
            LifeCycleComponent component = it.next().getValue();
            if (component != null){
                component.onBecomeVisibleFromTotallyInvisible();
            }
        }

    }

    public void onBecomesPartiallyInvisible(){

        if (mComponentList == null){
            return;
        }

        Iterator<Map.Entry<String , LifeCycleComponent>> it = mComponentList.entrySet().iterator();
        while (it.hasNext()){
            LifeCycleComponent component = it.next().getValue();
            if (component != null){
                component.onBecomePartiallyInvisible();
            }
        }

    }


    public void onBecomeVisibleFromPartiallyInvisible(){

        if (mComponentList == null){
            return;
        }

        Iterator<Map.Entry<String , LifeCycleComponent>> it = mComponentList.entrySet().iterator();
        while (it.hasNext()){
            LifeCycleComponent component = it.next().getValue();
            if (component != null){
                component.onBecomeVisible();
            }
        }
    }

    public void onDestroy(){

        if (mComponentList == null){
            return;
        }

        Iterator<Map.Entry<String , LifeCycleComponent>> it = mComponentList.entrySet().iterator();
        while (it.hasNext()){
            LifeCycleComponent component = it.next().getValue();
            if (component != null){
                component.onDestroy();
            }
        }
    }





}
