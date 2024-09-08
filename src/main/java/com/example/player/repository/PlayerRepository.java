// Write your code here
package com.example.player.repository;

import java.util.ArrayList;

import com.example.player.model.Player;

/**
 * PlayerRepository
 */
public interface PlayerRepository {

    ArrayList<Player> getPlayers();

    Player getPlayerById(int playerId);

    Player updatePlayer(int playerId, Player player);

    Player addPlayer(Player player);

    void deletePlayer(int playerId);
}