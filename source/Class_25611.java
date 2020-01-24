/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_25611 {
    private String Field_25612 = null;

    public int[] Method_25613(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] arrstring = Class_19426.Method_19561(string, " ,");
        for (int i = 1169 & 13158; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.contains("-")) {
                String[] arrstring2 = Class_19426.Method_19561(string2, "-");
                if (arrstring2.length != (-32730 & 6410)) {
                    this.Method_25630("Invalid interval: " + string2 + ", when parsing: " + string);
                    continue;
                }
                int n = Class_19426.Method_19502(arrstring2[24620 & 2835], -1 & -1);
                int n2 = Class_19426.Method_19502(arrstring2[1 & -29179], -1 & -1);
                if (n >= 0 && n2 >= 0 && n <= n2) {
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(j);
                    }
                    continue;
                }
                this.Method_25630("Invalid interval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n = Class_19426.Method_19502(string2, -1 & -1);
            if (n < 0) {
                this.Method_25630("Invalid number: " + string2 + ", when parsing: " + string);
                continue;
            }
            arrayList.add(n);
        }
        int[] arrn = new int[arrayList.size()];
        for (int i = 128 & -18112; i < arrn.length; ++i) {
            arrn[i] = (Integer)arrayList.get(i);
        }
        return arrn;
    }

    public boolean Method_25614(String string) {
        if (string == null) {
            return (-20419 & 2560) != 0;
        }
        String string2 = string.toLowerCase().trim();
        return string2.equals("true");
    }

    public boolean Method_25615(Class_3436 class_3436, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Class_3538 class_3538 = (Class_3538)entry.getKey();
            List list = (List)entry.getValue();
            Comparable comparable = class_3436.Method_3440(class_3538);
            if (comparable == null) {
                return (8234 & 4357) != 0;
            }
            if (list.contains(comparable)) continue;
            return (24600 & -32224) != 0;
        }
        return (1057 & -16383) != 0;
    }

    public static Comparable Method_25616(Class_3538 class_3538, String string) {
        Class class_ = class_3538.Method_3539();
        Comparable comparable = Class_25611.Method_25619(string, class_);
        if (comparable == null) {
            Collection collection = class_3538.Method_3542();
            comparable = Class_25611.Method_25631(string, collection);
        }
        return comparable;
    }

    public Class_30305[] Method_25617(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).length() <= 0) {
            return null;
        }
        String[] arrstring = Class_19426.Method_19561(string, ":");
        String string2 = "minecraft";
        int n = 6219 & 512;
        if (arrstring.length > (4245 & 25923) && this.Method_25625(arrstring)) {
            string2 = arrstring[2570 & -32719];
            n = -7931 & 665;
        } else {
            string2 = "minecraft";
            n = 17416 & 4688;
        }
        String string3 = arrstring[n];
        String[] arrstring2 = Arrays.copyOfRange(arrstring, n + (-28663 & 3333), arrstring.length);
        Class_3238[] arrclass_3238 = this.Method_25634(string2, string3);
        Class_30305[] arrclass_30305 = new Class_30305[arrclass_3238.length];
        for (int i = -7534 & 1380; i < arrclass_3238.length; ++i) {
            Class_30305 class_30305;
            Class_3238 class_3238 = arrclass_3238[i];
            int n2 = Class_3238.Method_3435(class_3238);
            int[] arrn = this.Method_25628(class_3238, arrstring2);
            arrclass_30305[i] = class_30305 = new Class_30305(n2, arrn);
        }
        return arrclass_30305;
    }

    public Class_30305[] Method_25618(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<Class_30305> arrayList = new ArrayList<Class_30305>();
        String[] arrstring = Class_19426.Method_19561(string, " ");
        for (int i = 10513 & -11034; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            Class_30305[] arrclass_30305 = this.Method_25617(string2);
            if (arrclass_30305 == null) {
                return null;
            }
            arrayList.addAll(Arrays.asList(arrclass_30305));
        }
        Class_30305[] arrclass_30305 = arrayList.toArray(new Class_30305[arrayList.size()]);
        return arrclass_30305;
    }

    public static Comparable Method_25619(String string, Class class_) {
        return (Comparable)(class_ == String.class ? string : (class_ == Boolean.class ? (Comparable<Boolean>)Boolean.valueOf(string) : (Comparable<Boolean>)(class_ == Float.class ? (double)Float.valueOf(string).floatValue() : (class_ == Double.class ? Double.valueOf(string) : (double)(class_ == Integer.class ? (long)Integer.valueOf(string).intValue() : (class_ == Long.class ? Long.valueOf(string) : null))))));
    }

    public Class_17281 Method_25620(String string) {
        string = string.toLowerCase();
        Class_17281[] arrclass_17281 = Class_17281.Method_17425();
        for (int i = 2184 & -31168; i < arrclass_17281.length; ++i) {
            String string2;
            Class_17281 class_17281 = arrclass_17281[i];
            if (class_17281 == null || !(string2 = class_17281.Field_17355.replace(" ", "").toLowerCase()).equals(string)) continue;
            return class_17281;
        }
        return null;
    }

    public Class_25611(String string) {
        this.Field_25612 = string;
    }

    public String Method_25621(String string) {
        int n;
        String string2 = string;
        int n2 = string.lastIndexOf(2223 & 111);
        if (n2 >= 0) {
            string2 = string.substring(n2 + (5 & -32255));
        }
        if ((n = string2.lastIndexOf(9775 & -26322)) >= 0) {
            string2 = string2.substring(18 & 23624, n);
        }
        return string2;
    }

    public Class_17281[] Method_25622(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Class_19426.Method_19561(string, " ");
        ArrayList<Class_17281> arrayList = new ArrayList<Class_17281>();
        for (int i = 20484 & 8704; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            Class_17281 class_17281 = this.Method_25620(string2);
            if (class_17281 == null) {
                this.Method_25630("Biome not found: " + string2);
                continue;
            }
            arrayList.add(class_17281);
        }
        Class_17281[] arrclass_17281 = arrayList.toArray(new Class_17281[arrayList.size()]);
        return arrclass_17281;
    }

    public int Method_25623(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = Class_19426.Method_19502(string, -1 & -1);
        if (n2 < 0) {
            this.Method_25630("Invalid number: " + string);
            return n;
        }
        return n2;
    }

    public boolean Method_25624(String string) {
        if (string == null) {
            return (18458 & 8580) != 0;
        }
        if (string.length() < (-30655 & 5261)) {
            return (1092 & 4256) != 0;
        }
        char c = string.charAt(-32736 & 4292);
        return Character.isDigit(c);
    }

    public boolean Method_25625(String[] arrstring) {
        if (arrstring.length < (-30718 & 16650)) {
            return (8200 & -31484) != 0;
        }
        String string = arrstring[1153 & -24307];
        return (string.length() < (4363 & 9861) ? -14304 & 527 : (this.Method_25624(string) ? 4296 & 24612 : (!string.contains("=") ? 261 & 2769 : -14336 & 8392))) != 0;
    }

    private void Method_25626() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27481 Method_25627(String string) {
        if (string == null) {
            return null;
        }
        Class_27481 class_27481 = new Class_27481();
        String[] arrstring = Class_19426.Method_19561(string, " ,");
        for (int i = -16240 & 7264; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            Class_17230 class_17230 = this.Method_25633(string2);
            if (class_17230 == null) {
                return null;
            }
            class_27481.Method_27486(class_17230);
        }
        return class_27481;
    }

    public int[] Method_25628(Class_3238 class_3238, String[] arrstring) {
        Object object;
        if (arrstring.length <= 0) {
            return null;
        }
        String string = arrstring[436 & 16385];
        if (this.Method_25624(string)) {
            int[] arrn = this.Method_25613(string);
            return arrn;
        }
        Class_3677 class_3677 = class_3238.Method_3293();
        Collection collection = class_3677.Method_3441();
        HashMap hashMap = new HashMap();
        for (int i = 18002 & -30324; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.length() <= 0) continue;
            object = Class_19426.Method_19561(string2, "=");
            if (((String[])object).length != (2258 & -24318)) {
                this.Method_25630("Invalid block property: " + string2);
                return null;
            }
            String string3 = object[3162 & -24063];
            String string4 = object[-32695 & 9217];
            Class_3538 class_3538 = Class_30312.Method_30364(string3, collection);
            if (class_3538 == null) {
                this.Method_25630("Property not found: " + string3 + ", block: " + class_3238);
                return null;
            }
            ArrayList<Comparable> arrayList = (ArrayList<Comparable>)hashMap.get(string3);
            if (arrayList == null) {
                arrayList = new ArrayList<Comparable>();
                hashMap.put(class_3538, arrayList);
            }
            String[] arrstring2 = Class_19426.Method_19561(string4, ",");
            for (int j = 13447 & 56; j < arrstring2.length; ++j) {
                String string5 = arrstring2[j];
                Comparable comparable = Class_25611.Method_25616(class_3538, string5);
                if (comparable == null) {
                    this.Method_25630("Property value not found: " + string5 + ", property: " + string3 + ", block: " + class_3238);
                    return null;
                }
                arrayList.add(comparable);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 2084 & -22967; i < (12821 & -31624); ++i) {
            object = class_3238.Method_3342(i);
            if (!this.Method_25615((Class_3436)object, hashMap)) continue;
            arrayList.add(i);
        }
        if (arrayList.size() == (20113 & -32750)) {
            return null;
        }
        int[] arrn = new int[arrayList.size()];
        for (int i = 1094 & -28536; i < arrn.length; ++i) {
            arrn[i] = (Integer)arrayList.get(i);
        }
        return arrn;
    }

    public int Method_25629(String string) {
        if (string == null) {
            return -1 & -1;
        }
        int n = Class_19426.Method_19502(string, -1 & -1);
        if (n < 0) {
            this.Method_25630("Invalid number: " + string);
        }
        return n;
    }

    public void Method_25630(String string) {
        Class_19426.Method_19610("" + this.Field_25612 + ": " + string);
    }

    public static Comparable Method_25631(String string, Collection collection) {
        for (Object e : collection) {
            if (!String.valueOf(e).equals(string)) continue;
            return (Comparable)e;
        }
        return null;
    }

    public String Method_25632(String string) {
        int n = string.lastIndexOf(63 & -14289);
        return n < 0 ? "" : string.substring(-32480 & 8910, n);
    }

    private Class_17230 Method_25633(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(-30803 & 30765) >= 0) {
            String[] arrstring = Class_19426.Method_19561(string, "-");
            if (arrstring.length != (674 & 4102)) {
                this.Method_25630("Invalid range: " + string);
                return null;
            }
            int n = Class_19426.Method_19502(arrstring[96 & 25226], -1 & -1);
            int n2 = Class_19426.Method_19502(arrstring[4269 & 1], -1 & -1);
            if (n >= 0 && n2 >= 0) {
                return new Class_17230(n, n2);
            }
            this.Method_25630("Invalid range: " + string);
            return null;
        }
        int n = Class_19426.Method_19502(string, -1 & -1);
        if (n < 0) {
            this.Method_25630("Invalid integer: " + string);
            return null;
        }
        return new Class_17230(n, n);
    }

    public Class_3238[] Method_25634(String string, String string2) {
        if (this.Method_25624(string2)) {
            int[] arrn = this.Method_25613(string2);
            if (arrn == null) {
                return null;
            }
            Class_3238[] arrclass_3238 = new Class_3238[arrn.length];
            for (int i = 8192 & 66; i < arrn.length; ++i) {
                int n = arrn[i];
                Class_3238 class_3238 = Class_3238.Method_3323(n);
                if (class_3238 == null) {
                    this.Method_25630("Block not found for id: " + n);
                    return null;
                }
                arrclass_3238[i] = class_3238;
            }
            return arrclass_3238;
        }
        String string3 = string + ":" + string2;
        Class_3238 class_3238 = Class_3238.Method_3341(string3);
        if (class_3238 == null) {
            this.Method_25630("Block not found for name: " + string3);
            return null;
        }
        Class_3238[] arrclass_3238 = new Class_3238[129 & 3129];
        arrclass_3238[-20927 & 148] = class_3238;
        Class_3238[] arrclass_32382 = arrclass_3238;
        return arrclass_32382;
    }
}

