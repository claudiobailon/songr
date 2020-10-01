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
    public RedirectView addSong(String title, long songId, int length, int trackNumber){
        Album record = albumRepository.getOne(songId);
        Song song = new Song(record, title, length,trackNumber);
        songRepository.save(song);
        return new RedirectView("/albums");
    }


}
