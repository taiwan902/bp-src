/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  net.java.games.input.Component$Identifier
 */
package net.java.games.input;

import net.java.games.input.Component;

public interface Component {
    public Identifier getIdentifier();

    public boolean isRelative();

    public boolean isAnalog();

    public float getDeadZone();

    public float getPollData();

    public String getName();
}

