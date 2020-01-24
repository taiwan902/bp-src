/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  net.java.games.input.ControllerEvent
 *  net.java.games.input.ControllerListener
 *  net.java.games.input.DefaultControllerEnvironment
 */
package net.java.games.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEvent;
import net.java.games.input.ControllerListener;
import net.java.games.input.DefaultControllerEnvironment;

public abstract class ControllerEnvironment {
    private static ControllerEnvironment defaultEnvironment;
    protected final ArrayList controllerListeners = new ArrayList();
    static Class class$net$java$games$input$ControllerEnvironment;
    static final boolean $assertionsDisabled;

    static void logln(String msg) {
        ControllerEnvironment.log(msg + "\n");
    }

    static void log(String msg) {
        Logger.getLogger((class$net$java$games$input$ControllerEnvironment == null ? (class$net$java$games$input$ControllerEnvironment = ControllerEnvironment.class$("net.java.games.input.ControllerEnvironment")) : class$net$java$games$input$ControllerEnvironment).getName()).info(msg);
    }

    protected ControllerEnvironment() {
    }

    public abstract Controller[] getControllers();

    public void addControllerListener(ControllerListener l) {
        if (!$assertionsDisabled && l == null) {
            throw new AssertionError();
        }
        this.controllerListeners.add(l);
    }

    public abstract boolean isSupported();

    public void removeControllerListener(ControllerListener l) {
        if (!$assertionsDisabled && l == null) {
            throw new AssertionError();
        }
        this.controllerListeners.remove((Object)l);
    }

    protected void fireControllerAdded(Controller c) {
        ControllerEvent ev = new ControllerEvent(c);
        Iterator<E> it = this.controllerListeners.iterator();
        while (it.hasNext()) {
            ((ControllerListener)it.next()).controllerAdded(ev);
        }
    }

    protected void fireControllerRemoved(Controller c) {
        ControllerEvent ev = new ControllerEvent(c);
        Iterator<E> it = this.controllerListeners.iterator();
        while (it.hasNext()) {
            ((ControllerListener)it.next()).controllerRemoved(ev);
        }
    }

    public static ControllerEnvironment getDefaultEnvironment() {
        return defaultEnvironment;
    }

    static Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError().initCause(x1);
        }
    }

    static {
        $assertionsDisabled = !(class$net$java$games$input$ControllerEnvironment == null ? (class$net$java$games$input$ControllerEnvironment = ControllerEnvironment.class$("net.java.games.input.ControllerEnvironment")) : class$net$java$games$input$ControllerEnvironment).desiredAssertionStatus();
        defaultEnvironment = new DefaultControllerEnvironment();
    }
}

