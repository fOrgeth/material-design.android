package com.roxiemobile.materialdesign.ui.routing;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

import com.roxiemobile.materialdesign.data.Resources.Layout;
import com.roxiemobile.materialdesign.ui.routing.base.IntentBuilder;

public class LeafIntentBuilder extends IntentBuilder<LeafIntentBuilder>
{
// MARK: - Methods

    @Override
    protected @LayoutRes int activityContainerId() {
        return Layout.ROOT_LAYOUT_ID;
    }

    @Override
    public @NonNull Intent build(@NonNull Context context) {
        Intent intent = super.build(context);

        // Update Intent
        intent.setAction(Intent.ACTION_CONFIGURATION_CHANGED);
        return intent;
    }
}
