/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_38526
extends Class_31428 {
    private double Field_38527;

    private void Method_38528() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_38529() {
        return "Mineshaft";
    }

    protected Class_18019 Method_38530(int n, int n2) {
        return new Class_22818(this.\u0000strictfp, this.\u0000strictfp, n, n2);
    }

    protected boolean Method_38531(int n, int n2) {
        return (this.\u0000strictfp.nextDouble() < this.Field_38527 && this.\u0000strictfp.nextInt(14558 & 17520) < Math.max(Math.abs(n), Math.abs(n2)) ? 2259 & 8705 : 2054 & 26169) != 0;
    }

    public Class_38526(Map map) {
        this.Field_38527 = 1.8108108108108107 * 0.002208955223880597;
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("chance")) continue;
            this.Field_38527 = Class_13337.Method_13373((String)entry.getValue(), this.Field_38527);
        }
    }

    public Class_38526() {
        this.Field_38527 = 0.0028571428571428576 * 1.4;
    }
}

