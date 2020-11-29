package com.myapp.smartagricultureplus.Monitor_Fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.myapp.smartagricultureplus.Adapter.MonitorAdapter;
import com.myapp.smartagricultureplus.Object.Device;
import com.myapp.smartagricultureplus.R;

import java.util.ArrayList;

public class Monitor_All_Fragment extends Fragment {
    private RecyclerView rcv_monitor_All;
    private ArrayList<Device> devices;
    int[] deviceIconAll=new int[]{R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,
            R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,
            R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,R.mipmap._monitor_img,
            R.mipmap._monitor_img,R.mipmap._monitor_img};
    String[] deviceNameAll=new String[]{"智能负离子风扇","吸顶式风扇灯","Wi-Fi智能调光器",
    "WiFi水浸报警器","双模智能空调","Wi-Fi智能彩色冷暖光球泡灯","Wi-Fi电量智能统计插座","温度传感器",
    "光照传感器","土壤湿度传感器","风向风力传感器","摄像头传感器","全景摄像头","热成像摄像头","AI摄像头","双模智能电热水器","WiFi门窗磁感应器","更多设备"};
    int[] deviceBackgroundAll=new int[]{R.mipmap.img_small_background,R.mipmap.iv_device_background,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background
            ,R.mipmap.img_small_background,R.mipmap.iv_device_background};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_monitor__all_, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initAdapter();
    }

    private void initView() {
        rcv_monitor_All = getActivity().findViewById(R.id.rcv_monitor_All);
    }

    private void initData() {

        devices = new ArrayList<>();
        for (int i=0;i<deviceIconAll.length;i++){
            Device device=new Device(deviceIconAll[i],deviceNameAll[i],deviceBackgroundAll[i]);
            devices.add(device);
        }
    }

    private void initAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2,LinearLayoutManager.VERTICAL,false);
        rcv_monitor_All.setLayoutManager(gridLayoutManager);
        MonitorAdapter monitorAdapter = new MonitorAdapter(getActivity(), devices);
        rcv_monitor_All.setAdapter(monitorAdapter);
    }
}