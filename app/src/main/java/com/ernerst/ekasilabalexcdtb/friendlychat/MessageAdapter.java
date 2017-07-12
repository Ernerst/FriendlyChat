package com.ernerst.ekasilabalexcdtb.friendlychat;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/06/28.
 */

class MessageAdapter extends ArrayAdapter<FriendlyMessage>{
    public MessageAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<FriendlyMessage> objects) {
        super(context, resource, objects);
    }
}
