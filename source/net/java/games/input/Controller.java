/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  net.java.games.input.Component$Identifier
 *  net.java.games.input.Controller$PortType
 *  net.java.games.input.Controller$Type
 *  net.java.games.input.EventQueue
 *  net.java.games.input.Rumbler
 */
package net.java.games.input;

import net.java.games.input.Component;
import net.java.games.input.Controller;
import net.java.games.input.EventQueue;
import net.java.games.input.Rumbler;

public interface Controller {
    public Controller[] getControllers();

    public Type getType();

    public Component[] getComponents();

    public Component getComponent(Component.Identifier var1);

    public Rumbler[] getRumblers();

    public boolean poll();

    public void setEventQueueSize(int var1);

    public EventQueue getEventQueue();

    public PortType getPortType();

    public int getPortNumber();

    public String getName();
}

