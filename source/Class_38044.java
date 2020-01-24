/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;

public class Class_38044
extends Class_37430 {
    public static final ArrayDeque Field_38045 = new ArrayDeque();

    public static void Method_38046() {
        long l;
        long l2 = System.currentTimeMillis();
        while (!Field_38045.isEmpty() && l2 - (l = ((Long)Field_38045.peek()).longValue()) > (269485036L & 711107577L)) {
            Field_38045.poll();
        }
    }

    public void Method_38047(int n, int n2, float f) {
        this.\u0000, ` = (Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8853.\u0000strictfp() != false && (Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8895.\u0000strictfp() == false ? -7645 & 3345 : 0 & -27728;
        int n3 = this.\u0000, ` ? 1 : 0;
        if (!this.\u0000, `) {
            return;
        }
        int n4 = 278 & 3786;
        Class_38044.Method_38046();
        String string = "CPS: " + Field_38045.size();
        int n5 = -32759 & 4521;
        int n6 = this.\u0000strictfp.Method_28715(string);
        this.\u0000, `(n6 + n4 * (13058 & 17415), n5 + n4 * (35 & 20738));
        Class_38044.\u0000, `((int)this.\u0000, for, (int)this.\u0000, 2, (int)this.\u0000= `, (int)this.\u0000= int, (int)(-799977392 & -1695395727));
        this.\u0000strictfp.Method_28692(string, this.\u0000, for + n4, this.\u0000, 2 + n4, -1906975 & -1253148);
    }

    public Class_38044() {
        super("CPS", -26857 & 2176, 22560 & 1290);
    }

    private void Method_38048() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

