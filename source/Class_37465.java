/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37465
implements Class_26181 {
    private Class_2062 Field_37466 = null;
    private int Field_37467 = -1 & -1;
    private String Field_37468 = null;

    public int Method_37469() {
        return this.Field_37466.Method_2063();
    }

    public String Method_37470() {
        return "textureUnit: " + this.Field_37467 + ", path: " + this.Field_37468 + ", glTextureId: " + this.Field_37466.Method_2063();
    }

    public Class_2062 Method_37471() {
        return this.Field_37466;
    }

    public void Method_37472() {
        Class_18695.Method_18720(this.Field_37466.Method_2063());
    }

    private void Method_37473() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37465(int n, String string, Class_2062 class_2062) {
        this.Field_37467 = n;
        this.Field_37468 = string;
        this.Field_37466 = class_2062;
    }

    public int Method_37474() {
        return this.Field_37467;
    }
}

