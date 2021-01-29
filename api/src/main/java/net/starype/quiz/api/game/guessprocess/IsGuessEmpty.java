package net.starype.quiz.api.game.guessprocess;

import net.starype.quiz.api.game.player.Player;

public class IsGuessEmpty extends GuessReceivedHead {
    @Override
    public void accept(Player<?> player, String message, Double correctness, RoundState roundState) {
        if (correctness == null) {
            setToTrue();
        } else {
            setToFalse();
        }
    }
}