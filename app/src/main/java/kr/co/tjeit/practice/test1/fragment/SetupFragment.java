package kr.co.tjeit.practice.test1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.practice.R;
import kr.co.tjeit.practice.test1.adapters.RequireAdapter;
import kr.co.tjeit.practice.test1.datas.RequireData;

/**
 * Created by the on 2017-08-04.
 */

public class SetupFragment extends Fragment {

    RequireAdapter requireAdapter;
    private android.widget.ListView requireListVIew;
    List<RequireData> requireDatas = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_setup, container, false);
        this.requireListVIew = (ListView) v.findViewById(R.id.requireListVIew);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        requireDatas.clear();
        requireDatas.add(new RequireData());
        requireDatas.add(new RequireData());
        requireDatas.add(new RequireData());
        requireDatas.add(new RequireData());
        requireDatas.add(new RequireData());

        requireAdapter = new RequireAdapter(getActivity(), requireDatas);
        requireListVIew.setAdapter(requireAdapter);
    }
}
