package com.retloh.ftpserver;

import java.io.File;
import java.io.IOException;

import org.apache.ftpserver.ftplet.DefaultFtplet;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpReply;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.ftplet.FtpSession;
import org.apache.ftpserver.ftplet.FtpletContext;
import org.apache.ftpserver.ftplet.FtpletResult;
import org.apache.ftpserver.ftplet.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.retloh.dao.FtpUserMapper;
import com.retloh.model.FtpUser;

public class FtpService extends DefaultFtplet{
	@Autowired
	private FtpUserMapper ftpuserMapper;
	

	@Override
	public FtpletResult afterCommand(FtpSession session, FtpRequest request, FtpReply reply)
			throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.afterCommand(session, request, reply);
	}

	@Override
	public FtpletResult beforeCommand(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.beforeCommand(session, request);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init(FtpletContext ftpletContext) throws FtpException {
		// TODO Auto-generated method stub
		super.init(ftpletContext);
	}

	@Override
	public FtpletResult onAppendEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onAppendEnd(session, request);
	}

	@Override
	public FtpletResult onAppendStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onAppendStart(session, request);
	}

	@Override
	public FtpletResult onConnect(FtpSession session) throws FtpException, IOException {
		// TODO Auto-generated method stub
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		System.out.println("User connected to FtpServer");
		
		return super.onConnect(session);
	}

	@Override
	public FtpletResult onDeleteEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onDeleteEnd(session, request);
	}

	@Override
	public FtpletResult onDeleteStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onDeleteStart(session, request);
	}

	@Override
	public FtpletResult onDisconnect(FtpSession session) throws FtpException, IOException {
		// TODO Auto-generated method stub
		System.out.println("User disconnected to FtpServer");
		return super.onDisconnect(session);
	}

	@Override
	public FtpletResult onDownloadEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		
		User user = session.getUser();
	    //File workingDir = workingDir(session);
	    String fileName = request.getArgument();
	    FtpUser ftpuser= new FtpUser();
	    ftpuser=(FtpUser) user;
	    ftpuser.setStatus(1);
	    ftpuserMapper.updateByPrimaryKey(ftpuser);
		
		return super.onDownloadEnd(session, request);
	}

	@Override
	public FtpletResult onDownloadStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onDownloadStart(session, request);
	}

	@Override
	public FtpletResult onLogin(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onLogin(session, request);
	}

	@Override
	public FtpletResult onMkdirEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onMkdirEnd(session, request);
	}

	@Override
	public FtpletResult onMkdirStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onMkdirStart(session, request);
	}

	@Override
	public FtpletResult onRenameEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onRenameEnd(session, request);
	}

	@Override
	public FtpletResult onRenameStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onRenameStart(session, request);
	}

	@Override
	public FtpletResult onRmdirEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onRmdirEnd(session, request);
	}

	@Override
	public FtpletResult onRmdirStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onRmdirStart(session, request);
	}

	@Override
	public FtpletResult onSite(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onSite(session, request);
	}

	@Override
	public FtpletResult onUploadEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		User user = session.getUser();
	    //File workingDir = workingDir(session);
	    String fileName = request.getArgument();
	    String filepath=session.getFileSystemView().getWorkingDirectory().getAbsolutePath()+"/"+fileName;
	    FtpUser ftpuser= new FtpUser();
	    ftpuser=(FtpUser) user;
	    ftpuser.setStatus(0);
	    if(fileName.toUpperCase().endsWith(".PDF")){
	    	ftpuser.setPdfexport(filepath);
	    }else{
	    	ftpuser.setFilepath(filepath);
	    }
	    ftpuserMapper.updateByPrimaryKey(ftpuser);
	    
		return super.onUploadEnd(session, request);
	}

	@Override
	public FtpletResult onUploadStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		User user = session.getUser();
	    //File workingDir = workingDir(session);
	    String fileName = request.getArgument();
	    
		return super.onUploadStart(session, request);
	}

	@Override
	public FtpletResult onUploadUniqueEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onUploadUniqueEnd(session, request);
	}

	@Override
	public FtpletResult onUploadUniqueStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		return super.onUploadUniqueStart(session, request);
	}
	
	
	
}
