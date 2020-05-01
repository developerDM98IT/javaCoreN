/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Minh.gameobject;

/**
 *
 * @author minh
 */
//obect giong con tro trong c++
public abstract class GameObject {
    
    private float posX;
    private float posY;
    private GameWorld gameWorld;

    public GameObject(float posX, float posY, GameWorld gameWorld) {
        this.posX = posX;
        this.posY = posY;
        this.gameWorld = gameWorld;
    }
    
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public GameWorld getGameWorld() {
        return gameWorld;
    }

    public void setGameWorld(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
    }
    
    public abstract void Update();//
    
}