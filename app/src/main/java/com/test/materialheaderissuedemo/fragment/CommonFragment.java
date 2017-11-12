package com.test.materialheaderissuedemo.fragment;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.test.materialheaderissuedemo.R;
import com.test.materialheaderissuedemo.adapter.CommonAdapter;

import java.util.ArrayList;
import java.util.List;


public class CommonFragment extends BaseFragment implements OnRefreshListener {

    private SmartRefreshLayout refreshLayout;
    private RecyclerView mRecyclerView;
    private CommonAdapter adapter;

    protected int getLayoutId() {
        return R.layout.fragment_common;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        refreshLayout = (SmartRefreshLayout) root.findViewById(R.id.refreshLayout);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new CommonAdapter();
        mRecyclerView.setAdapter(adapter);
        refreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //尝试结束刷新还是没效果
        refreshLayout.finishRefresh(0);
    }

    @Override
    protected void initData() {
        List<String> mDatas = new ArrayList();
        for (int i = 0; i < 10; i++) {
            mDatas.add("Test Data " + i);
        }
        adapter.replaceData(mDatas);
    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                refreshLayout.finishRefresh();
            }
        }, 1500);
    }
}
