package com.devsuperior.dslist.entities;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable // indica que que esta classe é uma chave composta
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;


    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }


    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return this.list;
    }

    public void setList(GameList list) {
        this.list = list;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(list, other.list);
    }
}
