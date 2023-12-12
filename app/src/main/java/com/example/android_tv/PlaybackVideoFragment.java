package com.example.android_tv;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;


import androidx.leanback.app.VideoSupportFragment;
import androidx.leanback.app.VideoSupportFragmentGlueHost;
import androidx.leanback.media.MediaPlayerAdapter;
import androidx.leanback.media.PlaybackTransportControlGlue;
import androidx.leanback.widget.PlaybackControlsRow;

import java.util.List;

public class PlaybackVideoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Crear un WebView
        WebView webView = new WebView(requireContext());
        webView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));

        // Habilitar JavaScript (necesario para la reproducción de YouTube)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Obtener la instancia de Movie desde la intención
        final Movie movie = (Movie) requireActivity().getIntent().getSerializableExtra(DetailsActivity.MOVIE);

        // Cargar el video de YouTube
        String videoId = extractVideoId(movie.getVideoUrl());
        webView.loadUrl("https://www.youtube.com/embed/" + videoId);

        return webView;
    }

    // Método para extraer la ID del video de una URL de YouTube
    private String extractVideoId(String youtubeUrl) {
        String videoId = null;

        // Primero, intentar extraer de manera más precisa usando expresiones regulares
        String[] patterns = {
                "(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|\\/e\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\\u200C\u200C2F|youtu.be%2F|%2Fv%2F)([\\w-]{11})[^#\\&\\?\\n]*",
                "^[^\\w]*([\\w-]{11}).*$"
        };

        for (String pattern : patterns) {
            java.util.regex.Pattern compiledPattern = java.util.regex.Pattern.compile(pattern);
            java.util.regex.Matcher matcher = compiledPattern.matcher(youtubeUrl);

            if (matcher.find()) {
                videoId = matcher.group(1);
                return videoId;
            }
        }

        // Si las expresiones regulares no fueron suficientes, intentar con otro método específico
        Uri uri = Uri.parse(youtubeUrl);
        if ("www.youtube.com".equals(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.contains("watch") && pathSegments.size() > 1) {
                int index = pathSegments.indexOf("watch") + 1;
                if (index < pathSegments.size()) {
                    videoId = pathSegments.get(index);
                }
            }
        } else if ("youtu.be".equals(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() > 0) {
                videoId = pathSegments.get(0);
            }
        }
        return videoId;
    }
    @Override
    public void onPause() {
        super.onPause();
    }
}