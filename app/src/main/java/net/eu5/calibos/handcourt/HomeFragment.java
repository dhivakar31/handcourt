package net.eu5.calibos.handcourt;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.IntegerRes;
import androidx.fragment.app.Fragment;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;


public class HomeFragment extends Fragment {
Button b;
Integer a1,b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        b=view.findViewById (R.id.a1);
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
           
                Intent i=new Intent (getContext (),Chapterpage.class);
                startActivity (i);
            }
        });
                return view;
    }

}
