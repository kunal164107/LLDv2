package com.kunal.lldStandardInterviewQuestions.LLDTicTacToe.Model;

import lombok.Data;

@Data
public class Player {

    public String name;
    public Long id;
    PlayingPiece playingPiece;

    public Player(String name, Long id, PlayingPiece playingPiece) {
        this.name = name;
        this.id = id;
        this.playingPiece = playingPiece;
    }
}