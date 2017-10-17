package com.example.samar.viewtypeexample.ui.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

/**
 * Created by samar on 16/10/17.
 */

public abstract class HidingScrollListener extends RecyclerView.OnScrollListener {

    private static final int HIDE_THRESHOLD = 20;
    private int scrolledDistance = 0;
    private boolean controlsVisible = true;


    private boolean isUserScrolling = false;
    private boolean isListGoingUp = true;
    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);


        if(newState== RecyclerView.SCROLL_STATE_DRAGGING)
        {
            onHide();
        }
        else if(newState==RecyclerView.SCROLL_STATE_IDLE)
        {
            onShow();
        }
    }


    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        LinearLayoutManager mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();

        int visibleItemCount = mLayoutManager.getChildCount();
        int totalItemCount = mLayoutManager.getItemCount();
        int pastVisibleItems = mLayoutManager.findFirstVisibleItemPosition();

        Log.d("##WWW", pastVisibleItems + visibleItemCount +"--"+ totalItemCount);

         if(pastVisibleItems + visibleItemCount==2)
         {
             onScrollTop();
         }
         else if(pastVisibleItems + visibleItemCount >1)
         {
             onScrollHide();
         }



        /*if (scrolledDistance > HIDE_THRESHOLD && controlsVisible) {
           onScrollHideTop();
            controlsVisible = false;
            scrolledDistance = 0;
        } else if (scrolledDistance < -HIDE_THRESHOLD && !controlsVisible) {
           // onShow();
            controlsVisible = true;
            scrolledDistance = 0;
        } else if (topPosition==0) {
            onTop();
            controlsVisible = true;
        }

        if ((controlsVisible && dy > 0) || (!controlsVisible && dy < 0)) {
            scrolledDistance += dy;
        }
*/


    }


    public abstract void onHide();

    public abstract void onShow();

    public abstract void onTop();

    public abstract void onScrollTop();

    public abstract void onScrollHide();


}
