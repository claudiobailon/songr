package com.claudiobailon.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/song")
    public RedirectView addSong(Album album, String title, int length, int trackNumber)


}
