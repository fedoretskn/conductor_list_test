package com.test.conductor.conductortest.controllers;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.test.conductor.conductortest.R;

public class EmptyController extends Controller {

    public EmptyController() {
        super();
    }

    protected EmptyController(@Nullable Bundle args) {
        super(args);
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.empty_controller, container, false);
    }
}
