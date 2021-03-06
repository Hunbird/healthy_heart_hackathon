package com.vaibhav_abhishek.teamiitp.healthy_heart;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;


public class symptom_checker extends Fragment {
    WebView wv;

    String url;
    public symptom_checker()
    {
        url="http://www.mayoclinic.org/symptom-checker/select-symptom/itt-20009075";
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_symptom_checker, container, false);
//        ProgressDialog pd=new ProgressDialog(getActivity());
        ProgressBar progressBar=(ProgressBar)view.findViewById(R.id.symp_prog);
        wv=(WebView)view.findViewById(R.id.symptom_webview);
        wv.setWebViewClient(new mybrowser(progressBar));
        progressBar.setVisibility(View.VISIBLE);
//        pd.setTitle("loading...");
//        pd.show();
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
        return view;

    }

}
