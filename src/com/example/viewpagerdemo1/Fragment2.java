package com.example.viewpagerdemo1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;

public class Fragment2 extends Fragment {
	
	 @Override  
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
	            Bundle savedInstanceState) {  
	        // TODO Auto-generated method stub  
	        View view=inflater.inflate(R.layout.layout2, container, false);  
	        return view;  
	    }  
}
