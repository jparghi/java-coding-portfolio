package designpatterns;

/**
 * Builder Pattern Example: Useful for constructing complex objects like configuring Spring Beans, DB configurations.
 */
class DatabaseConfig {
    private String host;
    private int port;
    private String dbName;
    private boolean sslEnabled;

    public static class Builder {
        private String host;
        private int port;
        private String dbName;
        private boolean sslEnabled;

        public Builder setHost(String host) { this.host = host; return this; }
        public Builder setPort(int port) { this.port = port; return this; }
        public Builder setDbName(String dbName) { this.dbName = dbName; return this; }
        public Builder enableSSL(boolean sslEnabled) { this.sslEnabled = sslEnabled; return this; }

        public DatabaseConfig build() {
            DatabaseConfig config = new DatabaseConfig();
            config.host = this.host;
            config.port = this.port;
            config.dbName = this.dbName;
            config.sslEnabled = this.sslEnabled;
            return config;
        }
    }

    @Override
    public String toString() {
        return "DatabaseConfig [host=" + host + ", port=" + port + ", dbName=" + dbName + ", sslEnabled=" + sslEnabled + "]";
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        DatabaseConfig config = new DatabaseConfig.Builder()
                                    .setHost("localhost")
                                    .setPort(5432)
                                    .setDbName("TestDB")
                                    .enableSSL(true)
                                    .build();
        System.out.println(config);
    }
}
