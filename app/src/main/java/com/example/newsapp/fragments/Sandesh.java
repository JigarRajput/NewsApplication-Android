package com.example.newsapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Sandesh#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Sandesh extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Sandesh() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Sandesh.
     */
    // TODO: Rename and change types and number of parameters
    public static Sandesh newInstance(String param1, String param2) {
        Sandesh fragment = new Sandesh();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sandesh, container, false);
        WebView view1 = view.findViewById(R.id.webViewSandesh);
        view1.loadUrl("https://sandesh.com/");
        view1.setWebViewClient(new WebViewController());
        view1.getSettings().setUseWideViewPort(true);
        view1.getSettings().setLoadWithOverviewMode(true);
        view1.getSettings().setSupportZoom(true);
        view1.getSettings().setBuiltInZoomControls(true);
        return view;
    }
}