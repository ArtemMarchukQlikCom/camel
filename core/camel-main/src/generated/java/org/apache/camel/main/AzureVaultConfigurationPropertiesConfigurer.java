/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.AzureVaultConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class AzureVaultConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AwsVaultConfiguration", org.apache.camel.vault.AwsVaultConfiguration.class);
        map.put("AzureIdentityEnabled", boolean.class);
        map.put("AzureVaultConfiguration", org.apache.camel.vault.AzureVaultConfiguration.class);
        map.put("BlobAccessKey", java.lang.String.class);
        map.put("BlobAccountName", java.lang.String.class);
        map.put("BlobContainerName", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("EventhubConnectionString", java.lang.String.class);
        map.put("GcpVaultConfiguration", org.apache.camel.vault.GcpVaultConfiguration.class);
        map.put("HashicorpVaultConfiguration", org.apache.camel.vault.HashicorpVaultConfiguration.class);
        map.put("KubernetesVaultConfiguration", org.apache.camel.vault.KubernetesVaultConfiguration.class);
        map.put("RefreshEnabled", boolean.class);
        map.put("RefreshPeriod", long.class);
        map.put("Secrets", java.lang.String.class);
        map.put("TenantId", java.lang.String.class);
        map.put("VaultName", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(AzureVaultConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.AzureVaultConfigurationProperties target = (org.apache.camel.main.AzureVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": target.setAwsVaultConfiguration(property(camelContext, org.apache.camel.vault.AwsVaultConfiguration.class, value)); return true;
        case "azureidentityenabled":
        case "azureIdentityEnabled": target.setAzureIdentityEnabled(property(camelContext, boolean.class, value)); return true;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": target.setAzureVaultConfiguration(property(camelContext, org.apache.camel.vault.AzureVaultConfiguration.class, value)); return true;
        case "blobaccesskey":
        case "blobAccessKey": target.setBlobAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "blobaccountname":
        case "blobAccountName": target.setBlobAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "blobcontainername":
        case "blobContainerName": target.setBlobContainerName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "eventhubconnectionstring":
        case "eventhubConnectionString": target.setEventhubConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": target.setGcpVaultConfiguration(property(camelContext, org.apache.camel.vault.GcpVaultConfiguration.class, value)); return true;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": target.setHashicorpVaultConfiguration(property(camelContext, org.apache.camel.vault.HashicorpVaultConfiguration.class, value)); return true;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": target.setKubernetesVaultConfiguration(property(camelContext, org.apache.camel.vault.KubernetesVaultConfiguration.class, value)); return true;
        case "refreshenabled":
        case "refreshEnabled": target.setRefreshEnabled(property(camelContext, boolean.class, value)); return true;
        case "refreshperiod":
        case "refreshPeriod": target.setRefreshPeriod(property(camelContext, long.class, value)); return true;
        case "secrets": target.setSecrets(property(camelContext, java.lang.String.class, value)); return true;
        case "tenantid":
        case "tenantId": target.setTenantId(property(camelContext, java.lang.String.class, value)); return true;
        case "vaultname":
        case "vaultName": target.setVaultName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return org.apache.camel.vault.AwsVaultConfiguration.class;
        case "azureidentityenabled":
        case "azureIdentityEnabled": return boolean.class;
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return org.apache.camel.vault.AzureVaultConfiguration.class;
        case "blobaccesskey":
        case "blobAccessKey": return java.lang.String.class;
        case "blobaccountname":
        case "blobAccountName": return java.lang.String.class;
        case "blobcontainername":
        case "blobContainerName": return java.lang.String.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "eventhubconnectionstring":
        case "eventhubConnectionString": return java.lang.String.class;
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return org.apache.camel.vault.GcpVaultConfiguration.class;
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return org.apache.camel.vault.HashicorpVaultConfiguration.class;
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return org.apache.camel.vault.KubernetesVaultConfiguration.class;
        case "refreshenabled":
        case "refreshEnabled": return boolean.class;
        case "refreshperiod":
        case "refreshPeriod": return long.class;
        case "secrets": return java.lang.String.class;
        case "tenantid":
        case "tenantId": return java.lang.String.class;
        case "vaultname":
        case "vaultName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.AzureVaultConfigurationProperties target = (org.apache.camel.main.AzureVaultConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "awsvaultconfiguration":
        case "awsVaultConfiguration": return target.getAwsVaultConfiguration();
        case "azureidentityenabled":
        case "azureIdentityEnabled": return target.isAzureIdentityEnabled();
        case "azurevaultconfiguration":
        case "azureVaultConfiguration": return target.getAzureVaultConfiguration();
        case "blobaccesskey":
        case "blobAccessKey": return target.getBlobAccessKey();
        case "blobaccountname":
        case "blobAccountName": return target.getBlobAccountName();
        case "blobcontainername":
        case "blobContainerName": return target.getBlobContainerName();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientsecret":
        case "clientSecret": return target.getClientSecret();
        case "eventhubconnectionstring":
        case "eventhubConnectionString": return target.getEventhubConnectionString();
        case "gcpvaultconfiguration":
        case "gcpVaultConfiguration": return target.getGcpVaultConfiguration();
        case "hashicorpvaultconfiguration":
        case "hashicorpVaultConfiguration": return target.getHashicorpVaultConfiguration();
        case "kubernetesvaultconfiguration":
        case "kubernetesVaultConfiguration": return target.getKubernetesVaultConfiguration();
        case "refreshenabled":
        case "refreshEnabled": return target.isRefreshEnabled();
        case "refreshperiod":
        case "refreshPeriod": return target.getRefreshPeriod();
        case "secrets": return target.getSecrets();
        case "tenantid":
        case "tenantId": return target.getTenantId();
        case "vaultname":
        case "vaultName": return target.getVaultName();
        default: return null;
        }
    }
}

