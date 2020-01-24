/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.properties.Property
 *  org.apache.logging.log4j.Marker
 *  tv.twitch.AuthToken
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLEncoder;
import org.apache.logging.log4j.Marker;
import tv.twitch.AuthToken;

public class Class_23477
extends Thread {
    final Property Field_23478;
    final Class_28018 Field_23479;

    public void Method_23480() {
        try {
            URL uRL = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.Field_23478.getValue(), "UTF-8"));
            String string = Class_32476.Method_32488(uRL);
            JsonObject jsonObject = Class_2986.Method_2996(new JsonParser().parse(string), "Response");
            JsonObject jsonObject2 = Class_2986.Method_2991(jsonObject, "token");
            if (Class_2986.Method_3007(jsonObject2, "valid")) {
                String string2 = Class_2986.Method_3001(jsonObject2, "user_name");
                Object[] arrobject = new Object[5121 & -32499];
                arrobject[275 & 25280] = string2;
                Class_28018.Method_28050().debug(Class_28018.Field_28027, "Authenticated with twitch; username is {}", arrobject);
                AuthToken authToken = new AuthToken();
                authToken.data = this.Field_23478.getValue();
                Class_28018.Method_28108(this.Field_23479).Method_37892(string2, authToken);
                Class_28018.Method_28045(this.Field_23479).Method_7405(string2);
                Class_28018.Method_28045(this.Field_23479).Method_7408(authToken);
                Runtime.getRuntime().addShutdownHook(new Class_32444(this, "Twitch shutdown hook"));
                Class_28018.Method_28108(this.Field_23479).Method_37900();
                Class_28018.Method_28045(this.Field_23479).Method_7413();
            } else {
                Class_28018.Method_28094(this.Field_23479, Class_25596.Field_25599);
                Class_28018.Method_28050().error(Class_28018.Field_28027, "Given twitch access token is invalid");
            }
        }
        catch (IOException iOException) {
            Class_28018.Method_28094(this.Field_23479, Class_25596.Field_25598);
            Class_28018.Method_28050().error(Class_28018.Field_28027, "Could not authenticate with twitch", (Throwable)iOException);
        }
    }

    private void Method_23481() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_23477(Class_28018 class_28018, String string, Property property) {
        this.Field_23479 = class_28018;
        this.Field_23478 = property;
        super(string);
    }
}

