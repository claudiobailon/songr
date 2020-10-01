package com.claudiobailon.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepository;

    @Autowired
    public SongRepository songRepository;

    @PostMapping("/albums/delete/{id}")//ToDo: Should this route be album not albums? Same for line 27
    public RedirectView removeAlbum(@PathVariable long id){
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageURL){
        Album newAlbum = new Album(title, artist, songCount, length, imageURL);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @GetMapping("/albums")//get route
    public String showAlbums(Model m){
        ArrayList<Album> albums = (ArrayList<Album>) albumRepository.findAll();
        albums.add( new Album(
                "Transatlanticism",
                "Death Cab for Cutie",
                11,
                2738,
                "https://upload.wikimedia.org/wikipedia/en/e/e9/Transatlanticism.jpg"
        ));
        albums.add( new Album(
                "The Dark Side of the Moon",
                "Pink Floyd",
                10,
                2589,
                "https://upload.wikimedia.org/wikipedia/en/3/3b/Dark_Side_of_the_Moon.png"
        ));
        albums.add( new Album(
                "Yoshimi Battles the Pink Robots",
                "the Flaming Lips",
                11,
                2845,
                "https://upload.wikimedia.org/wikipedia/en/7/7c/TheFlamingLips-YoshimiBattlesThePinkRobots.jpg"
        ));
        m.addAttribute("albums", albums);
        return "albums";
    }
}
