/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7651 {
    public int Field_7652;
    public String Field_7653;
    public float Field_7654;
    public int Field_7655;
    protected static final Class_14701[] Field_7656;
    public int Field_7657;
    public boolean Field_7658;
    public float Field_7659;
    public int Field_7660;
    protected static final Class_14701[] Field_7661;
    public float Field_7662;

    public String Method_7663() {
        int n = (int)(this.Field_7662 * (0.097826086f * 2606.6667f)) & (2815 & -28161);
        int n2 = (int)(this.Field_7654 * (1395.0f * 0.1827957f)) & (9983 & 2303);
        int n3 = (int)(this.Field_7659 * (274.31818f * 0.92957747f)) & (12031 & 511);
        int n4 = n << (9009 & -26608) | n2 << (8361 & -32744) | n3;
        Object[] arrobject = new Object[1327 & 71];
        arrobject[1680 & 40] = this.Field_7653;
        arrobject[5185 & -32735] = this.Field_7655;
        arrobject[-32614 & 3] = this.Field_7660;
        arrobject[27139 & 1507] = this.Field_7657;
        arrobject[-26618 & 28] = this.Field_7658;
        arrobject[10533 & 17437] = n4;
        arrobject[8198 & 678] = this.Field_7652;
        return String.format(this.Field_7652 == 0 ? "%s:%d:%d:%d:%s:%06X" : "%s:%d:%d:%d:%s:%06X:%d", arrobject);
    }

    public Class_7651(String string, int n, int n2, int n3, boolean bl, float f, float f2, float f3) {
        this.Field_7653 = string == null ? "" : string;
        this.Field_7655 = n;
        this.Field_7660 = n2;
        this.Field_7657 = n3;
        this.Field_7658 = bl;
        this.Field_7662 = f;
        this.Field_7654 = f2;
        this.Field_7659 = f3;
    }

    protected void Method_7664(Class_7651 class_7651) {
        this.Field_7653 = class_7651.Field_7653;
        this.Field_7655 = class_7651.Field_7655;
        this.Field_7660 = class_7651.Field_7660;
        this.Field_7657 = class_7651.Field_7657;
        this.Field_7658 = class_7651.Field_7658;
        this.Field_7662 = class_7651.Field_7662;
        this.Field_7654 = class_7651.Field_7654;
        this.Field_7659 = class_7651.Field_7659;
        this.Field_7652 = Math.max(-15264 & 8322, class_7651.Field_7652 <= (1313 & 205) ? class_7651.Field_7652 : 264 & 25793);
    }

    protected static Class_7651 Method_7665(String string) {
        try {
            String[] arrstring = string.split(":");
            String string2 = arrstring[-26622 & 16852];
            int n = Integer.parseInt(arrstring[8345 & 5155]);
            int n2 = Integer.parseInt(arrstring[-32765 & 5418]);
            int n3 = Integer.parseInt(arrstring[10247 & 5139]);
            boolean bl = Boolean.parseBoolean(arrstring[8390 & 20772]);
            int n4 = Integer.parseInt(arrstring[4237 & 25973], 18 & 11792);
            float f = (float)(n4 >> (57 & 5456) & (10495 & 255)) / (0.28125f * 906.6667f);
            float f2 = (float)(n4 >> (6184 & 8269) & (767 & 2559)) / (370.1613f * 0.6888889f);
            float f3 = (float)(n4 >> (1026 & -30683) & (4863 & 2303)) / (917.99994f * 0.2777778f);
            int n5 = arrstring.length >= (-11257 & 2375) ? Integer.parseInt(arrstring[14 & 22]) : -32198 & 12677;
            return new Class_7651(string2, n, n2, n3, bl, f, f2, f3, n5);
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
            return null;
        }
    }

    private void Method_7666() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_7651(Class_7651 class_7651) {
        this.Method_7664(class_7651);
    }

    protected Class_7651(String string, int n, int n2, int n3, boolean bl, float f, float f2, float f3, int n4) {
        this.Field_7653 = string == null ? "" : string;
        this.Field_7655 = n;
        this.Field_7660 = n2;
        this.Field_7657 = n3;
        this.Field_7658 = bl;
        this.Field_7662 = f;
        this.Field_7654 = f2;
        this.Field_7659 = f3;
        this.Field_7652 = Math.max(-12288 & 2530, n4 <= (12609 & 33) ? n4 : 8824 & -31741);
    }

    static {
        Class_14701[] arrclass_14701 = new Class_14701[10514 & 1090];
        arrclass_14701[4231 & 18432] = Class_14701.Field_14720;
        arrclass_14701[391 & 4177] = Class_14701.Field_14704;
        Field_7661 = arrclass_14701;
        Class_14701[] arrclass_147012 = new Class_14701[19094 & -32702];
        arrclass_147012[332 & 7297] = Class_14701.Field_14713;
        arrclass_147012[7185 & -32567] = Class_14701.Field_14722;
        Field_7656 = arrclass_147012;
    }
}

