package com.krzysztof.chess.states;

import com.krzysztof.chess.Game;
import com.krzysztof.chess.GameGUI;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class MainMenuState implements State{
    Button button;
    // to get control over state machine
    private Game game;
    private double dt;
    private GameGUI gui;

    private BufferedImage background;

    public MainMenuState(Game game, GameGUI gui, double dt){
        this.game = game;
        this.dt = dt;
        this.gui = gui;
        try{
            background = ImageIO.read(new File("D:\\Java\\Java\\MyChess\\src\\main\\resources\\bg.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endState() {

    }

    public void updateButton(){

    }

    @Override
    public void update(double dt) {
        this.dt = dt;
    }

    @Override
    public void render() {
        Graphics g = this.gui.gamePanel.getGraphics();
        ImageObserver observer = (img, infoflags, x, y, width, height) -> false;
        g.drawImage(background, 1, 1, observer);

        g.setColor(Color.RED);
        g.fillRect(100, 100, 200, 200);
    }
}
