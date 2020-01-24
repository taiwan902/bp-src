/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36556
extends Class_33781 {
    public Class_31961 Field_36557 = new Class_31961(this).Method_31988(8368 & 580, 1354 & 8719).Method_32002(0.0f, 2.8f * -1.4285715f, -0.39346156f * 2.516129f, -24443 & 2077, 7432 & 25097, -24341 & 5);
    public Class_31961 Field_36558 = new Class_31961(this).Method_31988(1657 & 284, 16398 & 1098).Method_32002(0.0f, 6.1f * -0.6557377f, 0.0f, 18437 & -23475, 24072 & 168, 20946 & -23040);
    public Class_31961 Field_36559 = new Class_31961(this).Method_31988(4272 & 11792, -32254 & 29825).Method_32002(0.0f, 1.0f * -5.0f, 0.0f, 12998 & 16438, 10 & 2602, -22582 & 2052);
    public Class_31961 Field_36560 = new Class_31961(this).Method_31988(24728 & -32449, 8219 & 5002).Method_32002(0.0f, 0.61904764f * -6.4615383f, 0.0f, -29625 & 13085, 26664 & 9, 14336 & 1558);
    public Class_31961 Field_36561 = new Class_31961(this).Method_31988(6274 & 16641, 2080 & 7).Method_32002(0.79347825f * -7.561644f, 2.2f * -2.2727273f, 0.0f, -31538 & 4118, 11498 & 4366, -28143 & 9608);
    public Class_31961 Field_36562 = new Class_31961(this).Method_31988(-32722 & 9804, 266 & 9262).Method_32002(0.0f, 2.7083333f * -1.4769231f, 0.8674699f * -0.011527777f, 261 & 30245, 10264 & 16908, 13203 & 16457);
    public Class_31961 Field_36563 = new Class_31961(this).Method_31988(-15859 & 6156, -13264 & 4742).Method_32002(-1.4545455f * 0.6875f, -1.891892f * 2.642857f, 0.0f, 14090 & 2051, 16459 & 1034, 8678 & 23040);

    public void Method_36564(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_36566(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_36561.Method_31999(f6);
        this.Field_36559.Method_31999(f6);
        this.Field_36563.Method_31999(f6);
        this.Field_36557.Method_31999(f6);
        this.Field_36562.Method_31999(f6);
        this.Field_36560.Method_31999(f6);
        this.Field_36558.Method_31999(f6);
    }

    public Class_36556() {
        this.Field_36561.Method_31993(0.0f, 0.0f, 1.0476191f * -0.9545454f);
        this.Field_36559.Method_31993(0.0f, 0.0f, 1.0f);
        this.Field_36563.Field_31968 = 2.1111112f * 0.7440614f;
    }

    private void Method_36565() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36566(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        float f7 = (Class_13337.Method_13370(f * (0.027142856f * 0.7368421f)) * (0.25510204f * 0.39200002f) + 3.846154f * 0.325f) * f4;
        this.Field_36561.Field_31968 = 0.058177643f * 54.0f + f7;
        this.Field_36559.Field_31968 = -f7;
        this.Field_36557.Field_31968 = f7;
        this.Field_36562.Field_31968 = -f7;
        this.Field_36560.Field_31968 = f7 - f7 * 2.0f * f2;
        this.Field_36558.Field_31968 = f7 - f7 * 2.0f * f3;
        this.Field_36557.Field_31976 = Class_13337.Method_13370(f7);
        this.Field_36562.Field_31976 = Class_13337.Method_13370(f7);
        this.Field_36560.Field_31976 = Class_13337.Method_13370(f7);
        this.Field_36558.Field_31976 = Class_13337.Method_13370(f7);
    }
}

