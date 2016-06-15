package model;

import model.database.IStockable;
import model.elements.Element;
import model.elements.Entity;
import model.elements.Hero;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *@author Marie
 * level of the game
 */
public class Level implements IStockable {

    private int number;
    private boolean exit = false;

    private ArrayList<Entity> entities;
    /**
     * level of Element
     */
    private Element elements[][];
    /**
     * level of hero
     */

    private Hero hero;

    /**
     *level of dimention
     */

    private Dimention dimention;

    /**
     * Localisation of elements
     * @return
     */

    public boolean setElement(Integer x, Integer y, Element element){
        return false;
    }
    /**
     * Number of level
     * @param
     */
    private Integer number(){
        return null;
    }

    /**
     * All data storage of raw in the data base
     * @param raw
     */
    public void load(ResultSet raw) {

    }
    /**
     * Name of table in DB
     * @return
     */
    public String getTableName() {
        return ("level");
    }

    /**
     * Get the number of level
     * @return
     * The number
     */
    public int getNumber() {
        return number;
    }
    /**
     * Set the number of level
     * @param number
     * The number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * Get the dimention of level
     * @return
     * The dimention
     */
    public Dimention getDimention() {
        return dimention;
    }
    /**
     * Set the dimention of level
     * @param dimention
     * The dimention
     */
    public void setDimention(Dimention dimention) {
        this.dimention = dimention;
    }
    /**
     * Get the hero of level
     * @return
     * The Hero
     */
    public Hero getHero() {
        return hero;
    }
    /**
     * Set the hero of level
     * @param hero
     * The hero
     */
    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Element[][] getElements() {
        return elements;
    }
    /**
     * Set the element of the level
    * @return
     *The element
    */
    public void setElements(Element[][] elements) {
        this.elements = elements;
    }
    /**
     * Get the element of level
     * @return
     * The element
     */
    public Element getElement(int x, int y){
        return this.elements[y][x];
    }

    /**
     * Localisation of element
     * @param x
     * localisation x
     * @param y
     * localisation y
     * @param element
     */
    public void setElement(int x, int y, Element element){
        this.elements[y][x] = element;

    }
    /**
     * Get the entities of the level
     * @return
     * The entity
     */
    public ArrayList<Entity> getEntities() {
        return entities;
    }
    /**
     * Set the entities of the level
     * @param entities
     * The entity
     */
    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    /**
     * Is (get) the exit of the level
     * @return
     * The sprite
     */
    public boolean isExit() {
        return exit;
    }
    /**
     * Set exit of the level
     * @param exit
     * The exit
     */
    public void setExit(boolean exit) {
        this.exit = exit;
    }
}

