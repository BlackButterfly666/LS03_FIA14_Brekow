package model.persistence;

import java.util.Vector;

import model.Level;

public interface IAttemptPersistence {

	int createHighscoreEntry(int F_user_id, int F_level_id, int shots, int hits, long reaction_time);
	int getPlayerPosition();
	Vector<Vector<String>> getAllAttemptsPerLevel(Level level, int game_id);
	//no update needed
	void deleteHighscore(int level_id);
}
