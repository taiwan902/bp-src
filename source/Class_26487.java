/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.HttpAuthenticationService
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.exceptions.UserMigratedException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 *  com.mojang.authlib.yggdrasil.request.JoinMinecraftServerRequest
 *  com.mojang.authlib.yggdrasil.response.Response
 *  com.mojang.util.UUIDTypeAdapter
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserMigratedException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import com.mojang.authlib.yggdrasil.request.JoinMinecraftServerRequest;
import com.mojang.authlib.yggdrasil.response.Response;
import com.mojang.util.UUIDTypeAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_26487
implements Class_17034 {
    private final Class_18 Field_26488;
    private final Class_1490 Field_26489;
    private final Gson Field_26490 = new GsonBuilder().registerTypeAdapter(UUID.class, (Object)new UUIDTypeAdapter()).create();
    private static final Logger Field_26491 = LogManager.getLogger();
    private final Class_44584 Field_26492;
    private GameProfile Field_26493;
    public static final URL Field_26494 = HttpAuthenticationService.constantURL((String)Class_26487.Method_26500("\u3000\u3010\u3012\u3012\u3010\u3010\u3002\u3002\u3010\u3000\u3012\u3012\u3000\u3000\u3002\u3012\u3000\u3010\u3012\u3002\u3010\u3000\u3002\u3002\u3000\u3000\u3002\u3002\u3000\u3000\u3002\u3002\u3020\u3030\u3022\u3032\u3030\u3020\u3022\u3022\u3020\u3020\u3022\u3022\u3020\u3020\u3032\u3022\u3020\u3030\u3022\u3022\u3020\u3020\u3022"));

    public void Method_26495(Class_27494 class_27494) {
        this.Field_26492.Method_44622(class_27494.Method_27500());
    }

    public void Method_26496(Class_32367 class_32367) {
        this.Field_26492.Field_44593.Method_6822(8199 & -30537);
        this.Field_26493 = class_32367.Method_32374();
        this.Field_26492.Method_44607(Class_11271.Field_11274);
        this.Field_26492.Method_44630(new Class_20165(this.Field_26488, this.Field_26489, this.Field_26492, this.Field_26493));
    }

    public void Method_26497(Class_1782 class_1782) {
        if (this.Field_26493 == null) {
            this.Field_26488.Method_218(new Class_20136(this.Field_26489, "connect.failed", class_1782));
        }
    }

    static Class_44584 Method_26498(Class_26487 class_26487) {
        return class_26487.Field_26492;
    }

    private void Method_26499() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_26500(String string) {
        int n = 26910;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26487.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_26501(Class_22160 class_22160) {
        if (!this.Field_26492.Method_44609()) {
            this.Field_26492.Method_44608(class_22160.Method_22167());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method_26502(URL uRL, String string, String string2) {
        Validate.notNull((Object)uRL);
        Validate.notNull((Object)string);
        Validate.notNull((Object)string2);
        this.Field_26492.Field_44593.Method_6822(566 & -22116);
        HttpURLConnection httpURLConnection = this.Method_26505(uRL);
        byte[] arrby = string.getBytes(Charsets.UTF_8);
        this.Field_26492.Field_44593.Method_6822(18709 & -19873);
        httpURLConnection.setRequestProperty("Content-Type", string2 + "; charset=utf-8");
        httpURLConnection.setRequestProperty("Content-Length", "" + arrby.length);
        httpURLConnection.setDoOutput((6145 & 8593) != 0);
        Field_26491.debug("Writing POST data to " + uRL + ": " + string);
        OutputStream outputStream = null;
        try {
            outputStream = httpURLConnection.getOutputStream();
            IOUtils.write((byte[])arrby, (OutputStream)outputStream);
        }
        finally {
            IOUtils.closeQuietly((OutputStream)outputStream);
        }
        this.Field_26492.Field_44593.Method_6822(8214 & 6974);
        Field_26491.debug("Reading data from " + uRL);
        InputStream inputStream = null;
        try {
            String string3;
            inputStream = httpURLConnection.getInputStream();
            String string4 = IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8);
            this.Field_26492.Field_44593.Method_6822(11799 & 319);
            Field_26491.debug("Successful read, server response was " + httpURLConnection.getResponseCode());
            Field_26491.debug("Response: " + string4);
            String string5 = string3 = string4;
            return string5;
        }
        catch (IOException iOException) {
            this.Field_26492.Field_44593.Method_6822(1050 & 10297);
            IOUtils.closeQuietly((InputStream)inputStream);
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                String string6;
                Field_26491.debug("Reading error page from " + uRL);
                String string7 = IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8);
                Field_26491.debug("Successful read, server response was " + httpURLConnection.getResponseCode());
                Field_26491.debug("Response: " + string7);
                String string8 = string6 = string7;
                return string8;
            }
            throw iOException;
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    public Class_26487(Class_44584 class_44584, Class_18 class_18, Class_1490 class_1490) {
        this.Field_26492 = class_44584;
        this.Field_26488 = class_18;
        this.Field_26489 = class_1490;
        this.Field_26488.Field_26.Method_2396();
    }

    private YggdrasilMinecraftSessionService Method_26503() {
        return this.Field_26488.Method_141();
    }

    protected Response Method_26504(URL uRL, Object object, Class class_) {
        try {
            String string = this.Method_26502(uRL, this.Field_26490.toJson(object), "application/json");
            Response response = (Response)this.Field_26490.fromJson(string, class_);
            if (response == null) {
                return null;
            }
            if (StringUtils.isNotBlank((CharSequence)response.getError())) {
                if ("UserMigratedException".equals(response.getCause())) {
                    throw new UserMigratedException(response.getErrorMessage());
                }
                if (response.getError().equals("ForbiddenOperationException")) {
                    throw new InvalidCredentialsException(response.getErrorMessage());
                }
                throw new AuthenticationException(response.getErrorMessage());
            }
            return response;
        }
        catch (IOException iOException) {
            throw new AuthenticationUnavailableException("Cannot contact authentication server", (Throwable)iOException);
        }
        catch (IllegalStateException illegalStateException) {
            throw new AuthenticationUnavailableException("Cannot contact authentication server", (Throwable)illegalStateException);
        }
        catch (JsonParseException jsonParseException) {
            throw new AuthenticationUnavailableException("Cannot contact authentication server", (Throwable)jsonParseException);
        }
    }

    protected HttpURLConnection Method_26505(URL uRL) {
        Validate.notNull((Object)uRL);
        Field_26491.debug("Opening connection to " + uRL);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(this.Method_26503().getAuthenticationService().getProxy());
        httpURLConnection.setConnectTimeout(-17764 & 15321);
        httpURLConnection.setReadTimeout(15324 & 31384);
        httpURLConnection.setUseCaches((17472 & 1) != 0);
        return httpURLConnection;
    }

    public void Method_26506(Class_24778 class_24778) {
        this.Field_26492.Field_44593.Method_6822(4357 & 2085);
        SecretKey secretKey = Class_31852.Method_31854();
        String string = class_24778.Method_24783();
        PublicKey publicKey = class_24778.Method_24789();
        String string2 = new BigInteger(Class_31852.Method_31858(string, publicKey, secretKey)).toString(-27110 & 26836);
        if (this.Field_26488.Method_184() != null && this.Field_26488.Method_184().Method_15496()) {
            try {
                this.Method_26503().joinServer(this.Field_26488.Method_265().Method_2117(), this.Field_26488.Method_265().Method_2114(), string2);
            }
            catch (AuthenticationException authenticationException) {
                Field_26491.warn("Couldn't connect to auth servers but will continue to join LAN");
            }
        } else {
            try {
                GameProfile gameProfile = this.Field_26488.Method_265().Method_2117();
                String string3 = this.Field_26488.Method_265().Method_2114();
                JoinMinecraftServerRequest joinMinecraftServerRequest = new JoinMinecraftServerRequest();
                joinMinecraftServerRequest.accessToken = string3;
                joinMinecraftServerRequest.selectedProfile = gameProfile.getId();
                joinMinecraftServerRequest.serverId = string2;
                this.Method_26504(Field_26494, (Object)joinMinecraftServerRequest, Response.class);
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                this.Field_26492.Method_44622(new Class_2840("Nie mozna zautoryzowac z serwerami mojang'u!"));
                return;
            }
            catch (InvalidCredentialsException invalidCredentialsException) {
                this.Field_26492.Method_44622(new Class_2840("Zrestartuj launcher! Je\u015bli to nie pomoze to prawdopodobnie\nprobujesz zalogowac sie na konto gracza premium! Zmien nick!"));
                return;
            }
            catch (AuthenticationException authenticationException) {
                Object[] arrobject = new Object[7265 & 513];
                arrobject[-32216 & 24784] = authenticationException.getMessage();
                this.Field_26492.Method_44622(new Class_2849("disconnect.loginFailedInfo", arrobject));
                return;
            }
        }
        this.Field_26492.Method_44606(new Class_32180(secretKey, publicKey, class_24778.Method_24786()), new Class_20060(this, class_24778, secretKey), new Class_18600[17168 & 6148]);
    }
}

