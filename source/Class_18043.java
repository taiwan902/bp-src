/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_18043
extends Class_15030 {
    public void Method_18044(Class_17531 class_17531) {
        if (this.\u0000strictfp) {
            int n = class_17531.ordinal();
            ArrayList arrayList = this.\u0000strictfp;
            GL11.glEnable((int)(20324 & 2884));
            for (int i = 88 & 1059; i < arrayList.size(); ++i) {
                Class_6176 class_6176;
                Class_13574 class_13574;
                if ((i & (-32672 & 17441)) == (671 & 31)) {
                    GL11.glEnable((int)(-25788 & 12229));
                }
                if ((class_13574 = (class_6176 = (Class_6176)arrayList.get(i)).Method_6231(n)).Method_13580() <= 0) continue;
                Class_16867.Method_16961();
                this.\u0000strictfp(class_6176);
                class_6176.Method_6212();
                class_13574.Method_13582();
                this.Method_18046();
                class_13574.Method_13584(2567 & 12311);
                Class_16867.Method_16945();
            }
            Class_32876.Method_32981(Class_32876.Field_32881, 18142 & 8192);
            Class_16867.Method_16932();
            this.\u0000strictfp.clear();
        }
    }

    private void Method_18045() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_18046() {
        if (Class_19426.Method_19570()) {
            Class_25377.Method_25382();
        } else {
            GL11.glVertexPointer((int)(-30289 & 8707), (int)(5391 & 7318), (int)(9502 & 19196), (long)(2792443903847958533L & -2792443905902014192L));
            GL11.glColorPointer((int)(270 & 8244), (int)(29771 & 5377), (int)(-30692 & 29533), (long)(-2662560472154242515L & 1612809230L));
            GL11.glTexCoordPointer((int)(194 & 22), (int)(5703 & -10978), (int)(-32612 & 3102), (long)(5801022347435712528L & -5801022349224165314L));
            Class_32876.Method_32970(Class_32876.Field_32911);
            GL11.glTexCoordPointer((int)(5207 & -14038), (int)(13811 & 7690), (int)(8348 & 21054), (long)(2551030822466498584L & -2551030822655687014L));
            Class_32876.Method_32970(Class_32876.Field_32931);
        }
    }
}

