/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40088
extends Class_36787 {
    private void Method_40089() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_26801 Method_40090(String string) {
        return !string.equalsIgnoreCase("peaceful") && !string.equalsIgnoreCase("p") ? (!string.equalsIgnoreCase("easy") && !string.equalsIgnoreCase("e") ? (!string.equalsIgnoreCase("normal") && !string.equalsIgnoreCase("n") ? (!string.equalsIgnoreCase("hard") && !string.equalsIgnoreCase("h") ? Class_26801.Method_26817(Class_40088.\u0000strictfp((String)string, (int)(17446 & 2369), (int)(7 & -27485))) : Class_26801.Field_26804) : Class_26801.Field_26802) : Class_26801.Field_26807) : Class_26801.Field_26803;
    }

    public String Method_40091() {
        return "difficulty";
    }

    public List Method_40092(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (10241 & 149)) {
            String[] arrstring2 = new String[-23996 & 16782];
            arrstring2[1056 & -20219] = "peaceful";
            arrstring2[-12983 & 8325] = "easy";
            arrstring2[-32233 & 1034] = "normal";
            arrstring2[787 & -11257] = "hard";
            list = Class_40088.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    public void Method_40093(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new Class_34974("commands.difficulty.usage", new Object[-24192 & 1045]);
        }
        Class_26801 class_26801 = this.Method_40090(arrstring[20584 & 4]);
        Class_2457.Method_2530().Method_2576(class_26801);
        Object[] arrobject = new Object[16657 & 5769];
        arrobject[388 & 18496] = new Class_2849(class_26801.Method_26810(), new Object[9542 & -14336]);
        Class_40088.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.difficulty.success", (Object[])arrobject);
    }

    public String Method_40094(Class_1367 class_1367) {
        return "commands.difficulty.usage";
    }

    public int Method_40095() {
        return 8198 & -10501;
    }
}

