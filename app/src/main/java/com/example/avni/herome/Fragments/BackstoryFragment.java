package com.example.avni.herome.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.avni.herome.Activities.MainActivity;
import com.example.avni.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BackstoryFragment.BackstoryInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BackstoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BackstoryFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView heroTitleTxt;
    private ImageView heroImg;
    private EditText heroStoryTxt;
    private Button primaryBtn;
    private Button secondaryBtn;
    private Button startOverBtn;

    private BackstoryInteractionListener mListener;

    public BackstoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BackstoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BackstoryFragment newInstance(String param1, String param2) {
        BackstoryFragment fragment = new BackstoryFragment();
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
        View view = inflater.inflate(R.layout.fragment_backstory, container, false);

        heroTitleTxt = (TextView) view.findViewById(R.id.heroTitleTxt);
        heroImg = (ImageView) view.findViewById(R.id.heroImg);
        heroStoryTxt = (EditText) view.findViewById(R.id.heroStoryTxt);
        primaryBtn = (Button) view.findViewById(R.id.primaryBtn);
        secondaryBtn = (Button) view.findViewById(R.id.secondaryBtn);
        startOverBtn = (Button) view.findViewById(R.id.startOverBtn);


        String arg1 = getArguments().getString(ARG_PARAM1);
        String arg2 = getArguments().getString(ARG_PARAM2);
        if (arg1.equalsIgnoreCase("Born with them")) {
            switch (arg2.toLowerCase()) {
                case "turtle power":
                    heroTitleTxt.setText("Teenage M Ninja");
                    heroImg.setImageResource(R.drawable.turtle_power);
                    heroStoryTxt.setText("This is the oldest Teenage Mutant Ninja of them all. Unlike his brothers \n he was born like this", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "flight":
                    break;
                case "web slinging":
                    heroTitleTxt.setText("Spidey");
                    heroImg.setImageResource(R.drawable.spider_web);
                    heroStoryTxt.setText("Spidey was born like this. He is the most cheerished kid of the block.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    primaryBtn.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power, 0, 0, 0);
                    secondaryBtn.setText(arg2);
                    break;
                case "laser vision":
                    heroTitleTxt.setText("LAZAHHH");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("He fucks shit up with his laser.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "super strength":
                    heroTitleTxt.setText("Khabib");
                    heroImg.setImageResource(R.drawable.super_strength);
                    heroStoryTxt.setText("Khabib is a well-trained, UFC Lightweight Champion. Most of his fanbase are albanian.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                default:
                    heroTitleTxt.setText("THOR");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("Thor is the son of Jared and Kara Ragnarok. He was born with\n " + "the power to control the\n lightining and do as it may with it.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
            }
        } else if (arg1.equalsIgnoreCase("Came by accident")) {
            switch (arg2.toLowerCase()) {
                case "turtle power":
                    heroTitleTxt.setText("Teenage M Ninja");
                    heroImg.setImageResource(R.drawable.turtle_power);
                    heroStoryTxt.setText("Teenage M Ninnja is a ninja. Simple as that.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "flight":
                    break;
                case "web slinging":
                    heroTitleTxt.setText("Spidey");
                    heroImg.setImageResource(R.drawable.spider_web);
                    heroStoryTxt.setText("Spidey was accidentally bit by a spider at the Mo Labs Co., and since then,\n he got his super-hero abilities of a spider.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "laser vision":
                    heroTitleTxt.setText("LAZAHHH");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("He had to go under eye surgery to avoid complete blindes, but the lead doctor\n turnt out to be the supervillan Josh \"The Mayhem\" Olson."
                            + "You know the rest.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "super strength":
                    heroTitleTxt.setText("Khabib");
                    heroImg.setImageResource(R.drawable.super_strength);
                    heroStoryTxt.setText("Khabib was born \"accidentally\" in the Russian family of an ex-milittary commando.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                default:
                    heroTitleTxt.setText("The Flash");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("Flash was struck by a lighting. A lightning full of radioactive waves \n that came from an out of space meteor..", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
            }
        } else if (arg1.equalsIgnoreCase("Genetic mutation")) {
            switch (arg2.toLowerCase()) {
                case "turtle power":
                    heroTitleTxt.setText("Teenage M Ninja");
                    heroImg.setImageResource(R.drawable.turtle_power);
                    heroStoryTxt.setText("This Ninja, along with all three of his brother, was exposed to high radioactive waves.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "flight":
                    break;
                case "web slinging":
                    heroTitleTxt.setText("Spidey");
                    heroImg.setImageResource(R.drawable.spider_web);
                    heroStoryTxt.setText("Spidey came in contact with a \"Spiders ADN\". A lab-spider that is. You know the drill.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "laser vision":
                    heroTitleTxt.setText("LAZAHHH");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("LAZAHHH took an eye surgery operation. During the operation\n the radioactive waves hit his pupils." +
                            "\nHe got his pupils dilated, only to never return back to normal. Oh, and shoot laser beams too.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                case "super strength":
                    heroTitleTxt.setText("Khabib");
                    heroImg.setImageResource(R.drawable.super_strength);
                    heroStoryTxt.setText("Khabib is just like that. A beast, genetically.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
                default:
                    heroTitleTxt.setText("The Thunder");
                    heroImg.setImageResource(R.drawable.thors_hammer);
                    heroStoryTxt.setText("Thunder was taking a flight to Vegas, when a lightning that was a result of prior thunders\n struck his plane"
                            + " only to genetically modify this ordinary man, into a full-time beast.", TextView.BufferType.EDITABLE);
                    primaryBtn.setText(arg1);
                    secondaryBtn.setText(arg2);
                    break;
            }
        }

        startOverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.loadMainFragment();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }




    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onBackstoryFragmentInteraction(uri);
        }
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BackstoryInteractionListener) {
            mListener = (BackstoryInteractionListener) context;
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface BackstoryInteractionListener {
        // TODO: Update argument type and name
        void onBackstoryFragmentInteraction(Uri uri);
    }
}
