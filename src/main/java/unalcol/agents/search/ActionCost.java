package unalcol.agents.search;

import unalcol.agents.Action;

/**
 * <p>Title: </p>
 * <p>
 * <p>Description: </p>
 * <p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>
 * <p>Company: Universidad Nacional de Colombia</p>
 *
 * @author Jonatan Gómez
 * @version 1.0
 */
public interface ActionCost {
    public double evaluate(State state, Action action);
}
