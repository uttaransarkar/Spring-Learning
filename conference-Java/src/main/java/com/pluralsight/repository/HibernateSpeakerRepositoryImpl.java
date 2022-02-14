package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll()   {

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Uttaran");
        speaker.setLastName("Sarkar");

        speakers.add(speaker);

        return speakers;
    }

}
