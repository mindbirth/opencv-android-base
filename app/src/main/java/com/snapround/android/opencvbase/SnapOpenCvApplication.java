package com.snapround.android.opencvbase;

import android.app.Application;

import org.opencv.android.OpenCVLoader;

/**
 * Example Application that loads OpenCv..
 */
public class SnapOpenCvApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OpenCVLoader.initDebug();
    }
}
