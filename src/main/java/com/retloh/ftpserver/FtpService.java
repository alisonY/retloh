package com.retloh.ftpserver;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.apache.ftpserver.ftplet.DefaultFtplet;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpReply;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.ftplet.FtpSession;
import org.apache.ftpserver.ftplet.FtpletContext;
import org.apache.ftpserver.ftplet.FtpletResult;
import org.apache.ftpserver.ftplet.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.retloh.dao.FtpUserMapper;
import com.retloh.dao.VerificationMapper;
import com.retloh.model.Verification;
import com.retloh.model.VerificationExample;
import com.retloh.service.VerificationServices;
import com.retloh.utils.Md5Utils;

public class FtpService extends DefaultFtplet {

	private static final Logger LOGGER = LoggerFactory.getLogger(FtpService.class);
	@Autowired
	private FtpUserMapper ftpuserMapper;

	@Autowired
	private VerificationMapper verificationServices;

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

		/*
		 * User user = session.getUser(); //File workingDir =
		 * workingDir(session); String fileName = request.getArgument(); FtpUser
		 * ftpuser= new FtpUser(); ftpuser=(FtpUser) user; ftpuser.setStatus(1);
		 * ftpuserMapper.updateByPrimaryKey(ftpuser);
		 */

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
		String fileName = request.getArgument();
		String homeDirectory = session.getFileSystemView().getHomeDirectory().getAbsolutePath();
		String workingDirectory = session.getFileSystemView().getWorkingDirectory().getAbsolutePath();

		Verification verification = new Verification();
		String osName = System.getProperties().getProperty("os.name");
		verification.setFilename(fileName);
		try {
			String filepath = "";
			/*
			 * if (osName.toLowerCase().contains("windows")) { filepath =
			 * "C:/data" + workingDirectory + "/" + fileName;
			 * verification.setCommonid(fileName.split("/")[0]); } else {
			 * verification.setCommonid(workingDirectory.replaceAll("/", ""));
			 * filepath = "/data" + workingDirectory + "/" + fileName; }
			 */

			verification.setCommonid(workingDirectory.replaceAll("/", ""));
			filepath = "/data" + workingDirectory + "/" + fileName;
			//filepath = homeDirectory + "/" + workingDirectory + "/" + fileName;

			verification.setMd5sum(Md5Utils.getHash(filepath, "MD5"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			verification.setMd5sum("");
		}

		VerificationExample example = new VerificationExample();
		example.createCriteria().andFilenameEqualTo(fileName).andCommonidEqualTo(workingDirectory.replaceAll("/", ""));
		List<Verification> verification_list = verificationServices.selectByExample(example);
		if (verification_list.isEmpty()) {
			int res = verificationServices.insert(verification);
			if (res < 0) {
				LOGGER.error("insert {} md5sum to table failed", verification.toString());
			}
		} else {
			for (Verification veric : verification_list) {
				veric.setCommonid(verification.getCommonid());
				veric.setMd5sum(verification.getMd5sum());
				int res = verificationServices.updateByPrimaryKeySelective(veric);
				if (res < 0) {
					LOGGER.error("update {} md5sum to table failed", verification.toString());
				}
			}
		}
		return super.onUploadEnd(session, request);
	}

	@Override
	public FtpletResult onUploadStart(FtpSession session, FtpRequest request) throws FtpException, IOException {
		// TODO Auto-generated method stub
		User user = session.getUser();
		// File workingDir = workingDir(session);
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
