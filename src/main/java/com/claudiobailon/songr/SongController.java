package com.claudiobailon.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class SongController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/song")
    public RedirectView addSong(String title, long albumId, int length, int trackNumber){
        Album record = albumRepository.getOne(albumId);
        Song song = new Song(record, title, length, trackNumber);
        songRepository.save(song);
        return new RedirectView(String.format("/album?albumId=%d", albumId));
    }
    @GetMapping("/songs")
    public String showSongs(Model m){
        ArrayList<Song> songs =new ArrayList<>();
        songs =(ArrayList<Song>) songRepository.findAll(Sort.by(Sort.Direction.ASC, "title"));
        m.addAttribute("songs", songs);
        return "songs";
    }


}
