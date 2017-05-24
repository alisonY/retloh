package com.retloh.model;

import java.util.List;

import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.AuthorizationRequest;
import org.apache.ftpserver.ftplet.User;

public class FtpUser implements User{
    private String name;

    private String password;

    private String homedirectory;

    private Boolean enabled;

    private Boolean writepermission;

    private Integer status;

    private String pdfexport;

    private Integer idletime;

    private Integer uploadrate;

    private Integer downloadrate;

    private Integer maxloginnumber;

    private Integer maxloginperip;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public void setHomedirectory(String homedirectory) {
        this.homedirectory = homedirectory == null ? null : homedirectory.trim();
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getWritepermission() {
        return writepermission;
    }

    public void setWritepermission(Boolean writepermission) {
        this.writepermission = writepermission;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPdfexport() {
        return pdfexport;
    }

    public void setPdfexport(String pdfexport) {
        this.pdfexport = pdfexport == null ? null : pdfexport.trim();
    }

    public Integer getIdletime() {
        return idletime;
    }

    public void setIdletime(Integer idletime) {
        this.idletime = idletime;
    }

    public Integer getUploadrate() {
        return uploadrate;
    }

    public void setUploadrate(Integer uploadrate) {
        this.uploadrate = uploadrate;
    }

    public Integer getDownloadrate() {
        return downloadrate;
    }

    public void setDownloadrate(Integer downloadrate) {
        this.downloadrate = downloadrate;
    }

    public Integer getMaxloginnumber() {
        return maxloginnumber;
    }

    public void setMaxloginnumber(Integer maxloginnumber) {
        this.maxloginnumber = maxloginnumber;
    }

    public Integer getMaxloginperip() {
        return maxloginperip;
    }

    public void setMaxloginperip(Integer maxloginperip) {
        this.maxloginperip = maxloginperip;
    }

    @Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public List<? extends Authority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Authority> getAuthorities(Class<? extends Authority> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorizationRequest authorize(AuthorizationRequest request) {
		// TODO Auto-generated method stub
		return request;
	}

	@Override
	public int getMaxIdleTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

	@Override
	public String getHomeDirectory() {
		// TODO Auto-generated method stub
		return homedirectory;
	}
}