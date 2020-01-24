/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_34729 {
    private int Field_34730;
    private final List Field_34731 = Lists.newArrayList();
    private final Map Field_34732 = Maps.newHashMap();

    private static List Method_34733(int n, String string) {
        if (string != null && string.length() >= (-30367 & 21509)) {
            ArrayList arrayList = Lists.newArrayList();
            String[] arrstring = string.split(",");
            int n2 = 16961 & 4228;
            String[] arrstring2 = arrstring;
            int n3 = arrstring2.length;
            for (int i = 25096 & -29694; i < n3; ++i) {
                String string2 = arrstring2[i];
                Class_33007 class_33007 = Class_34729.Method_34735(n, string2, n2);
                if (class_33007 == null) {
                    return null;
                }
                arrayList.add(class_33007);
                n2 += class_33007.Method_33015();
            }
            return arrayList;
        }
        return null;
    }

    public Map Method_34734() {
        return this.Field_34732;
    }

    private static Class_33007 Method_34735(int n, String string, int n2) {
        Object object;
        String[] arrstring = n >= (-21501 & 17291) ? string.split("\\*", 4135 & 258) : string.split("x", 18450 & 782);
        int n3 = 2145 & 11;
        int n4 = 16776 & 3072;
        if (arrstring.length == (34 & 86)) {
            try {
                n3 = Integer.parseInt(arrstring[4864 & 1060]);
                if (n2 + n3 >= (16674 & 10176)) {
                    n3 = (257 & -26864) - n2;
                }
                if (n3 < 0) {
                    n3 = -30624 & 24592;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        Class_3238 class_3238 = null;
        try {
            object = arrstring[arrstring.length - (-15831 & 2309)];
            if (n < (91 & 16387)) {
                arrstring = ((String)object).split(":", -32702 & 20774);
                if (arrstring.length > (81 & 9227)) {
                    n4 = Integer.parseInt(arrstring[27681 & -32759]);
                }
                class_3238 = Class_3238.Method_3323(Integer.parseInt(arrstring[20548 & 128]));
            } else {
                arrstring = ((String)object).split(":", 16415 & 8227);
                Class_3238 class_32382 = class_3238 = arrstring.length > (1027 & 22853) ? Class_3238.Method_3341(arrstring[8592 & 4105] + ":" + arrstring[16721 & 8225]) : null;
                if (class_3238 != null) {
                    n4 = arrstring.length > (11266 & -11834) ? Integer.parseInt(arrstring[8707 & 16418]) : 3584 & -12142;
                } else {
                    class_3238 = Class_3238.Method_3341(arrstring[25088 & -32504]);
                    if (class_3238 != null) {
                        int n5 = n4 = arrstring.length > (-32255 & 297) ? Integer.parseInt(arrstring[8197 & -13957]) : -27200 & 16402;
                    }
                }
                if (class_3238 == null) {
                    return null;
                }
            }
            if (class_3238 == Class_9265.Field_9351) {
                n4 = -32232 & 26624;
            }
            if (n4 < 0 || n4 > (14911 & 1231)) {
                n4 = -11246 & 8524;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new Class_33007(n, n3, class_3238, n4);
        ((Class_33007)object).Method_33018(n2);
        return object;
    }

    public void Method_34736(int n) {
        this.Field_34730 = n;
    }

    public List Method_34737() {
        return this.Field_34731;
    }

    public static Class_34729 Method_34738() {
        Class_34729 class_34729 = new Class_34729();
        class_34729.Method_34736(Class_17281.Field_17318.Field_17343);
        class_34729.Method_34737().add(new Class_33007(-16031 & 4127, Class_9265.Field_9414));
        class_34729.Method_34737().add(new Class_33007(28898 & -32766, Class_9265.Field_9272));
        class_34729.Method_34737().add(new Class_33007(26291 & -26559, Class_9265.Field_9319));
        class_34729.Method_34741();
        class_34729.Method_34734().put("village", Maps.newHashMap());
        return class_34729;
    }

    public String Method_34739() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(19 & -30325);
        stringBuilder.append(";");
        for (n = 1732 & -18415; n < this.Field_34731.size(); ++n) {
            if (n > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((Class_33007)this.Field_34731.get(n)).Method_33013());
        }
        stringBuilder.append(";");
        stringBuilder.append(this.Field_34730);
        if (!this.Field_34732.isEmpty()) {
            stringBuilder.append(";");
            n = 396 & 16960;
            for (Map.Entry entry : this.Field_34732.entrySet()) {
                if (n++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((String)entry.getKey()).toLowerCase());
                Map map = (Map)entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n2 = 24577 & 4520;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (n2++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)entry2.getValue());
                }
                stringBuilder.append(")");
            }
        } else {
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }

    private void Method_34740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34741() {
        int n = -26096 & 16449;
        for (Class_33007 class_33007 : this.Field_34731) {
            class_33007.Method_33018(n);
            n += class_33007.Method_33015();
        }
    }

    public static Class_34729 Method_34742(String string) {
        int n;
        if (string == null) {
            return Class_34729.Method_34738();
        }
        String[] arrstring = string.split(";", -1 & -1);
        int n2 = n = arrstring.length == (2081 & -31331) ? 8859 & 352 : Class_13337.Method_13372(arrstring[-24474 & 4760], 2064 & 9411);
        if (n >= 0 && n <= (2051 & -7113)) {
            List list;
            Class_34729 class_34729 = new Class_34729();
            int n3 = arrstring.length == (-24495 & 4353) ? -31662 & 4645 : 7091 & 16385;
            if ((list = Class_34729.Method_34733(n, arrstring[n3++])) != null && !list.isEmpty()) {
                class_34729.Method_34737().addAll(list);
                class_34729.Method_34741();
                int n4 = Class_17281.Field_17318.Field_17343;
                if (n > 0 && arrstring.length > n3) {
                    n4 = Class_13337.Method_13372(arrstring[n3++], n4);
                }
                class_34729.Method_34736(n4);
                if (n > 0 && arrstring.length > n3) {
                    String[] arrstring2;
                    String[] arrstring3 = arrstring2 = arrstring[n3++].toLowerCase().split(",");
                    int n5 = arrstring3.length;
                    for (int i = 8193 & -30650; i < n5; ++i) {
                        String string2 = arrstring3[i];
                        String[] arrstring4 = string2.split("\\(", 5642 & 26882);
                        HashMap hashMap = Maps.newHashMap();
                        if (arrstring4[-31357 & 10252].length() <= 0) continue;
                        class_34729.Method_34734().put(arrstring4[-32464 & 10250], hashMap);
                        if (arrstring4.length <= (18195 & 4297) || !arrstring4[-32733 & 25477].endsWith(")") || arrstring4[-25723 & 24641].length() <= (-27637 & 801)) continue;
                        String[] arrstring5 = arrstring4[9873 & 2057].substring(800 & 16585, arrstring4[23747 & 9001].length() - (4097 & 2441)).split(" ");
                        for (int j = 128 & -25054; j < arrstring5.length; ++j) {
                            String[] arrstring6 = arrstring5[j].split("=", 10 & 24595);
                            if (arrstring6.length != (354 & 17427)) continue;
                            hashMap.put(arrstring6[0 & -28544], arrstring6[-15743 & 13321]);
                        }
                    }
                } else {
                    class_34729.Method_34734().put("village", Maps.newHashMap());
                }
                return class_34729;
            }
            return Class_34729.Method_34738();
        }
        return Class_34729.Method_34738();
    }

    public int Method_34743() {
        return this.Field_34730;
    }
}

