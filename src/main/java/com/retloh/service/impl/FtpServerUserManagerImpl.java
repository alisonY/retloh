package com.retloh.service.impl;

import java.security.MessageDigest;

import org.apache.ftpserver.ftplet.Authentication;
import org.apache.ftpserver.ftplet.AuthenticationFailedException;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.User;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.usermanager.AnonymousAuthentication;
import org.apache.ftpserver.usermanager.UsernamePasswordAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retloh.dao.FtpUserMapper;
import com.retloh.model.FtpUser;

@Service
public class FtpServerUserManagerImpl implements UserManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(FtpServerUserManagerImpl.class);

	@Autowired
	private FtpUserMapper ftpuserMapper;

	@Override
	public User authenticate(Authentication authentication) throws AuthenticationFailedException {
		// TODO Auto-generated method stub

		if (authentication instanceof UsernamePasswordAuthentication) {
			UsernamePasswordAuthentication upauth = (UsernamePasswordAuthentication) authentication;

			String user = upauth.getUsername();
			String password = upauth.getPassword();

			if (user == null) {
				throw new AuthenticationFailedException("Authentication failed");
			}
			if (password == null) {
				password = "";
			}

			User userselect = null;
			try {
				userselect = getUserByName(user);
			} catch (FtpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return userselect;
			}

			if (userselect.getPassword().equals(string2MD5(password))) {
				return userselect;
			} else {
				throw new AuthenticationFailedException("Authentication failed");
			}

			/*
			 * if (getPasswordEncryptor().matches(password, storedPassword)) {
			 * return getUserByName(user); } else { throw new
			 * AuthenticationFailedException("Authentication failed"); }
			 */

		} else if (authentication instanceof AnonymousAuthentication) {
			try {
				if (doesExist("anonymous")) {
					return getUserByName("anonymous");
				} else {
					throw new AuthenticationFailedException("Authentication failed");
				}
			} catch (FtpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			throw new IllegalArgumentException("Authentication not supported by this user manager");
		}

		return null;
	}

	@Override
	public void delete(String userid) throws FtpException {
		// TODO Auto-generated method stub
		ftpuserMapper.deleteByPrimaryKey(userid);

	}

	@Override
	public boolean doesExist(String arg0) throws FtpException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getAdminName() throws FtpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getAllUserNames() throws FtpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String username) throws FtpException {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(username);
		User user = ftpuserMapper.selectByPrimaryKey(username);
		System.out.println(user.getHomeDirectory());

		return ftpuserMapper.selectByPrimaryKey(username);
	}

	@Override
	public boolean isAdmin(String arg0) throws FtpException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(User user) throws FtpException {
		// TODO Auto-generated method stub
		ftpuserMapper.insert((FtpUser) user);

	}
	
	
	public String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();

	}
}
