public class TesteConfigSingleton {
    public static void main(String[] args) {
        ConfigSingleton configSingleton = ConfigSingleton.getInstance();        
        
        ConfigData configData = configSingleton.getConfigData();

        System.out.println("AppId: " + configData.getAppId());
        System.out.println("UserName: " + configData.getUserName());
        System.out.println("Language: " + configData.getLanguage());
        System.out.println("Offline: " + configData.getOffline());
        System.out.println("AutoDLC: " + configData.getAutoDLC());
        System.out.println("BuildId: " + configData.getBuildId());
        System.out.println("DLCName: " + configData.getDlcName());
        System.out.println("UpdateDB: " + configData.getUpdateDB());
        System.out.println("Signature: " + configData.getSignature());
        System.out.println("WindowInfo: " + configData.getWindowInfo());
        System.out.println("LVWindowInfo: " + configData.getLVWindowInfo());
        System.out.println("ApplicationPath: " + configData.getApplicationPath());
        System.out.println("WorkingDirectory: " + configData.getWorkingDirectory());
        System.out.println("WaitForExit: " + configData.getWaitForExit());
        System.out.println("NoOperation: " + configData.getNoOperation());
    }
}
