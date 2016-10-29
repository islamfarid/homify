package com.example.islam.homifymobilemosaic.bussiness;

import com.example.islam.homifymobilemosaic.R;
import com.example.islam.homifymobilemosaic.adapter.ItemObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by islam on 29/10/16.
 */

public class MosaicBussiness {
    
    public  List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Alkane", R.mipmap.one));
        listViewItems.add(new ItemObjects("Ethane", R.mipmap.two));
        listViewItems.add(new ItemObjects("Alkyne", R.mipmap.three));
        listViewItems.add(new ItemObjects("Benzene", R.mipmap.four));
        listViewItems.add(new ItemObjects("Amide", R.mipmap.one));
        listViewItems.add(new ItemObjects("Amino Acid", R.mipmap.two));
        listViewItems.add(new ItemObjects("Phenol", R.mipmap.three));
        listViewItems.add(new ItemObjects("Carbonxylic", R.mipmap.four));
        listViewItems.add(new ItemObjects("Nitril", R.mipmap.one));
        listViewItems.add(new ItemObjects("Ether", R.mipmap.two));
        listViewItems.add(new ItemObjects("Ester", R.mipmap.three));
        listViewItems.add(new ItemObjects("Alcohol", R.mipmap.four));
        listViewItems.add(new ItemObjects("Alkane", R.mipmap.one));
        listViewItems.add(new ItemObjects("Ethane", R.mipmap.two));
        listViewItems.add(new ItemObjects("Alkyne", R.mipmap.three));
        listViewItems.add(new ItemObjects("Benzene", R.mipmap.four));
        listViewItems.add(new ItemObjects("Amide", R.mipmap.one));
        listViewItems.add(new ItemObjects("Amino Acid", R.mipmap.two));
        listViewItems.add(new ItemObjects("Phenol", R.mipmap.three));
        listViewItems.add(new ItemObjects("Carbonxylic", R.mipmap.four));
        listViewItems.add(new ItemObjects("Nitril", R.mipmap.one));
        listViewItems.add(new ItemObjects("Ether", R.mipmap.two));
        listViewItems.add(new ItemObjects("Ester", R.mipmap.three));
        listViewItems.add(new ItemObjects("Alcohol", R.mipmap.four));

        return listViewItems;
    }
}
