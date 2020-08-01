package com.yalantis.ucrop.callback;

import android.net.Uri;

import androidx.annotation.NonNull;

public interface BitmapCropDetailsCallback {

    void onCropDetailsRetrieved(int offsetX, int offsetY, int imageWidth, int imageHeight);

}