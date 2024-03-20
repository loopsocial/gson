/**
 * Defines the Gson serialization/deserialization API.
 * @since 2.8.6
 */
module com.firework.gson {
	exports com.firework.gson;
	exports com.firework.gson.annotations;
	exports com.firework.gson.reflect;
	exports com.firework.gson.stream;

	// Optional dependency on java.sql
	requires static java.sql;

	// Optional dependency on jdk.unsupported for JDK's sun.misc.Unsafe
	requires static jdk.unsupported;
}
