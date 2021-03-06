package id.ac.ub.filkom.sekcv.astech.controller.main_app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.ac.ub.filkom.sekcv.appstroke.R;
import id.ac.ub.filkom.sekcv.astech.controller.MainPage;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Medis.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Medis#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Medis extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Medis() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Medis.
     */
    // TODO: Rename and change types and number of parameters
    public static Medis newInstance(String param1, String param2) {
        Medis fragment = new Medis();
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
        View   view   = inflater.inflate(R.layout.fragment_medis, container, false);
        Button button = (Button) view.findViewById(R.id.buttonAppMedis);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//                button.setBackgroundColor(R.color.primary_dark);
//                Intent intent = Medis.super.getContext().getPackageManager().getLaunchIntentForPackage(".controller.MainPage");
//                if(intent != null)
//                {
//                    // We found the activity now start the activity
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    Medis.super.getContext().startActivity(intent);
//                    Medis.super.getActivity().finish();
//                }
//                else
//                {
//                    // Bring user to the market or let them choose an app?
//                    Toast.makeText(Medis.super.getContext(), "Cannot find app", Toast.LENGTH_LONG).show();
//                }
//                Intent intent = new Intent(Medis.super.getContext(), MainPage.class);
                startActivity(new Intent(Medis.super.getContext(), id.ac.ub.filkom.sekcv.astech.controller.main_sub_app.MainPage.class));
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
