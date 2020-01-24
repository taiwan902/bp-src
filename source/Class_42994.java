/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.zip.Inflater;

public class Class_42994
extends Class_42759 {
    private int Field_42995;
    private static ThreadLocal Field_42996 = new ThreadLocal();
    private final Inflater Field_42997;

    public Class_42994(int n) {
        this.Field_42995 = n;
        this.Field_42997 = new Inflater();
    }

    private void Method_42998() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_42999(int n) {
        this.Field_42995 = n;
    }

    protected void Method_43000(Class_39158 class_39158, Class_22553 class_22553, List list) {
        if (class_22553.Method_22564() != 0) {
            Class_29900 class_29900 = new Class_29900(class_22553);
            int n = class_29900.Method_30004();
            if (n == 0) {
                list.add(class_29900.Method_29951(class_29900.Method_30014()));
            } else {
                if (n < this.Field_42995) {
                    throw new Class_32043("Badly compressed packet - size of " + n + " is below server threshold of " + this.Field_42995);
                }
                if (n > (-2123340591 & 102895650)) {
                    throw new Class_32043("Badly compressed packet - size of " + n + " is larger than protocol maximum of " + (44221877 & -1520369590));
                }
                byte[] arrby = (byte[])Field_42996.get();
                if (arrby == null || arrby.length == 0) {
                    arrby = new byte[-1805315840 & 4851712];
                    Field_42996.set(arrby);
                }
                int n2 = class_29900.Method_30014();
                class_29900.Method_29905(arrby, 804 & 16386, n2);
                this.Field_42997.setInput(arrby, 9382 & 256, n2);
                byte[] arrby2 = new byte[n];
                this.Field_42997.inflate(arrby2);
                list.add(Class_16620.Method_16632(arrby2));
                this.Field_42997.reset();
            }
        }
    }
}

