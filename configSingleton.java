public class ConfigSingleton {
    private static ConfigSingleton instance;
    private ConfigData configData;
    private ConfigSingleton() {
        loadConfig(); 
    }

    // acessar a instância única da classe
    public static synchronized ConfigSingleton getInstance() {
        // se a instância não foi criada, cria uma nova
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    private void loadConfig() {
        configData = new ConfigData();
        configData.setAppId("1649240");
        configData.setUserName("elamigos");
        configData.setLanguage("brazilian");
        configData.setOffline(0);
        configData.setAutoDLC(0);
        configData.setBuildId("10547147");
        configData.setDlcName("Returnal Pre-Purchase Entitlement");
        configData.setUpdateDB(1);
        configData.setSignature("FitGirl");
        configData.setWindowInfo("LAIAAAATQMAAJACAAA=");
        configData.setLVWindowInfo("AwAAADEBAAByAAAApQAAAA==");
        configData.setApplicationPath("../../../Returnal.exe");
        configData.setWorkingDirectory("");
        configData.setWaitForExit(1);
        configData.setNoOperation(0);
    }

    // aqui acessa os dados de configuração
    public ConfigData getConfigData() {
        return configData;
    }
}
