package com.ericwyn.proxyhelp;

/**
 * 代理信息的存放点
 *
 * Created by Ericwyn on 17-12-11.
 */
public class ProxyMsg {
    private String ip;
    private String port;
    private String type;
    private String securityLevel;
    private String address;
    private String lastCheckDate;

    public ProxyMsg() {
    }

    public ProxyMsg(String ip, String port) {
        this.ip = ip;
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastCheckDate() {
        return lastCheckDate;
    }

    public void setLastCheckDate(String lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }
}
