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
import kr.co.tjeit.practice.test1.adapters.AlarmAdapter;
import kr.co.tjeit.practice.test1.datas.AlarmData;

/**
 * Created by the on 2017-08-04.
 */

public class LockFragment extends Fragment {
    private android.widget.ListView alarmListView;
    AlarmAdapter alarmAdapter;
    List<AlarmData> alarmDatas = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lock, container, false);
        this.alarmListView = (ListView) v.findViewById(R.id.alarmListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        alarmDatas.clear();
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());
        alarmDatas.add(new AlarmData());

        alarmAdapter = new AlarmAdapter(getActivity(), alarmDatas);
        alarmListView.setAdapter(alarmAdapter);

    }
}
