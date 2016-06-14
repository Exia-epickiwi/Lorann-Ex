package model.elements;

import model.pathAi.PathAI;

/**
 * @author Marie
 * Autonomous and entity
 */
public class AI {

    /** The autonomous path class */
    protected PathAI path;

    /**
     * instanciate the Object
     *
     * @param path
     */
    public AI(PathAI path) {
        this.path = path;
    }

    /**
     * Get the autonomous path class
     * @return
     * The autonomous path class
     */
    public PathAI getPath() {
        return path;
    }
}
