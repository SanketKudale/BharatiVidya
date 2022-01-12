package com.sanket.padaayi.ui.words;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.sanket.padaayi.R;

public class WordsFragment extends Fragment {

    private WordsViewModel wordsViewModel;
    VideoView video_player;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wordsViewModel =
                ViewModelProviders.of(this).get(WordsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_words, container, false);

        video_player = root.findViewById(R.id.video_player1);

        MediaController mediaController1 = new MediaController(getActivity());
        mediaController1.setAnchorView(video_player);
        video_player.setMediaController(mediaController1);
        video_player.setVideoURI(Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.video_words));
        video_player.start();

        return root;
    }
}