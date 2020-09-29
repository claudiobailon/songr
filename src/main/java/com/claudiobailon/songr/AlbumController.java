package com.claudiobailon.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {

    @GetMapping("/albums")//get route
    public String showAlbums(Model m){
        ArrayList<Album> albums = new ArrayList<>();
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