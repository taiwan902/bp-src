/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_45541
extends Class_36787 {
    public void Method_45542(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length >= (33 & 8259) && arrstring.length <= (-7917 & 3086)) {
            int n = ((13228 & 16751) + new Random().nextInt(21336 & 8921)) * (124 & -14700);
            if (arrstring.length >= (4102 & -32221)) {
                n = Class_45541.\u0000strictfp((String)arrstring[-8173 & 2177], (int)(16585 & 9221), (int)(-1043375388 & 606062418)) * (12310 & 19860);
            }
            Class_2651 class_2651 = Class_2457.Method_2530().Field_2463[17312 & 10308];
            Class_31717 class_31717 = class_2651.Method_386();
            if ("clear".equalsIgnoreCase(arrstring[3096 & -28665])) {
                class_31717.Method_31825(n);
                class_31717.Method_31799(18624 & 27);
                class_31717.Method_31775(289 & 24576);
                class_31717.Method_31828((2566 & 20545) != 0);
                class_31717.Method_31818((28968 & 3) != 0);
                Class_45541.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.weather.clear", (Object[])new Object[24603 & -26620]);
            } else if ("rain".equalsIgnoreCase(arrstring[-29176 & 16817])) {
                class_31717.Method_31825(-32447 & 5658);
                class_31717.Method_31799(n);
                class_31717.Method_31775(n);
                class_31717.Method_31828((10899 & -15099) != 0);
                class_31717.Method_31818((-30054 & 256) != 0);
                Class_45541.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.weather.rain", (Object[])new Object[-18325 & 640]);
            } else {
                if (!"thunder".equalsIgnoreCase(arrstring[1124 & -9320])) {
                    throw new Class_34974("commands.weather.usage", new Object[24706 & -28127]);
                }
                class_31717.Method_31825(-22448 & 416);
                class_31717.Method_31799(n);
                class_31717.Method_31775(n);
                class_31717.Method_31828((-32733 & 16385) != 0);
                class_31717.Method_31818((25305 & 39) != 0);
                Class_45541.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.weather.thunder", (Object[])new Object[8589 & 18]);
            }
        } else {
            throw new Class_34974("commands.weather.usage", new Object[52 & 13632]);
        }
    }

    private void Method_45543() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_45544() {
        return 4818 & 46;
    }

    public List Method_45545(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (-7423 & 1033)) {
            String[] arrstring2 = new String[9299 & -30585];
            arrstring2[-31696 & 10304] = "clear";
            arrstring2[-24417 & 1537] = "rain";
            arrstring2[538 & 4166] = "thunder";
            list = Class_45541.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    public String Method_45546() {
        return "weather";
    }

    public String Method_45547(Class_1367 class_1367) {
        return "commands.weather.usage";
    }
}

