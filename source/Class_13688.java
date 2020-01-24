/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  internal.org.lwjgl.WindowsSysImplementation
 */
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.lwjgl.WindowsSysImplementation;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.swing.JColorChooser;

public class Class_13688 {
    private static void Method_13689(int n, Class_18 class_18, long l, Class_30748 class_30748) {
        int n2 = n;
        if (class_18.Field_26.Method_2361()) {
            if (n2 != (-1 & -1)) {
                n2 = Integer.reverseBytes(n2) >> (1178 & 8716) & (620756991 & -754974721);
            }
            if ((n2 = class_18.Field_26.Method_2421(l, n2)) != (-1 & -1)) {
                n2 = Integer.reverseBytes(n2) >> (284 & 9354) & (419430399 & 16777215);
            }
        } else {
            Color color = JColorChooser.showDialog(null, null, n2 == (-1 & -1) ? null : new Color(n2 & (16777215 & 855638015)));
            n2 = color != null ? color.getRGB() & (33554431 & -2030043137) : -1 & -1;
        }
        int n3 = n2;
        class_18.Method_229(() -> Class_13688.Method_13690(class_30748, n3));
    }

    private static void Method_13690(Class_30748 class_30748, int n) {
        class_30748.Method_30749(n);
    }

    public static void Method_13691(int n, Class_30748 class_30748) {
        Class_18 class_18 = Class_18.Field_89;
        long l = -1603516030506672126L & 1368427552L;
        if (class_18.Field_26.Method_2361()) {
            try {
                l = WindowsSysImplementation.getHwnd();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        long l2 = l;
        new Thread(() -> Class_13688.Method_13689(n, class_18, l2, class_30748)).start();
    }

    private void Method_13692() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

