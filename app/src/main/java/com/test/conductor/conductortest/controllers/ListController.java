package com.test.conductor.conductortest.controllers;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.test.conductor.conductortest.R;

public class ListController extends Controller {

    public ListController() {
        super();
    }

    protected ListController(@Nullable Bundle args) {
        super(args);
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.list_controller, container, false);
    }

    @Override
    protected void onAttach(@NonNull final View view) {
        super.onAttach(view);
        getRouter().pushController(RouterTransaction.with(new EmptyController()));

//        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.container);
//        RecyclerView recyclerView = new RecyclerView(getActivity());
//        viewGroup.addView(recyclerView,
//                RecyclerView.LayoutParams.MATCH_PARENT,
//                RecyclerView.LayoutParams.MATCH_PARENT);
//
//        viewGroup.removeView(recyclerView);

    }
}
