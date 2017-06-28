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
import com.retloh.model.FtpUserExample;

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

			if (userselect.getPassword().equals(password)) {
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
	
	public void deleteByName(String username){
		FtpUserExample example= new FtpUserExample();
		example.createCriteria().andNameEqualTo(username);
		ftpuserMapper.deleteByExample(example);
	}
	
	public int updateByPrimaryKey(FtpUser user){
		
		return ftpuserMapper.updateByPrimaryKey(user);
		
	}
	
	public FtpUser selectByPrimaryKey(String id){
		return ftpuserMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(String userid) throws FtpException {
		// TODO Auto-generated method stub
		int result=ftpuserMapper.deleteByPrimaryKey(userid);
		if (result==0){
			deleteByName(userid);
		}

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
		/*System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(username);
		User user = ftpuserMapper.selectByPrimaryKey(username);
		System.out.println(user.getHomeDirectory());*/
		
		//TODO id为主键，name有可能出现重复风险
		FtpUserExample example= new FtpUserExample();
		example.createCriteria().andNameEqualTo(username);
		User user = ftpuserMapper.selectByExample(example).get(0);
		return user;
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
