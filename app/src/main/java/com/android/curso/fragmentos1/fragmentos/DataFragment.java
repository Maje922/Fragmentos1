package com.android.curso.fragmentos1.fragmentos;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.android.curso.fragmentos1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {

    private EditText textData;
    private Button mButton;
    private DataListener callBack;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callBack=(DataListener)context;

        }catch (Exception e){
            throw new ClassCastException("No se ha implementado la interfaz DataListener");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        textData = (EditText) view.findViewById(R.id.editTextData);
        mButton = (Button) view.findViewById(R.id.buttonSend);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                callBack.sendData(textData.getText().toString());

            }
        });

        return view;
    }



    public  interface DataListener{
        void sendData(String text);
    }
}
