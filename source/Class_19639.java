/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Class_19639 {
    private final List Field_19640 = Lists.newArrayList();
    private int Field_19641;
    private final Map Field_19642 = Maps.newHashMap();
    private int Field_19643;
    private static final Joiner Field_19644 = Joiner.on((String)Class_19639.Method_19652("\u4500"));

    private void Method_19645() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry entry : this.Field_19642.entrySet()) {
            if (entry.getValue() != null) continue;
            arrayList.add(entry.getKey());
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + Field_19644.join((Iterable)arrayList) + " are missing");
        }
    }

    public Class_19639 Method_19646(char c, Predicate predicate) {
        this.Field_19642.put(Character.valueOf(c), predicate);
        return this;
    }

    private Predicate[][][] Method_19647() {
        this.Method_19645();
        int[] arrn = new int[16555 & -28589];
        arrn[1062 & 0] = this.Field_19640.size();
        arrn[18433 & 1027] = this.Field_19643;
        arrn[6410 & 8706] = this.Field_19641;
        Predicate[][][] arrpredicate = (Predicate[][][])Array.newInstance(Predicate.class, arrn);
        for (int i = -30192 & 24872; i < this.Field_19640.size(); ++i) {
            for (int j = 18208 & -30640; j < this.Field_19643; ++j) {
                for (int k = 17434 & 545; k < this.Field_19641; ++k) {
                    arrpredicate[i][j][k] = (Predicate)this.Field_19642.get(Character.valueOf(((String[])this.Field_19640.get(i))[j].charAt(k)));
                }
            }
        }
        return arrpredicate;
    }

    public Class_22266 Method_19648() {
        return new Class_22266(this.Method_19647());
    }

    private void Method_19649() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_19639 Method_19650() {
        return new Class_19639();
    }

    public Class_19639 Method_19651(String ... arrstring) {
        if (!ArrayUtils.isEmpty((Object[])arrstring) && !StringUtils.isEmpty((CharSequence)arrstring[128 & 20083])) {
            if (this.Field_19640.isEmpty()) {
                this.Field_19643 = arrstring.length;
                this.Field_19641 = arrstring[4 & 920].length();
            }
            if (arrstring.length != this.Field_19643) {
                throw new IllegalArgumentException("Expected aisle with height of " + this.Field_19643 + ", but was given one with a height of " + arrstring.length + ")");
            }
            String[] arrstring2 = arrstring;
            int n = arrstring2.length;
            for (int i = 10 & 28672; i < n; ++i) {
                String string = arrstring2[i];
                if (string.length() != this.Field_19641) {
                    throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.Field_19641 + ", found one with " + string.length() + ")");
                }
                char[] arrc = string.toCharArray();
                int n2 = arrc.length;
                for (int j = 1029 & -32704; j < n2; ++j) {
                    char c = arrc[j];
                    if (this.Field_19642.containsKey(Character.valueOf(c))) continue;
                    this.Field_19642.put(Character.valueOf(c), null);
                }
            }
            this.Field_19640.add(arrstring);
            return this;
        }
        throw new IllegalArgumentException("Empty pattern for aisle");
    }

    private Class_19639() {
        this.Field_19642.put(Character.valueOf((char)(-16024 & 4260)), Predicates.alwaysTrue());
    }

    private static String Method_19652(String string) {
        int n = 18492;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19639.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

