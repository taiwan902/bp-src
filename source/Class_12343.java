/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Mouse
 *  internal.org.lwjgl.opengl.Display
 */
import internal.org.lwjgl.input.Mouse;
import internal.org.lwjgl.opengl.Display;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12343 {
    public int Field_12344;
    public int Field_12345;

    public void Method_12346() {
        Mouse.setGrabbed((3 & -24575) != 0);
        this.Field_12344 = -22229 & 4112;
        this.Field_12345 = 30733 & 672;
    }

    private void Method_12347() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_12348() {
        Mouse.setCursorPosition((int)(Display.getWidth() / (-27598 & 2306)), (int)(Display.getHeight() / (4134 & -20670)));
        Mouse.setGrabbed((-31232 & 22560) != 0);
    }

    public void Method_12349() {
        this.Field_12344 = Mouse.getDX();
        this.Field_12345 = Mouse.getDY();
    }
}

