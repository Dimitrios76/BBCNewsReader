package com.example.dkallikragas_bbcnewsreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    FragmentManager fm = getSupportFragmentManager();

    if(isTablet) {
        Fragment parent = (Fragment)getActivity();
        parent.deleteMesageId((int)id);

        parent.getSupportFragmentManager().beginTransaction().remove(this).commit();
    }

    else {
        EmptyActivity parent = (EmptyActivity) getActivity();
        Intent backToFragment = new Intent();
        backToFragment.putExtra(Fragment.ITEM_ID, dataFromActivity.getLong(Fragment));

        parent.setResult(Activity.RESULT_OK, backToFragment);
        parent.finish();

    }
};
    return result;

}