package com.example.islam.homifymobilemosaic.presenter;

import com.example.islam.homifymobilemosaic.adapter.ItemObjects;
import com.example.islam.homifymobilemosaic.bussiness.MosaicBussiness;
import com.example.islam.homifymobilemosaic.view.MosaicView;

import java.util.List;

/**
 * Created by islam on 29/10/16.
 */

public class MosaicPresenter {
    MosaicView mosaicView;
    public MosaicPresenter(MosaicView mosaicView){
        this.mosaicView = mosaicView;
    }
    public void processData(){
        mosaicView.showMosaicView(  new MosaicBussiness().getListItemData());
    }
}
