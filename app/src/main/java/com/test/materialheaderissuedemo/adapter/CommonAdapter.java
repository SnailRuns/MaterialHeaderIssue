package com.test.materialheaderissuedemo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.test.materialheaderissuedemo.R;


public class CommonAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public CommonAdapter() {
        super(R.layout.item_test);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, String item) {
        viewHolder.setText(R.id.tv_content, item);
    }
}
