/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_19328
extends Class_18343 {
    public String Method_19329() {
        return "Nether";
    }

    public String Method_19330() {
        return "_nether";
    }

    public float Method_19331(long l, float f) {
        return 4.375f * 0.114285715f;
    }

    public Vec3 Method_19332(float f, float f2) {
        return new Vec3(0.030612244897959183 * 6.533333430687587, 0.02535211210939246 * 1.1833333333333333, 21.333333333333332 * 0.001406249968567863);
    }

    private void Method_19333() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31457 Method_19334() {
        return new Class_32241(this);
    }

    protected void Method_19335() {
        float f = 0.31944445f * 0.31304348f;
        for (int i = 2048 & -23023; i <= (5135 & 2351); ++i) {
            float f2 = 1.0f - (float)i / (10.238095f * 1.4651163f);
            this.\u0000strictfp[i] = (1.0f - f2) / (f2 * (3.1666665f * 0.94736844f) + 1.0f) * (1.0f - f) + f;
        }
    }

    public boolean Method_19336() {
        return (9220 & 4193) != 0;
    }

    public void Method_19337() {
        this.\u0000strictfp = new Class_43191(Class_17281.Field_17327, 0.0f);
        this.\u0000, ` = 1947 & 12385;
        this.\u0000strictfp = 1045 & 16457;
        this.\u0000strictfp = -1 & -1;
    }

    public boolean Method_19338(int n, int n2) {
        return (-32763 & 19489) != 0;
    }

    public boolean Method_19339() {
        return (784 & -16340) != 0;
    }

    public Class_12166 Method_19340() {
        return new Class_28268(this.\u0000strictfp, this.\u0000strictfp.Method_386().Method_31835(), this.\u0000strictfp.Method_392());
    }

    public boolean Method_19341(int n, int n2) {
        return (11384 & -32127) != 0;
    }
}

