/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_9959 {
    private Random Field_9960 = new Random();
    private String[] Field_9961 = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
    private static final Class_9959 Field_9962 = new Class_9959();

    public String Method_9963() {
        int n = this.Field_9960.nextInt(22611 & 526) + (43 & -24569);
        String string = "";
        for (int i = 16521 & -29182; i < n; ++i) {
            if (i > 0) {
                string = string + " ";
            }
            string = string + this.Field_9961[this.Field_9960.nextInt(this.Field_9961.length)];
        }
        return string;
    }

    private void Method_9964() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_9959 Method_9965() {
        return Field_9962;
    }

    public void Method_9966(long l) {
        this.Field_9960.setSeed(l);
    }
}

