/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.DisplayMode
 */
import internal.org.lwjgl.opengl.DisplayMode;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public final class Class_21459
implements Comparator {
    public int Method_21460(Object object, Object object2) {
        DisplayMode displayMode = (DisplayMode)object;
        DisplayMode displayMode2 = (DisplayMode)object2;
        return displayMode.getWidth() != displayMode2.getWidth() ? displayMode2.getWidth() - displayMode.getWidth() : (displayMode.getHeight() != displayMode2.getHeight() ? displayMode2.getHeight() - displayMode.getHeight() : -32703 & 5122);
    }

    private void Method_21461() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_21459() {
    }
}

