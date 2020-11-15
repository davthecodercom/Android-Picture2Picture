package com.lastreact.picture2picturedemo.extensions

import android.content.Context
import android.content.pm.PackageManager

fun Context.isOreoOrAbove(): Boolean {
    return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O
}

fun Context.hasPipSupport(): Boolean {
    return this.isOreoOrAbove() && packageManager.hasSystemFeature(PackageManager.FEATURE_PICTURE_IN_PICTURE)
}